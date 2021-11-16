package MyPractise;

public class ArtsTeacher extends Teaching  implements Teacher{

	@Override
	public void teaching() {
	System.out.println("Teaching only theory");
	}

}
