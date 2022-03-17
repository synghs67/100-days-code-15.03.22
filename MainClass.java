package myPackage;

public class MainClass {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile ( "Swami", "Nath", "Cse", 2022, 6.89 );
        StudentProfile profileTwo = new StudentProfile ( "Gopinath", "Swami", "Electrical", 2023, 7.98 );
        System.out.println (profileOne.firstname);
        profileOne.incrementExpectedYearToGraduate ();
        System.out.println ( profileOne.expectedYearToGraduate );

    }
}
