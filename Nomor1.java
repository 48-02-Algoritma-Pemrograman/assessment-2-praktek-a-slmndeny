import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        hitungGanjil(N);
    }
        public static void hitungGanjil(int N){
            for(int i =0; i <= N; i++){
                if (i % 2 ==1) {
                    System.out.println(i);
                }
            }
        /* Pekerjaan anda berakhir sisi */

        System.out.print(Nomor1.class.getDeclaredMethods().length); 
    }
}
