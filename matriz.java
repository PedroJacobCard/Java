import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        int students;
        System.out.println("Enter the number of how many students:");
        students = new Scanner(System.in).nextInt();
        int studentsGrade;
        System.out.println("Enter the number of how many grade:");
        studentsGrade = new Scanner(System.in).nextInt();
        int[][] numbers = new int[students][studentsGrade];
        int grade, sum = 0;
        String name = "";

        for(int i = 0; i < students; i++) {
            System.out.println("Enter a Student Name");
            name = new Scanner(System.in).nextLine();
            for(int j = 0; j < studentsGrade; j++) {
                System.out.println("Enter the " + (j+1) + " grade of " + name);
                grade = new Scanner(System.in).nextInt();
                sum = sum + grade;
                numbers[i][j] = sum;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("The grade of " + (name) + " are " + (sum));
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println("End of execution.");
    }
}
