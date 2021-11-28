public class Automatic_type_promotion {
    public static void main(String[] args) {

        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);

        // Automatic type promotion in expression

        byte x = 40;
        byte y = 50;
        byte z = 100;

        int res_ = (x*y)/z;

        System.out.println(res_);

        /*
         The result of intermediate term [a*b] easily exceeds the range of byte datatype
         to handle this kind of problem java automatically is promoting each byte to integer when evaluating this expression
        */

//        byte w = 10;
//        byte q =w*26;
//        System.out.println(q);

        /*
        Evaluation performs btw integer values in a given expression
         */

    /*
    Rule for automatic type Promotion in expression:

    All the byte,char,short values are promoted to integer then if any one of the operands is long,the whole expression
    is Promoted to long ,if it is float the whole expression is promoted to float,if it is double the whole expression
    is promoted to double.

     */

        byte A = 42;
        char B = 'a';
        short C = 1024;
        int D = 50000;
        float E = 5.67f;
        double F = 0.1234;

        double result = (E*A) + (D/B) - (F-C);
        //                ^       ^       ^
        //              float    int    double = double (because is biggest them all)
        System.out.println((E*A) +" "+ (D/B) +" "+ (F-C));
        System.out.println(result);
    }
}
