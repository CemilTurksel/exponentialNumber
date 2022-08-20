import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int number,power,total=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();
        System.out.println("Enter the power: ");
        power = scanner.nextInt();
        for(int i = 1;i<=power;i++){total*=number;}
        System.out.println("Result is: "+total);
    }
}
