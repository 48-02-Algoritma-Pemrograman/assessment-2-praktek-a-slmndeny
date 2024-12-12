import java.util.Scanner;

public class Nomor1 {
    // Prosedur untuk menampilkan deret FizzBuzz
    public static void prosesOutputFizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            // Cek kelipatan 3 dan 5 terlebih dahulu
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } 
            // Cek kelipatan 3
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } 
            // Cek kelipatan 5
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } 
            // Jika bukan kelipatan 3 atau 5, cetak bilangan
            else {
                System.out.print(i + " ");
            }
        }
        // Hapus spasi tambahan di akhir
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        /* Pekerjaan anda mulai dari sini */
        prosesOutputFizzBuzz(N);
        /* Pekerjaan anda berakhir sisi */
        
        // Cetak jumlah method yang ada di kelas
        System.out.print(Nomor1.class.getDeclaredMethods().length); 
    }
}
