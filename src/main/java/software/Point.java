package software;

public record Point(int i, int j) {
    public static Point at(int i, int j){return new Point(i,j);}

    public Point add(Point point) {return new Point(this.i + point.i, this.j+ point.j);}
}
