package chapter05;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        //각 단의 학생 수가 3명으로 동일 할경우
        int[][] MathScores = new int[2][3];

        for (int i = 0; i < MathScores.length; i++) {
            for (int j = 0; j < MathScores[i].length; j++) {
                System.out.printf("MathScores[%d][%d] 초깃값: %d", i, j, MathScores[i][j]);
                MathScores[i][j] = (int) (Math.random() * 100) + 1;
                System.out.printf("/ 지정 후 값 : %d\n", MathScores[i][j]);
            }
        }

        System.out.println("---------------------------------------");
        //각 반의 학생 수가 다를 경우 점수
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[3];
        englishScores[1] = new int[2];
        for (int i = 0; i < englishScores.length; i++) {
            for (int j = 0; j < englishScores[i].length; j++) {
                System.out.printf("MathScores[%d][%d] 초깃값: %d", i, j, englishScores[i][j]);
                englishScores[i][j] = (int) (Math.random() * 100) + 1;
                System.out.printf("/ 지정 후 값 : %d\n", englishScores[i][j]);
            }
        }

    }
}
