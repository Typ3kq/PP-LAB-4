public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan Kowalski", 20000);
        employees[1] = new Employee("Mateusz Mateuszowski", 10000);
        employees[2] = new Employee("Grzegorz Grzegowski", 15000);
        employees[3] = new Employee("Andrzej Andrzejowski", 25000);
        employees[4] = new Employee("Agata Agatowska", 30000);

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(70000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
