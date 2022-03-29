package myPackage;
class Element{
    int values[];
    Element (int i) {
        values = new int[i];
    }
    // Display array recursively
    void  printArray(int i){
        if (i == 0) return;
        else printArray ( i -1 );
        System.out.println ("["+ (i -1) +"]" + values [i-1]);
    }

}

public class Test {
    public static void main(String[] args) {

        Element ele = new Element ( 11 );
        for (int i = 0; i <=10; i++) 
            ele.values[i] =i ;{
            ele.printArray ( 11 );
        }


    }
}
