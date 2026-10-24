import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            // 1. Read CSV file
            CSVFileReader fileReader = new CSVFileReader();

            List<String> lines = fileReader.readFile("exams-grade.csv");

            // 2. Create students
            StudentReader studentReader = new StudentReader();

            List<Student> students = studentReader.createStudents(lines);

            // 3. Calculate each student's GPA
            GPACalculator calculator = new GPACalculator();

            for (Student student : students) {
                double gpa = calculator.calculateGpa(student);
                student.setGpa(gpa);
            }

            // 4. Calculate the class average
            double classAverage = calculator.calculateClassAverage(students); //آبجکت خط 3 =

            // 5. Print results
            Printer printer = new Printer();

            printer.printResults(students, classAverage);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}