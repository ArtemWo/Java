package org.example.HW22_03_23;

import java.lang.annotation.*;
import java.lang.reflect.*;

/*todo Сделать по аналогии с примером с аннотацией  @MyName (см. код в репозитории):
   Имеется класс Student с полями name, surname, age. Создать аннотацию @StudentInfo
   и соответствующий инжектор через рефлексию,
   чтобы с их помощью иметь возможность инициализировать переменные типа Student. Например:
   public class School {
   @StudentInfo(name = "Tom", surname = "Smith", age = 15)
   private Student student1;
   @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
   private Student student2;} */



public class Main{
	public static void main(String[] args) {

		School school = new School();
		System.out.println(school);
	}
}
