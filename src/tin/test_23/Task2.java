package tin.test_23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            int[][] graph = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[j] > a[k]) {
                        graph[j][k] = 1;
                        graph[k][j] = 1;
                    } else {
                        graph[j][k] = 0;
                        graph[k][j] = 0;
                    }
                }
            }
            boolean[] visited = new boolean[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    count++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(j);
                    visited[j] = true;
                    while (!queue.isEmpty()) {
                        int u = queue.poll();
                        for (int k = 0; k < n; k++) {
                            if (graph[u][k] == 1 && !visited[k]) {
                                count++;
                                queue.offer(k);
                                visited[k] = true;
                            }
                        }
                    }
                }
            }
            if (count == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}*/


   /*public static void main(String[] args) {
       int[][] input = {
               {1, 1000000000},
               {2, 1, 1},
               {3, 1, 1, 1},
               {4, 1, 1, 2, 2}
       };
       int t = input.length;
       for (int i = 0; i < t; i++) {
           int n = input[i][0];
           int[] a = Arrays.copyOfRange(input[i], 1, n+1);
           int[][] graph = new int[n][n];
           for (int j = 0; j < n; j++) {
               for (int k = j+1; k < n; k++) {
                   if (a[j] > a[k]) {
                       graph[j][k] = 1;
                       graph[k][j] = 1;
                   } else {
                       graph[j][k] = 0;
                       graph[k][j] = 0;
                   }
               }
           }
           boolean[] visited = new boolean[n];
           int count = 0;
           for (int j = 0; j < n; j++) {
               if (!visited[j]) {
                   count++;
                   Queue<Integer> queue = new LinkedList<>();
                   queue.offer(j);
                   visited[j] = true;
                   while (!queue.isEmpty()) {
                       int u = queue.poll();
                       for (int k = 0; k < n; k++) {
                           if (graph[u][k] == 1 &&!visited[k]) {
                               count++;
                               queue.offer(k);
                               visited[k] = true;
                           }
                       }
                   }
               }
           }
           if (count == n) {
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
       }
   }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            boolean[] visited = new boolean[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    count++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(j);
                    visited[j] = true;
                    while (!queue.isEmpty()) {
                        int u = queue.poll();
                        for (int k = 0; k < n; k++) {
                            if (a[u] > a[k] && !visited[k]) {
                                count++;
                                queue.offer(k);
                                visited[k] = true;
                            }
                        }
                    }
                }
            }
            if (count == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            boolean[] visited = new boolean[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    count++;
                    int[] parent = new int[n];
                    Arrays.fill(parent, -1);
                    parent[j] = j;
                    visited[j] = true;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(j);
                    while (!queue.isEmpty()) {
                        int u = queue.poll();
                        for (int k = 0; k < n; k++) {
                            if (a[u] > a[k] &&!visited[k]) {
                                parent[k] = u;
                                visited[k] = true;
                                queue.offer(k);
                            }
                        }
                    }
                    int u = j;
                    while (u!= j) {
                        System.out.print(u + " ");
                        u = parent[u];
                    }
                    System.out.println(j);
                }
            }
            if (count == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
*/

