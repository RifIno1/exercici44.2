import java.util.Scanner;

class Tui {

    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Sortir");
        System.out.print("Escull una opció: ");
        return scanner.nextInt();
    }

    public void mostrarTaulell(char[][] taulell, char torn) {
        System.out.println("Torn del jugador: " + torn);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(taulell[i][j] + " ");
            }
            System.out.println();
        }
    }

}
