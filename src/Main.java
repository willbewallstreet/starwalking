public class Main {
    public static void main(String[] args) {
        System.out.println("1.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("2.");
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j <=i-1; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }

        System.out.println("3.");
        for(int i =1; i <= 5; i++) {
            for(int j = i-1; j <=5; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }



        System.out.println("\n6.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        }


}
