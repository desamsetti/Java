package com.company;

import java.util.Random;

public class Percolation {
    //Om Sai Ram
    //Om Namah Shivaya
    boolean[][] sites;

    private int grid;
    private int beginNode;
    private int endNode;

    private WeightedQuickUnionUF QU;
    private WeightedQuickUnionUF Backwash;



    public Percolation(int N)
    {
        N = N+1;
        QU = new WeightedQuickUnionUF(N*N+1); //+2 for the top and bottom node
        Backwash = new WeightedQuickUnionUF(N*N+2);
        //QU = new QuickFindUF(N*N+2);
        sites = new boolean[N][N]; // create N-by-N grid, with all sites blocked
        grid = N-1;
        beginNode = 0;
        endNode = N*N+1;

    }
    public void open(int i, int j)
    {
        // open site (row i, column j) if it is not already
        // check if out of bound:

        checkException(i, j);
        if (!sites[j][i]) {
            sites[j][i] = true;
        }
        int index = indexCalc(j, i);
        //Connect the site with surrounding nodes
        //left:
        if (j != 1) {
            if (sites[j-1][i]) {
                QU.union(index, index-1);
                Backwash.union(index,index-1);
            }
        }
        //right:
        if (j != grid) {
            if (sites[j+1][i]) {
                QU.union(index, index+1);
                Backwash.union(index, index+1);
            }
        }
        //top:
        if (i != 1) {
            if (sites[j][i-1]) {
                QU.union(index, j+grid*(i-1));
                Backwash.union(index, j+grid*(i-1));
            }
        }
        else {
            QU.union(beginNode, index); //connect with top node which we will just have as N^2
            Backwash.union(beginNode, index);
        }
        //bottom:

        if (i != grid) {
            if (sites[j][i+1]) {
                QU.union(index, j+grid*(i+1));
                Backwash.union(index, j+grid*(i+1));
            }
        }
        else {
            Backwash.union(index,endNode);
        }

    }

    public boolean isOpen(int i, int j)
    {

        checkException(i, j);
        // is site (row i, column j) open?
        return sites[j][i];
    }

    public boolean isFull(int i, int j)
    {

        checkException(i, j);
        // is site (row i, column j) full?
        return (QU.connected(indexCalc(j,i), beginNode) );
    }



    public boolean percolates()
    {
        return Backwash.connected(beginNode,endNode);
    }

    private int indexCalc(int i, int j) {
        return i + grid*j;
    }
    private void checkException(int i, int j) {
        if (i <= 0 || i > grid || j <= 0 || j > grid) {
            throw new IndexOutOfBoundsException("row index i out of bounds");
        }
    }

    public static void main(String[] args) {
        int grid_size = 3;
        Percolation perc = new Percolation(grid_size);
        //initialize the grid to something
//    for(int i=0;i<grid_size;i++){
//      for (int j=0;j<grid_size;j++){
//        System.out.println(perc.isOpen(i,j));
//      }
//    }

//  let's test if the openning of a site works.
        perc.open(2,3);
        perc.open(3,3);
        perc.open(3,1);
        perc.open(2,1);
        perc.open(1,1);
        System.out.println(perc.percolates());
        System.out.println(perc.isFull(1,1));
    }
}

