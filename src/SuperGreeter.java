import java.util.Scanner;
public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hvad hedder du?");
        String navn = sc.next();
        sg.navn(navn);

        System.out.println("Hvor gammel er du?");
        int alder = sc.nextInt();
        sg.alder(alder);
    }

    public void start() {
        System.out.println("Det virker");
    }

    public void navn(String navn) {
        System.out.println("Hello: " + navn);
    }

    public void alder(int alder) {
        System.out.println("Du er: " + alder);
    }
}
