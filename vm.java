import java.util.Scanner;
public class vm {
    public static void timeCal(int initialTime, int finalTime, int d){
        int aux, time;
        time = finalTime - initialTime;
        aux = d / time;
        result = aux;
    }

    static int result;

    public static void main(String[] args){
        int initialTime, finalTime, d;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the initial time:");
        initialTime = read.nextInt();
        System.out.println("Enter the final time:");
        finalTime = read.nextInt();
        System.out.println("Enter the distance:");
        d = read.nextInt();
        timeCal(initialTime, finalTime, d);
        System.out.println("The Vm is: " + result);
    }
}
