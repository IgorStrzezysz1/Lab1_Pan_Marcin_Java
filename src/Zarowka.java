public class Zarowka {
    private boolean czySwieci;
    private boolean czySpalona = false;

    public void zapal() {
        if (!czySpalona) {
            czySwieci = true;
        }
    }

    public void zgas() {
        if (!czySpalona) {
            czySwieci = false;
        }
    }

    public boolean sprawdzCzySwieci() {
        return czySwieci;
    }

    public boolean sprawdzCzySpalona() {
        return czySpalona;
    }

    public void spal() {
        czySwieci = false;
        czySpalona = true;
    }
}
