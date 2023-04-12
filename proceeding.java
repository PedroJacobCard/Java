import java.util.Scanner;
public class exempleProceeding {
    public static void soma(int n, int m) {
       int aux;
       aux = n + m;
       rest = aux;
    }
static int rest;
    public static void main(String[] args) {
        int n, m;
        Scanner read = new Scanner(System.in);
        System.out.println("type a number: ");
        n = read.nextInt();
        System.out.println("type another number: ");
        m = read.nextInt();
        soma(n, m);
        System.out.println(rest);
    }
    }
