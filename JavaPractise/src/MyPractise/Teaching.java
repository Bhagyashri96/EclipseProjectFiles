package MyPractise;

public class Teaching{
	
	Teaching(){}
	
	public static void teachingTech(Teacher t) {
		t.teaching();//Runtime polymorphism passing object on run time
	}

	public static void main(String[] args) {
		/*
		 * ScineceTeacher st = new ScineceTeacher(); st.teaching(); ArtsTeacher st2 =
		 * new ArtsTeacher(); st2.teaching();
		 */
		teachingTech(new ScineceTeacher());
		teachingTech(new ArtsTeacher());
	}

}
