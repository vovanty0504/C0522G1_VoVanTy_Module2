package ss02_java_loop.exercise;


public class PrimeLessThan100 {
    public static void main(String[] args) {

        for (int prime = 2; prime <= 100; prime++) {
            int division = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    division++;
                }
            }
            if (division == 2) {
                System.out.println(prime + " \n");
            }
        }
    }
}
