import java.util.Scanner;
public class objectLoop {
    public static void main(String[] args) {
        Plant[] plants = new Plant[7];
        int sum = 0;
        int counter = 0;

        do {
            System.out.println("Enter the name of the plant: " + (counter + 1));
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter the number of how many " + name + ":");
            int number = new Scanner(System.in).nextInt();
            plants[counter] = new Plant(name, number);
            sum += number;
            counter++;
        } while (counter < 7);
        System.out.println("There are: " + sum + " new plants");

        for(Plant plant : plants) {
            System.out.println( plant.getValue() + ":" );
            System.out.println(plant.getName());
        }
    }
}

class Plant {
    private String name;
    private int value;

    public Plant(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value; 
    }
}
