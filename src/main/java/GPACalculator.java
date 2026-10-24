import java.util.List;

public class GPACalculator {

    public double calculateGpa(Student student) {

        List<Double> grades = student.getGrades();

        if (grades.isEmpty()) {
            return 0.0;
        }

/*        double sum = 0;         //Stream

        for (double grade : grades) {
            sum += grade;                      // معدل را به جای این روش قدیمی با Stream حساب کنیم. چیند چیکار میککند به چه دردی میخورند
        }

        return sum / grades.size();   //Stream
    }*/
        return grades.stream()      // روی نمره های لیست پردازش انجام می دهد.
                .mapToDouble(Double::doubleValue)    // double نمره ها را به جریان اعداد تبدیل می کند.
                .average() // میانگین نمره ها را محاسبه می کند.
                .orElse(0.0); // اگر لیست خالی بود، عدد 0 بر می گرداند.
    }

    public double calculateClassAverage(List<Student> students) {

        if (students.isEmpty()) {
            return 0.0;
        }

        double sum = 0;

        for (Student student : students) {
            sum += student.getGpa();
        }

        return sum / students.size();
    }
}

