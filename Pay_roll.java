class Employee{
    void calculatePay(String name,double sal) {
        System.out.println(name + " " + sal * 12);
    }
    void calculatePay(String name,double hourRate,double hoursWorked){
        System.out.println(name+" "+hoursWorked*hoursWorked);
    }
}

public class Payroll_System{
    public static void main(String[] args) {
        Employee employee=new Employee(); 
        employee.calculatePay("Jay",50000.0);
