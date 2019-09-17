public class Opgave_4 {
    public static void main(String[] args) {
        int First = 50;
        int Second = 20;
        int Third = 10;
        if (First > Second && Third < First) {
            System.out.println(First);
        }
        else if (Second > Third && First < Second) {
            System.out.println(Second);
        }
        else {
            System.out.println(Third);
        }
        }
}
