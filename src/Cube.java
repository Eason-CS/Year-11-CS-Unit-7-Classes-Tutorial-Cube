public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            System.out.println("A cube’s side length cannot be less than 1! Setting side to 1.");
            this.side = 1;
        } else {
            this.side = side;
        }
    }

    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public Cube(int side) {
        setSide(side);
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }
}