public class star04 {
    public static void main(String[] args) {
        // 배열 크기

        for (int i = 0; i < 5; i++) {          // 행
            for (int j = 0; j < 5; j++) {      // 열
                if (i == j || j == 5 - 1-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // 줄바꿈
        }
    }
}
