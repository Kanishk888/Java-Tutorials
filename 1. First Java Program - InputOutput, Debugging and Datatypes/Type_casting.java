import java.util.Scanner;

public class Type_casting {

//Type Casting or Casting incompatible types:
    /*
    Sometimes this is called narrowing conversion,because you are explicitly doing float type to int type.
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = (int)(1312.2f);
        System.out.println(num);

    }
}
