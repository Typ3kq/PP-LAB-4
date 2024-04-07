import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 20000, 0);
        employees[1] = new Worker("Mateusz Mateuszowski", 10000, "Kurier");
        employees[2] = new Employee("Grzegorz Grzegowski", 15000);
        employees[3] = new Worker("Andrzej Andrzejowski", 25000, "Piłkarz");
        employees[4] = new Worker("Agata Agatowska", 30000, "Barmanka");

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(7500);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}