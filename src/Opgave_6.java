public class Opgave_6 {
    public static void main(String[] args) {
        //Test case hvor sidste værdi er midterst
        //Input: a = 6, b = 10, c = 8
        //Forventet output: 8

        //input
        int a = 6;
        int b = 10;
        int c = 8;

        //forventet output
        int output = midterst(a, b, c);

        if (output == 8)
            System.out.println("pass");
        else
            System.out.println("fail");



        //Test case hvor midterste værdi er midterst
        //Input: a = 3, b = 7, c = 2
        //Forventet output 3

        //input
        a = 3;
        b = 7;
        c = 2;

        //forventet output
        output = midterst(a, b, c);

        if (output == 3)
            System.out.println("pass");
        else
            System.out.println("fail");


        //Test case hvor midterste værdi er midterst
        //Input: a = 10, b = 25, c = 50
        //Forventet output = 25
        a = 10;
        b = 25;
        c = 50;

        //forventet output
        output = midterst(a, b, c);

        if (output == 25)
            System.out.println("pass");
        else
            System.out.println("fail");

        //Test case hvor midterste værdi er midterst
        //Input: a = 6, b = 6, c = 10
        //Forventet output = 6
        a = 6;
        b = 6;
        c = 10;

        //forventet output
        output = midterst(a, b, c);

        if (output == 6)
            System.out.println("pass");
        else
            System.out.println("fail");

    }

    static int midterst(int a, int b, int c) {
        if (a <= b && b < c || a > b && b > c) {
            System.out.println(b);
            return b;
        } else if (b <= a && a < c || b > a && a > c) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(c);
            return c;
        }
    }
}


