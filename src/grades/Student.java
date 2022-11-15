package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    private HashMap<String, String> attendance = new HashMap<>();

    Student (String _name, ArrayList<Integer> _grades) {
        this.name = _name;
        this.grades = _grades;
    }

    public void recordAttendance(String date, String value) {
        attendance.put(date, value);
    }

    public String getAttendanceAverage() {
        int sum = 0;
        for (String s : attendance.keySet())
            if (attendance.get(s).equals("P")) sum++;
        return sum + " out of " + attendance.size() + " = " + String.format("%.1f",((float)sum/(float)attendance.size() * 100.0)) + "%";
    }


    public String getAbsenceList() {
        String list = "";
        for (String s : attendance.keySet())
            if (attendance.get(s).equals("A")) list += s + "   ";
        if (list.equals("")) list += "none.";
        return list;
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
