class Joc {
    private char[][] taulell;
    private char torn;

    public Joc() {
        this.taulell = new char[3][3];
        this.torn = 'X'; // Comença el jugador X
        novaPartida();
    }

    public void novaPartida() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taulell[i][j] = ' ';
            }
        }
    }

    public void carregarPartida() {
    }
}