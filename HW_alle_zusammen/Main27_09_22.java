package HW_Java.HW_alle_zusammen;

public class Main27_09_22 {
    public static void main(String[] args) {
        /*���������� �������� �����, ������� �������� ��� ����� �������� ����� � ���������
        ����� num1 � num2. ������, num1 ����� ���� ��� ������, ��� ������ ��� �����  num2.*/
        int num1 = 3;
        int num2 = 10;
        oddNumbers(num1, num2);
    }

    public static void oddNumbers(int num1, int num2) {
        if (num1 == num2 && num1 % 2 != 0) {
            System.out.println(num1);
        } else {
            int start = num1 > num2 ? num2 : num1;    // int start = Math.min(num1>num2? num2:num1)
            int end = num1 > num2 ? num1 : num2;      // int end = Math.min(num1>num2? num1:num2)
            for (int i = start; i < end; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
/*   ���������� �������� �����, ������� �������� ��� ����� ����� � ���������  ����� num1
        � num2. ��� ������� �����, ������� ������� �� 2 �������� ������� ��������� �� 2�.
        ��� ������� �����, ������� ������� �� 3 �������� ������� �������� �� 3�*/