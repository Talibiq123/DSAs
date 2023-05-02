package heaps;

import java.util.PriorityQueue;

public class KNearByCars {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSqr;
        int index;

        public Point(int x, int y, int distSqr, int index) {
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSqr - p2.distSqr; //assending order
        }
    }

    public static void main(String[] args) {
        int[][] pts = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSqr = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSqr, i));
        }

        //nearest k cars
        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.remove().index);
        }

    }
}
