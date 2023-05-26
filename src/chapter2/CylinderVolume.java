public class CylinderVolume {
    private double radius, height, volume;

    CylinderVolume(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    CylinderVolume() {
        this.radius = 4;
        this.height = 5;
    }

    public double get_cylinder() {
        this.volume = 3.1416 * this.radius * this.radius * height;
        return this.volume;
    }
}
