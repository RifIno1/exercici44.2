public class Main {

    public static void main(String[] args) {

        TUI tui = new TUI();
        JOC joc = new JOC();

        int resultado = tui.mostrarMenu();
        System.out.print(resultado);
        switch (resultado){
            case 1:
                nuevapartida();
                break;
            case 2:
                cargapartida();
                break;
            case 3:
                configuracion();
                break;
            case 4:
                salir();
                break;
        }
    
    
    }

    public static void nuevapartida() {
    }

    public static void cargapartida() {
    }

    public static void configuracion() {
    }

    public static void salir() {
    }

    
    
}