//Write a Java program to find numbers less than 7 in a tree set.
package Homework_collection_HashSet;

import java.util.TreeSet;
import java.util.Iterator;
//import java.util.;
public class Program9
{
    public static void main(String[] args) {
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        // to find numbers less than 7 in a tree set
        treeheadset = (TreeSet)tree_num.headSet(7);
        // to create an iterator
        Iterator iterator;
        iterator = treeheadset.iterator();
        System.out.println("---------------------------------------------");
        System.out.println("Tree set data: ");
        while (iterator.hasNext()) {
            System.out.println("find numbers less than 7:-" +iterator.next() + " ");
        }
        }
}
