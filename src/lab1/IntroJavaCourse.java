package lab1;


public class IntroJavaCourse extends ProgrammingClass{
    

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }  

   
    @Override
        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
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

}
