public class Lampka {
    private boolean czySwieci;
    private int silaSwiecenia;
    private Zarowka zarowka;

    public void wlacz() {
        czySwieci = true;
    }

    public void wylacz() {
        czySwieci = false;
    }

    public void rozjasnij() {
        if (silaSwiecenia == 10) {
            zarowka.spal();
        } else {
            silaSwiecenia++;
        }
    }

    public void sciemnij() {
        if (silaSwiecenia <= 1) {
            silaSwiecenia = 0;
            zarowka.zgas();
        } else {
            silaSwiecenia--;
        }
    }
}
