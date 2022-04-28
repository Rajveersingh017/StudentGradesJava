
public class test
{
    public static void main(String [] args)
    {
        int [] asd = {54,56,13,55,16};

        StudentGrades obj_1 = new StudentGrades(5);

        System.out.print(
        "TESTING THE FIRST CONSTRUCTOR\n"+
        "------EXPECTED-----\n"+
        "===================\n"+
        "Student       Grade\n" +
        "===================\n"+
        0 + "\t\t" + 0 +"\n"+
        1 + "\t\t" + 0 +"\n"+
        2 + "\t\t" + 0 +"\n"+
        3 + "\t\t" + 0 +"\n"+
        4 + "\t\t" + 0 +"\n\n\n"
        );

        System.out.println("------ACTUAL-----");
        System.out.println(obj_1.getGrades());

        System.out.print(
        "TESTING THE OVERLOADED CONSTRUCTOR\n"+
        "------EXPECTED-----\n"+
        "===================\n"+
        "Student       Grade\n" +
        "===================\n"+
        0 + "\t\t" + 54 +"\n"+
        1 + "\t\t" + 56 +"\n"+
        2 + "\t\t" + 13 +"\n"+
        3 + "\t\t" + 55 +"\n"+
        4 + "\t\t" + 16 +"\n\n\n"
        );

        System.out.println("------ACTUAL-----");
        StudentGrades obj_2 = new StudentGrades(asd);
        System.out.println(obj_2.getGrades());


        System.out.print(
        "TESTING THE SET GRADE METHOD\n"+
        "------EXPECTED-----\n"+
        "===================\n"+
        "Student       Grade\n" +
        "===================\n"+
        0 + "\t\t" + 96 +"\n"+
        1 + "\t\t" + 6 +"\n"+
        2 + "\t\t" + 83 +"\n"+
        3 + "\t\t" + 54 +"\n"+
        4 + "\t\t" + 10 +"\n\n\n"
        );


        obj_2.setGrades(new int[]{96,6,83,54,10});
        System.out.println("------ACTUAL-----");
        System.out.println(obj_2.getGrades());

        System.out.print(
        "TESTING THE GET SORTED GRADE METHOD\n"+
        "------EXPECTED-----\n"+
        "===================\n"+
        "Student       Grade\n" +
        "===================\n"+
        0 + "\t\t" + 6 +"\n"+
        1 + "\t\t" + 10 +"\n"+
        2 + "\t\t" + 54 +"\n"+
        3 + "\t\t" + 83 +"\n"+
        4 + "\t\t" + 96 +"\n\n\n"
        );


 		obj_2.getSortedGrades();
        System.out.println("------ACTUAL-----");
        System.out.println(obj_2.getGrades());

        System.out.print(
        "TESTING THE GET HIGHEST GRADE METHOD\n"+
        "------EXPECTED-----\n"+
        96 + "\n"
        );

        System.out.println("------ACTUAL-----");
        System.out.println(obj_2.getHighestGrade());


        System.out.print(
        "TESTING THE GET AVERAGE GRADE METHOD\n"+
        "------EXPECTED-----\n"+
        49.8 + "\n"
        );

        System.out.println("------ACTUAL-----");
        System.out.println(obj_2.getAverageOfGrades());



        System.out.print(
        "TESTING THE toString METHOD\n"+
        "------EXPECTED-----\n"+
        "===================\n"+
        "Student       Grade\n" +
        "===================\n"+
        0 + "\t\t" + 6 +"\n"+
        1 + "\t\t" + 10 +"\n"+
        2 + "\t\t" + 54 +"\n"+
        3 + "\t\t" + 83 +"\n"+
        4 + "\t\t" + 96 +"\n\n\n"
        );

        obj_2.getSortedGrades();
        System.out.println("------ACTUAL-----");
        System.out.println(obj_2.toString());

    }

}