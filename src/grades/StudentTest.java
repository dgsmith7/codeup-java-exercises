package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Integer> emptyGrades = new ArrayList<>();
        Student s1 = new Student("Joe", emptyGrades );
        s1.addGrade(95);
        s1.addGrade(100);
        s1.addGrade(90);
        System.out.println(s1.getGradeAverage());


    }
}
