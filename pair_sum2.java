import java.util.*;
public class pair_sum2 {
    // Rotated sorted list
    public static boolean pairsum(  ArrayList<Integer> list,int target){
        int br = -1;
        int n = list.size();
        for(int i = 0; i<list.size(); i++){
            if (list.get(i) > list.get(i+1)) {
                br = i;
                break;
            }
        }
        int lp = br+1;
        int rp= br;
        while(lp!=rp){
            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }
            if (list.get(lp)+list.get(rp)<target) {
                lp = (lp + 1) % n;
            }
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairsum(list,target));
    }
}
