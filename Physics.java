import java.util.Scanner;
import java.lang.Math;

public class Physics {
    static void main(){
        final double gravity = 9.8;
        final double pi = Math.PI;

        Scanner input  = new Scanner(System.in);
        System.out.print("Length: ");
        double length = input.nextDouble();
        double period = 2*pi*(Math.sqrt((length/gravity)));
        System.out.print(period);
        input.close();
    }
    public static void main(String[] args) {
        main();
    }
}
