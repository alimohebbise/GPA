import java.util.ArrayList;
import java.util.List;

public class StudentReader {

    public List<Student> createStudents(List<String> lines) {

        List<Student> students = new ArrayList<>();

        // Skip the CSV header
        for (int i = 1; i < lines.size(); i++) {

            String[] data = lines.get(i).split(",");

            String name = data[0];

            List<Double> grades = new ArrayList<>();

            /*for (int j = 1; j < data.length; j++) {
                grades.add(Double.parseDouble(data[j]));
            }*/
            for (int j = 1; j < data.length; j++) {

                System.out.println("Reading value: [" + data[j] + "]");

                grades.add(Double.parseDouble(data[j]));
            }

            Student student = new Student(name, grades);

            students.add(student);
        }

        return students;
    }
}
