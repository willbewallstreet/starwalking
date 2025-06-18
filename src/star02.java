public class star02 {
    public static void main(String[] args) {

        System.out.println("2.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
    }
}


