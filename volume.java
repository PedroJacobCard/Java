public class volume {
    static float r, v;

    public static float theVolume(){
        double pi = Math.PI;
        float b;
        b =  (float) (4.0/3.0 * pi * Math.pow(r,3));
        return b;
    }

    public static void main(String[] args) {
        r = 3;
        v = theVolume();
        System.out.println(v);
    }
}
