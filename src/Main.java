public class Main {

    public static void main(String[] args) {

        Tui tui = new Tui();
        Joc joc = new Joc();

        int resultado = tui.mostrarMenu();
        System.out.print(resultado);
        switch (resultado){
            case 1:
                Joc.novaPartida();
                break;
            case 2:
                /*
                joc.carregarPartida();
                */
                break;
            case 3:
                System.exit(0);
                break;


        }
    
    
    }



    
    
}