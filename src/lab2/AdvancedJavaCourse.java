package lab2;

import javax.swing.JOptionPane;

public class AdvancedJavaCourse implements ProgrammingClass {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.setPrerequisites(prerequisites);
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    public String getCourseName() {
        return this.getCourseName();
    }

    @Override
    public String getCourseNumber() {
        return this.getCourseNumber();
    }

    @Override
    public double getCredits() {
        return this.getCredits();
    }

    @Override
    public String getPrerequisites() {
        return this.getPrerequisites();
    }

    public void setCourseName(String courseName) {

    }

    public void setCourseNumber(String courseNumber) {

    }

}
