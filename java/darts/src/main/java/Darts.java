class Darts {

    private Double distance;

    Darts(double x, double y) {
        this.distance = x * x + y * y;
    }

    private boolean withinRadius(int r) {
        return this.distance <= r * r;
    }

    int score() {
        if (withinRadius(1)) {
            return 10;
        } else if (withinRadius(5)) {
            return 5;
        } else if (withinRadius(10)) {
            return 1;
        } else {
            return 0;
        }
    }

}
