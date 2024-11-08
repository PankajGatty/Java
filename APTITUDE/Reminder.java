public class Reminder {
    public static void main(String[] args) {
        int A=55;
        int B=3;

        if (B == 0) {
            System.out.println("Can not do Divisible");
        } else {
            int reminder = A % B;
            System.out.println("The reminder when " + A + " is divided by " + B + " is: " + reminder);
        }
    }
}
