package lab1;
//an abstract class allows the code to be more flexible by allowing other code to be added easily

public abstract class ProgrammingClass {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    //abstract methods prevent concrete inheritance issues later on by forcing the other classes to use certain methods

    //I changed all of the following to abstract for this reason
    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    public abstract double getCredits();

    public abstract void setCredits(double credits);

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);

}
