import java.util.Scanner;

class Tui {
    Scanner scanner;

    public Tui() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
        System.out.print("Escull una opció: ");
        return scanner.nextInt();
    }

}