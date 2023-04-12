public class function {
    static int res, n, m;
    public static int sum(){
        int aux;
        aux = n + m;
        return aux;
    }

    public static void main(String[] args) {
        n = 4;
        m = -9;
        res = sum();
        System.out.println(res);
    }
}
