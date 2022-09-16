package StudentMarksComparator;

public class Driver {

	public static void main(String[] args) {
		Student helen = new Student("Helen");
		helen.addMarks("English", 63);
		helen.addMarks("Maths", 78);
		helen.addMarks("History", 93);
		helen.addMarks("Geography", 100);

		Student leslie = new Student("Leslie");
		leslie.addMarks("English", 59);
		leslie.addMarks("Maths", 90);
		leslie.addMarks("History", 88);
		leslie.addMarks("Geography", 100);

		if (helen.compareTo(leslie) > 0){
			System.out.println(helen.getName() + " gets a higher total mark");
		}
		else if (helen.compareTo(leslie) == 0){
			System.out.println("Both students have the same mark");
		}
		else{
			System.out.println(leslie.getName() + " gets the higher total mark");
		}
	}

}
