package com.company;

import java.util.Scanner;

public class WeightedQuickUnionUF {
        private int[] id;
        private int[] sz;
        private int count;


        public WeightedQuickUnionUF(int N) {
            count = N;
            id = new int[N];
            sz = new int[N];
            for (int i = 0; i < N; i++) {
                id[i] = i;
                sz[i] = 1;
            }
        }


        public int count() {
            return count;
        }


        public int find(int p) {
            while (p != id[p])
                p = id[p];
            return p;
        }


        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }



        public void union(int p, int q) {
            int i = find(p);
            int j = find(q);
            if (i == j) return;

            // make smaller root point to larger one
            if   (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
            else                 { id[j] = i; sz[i] += sz[j]; }
            count--;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);


            while (!scanner.hasNext()) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                if (uf.connected(p, q)) continue;
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
            System.out.println(uf.count() + " components");
        }



}
