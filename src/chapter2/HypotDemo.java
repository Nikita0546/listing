public class HypotDemo {
    private double cathetus1, cathetus2, hypot;

    public double get_hypot() {
        return this.hypot;
    }

    public void calculate_hypot(double cath1, double cath2) {
        this.cathetus1 = cath1;
        this.cathetus2 = cath2;
        this.hypot = Math.sqrt((this.cathetus1 * this.cathetus1) + (this.cathetus2 * this.cathetus2));


    }

}
