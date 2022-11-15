package HW_Java.HW_alle_zusammen;

public class MULTIPLICATION_TABLE {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[11][11];
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                MULTIPLICATION_TABLE[i-1][j-1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i-1][j-1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
