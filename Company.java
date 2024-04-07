import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan Kowalski", 20000, 0);
        employees[1] = new Worker("Mateusz Mateuszowski", 10000, "Kurier");
        employees[2] = new Employee("Grzegorz Grzegowski", 15000);
        employees[3] = new Worker("Andrzej Andrzejowski", 25000, "Piłkarz");
        employees[4] = new Worker("Agata Agatowska", 30000, "Barmanka");
        employees[5] = new Manager("Jakub Jakubowski", 40000, 0);
        employees[6] = new Worker("Stanisław Stanisłowski", 55000, "Tynkarz");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); 
                employee.setSalary(7500); 
            }
        }

        System.out.println("Zaktualizowane dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}