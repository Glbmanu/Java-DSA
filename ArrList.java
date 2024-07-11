import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class ArrList {
    public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {
    /*    ArrayList <Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }
        list.add(6);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
        list.set(1,10);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.contains(11));
        // size
        int s = list.size();
        System.out.println(s);
        */

        // reverse of an arraylist
        /*
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
         */

        // Max Element
    /*    int max = Integer.MIN_VALUE;
        for (int i = 0; i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        System.out.println("Max element =" + max);
     */

      /*  int idx1 = 1;
        int idx2 = 2;
        System.out.print(list);
        swap(list,idx1,idx2);
        System.out.print(list);  */

    /*    Collections.sort(list);
        System.out.print(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
     */

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        for(int i =0 ; i< mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
