package lab1;

public abstract class ProgrammingClass {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public abstract String getCourseName();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public abstract String getCourseNumber();

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public abstract double getCredits();

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public abstract String getPrerequisites();

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
