package exercise05;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee= new PartTimeEmployee("Phuong", 2000);
        partTimeEmployee.workingHours=5;
        System.out.println("Part-time employee: "+partTimeEmployee.getName()+" worked "+partTimeEmployee.workingHours+"hours. Salary: "+partTimeEmployee.calculateSalary());

        FullTimeEmployee fullTimeEmployee= new FullTimeEmployee("Ngoc", 3000);
        System.out.println("Full time employee: "+fullTimeEmployee.getName()+" . Salary: "+fullTimeEmployee.calculateSalary());

    }
}
