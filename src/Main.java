import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Саатты жаз:");
        int hours = scanner.nextInt();
        int sumHorse = hours*3600;
        System.out.print("Минутаны жаз:");
        int minuts = scanner.nextInt();
        int minuts1 = minuts*60;
        System.out.print("Секунданы жаз:");
        int secunds = scanner.nextInt();
        int result = sumHorse+minuts1+secunds;
        System.out.println("Жалпысынан: "+result+" Секунда болду");
    }
}