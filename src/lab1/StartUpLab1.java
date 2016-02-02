package lab1;

public class StartUpLab1 {

    public static void main(String[] args) {
        ProgrammingClass[] classes = {
            new AdvancedJavaCourse("AdvJava", "999-5555"), new IntroJavaCourse("IntroJava", "555-5555"),
            new IntroToProgrammingCourse("IntroPro", "999-5959")
        };
        for (ProgrammingClass p : classes) {
            p.setCourseName("named");
        }
        //Being able to use either ProgrammingClass or AdvancedJavaCourse to make a new AdvancedJavaCourse object shows
        //polymorphism
        ProgrammingClass pClass = new AdvancedJavaCourse("AdvJava", "999-5555");
        System.out.println(pClass.getCourseName());
        //I am still confused about how the Liskov Substitution Principle works
        AdvancedJavaCourse course = new AdvancedJavaCourse("AdvJavaC", "999-5599");
        System.out.println(course.getCourseNumber() + " " + course.getCourseName());
    }
}
