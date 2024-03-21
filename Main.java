import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student's address: ");
        String studentAddress = scanner.nextLine();

        Student student = new Student(studentName, studentAddress);

        System.out.print("Enter number of courses for the student: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String course = scanner.nextLine();
            System.out.print("Enter grade for " + course + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            student.addCourseGrade(course, grade);
        }

        System.out.println(student);

        student.printGrade();
        System.out.println("Average grade: " + student.getAverageGrade());

        System.out.print("\nEnter teacher's name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter teacher's address: ");
        String teacherAddress = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.print("Enter number of courses for the teacher: ");
        int numTeacherCourses = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < numTeacherCourses; i++) {
            System.out.print("Enter course name: ");
            String course = scanner.nextLine();
            teacher.addCourse(course);
        }

        System.out.println(teacher);

        scanner.close();
    }
}
