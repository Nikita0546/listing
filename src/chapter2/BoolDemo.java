public class BoolDemo {
    private boolean bool = false;

    BoolDemo() {
        this.log();
    }
    private void log() {
        System.out.println("b = " + this.bool);
    }

    public void set(boolean bool) {
        this.bool = bool;
        this.log();
    }

    public boolean get() {
        return this.bool;
    }

}
