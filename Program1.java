public class Program1 {
    public static void main(String enter[]){
        int numInt;
        double numReal, calc;
        char chart;

        numInt = Integer.parseInt(enter[0]);
        numReal = Double.parseDouble(enter[1]);
        chart = (enter[2]).charAt(0);

        switch(chart){
            case '+': calc = (double)numInt + numReal;
            case '-': calc =(double)numInt - numReal;
            case '*': calc =(double)numInt * numReal;
            case '/': calc =(double)numInt / numReal;
            System.out.println("The calc is " + (double)numInt + chart + numReal + " = " + calc + " signal " + chart);
        }
        //soma = (double)numInt + numReal;
        System.exit(0);
    }
}
