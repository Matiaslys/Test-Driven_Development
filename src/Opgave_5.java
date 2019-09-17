public class Opgave_5 {
    public static void main(String[] args) {
        int x = 62;
        int heltal;
        heltal = x/10;
        switch (heltal) {
            case 0:
                System.out.println("[0:9]");
                break;
            case 1:
                System.out.println("[10:19]");
                break;
            case 2:
                System.out.println("[20:29]");
                break;
            case 3:
                System.out.println("[30:39]");
                break;
            case 4:
                System.out.println("[40:49]");
                break;
            case 5:
                System.out.println("[50:59]");
                break;
            case 6:
                System.out.println("[60:69]");
                break;
            case 7:
                System.out.println("[70:79]");
                break;
            case 8:
                System.out.println("[80:89]");
                break;
            case 9:
                System.out.println("[90:99]");
                break;
        }
    }
}
