import java.util.List;

public class Printer {
    public void printResults(List<Student> students, double classAverage) {
        System.out.println("Student GPA Results");
        System.out.println("-------------------");

        for (Student student : students) {

            System.out.printf(
                    "%s: %.2f%n",
                    student.getName(),
                    student.getGpa()
            );
        }

        System.out.println("------------------");

        System.out.printf(
                "Class Average GPA: %.2f%n",
                classAverage
        );
    }
}
