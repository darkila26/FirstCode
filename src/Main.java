import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Christiane Delazeri", "Brazil", 8000, 30);
        Employee employeeTwo = new Employee("Gabriel Delazeri", "Nigeria", 10000, 40);

        employeeTwo.raiseSalary();

        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
    }
}
