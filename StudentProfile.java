package myPackage;

public class StudentProfile {
    String firstname;
    String lastname;
    int expectedYearToGraduate;
    double gpa;
    String stream;
    public StudentProfile(String firstname, String lastname, String stream,int expectedYearToGraduate, double gpa){
         this.firstname = firstname;
         this.lastname = lastname;
         this.stream = stream;
         this.gpa =gpa;
         this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public  void incrementExpectedYearToGraduate(){
        this.expectedYearToGraduate =(this.expectedYearToGraduate)+1;
    }

}
