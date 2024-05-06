class Joc {
    private static final char[][] taulell = new char[3][3];

    public Joc() {
        char torn = 'X';
    }

    public static void novaPartida() {
        char torn = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taulell[i][j] = ' ';
            }
        }
    }

    // check if the game is over
    public static boolean comprovarGuanyador(char torn) {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (taulell[i][0] == torn && taulell[i][1] == torn && taulell[i][2] == torn) {
                return true;
            }
        }
        // check columns
        for (int i = 0; i < 3; i++) {
            if (taulell[0][i] == torn && taulell[1][i] == torn && taulell[2][i] == torn) {
                return true;
            }
        }
        // check diagonals
        if (taulell[0][0] == torn && taulell[1][1] == torn && taulell[2][2] == torn) {
            return true;
        }
        if (taulell[0][2] == torn && taulell[1][1] == torn && taulell[2][0] == torn) {
            return true;
        }
        return false;
        
    }

    /* 
    public void carregarPartida() {
    }
    */
}