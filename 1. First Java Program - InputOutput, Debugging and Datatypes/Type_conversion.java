import java.util.Scanner;
// type Casting :
/*
When type of data assigned to the another type of variable,then automatic type conversion will take place if the follow conditions are mate
Conditions:->
1.The two type should be compatible.[string will not be converted into any other data type]
2.Destination type should be greater than the source type.
*/
public class Type_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      example of point - 1

        float num = input.nextInt();
        System.out.println(num);

//      example of point - 2

        int number = input.nextInt();// Enter float to get an ERROR
        System.out.println(number);

    }

}
