import java.util.Scanner;
public class BioskopWithScanner26 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int baris,kolom, menu;
        String nama, next;
        
        String[][] penonton = new String[4][2];
        do {
            System.out.println("Menu Bioskop");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();  
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                           
                        if (baris < 1 || baris > penonton.length|| kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Kursi tidak tersedia! Baris 1-" + penonton.length + ", kolom 1-" + penonton[0].length + ". Silakan ulangi.");
                        }else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh "+ penonton[baris - 1][kolom - 1] + "! Pilih kursi lain.");
                        } else {
                            break;
                        }                       
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                           
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(isi);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 3);

        sc.close();
        
        
    }
}