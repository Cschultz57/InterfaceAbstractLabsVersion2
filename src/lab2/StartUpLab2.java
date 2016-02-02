package lab2;

public class StartUpLab2 {

    public static void main(String[] args) {
        //Being able to use either ProgrammingClass or AdvancedJavaCourse or IntroToProgrammingcourse or IntroJavaCourse
        //to make a new AdvancedJavaCourse object shows polymorphism

        ProgrammingClass pClass = new IntroJavaCourse("IntroJ", "44568-87953");
        ProgrammingClass pClass2 = new AdvancedJavaCourse("AdvJavaC", "789877-884555");
        IntroToProgrammingCourse intro = new IntroToProgrammingCourse("IntroPC", "1234-56789");
        //I am confused about the Liskov Substitution Principle still
        System.out.println(pClass.getCourseName() + " " + pClass.getCourseNumber());
        System.out.println(pClass2.getCourseName() + " " + pClass2.getCourseNumber());
        System.out.println(intro.getCourseName() + " " + intro.getCourseNumber());

    }

}
