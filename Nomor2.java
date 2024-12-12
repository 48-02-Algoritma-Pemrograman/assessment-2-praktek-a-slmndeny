import java.util.*;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Pekerjaan anda mulai dari sini */
        String[] books = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] prices = {350000, 450000, 500000, 95000};

        System.out.println("Daftar Buku:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " " + prices[i]);
        }
        ArrayList<Integer> cart = new ArrayList<>();
        String choice;

        do {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int bookChoice = input.nextInt();
            if (bookChoice >= 1 && bookChoice <= 4) {
                cart.add(prices[bookChoice - 1]);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Input lagi (Y/N)?: ");
            choice = input.next().toUpperCase();
        } while (choice.equals("Y"));

        int totalPrice = calculateTotal(cart);
        int voucher = calculateVoucher(totalPrice);

        System.out.println("Total voucher belanja : " + voucher);
        System.out.println("Total yang harus dibayar : " + (totalPrice - voucher));
        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }

    public static int calculateTotal(ArrayList<Integer> cart) {
        int total = 0;
        for (int price : cart) {
            total += price;
        }
        return total;
    }

    public static int calculateVoucher(int total) {
        if (total < 200000) {
            return 0;
        } else if (total <= 500000) {
            return 50000;
        } else if (total <= 750000) {
            return 100000;
        } else if (total <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }

        /* Pekerjaan anda berakhir sini */

    }
}
