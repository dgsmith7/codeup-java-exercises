package grades;

import java.util.ArrayList;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    private static final HashMap<String, Student> students = new HashMap<>();
    private static final Input input = new Input();

    public static void main(String[] args) {
        buildData();
        boolean done = false;
        while (!done) {
            int sel = input.getInt(1, 5, displayMenu());
            switch(sel) {
                case 1: // Grades-attendance-absence report for 1 student
                    String student = getStudentName();
                    runSingleStudentReport(student);
                    break;
                case 2: // Summary report for all students
                    runSummaryReport();
                    break;
                case 3: // Class average and attendance
                    runClassAverageReport();
                    break;
                case 4: // Output CSV summary(name,github,avg, attdc)
                    break;
                default : // Exit
                    done = true;
                    break;
            }
        }
    }

    public static void outputCSV() {
        // (name,github,avg, attdc)
    }

    public static void runClassAverageReport() {
        // do the messaging and display piece then show average grades and attendance
        float sum = 0;
        for (String s : students.keySet()) {
            runSingleStudentReport(s);
            sum += students.get(s).getGradeAverage();
        }
        double avg = sum / students.size();
    }

    public static void runSummaryReport() {
        System.out.println("\nSummary of all students: ");
        System.out.println("-------\n");
        for (String s : students.keySet()) runSingleStudentReport(s);
        System.out.println("End of report - " + students.size() + " students total.\n");
    }

    public static void runSingleStudentReport(String _student) {
        // do the messaging and display piece then call single record method
        String[] record = pullSingleStudentRecord(_student);
        String report = "Name: " + record[0] + "\n";
                report += "username: " + record[1] + "\n";
                report += "grades: " + record[2] + "\n";
                report += "average grade: " + record[3] + "\n";
                report += "attendance average: " + record[4] + "\n";
                report += "days absent: " + record[5] + "\n";
                report += "-------\n";
                System.out.println(report);
    }

    public static String[] pullSingleStudentRecord(String _student) {
        // name, username, all grade, average, attendance, dates absent
        String[] reportItems = new String[6];
        reportItems[0] = students.get(_student).getName();
        reportItems[1] = _student;
        reportItems[2] = students.get(_student).getGrades().toString();
        reportItems[3] = String.format("%.2f", students.get(_student).getGradeAverage());
        reportItems[4] = "average attendance";  // todo
        reportItems[5] = "the days student was absent";  // todo
        return reportItems;
    }


    public static String getStudentName() {
        String studentGithubName = "";
        while(!students.containsKey(studentGithubName)) {
            System.out.println("Here are the GitHub usernames of our students:\n\n");
            System.out.print("     | ");
            for (int i = 0; i < students.size(); i ++) {
                System.out.print(students.keySet().toArray()[i]+" | ");
            }
            System.out.println("\n");
                studentGithubName = input.getString("Please enter the username of the student.");
        }
        return studentGithubName;
    }

    public static String displayMenu() {
        String menu = "Student Reports Menu:\n\n" +
                "1 - Grades-attendance-absence report for 1 student\n" +
                "2 - Summary report for all students\n" +
                "3 - Class average and attendance\n" +
                "4 - Output CSV summary\n" +
                "5 - Exit\n\n" +
                "Please enter you selection: ";
        return menu;
    }

    public static void buildData() {
        ArrayList<Integer> emptyGrades = new ArrayList<>();
        Student s1 = new Student("Larry", emptyGrades );
        s1.addGrade(95);
        s1.addGrade(100);
        s1.addGrade(90);
        Student s2 = new Student("Moe", emptyGrades );
        s2.addGrade(65);
        s2.addGrade(70);
        s2.addGrade(75);
        Student s3 = new Student("Curly", emptyGrades );
        s3.addGrade(93);
        s3.addGrade(87);
        s3.addGrade(85);
        Student s4 = new Student("Schemp", emptyGrades );
        s3.addGrade(55);
        s3.addGrade(65);
        s3.addGrade(75);
        students.put("smartStooge", s1);
        students.put("angryMoe", s2);
        students.put("heyMoe", s3);
        students.put("afterThought", s4);
    }
}
