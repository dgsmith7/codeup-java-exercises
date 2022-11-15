package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    Student (String _name, ArrayList<Integer> _grades) {
        this.name = _name;
        this.grades = _grades;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i ++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}
