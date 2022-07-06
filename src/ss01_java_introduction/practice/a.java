package ss01_java_introduction.practice;

public class a {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 14; j++) {
                if (j == 8 - i || j == 7 + i){
                    System.out.print(i);
                }else if(i-j==6||j+i==21) {
                        System.out.print(14-i);
                    }
                else if(i==5 && (j>2 && j <13)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
