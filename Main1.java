class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    private String employeeId;
    private double salary;
    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployeeDetails() {
        super.displayPersonDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + String.format("%.2f", salary)); 
    }
}
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    @Override 
    public void start() {
        System.out.println("Car is starting with a powerful engine roar!");
    }
}
class Bike extends Vehicle {
    @Override 
    public void start() {
        System.out.println("Bike is starting with a gentle hum.");
    }
}
public class Main1 {
    public static void main(String[] args) {
        System.out.println("--- Employee Details ---");
        Employee emp1 = new Employee("Alice Wonderland", 30, "EMP001", 75000.50);
        emp1.displayEmployeeDetails();
        System.out.println("\n"); 
        System.out.println("--- Vehicle Starting Demonstrations ---");
        Car myCar = new Car();
        myCar.start();
        Bike myBike = new Bike();
        myBike.start();
    }
}

