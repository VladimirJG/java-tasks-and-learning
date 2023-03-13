package other;

public class test1 {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);
        System.out.println(line1.intersection(line2)); // (1;2)
    }
}

class Line {
    double k;
    double b;

    Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    Point intersection(Line line) {
        if (this.k == line.k) {
            return null;
        }
        double x = (line.b - this.b) / (this.k - line.k);
        double y = this.k * x + this.b;

        return new Point(x,y);
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
