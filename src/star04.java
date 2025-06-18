public class star04 {
    public static void main(String[] args) {
        int size = 5;  // 배열 크기

        for (int i = 0; i < size; i++) {          // 행
            for (int j = 0; j < size; j++) {      // 열
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // 줄바꿈
        }
    }
}
