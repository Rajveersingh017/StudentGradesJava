import java.util.Arrays;
import java.util.*;

public class arrayList{
	public static void main(String[] args) {

		Scanner userinp = new Scanner(System.in);

		Random rand = new Random();
		int randomNum;

		ArrayList<StudentGrades> course = new ArrayList<StudentGrades>();

		System.out.print("Enter number of students of course1: ");
		StudentGrades math = new StudentGrades(new int[userinp.nextInt()]);
		course.add(math);

		System.out.print("Enter number of students of course2: ");
		StudentGrades eng = new StudentGrades(new int[userinp.nextInt()]);
		course.add(eng);

		System.out.print("Enter number of students of course3: ");
		StudentGrades sci = new StudentGrades(new int[userinp.nextInt()]);
		course.add(sci);

		for(StudentGrades i: course){
			for(int g=0; g< i.getGrades().length; g++){
				randomNum = rand.nextInt((100 - 1) + 1) + 1;
				i.getGrades()[g]= randomNum;
			}
		}
		int count = 1;
		for (StudentGrades i: course){
			System.out.println("COURSE Number: " + count);
			System.out.print(i);
			count++;
		}
        System.out.println();
		System.out.println("LAST ELEMENT BEFORE REMOVE:");
		System.out.println();
		count = 1;
		for (StudentGrades i: course){
			System.out.println("COURSE Number: " + count);
			System.out.print(i);
			count++;
		}
		course.remove(2);
		System.out.println();
		System.out.println("LAST ELEMENT AFTER REMOVE:");
		System.out.println();

		count = 1;
		for (StudentGrades i: course){
			System.out.println("COURSE Number: " + count);
			System.out.print(i);
			count++;
		}
	}
}

