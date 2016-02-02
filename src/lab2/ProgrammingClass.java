package lab2;
//By using an interface and abstract classes it allows for other code to be added without breaking the rest.
//Abstract methods also prevent any issues with concrete inheritance

public interface ProgrammingClass {

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    public abstract double getCredits();

    public abstract void setCredits(double credits);

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);

}
