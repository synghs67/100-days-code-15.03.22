package myPackage;

public class AvgNum {
    public static void main(String[] args) {
        int [] data = new  int[] {20,10,20,10,20,10,20,10,20,10};
        int sum = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            sum +=data[i];
            y +=1;
        }
        int result = sum / y;
        System.out.println ("Average is : " + result );

    }
}
