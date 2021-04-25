import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final String Username = "Tarik";
        final String Password = "123";
        System.out.println(Messages.welcomeSystem);
        System.out.println(Messages.userName);
        String username = scanner.next();

        System.out.println(Messages.password);
        String password = scanner.next();

        if (username.equals(Username) && password.equals(Password)) {
            menuMainMessages(username);
            int inputAnswer = scanner.nextInt();
            switch (inputAnswer) {
                case 1:
                    getActiveCourse();
                    break;
                case 2:
                    courseAdded(scanner);
                    break;
                case 3:
                    deleteCourse(scanner);
                    break;
                case 4:
                    Course();
                    break;
                default:
                    System.out.println(Messages.youDontHaveChoose);
            }
        } else System.out.println(Messages.accessDenied);


    }

    private static void menuMainMessages(String username) {
        System.out.println(Messages.welcomeMessage + " " + username);
        System.out.println(Messages.accessSuccessFull);
        System.out.println(Messages.courseWelcome + " " + Messages.makeChoose);
        System.out.println(Messages.showActiveCourse);
        System.out.println(Messages.addCourse);
        System.out.println(Messages.deleteCourse);
        System.out.println(Messages.nextCourse);
    }

    private static void deleteCourse(Scanner scanner) {
        ActiveCourse activeCourse = new ActiveCourse();
        System.out.println(Messages.courseName + Messages.courseType);
        String deleteCourseName = scanner.next();
        String deleteCourseName1 = scanner.next();
        System.out.println(Messages.courseDeleted + " " + deleteCourseName + " " + deleteCourseName1);
        activeCourse.Delete();
    }

    private static void courseAdded(Scanner scanner) {
        ActiveCourse activeCourse = new ActiveCourse();
        System.out.println(Messages.courseName + " " + Messages.courseType);
        String courseName = scanner.next();
        String courseName1 = scanner.next();
        System.out.println(Messages.courseAdded + " " + courseName + " " + courseName1);
        activeCourse.Add();
    }


    private static void getActiveCourse() {
        ActiveCourse activeCourse1 = new ActiveCourse(Messages.csharpAngularMessage, Messages.backEndMessage);
        ActiveCourse activeCourse2 = new ActiveCourse(Messages.javaReactMessage, Messages.backEndMessage);
        ActiveCourse[] activeCourses = {activeCourse1, activeCourse2};
        for (ActiveCourse activeCourse : activeCourses) {
            System.out.println(activeCourse.courseName + activeCourse.courseType);
        }
    }

    private static void Course() {
        Course course1 = new Course(Messages.csharpAngularMessage, Messages.backEndMessage);
        Course course2 = new Course(Messages.javaReactMessage, Messages.backEndMessage);
        Course course3 = new Course(Messages.pythonVueMessage, Messages.backEndMessage);
        Course course4 = new Course(Messages.javaScriptVueMessage, Messages.backEndMessage);
        Course[] courses = {course1, course2, course3, course4};
        for (Course course : courses) {
            System.out.println(course.courseName + course.courseType);
        }
    }
}



