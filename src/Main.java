import model.Employee;
import service.SalaryCal;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER EMPLOYEE NAME: ");
        String employee_name = scanner.nextLine();
        System.out.println("ENTER EMPLOYEE LAST NAME: ");
        String employee_last_name = scanner.nextLine();
        System.out.println("ENTER EMPLOYEE ID: ");
        int id=scanner.nextInt();
        System.out.println("ENTER EMPLOYEE HOURLY RATE: ");
        double rate= scanner.nextDouble();

        Employee worker1 = new Employee(employee_name, employee_last_name, id++, rate);
        SalaryCal salaryCal = new SalaryCal(worker1);
        System.out.println("SALARY FOR "+ employee_name+" is exclusively "+salaryCal.salarycal());


    }
}