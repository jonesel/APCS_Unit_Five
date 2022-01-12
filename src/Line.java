class Line {

    private int a, b, c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        return (double)a/b * -1;
    }

    public boolean isOnLine(int x, int y) {
        return a*x + b*y + c == 0;
    }

    public boolean isParallel(Line other) {
        return this.getSlope() == other.getSlope();
    }

    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }

}
