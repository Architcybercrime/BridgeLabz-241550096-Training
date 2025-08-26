// Dijkstra shortest paths on weighted graph using adjacency list and priority queue
import java.util.*;
public class DijkstraShortestPath {
    static class Edge { int to; int w; Edge(int t,int w){to=t;this.w=w;} }
    public static int[] dijkstra(int n, List<Edge>[] g, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int u = cur[0], d = cur[1];
            if (d!=dist[u]) continue;
            for (Edge e: g[u]) {
                if (dist[e.to] > dist[u] + e.w) {
                    dist[e.to] = dist[u] + e.w;
                    pq.add(new int[]{e.to, dist[e.to]});
                }
            }
        }
        return dist;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        int n = 5;
        List<Edge>[] g = new ArrayList[n];
        for (int i=0;i<n;i++) g[i]=new ArrayList<>();
        // build sample graph
        g[0].add(new Edge(1,10));
        g[0].add(new Edge(2,3));
        g[1].add(new Edge(2,1));
        g[1].add(new Edge(3,2));
        g[2].add(new Edge(1,4));
        g[2].add(new Edge(3,8));
        g[2].add(new Edge(4,2));
        g[3].add(new Edge(4,7));
        g[4].add(new Edge(3,9));
        int[] dist = dijkstra(n,g,0);
        System.out.println(Arrays.toString(dist)); // distances from 0
    }
}
