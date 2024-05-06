class Joc {
    private static final char[][] taulell = new char[3][3];

    public Joc() {
        char torn = 'X';
    }

    public static void novaPartida() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taulell[i][j] = ' ';
            }
        }
    }

    /* 
    public void carregarPartida() {
    }
    */
}