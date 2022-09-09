import java.util.Scanner;
public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Hvad hedder du?");
        String navn = sc.next();
        sg.navn(navn);
    }

    public void start() {
        System.out.println("Det virker");
    }

    public void navn(String navn) {
        System.out.println("Hello: " + navn);
    }
}
