public class star09{

        public static void main(String[] args) {
            // 각 줄의 공백 개수
            int[] spaces = {0, 1, 2, 1, 0};
            // 각 줄의 별 개수
            int[] stars =  {5, 3, 1, 3, 5};

            for (int i = 0; i < stars.length; i++) {
                // 공백 출력
                for (int s = 0; s < spaces[i]; s++) {
                    System.out.print(" ");
                }
                // 별 출력
                for (int j = 0; j < stars[i]; j++) {
                    System.out.print("*");
                }
                System.out.println(); // 줄바꿈
            }
        }
    }