package homeWork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Lesson lesson1 = new Lesson();
		lesson1.id= 1;
		lesson1.name= "Yazılım Geliştirme Kampı (C#+ ANGULAR)";
		lesson1.detail= "2 ay sürecek yazılım geliştirme kampızın, takip, döküm..";
		lesson1.duration= 2;
		lesson1.instructorName= "Engin Demirog";
		
		Lesson lesson2 = new Lesson();
		lesson2.id= 2;
		lesson2.name= "Yazılım Geliştirme Kampı (JAVA+ REACT)";
		lesson2.detail= "2 ay sürecek yazılım geliştirme kampızın, takip, döküm..";
		lesson2.duration= 2;
		lesson2.instructorName= "Engin Demirog";
		
		Lesson lesson3 = new Lesson();
		lesson3.id= 3;
		lesson3.name= "Programlamaya giriş için temel kurs";
		lesson3.detail= "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.";
		lesson3.duration= 1;
		lesson3.instructorName= "Engin Demirog";
		
		Lesson[] lessons = {lesson1, lesson2, lesson3};
		System.out.println(lessons.length);
		
		for (Lesson lesson: lessons) {
			System.out.println(lesson.name);
		}
				
		Category category1 = new Category();
		category1.id= 1;
		category1.name= "Tümü";
		
		Category category2 = new Category();
		category2.id= 2;
		category2.name= "Programlama 3";
		
		
		Category[] categories= {category1, category2};
		
		for (Category category: categories) {
			System.out.println(category.name);
		}
			
		LessonManager lessonManager= new LessonManager();
		lessonManager.logIn();
		
		LessonManager lessonManager1= new LessonManager();
		lessonManager1.analyse(category1);
		lessonManager1.analyse(category2);
		
		}
	}

