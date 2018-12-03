package Strefa;

public enum Superbohater {
    BATMAN(10), SUPERMAN(5), SPIDERMAN(1);

    private int moc;

    Superbohater(int moc) {
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }
}
