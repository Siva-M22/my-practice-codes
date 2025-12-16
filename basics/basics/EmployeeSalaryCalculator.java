import java.util.Scanner;
public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hourly Wage:");
        double hourlywage=sc.nextDouble();
        System.out.println("Enter hour worked per week ");
        double hourlyworked=sc.nextDouble();

        double weeklySalary;
        if(hourlyworked>40){
            weeklySalary=calculateWeeklySalary(hourlywage, hourlyworked,1.5);
        }else{
            weeklySalary= calculateWeeklySalary(hourlywage, hourlyworked);
        }
        double annualSalary=calculateAnnualsalary(weeklySalary);

        System.out.printf("Weekly salary: $%.2f\n", weeklySalary);
        System.out.printf("Annual Salary: $%.2f\n",annualSalary);

        double monthlySalary=calculateMonthlySalary(annualSalary);
        System.out.printf("Monthly Salary: $%.2f",monthlySalary);
