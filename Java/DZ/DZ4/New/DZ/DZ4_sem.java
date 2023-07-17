package DZ.DZ4.New.DZ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DZ4_sem {

    public static void main(String[] args) {

        // MapPrinter mp = new MapPrinter();
        // Ui ui = new Ui(mp, new ConsoleView());
        // int[][] m = new int[10][10];

        // mp.mapColor(m);
        // ui.setWallBlock(10, m);

        var mg = new MapGenerator();
        System.out.println(
        new MapPrinter().mapColor(
        mg.getMap()));

        var c = new Point2D(3, 3);
        var lee = new WaveAlgorithm(mg.getMap());
        lee.Colorize(c);

        System.out.println(new MapPrinter().rawData(mg.getMap()));

        mg.map[c.x][c.y] = -2;
        System.out.println();
        System.out.println();
        System.out.println(new MapPrinter().mapColor(mg.map));
    }
}

interface View {
    void print(String str);
}

class ConsoleView implements View {

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}

class Ui {
    Scanner in = new Scanner(System.in);
    Point2D catPos = new Point2D(0, 0);
    ArrayList<Point2D> exitPos = new ArrayList<Point2D>();
    MapPrinter mapPrinter;
    View view;

    public Ui(MapPrinter printer, View view) {
        mapPrinter = printer;
        this.view = view;
    }

    public Point2D getCatPos() {
        return catPos;
    }

    public void setCatPosition() {
        catPos = new Point2D(in.nextInt(), in.nextInt());
    }

    public ArrayList<Point2D> getExitPos() {
        return exitPos;
    }

    public void setExitPos(int count) {
        for (int i = 0; i < count; i++) {
            exitPos.add(new Point2D(in.nextInt(), in.nextInt()));
        }
    }

    public void setWallBlock(int count, int[][] map) {
        for (int i = 0; i < count; i++) {
            view.print(mapPrinter.mapColor(map));

            view.print("РЎС‚РµРЅР° " + i);
            Point2D exit = new Point2D(in.nextInt(), in.nextInt());
            map[exit.x][exit.y] = -1;
        }
    }

}

public class Point2D {
    int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d  y: %d", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        Point2D t = (Point2D) obj;
        return this.x == t.x && this.y == t.y;
    }
}

class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] map = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }

    public void setCat(Point2D pos) {
        map[pos.x][pos.y] = -2;
    }

    public void setExit(Point2D pos) {
        map[pos.x][pos.y] = -3;
    }
}

class MapPrinter {

    public String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%5d", map[row][col]));
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }

        return sb.toString();
    }

    public String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                switch (map[row][col]) {
                    case 0:
                        sb.append("рџ”¶");
                        break;
                    case -1:
                        sb.append("рџ”ґ");
                        break;
                    case -2:
                        sb.append("рџђ€");
                        break;
                    case -3:
                        sb.append("E");
                        break;
                    default:
                        sb.append("  ");
                        break;
                }
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }
}

class WaveAlgorithm {
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public void Colorize(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<Point2D>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    public ArrayList<Point2D> getRoad(Point2D exit) {
        ArrayList<Point2D> road = new ArrayList<>();
        ///
        return road;
    }
} 
