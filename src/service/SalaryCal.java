package service;

import model.Employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SalaryCal {
    private String start;
    private String end_time;
    private Employee employee;


    List<String> weekDays = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    Scanner scanner = new Scanner(System.in);

    public SalaryCal(Employee employee) throws ParseException {
        this.employee = employee;
    }

    public double timecalculator() throws ParseException {

        DateFormat sdf = new SimpleDateFormat("hh:mm");
        double sum = 0;
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " start time: ");
            start = scanner.nextLine();
            System.out.print(weekDay + " end time: ");
            end_time = scanner.nextLine();
            Date d1 = sdf.parse(start);
            Date d2 = sdf.parse(end_time);
            long diff = d2.getTime() - d1.getTime();
            sum += diff / 60000;

        }
        return sum / 60;
    }

    double workedHr = timecalculator();


    public double salarycal() throws ParseException {
        System.out.println("Enter the threshold");
        int threshold = scanner.nextInt();
        double salary;


        if (threshold > workedHr) {
            System.out.println(" overtime is NOT reached");
            return workedHr * employee.getPer_hr_rate();
        } else {
            salary = (40 * employee.getPer_hr_rate()) + (1.5* employee.getPer_hr_rate() * (workedHr - threshold));
        }
        System.out.println("Total hours worked: "+workedHr);
        System.out.println("over time is: "+(workedHr - threshold));


        return salary;
    }


}
