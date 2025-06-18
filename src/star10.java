public class star10 {

        public static void main(String[] args) {
            int size = 5;

            for (int i = 0; i < size; i++) {         // 줄
                for (int j = 0; j < size; j++) {     // 칸

                    if (i == 0 || i == 4) {
                        // 첫째 줄, 다섯째 줄: 양 끝에만 별
                        if (j == 0 || j == size - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    } else if (i == 1 || i == 3) {
                        // 둘째 줄, 넷째 줄: 0,1번 별 + 2번 공백 + 3,4번 별
                        if (j == 0 || j == 1 || j == 3 || j == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    } else {
                        // 가운데 줄: 전부 별
                        System.out.print("*");
                    }

                }
                System.out.println(); // 줄바꿈
            }
        }
    }
