package Game.Unit;

public class Point {
    protected int x;
    protected int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    protected double getDistance(Point oponent){
        return Math.sqrt(Math.pow(x - oponent.x,2) + Math.pow(y - oponent.y,2));
    }

    protected boolean isLeft(Point oponent){
        return x < oponent.x;
    }

    protected Point chooseWay(Point opponent) {
        return new Point(x - opponent.x, y - opponent.y);
    }

   
}
