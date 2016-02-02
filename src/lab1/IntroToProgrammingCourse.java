package lab1;

import javax.swing.JOptionPane;

public class IntroToProgrammingCourse extends ProgrammingClass {

    private String courseName;
    private String courseNumber;
    private String prerequisites;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    //override so there are no prerequisites for this class
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = "null";
    }

}
