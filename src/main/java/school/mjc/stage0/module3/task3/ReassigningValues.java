package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first = 1;
        int second = 10;
        int third = 100;

        // Print their initial values
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Create new variables that reference the initial values
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        // Reassign values to the original variables
        first = 15;
        second = 6;
        third = 4;

        // Print all variables again in the order they were declared
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
