class Book {
    String title;
    String author;
    double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
        System.out.println("-----------------------------");
    }
}

class Student {
    private String name;
    private int age;
    private String course;
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
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", 499.0);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 350.0);

        System.out.println("Book Details:");
        book1.display();
        book2.display();
        Student student = new Student();
        student.setName("Debosmita");
        student.setAge(20);
        student.setCourse("Computer Science");

        System.out.println("Student Details:");
        student.display();
    }
}

