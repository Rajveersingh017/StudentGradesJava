/**
* Represent StudentGrades class.
*
* @author Rajveer
* @version 1.0
*/
import java.util.Arrays;

public class StudentGrades{

	/**
	* The constant grades is declared,
	* to store the value of grades.
	*
	* @param grades A empty array to store the grades.
	*
	*/

	private int[] grades;

	/**
	* The default constructor is going to
	* iniates the array with null elements
	*
	* @param numberOfStudents A variable that stores
	* the amount of null elements required to initate the array.
	*
	*/

	public StudentGrades(int numberOfStudents){

		this.grades = new int[numberOfStudents];
	}

	/**
	* The overloaded constructor calls the
	* the copyArray() method to remove the
	* refrence of the user input and makes
	* a new array.
	*
	* @param copyArray() A method to copy the array.
	*
	*/

	public StudentGrades(int[] newGradess){

		this.grades = copyArray(newGradess);
	}

	/**
	* Method to copy and remove the reference of the array.
	*
	* @return The array with a new reference.
	*/

	private int[] copyArray(int[] newGrades){

		this.grades = new int[newGrades.length];
		for(int i=0; i< newGrades.length; i++){
			this.grades[i]= newGrades[i];
		}
		return this.grades;
	}

	/**
	* Method to display the array
	*
	* @return Returns the array.
	*/

	public int[] getGrades(){
		return this.copyArray(grades);
		// return Arrays.toString(this.grades);
	}

	/**
	* Method to set the grades by calling copyArray()
	*
	* @return Returns the array.
	*/

	public int[] setGrades(int[] newGrades){
		this.grades = copyArray(newGrades);
		// return Arrays.toString(this.grades);
		return this.grades;
	}

	/**
	* Method to sort the grades into acesending order
	*
	* @return Returns the array that is sorted into acesending order
	*/

	// public String getSortedGrades(int[] newGrades){
	public int[] getSortedGrades(){
		int[] tempo = this.copyArray(grades);
		int temp = 0;
		// this.grades= copyArray(newGrades);
		for(int i=0; i< tempo.length; i++){
			for(int j=0; j<grades.length; j++){
				if (tempo[i]<tempo[j]){
					temp = tempo[i];
					tempo[i]=tempo[j];
					tempo[j]=temp;
				}
			}

		}
		// return Arrays.toString(this.grades);
		return tempo;
	}

	/**
	* Method to display the highest element of the array
	*
	* @return Returns the highest no. of grades.
	*/

	public int getHighestGrade(){
		int high = 0;
		for(int i=0; i< grades.length; i++){
			if (high<grades[i]){
				high=grades[i];
			}
			else{
				continue;
			}
		}
		return high;
	}

	/**
	* Method to find the average of the array
	*
	* @return Returns the average of the array.
	*/

	public double getAverageOfGrades(){

		double total = 0;
		double average;
		for(int i=0; i < this.grades.length; i++){
			total += grades[i];
		}
		average = total/this.grades.length;
		return average;
	}

	/**
	* Method to meet the toString output
	*
	* @return Returns the elements of the array, one by one.
	*/

	public void forToString(){
		for(int i=0; i < grades.length; i++){
			System.out.println(i+1+" "+this.grades[i]);
		}
	}

	/**
	* Method to print the array
	*
	* @return Returns the array.
	*/

	public String toString(){
		String aer = "";

    	System.out.println(

    	"===================\n"+
        "Student       Grade\n" +
        "==================="
        
        );
		for(int i = 0;  i < grades.length; i++){
				aer += i + "\t\t" + grades[i] + "\n";
			}
		return aer;
	}
}
