package org.example.HW22_03_23;

import java.lang.reflect.Field;


class School{
	// Поля с аннотацией @StudentInfo
	@StudentInfo(name = "Tom", surname = "Smith", age = 15)
	private Student student1;

	@StudentInfo(name = "Mary", surname = "Jennings", age = 17)
	private Student student2;

	@StudentInfo(name = "Tim", surname = "Prit", age = 27)
	private Student student3;

	@StudentInfo(name = "Kony", surname = "Ivashov", age = 45)
	private Student student4;

	public School() {
		initStudents();
	}


	private void initStudents() {
		// Получаем все поля класса School
		Field[] fields = School.class.getDeclaredFields();

		for(Field field : fields) {

			if(field.isAnnotationPresent(StudentInfo.class)) {
				// Получаем значения параметров аннотации @StudentInfo
				StudentInfo annotation = field.getAnnotation(StudentInfo.class);
				String name = annotation.name();
				String surname = annotation.surname();
				int age = annotation.age();
				try {

					field.setAccessible(true);
					field.set(this, new Student(name, surname, age));
				} catch(IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public String toString() {
		return "\n"+ "School " + "student1: " + student1 +"\n"+ " |     student2: " + student2 +"\n"+
				" |     student3: " + student3 +"\n"+  " |     student4: " + student4;
	}
}
