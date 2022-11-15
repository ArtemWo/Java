package HW_Java.HW_alle_zusammen;

public class Main22_09_222 {
    public static void main(String[] args) {
        /*���������� �����, ������� ������� 3 ����� int ����������,
        ���� �� ����� ��� �����, ������� ����� ����� ���� ������.*/

       /* System.out.println("Summa dvuch chisel "+(sum(16, 8, 8)));
    }
    public static int sum(int x, int r, int o) {
        int sum1 = x + r;
        System.out.println((sum1 == o) + " -'O' Sovpadenia");
        int sum2 = x + o;
        System.out.println((sum2 == r) + " -'R' Sovpadenia");
        int sum3 = r + o;
        System.out.println((sum3 == x) + " -'X' Sovpadenia");

        if (sum1 == x || sum1 == r || sum1 == o) {
            return sum1;
        }
        if (sum2 == x || sum2 == r || sum2 == o) {
            return sum2;
        }
        if (sum3 == x || sum3 == r || sum3 == o) {
            return sum3;
        }
        return sum1;*/
        //------------------------------------------------------------------------------------------------------
  /*      int num1 = 34;
        int num2 = 45;
        int num3 = 89;
        System.out.println(checkNumbers(num1, num2, num3));
    }

        public static boolean checkNumbers(int num1, int num2, int num3){
                   return num1==num2+num3 || num2==num1+num3 || num3==num1+num2;
        }*/

//======================================================================================
     /*�����������, �� ������ ��������� ��� ������� ������� �� ���������� ��������.
        � �������� �������� ������ � ���: ����������� �������� �� ������ ������� ������ � ��������,
        � ������� �������� ���������� ������� ������� �����:
        - ���������� ����� 10% �� ����������� ����������� � �� ����������
        - 10% - ����� 20%   �� ����������� ����������� � 50 ����
            - 20% - ����� 30%   �� ����������� ����������� � 150 ����
            - �� 30% � ���� - 500 ���� ����
        ���������� ���������, ������� ������������ ����� � ������� ��������������� ��������� �� �����.*/

        // System.out.println("Vascha skorost` bila: " + (speedAuto(58)) + "km/h");


   /* public static int speedAuto(int checkSpeed) {

        int limitSpeed = 50;
        System.out.println("Limit speed: " + limitSpeed + "km/h");
        int x = (checkSpeed * 100) / (limitSpeed);
        int y = x - 100;
        System.out.println("Vi previsili skorost` na: " + y + "%");
        int a = 10; //10%
        int d = 20; //20%
        int f = 30; //30%


        if (y < a) {
            System.out.println("Schtrafa net vascha skorost`: " + checkSpeed + "km/h");
        }

        if ((y >= a) && (y < d)) {
            System.out.println("SCHTRAF 50�");
        }

        if (y >= d && y < f) {
            System.out.println("SCHTRAF 150�");

        } else if (y >= f) {
            System.out.println("SCHTRAF 500�");
        }

        return checkSpeed;
    }*/
//---------------------------------------------------------------------------------------
        int speedLimit=70;
        int speed=77;
        System.out.println(cslcFine(100));
    }
               public static double calcDiffPercent(int speedLimit, int speed){
                   if (speed>speedLimit){
                       return (speed/speedLimit)*100-100;
                   }else{
                       return 0;
                   }
               }
              public static int cslcFine(double diffPercent ){
               if (diffPercent<10) return 0;
               if (diffPercent>=10 && diffPercent<20) return 50;
               if (diffPercent>=20 && diffPercent<30) return 150;
               if (diffPercent>=30) return 500;

                  return 0;
              }
}

