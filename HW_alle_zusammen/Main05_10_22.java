package HW_Java.HW_alle_zusammen;

public class Main05_10_22 {
    public static void main(String[] args) {
        String[] students = {"Jack", "John", "Stan", "Ed"};
        double[] score = {2.9, 3.2, 2.2, 1.8,};


        System.out.println("Best student is:  " + nameBestStudent(students, score));

    }

    /*  1.  Дано 2 массива. Первый массив String[] содержит имена студентов.
    Второй массив double[] содержит средний балл  студентов. i-й элемент первого
     массива соответствует i-элементу второго массива. Длины массивов равны.
     Необходимо написать метод, который возвращает имя самого успешного студена.
     В данной задаче, если 2 и более студента имеют лучший бал, метод может
     вернуть имя любого из них. */

    public static double nameBestStudent(String[] students, double[] score) {
        double bestScore = 0;
        String bestStudent = "";

        for (int i = 0; i < score.length; i++) {
            if (bestScore < score[i]) {
                bestScore = score[i];
                bestStudent = students[i];
            }
        }
        return bestScore;
    }
}