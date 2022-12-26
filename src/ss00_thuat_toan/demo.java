package ss00_thuat_toan;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo {
    //    public static void nhapDiem() {
//        Scanner sc = new Scanner(System.in);
//        float abc;
//        try{
//            System.out.println("nhập giá trị");
////         abc = Float.parseFloat(sc.nextLine());
//         abc = sc.nextFloat();
//            System.out.println(abc);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("Vui lòng nhập lại");;
//        }
//    }
//
    public static void main(String[] args) {
//        nhapDiem();

//        int[] arr1 = {3, 1, 5, 6, 878, 45, 232, 23, 54, 3, 23, 54, 1, 3, 5, 6, 7, 4, 445, 454, 7, 4, 23, 7, 65, 34, 22, 3, 53, 2, 476, 8, 33, 44, 32, 888};
//        int[] arr2 = {4, 54, 2, 1, 4, 545, 3, 23, 555, 442, 43, 87, 9, 8, 67, 56, 43, 23, 1, 2, 554, 4545, 33, 23, 545, 34, 24, 54, 32, 444, 888, 44};
//        Map<Integer, Boolean> map = new HashMap<>();
//
//        for (int item1 : arr1) {
//                map.put(item1, false);
//        }
//
//        for (int item2 : arr2) {
//            if (map.containsKey(item2)) {
//                System.out.print(item2 + " ");
//                map.remove(item2);
//            }
//        }

        String ta = "A ";
        ta = ta.concat("B ");
        String tc = "C ";
        ta = ta.concat(tc);
         ta.replace('C', 'D');
        ta = ta.concat(tc);
        System.out.println(ta);
    }
}




