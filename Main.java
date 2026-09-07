public class Main {
    public static void main(String[] args) {
        System.out.println("=== Student Management System ===");

        Student s1 = new Student(101, "Rahul", "BCA");

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Course: " + s1.getCourse());
    }
}
