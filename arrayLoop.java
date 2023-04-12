//import java.util.Scanner;

/*public class arrayLoop {
    public static void main(String[] args) {
        String [] names;
        names = new String[5];
        double[] grades = new double[5];
        double sum = 0, media = 0;
        int couter = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student name nº: " + (i+1));
            names[i] = new Scanner(System.in).nextLine();
            System.out.println("Enter student grade nº: " + (i+1));
            grades[i] = new Scanner(System.in).nextDouble();
            sum = sum + grades[i];
            couter = couter + 1;
        }

        media = sum / 5;
        System.out.println("The class media is: " + media);
    }
}*/
import java.util.Scanner;
public class arrayLoop {
    public static void main(String[] args) {
        String[] plantsName;
        plantsName = new String[7];
        int[] value = new int[7];
        int sum = 0;
        int counter = 1;


        do {
            System.out.println("Enter the name of the plant nº: " + (counter + 1));
            plantsName[counter] = new Scanner(System.in).nextLine();
            System.out.println("Enter the value of the plant " + plantsName[counter] + ":");
            value[counter] = new Scanner(System.in).nextInt();
            sum = sum + value[counter];
            counter++;
        } while (counter < 7);
        System.out.println("There are " + sum + " new plants");
    }
}
