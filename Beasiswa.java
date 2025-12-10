import java.util.Scanner;

public class Beasiswa {

    public static int Menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n=== System Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar Berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-Rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");

        int pilihanMenu = input.nextInt();
        System.out.println();
        return pilihanMenu;
    }

    public static String[][] tambahPendaftar(String pendaftar[][]){
        
        // Tambah pendaftar

        return pendaftar;
    }

    public static void tampilkanPendaftar(String pendaftar[][]){

        // Tampilkan Pendaftar

    }

    public static void CariPendaftar(String pendaftar[][]){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jenis Beasiswa yang dicari: ");
        String jenisBeasiswa = input.nextLine();

        System.out.println("Pencarian Pendaftar dengan Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("=============================================================");
        System.out.println("Nama\tNIM\tIPK\tJenis Beasiswa\tPenghasilan Orang Tua");

        for(int i = 0 ; i < pendaftar.length; i++){
            if(pendaftar[i][0] != null && pendaftar[i][3].equalsIgnoreCase(jenisBeasiswa)){
                System.out.println(pendaftar[i][0] + "\t" + pendaftar[i][1] + "\t" + pendaftar[i][2] + "\t" + pendaftar[i][3] + "\t\t" + pendaftar[i][4]);
            }
        }

    }

    public static void HitungIPK(String pendaftar[][]){
        float totalIPK = 0;
        int jumlahPendaftar = 0;
        
        for(int i = 0; i < pendaftar.length; i++){
            if(pendaftar[i][2] != null){
                totalIPK += Float.parseFloat(pendaftar[i][2]);
                jumlahPendaftar++;
            }
        }

        float hitungIPK = totalIPK / jumlahPendaftar;
        System.out.println(totalIPK);
        System.out.println("Rata-rata IPK: " + hitungIPK);
    }

    public static void main(String[] args) {
        String pendaftar[][] = new String[25][5];

        pendaftar[0][0] = "Alice";
        pendaftar[0][1] = "2540001";
        pendaftar[0][2] = "3.0";
        pendaftar[0][3] = "Reaguler";
        pendaftar[0][4] = "1500000";

        pendaftar[1][0] = "Alice";
        pendaftar[1][1] = "2540001";
        pendaftar[1][2] = "3.6";
        pendaftar[1][3] = "Reguler";
        pendaftar[1][4] = "1500000";

        pendaftar[2][0] = "Alice";
        pendaftar[2][1] = "2540001";
        pendaftar[2][2] = "3.2";
        pendaftar[2][3] = "Reguler";
        pendaftar[2][4] = "1500000";

        do {
            int pilihanMenu = Menu();
            if(pilihanMenu == 1){
                tambahPendaftar(pendaftar);
            } else if (pilihanMenu == 2) {
                tampilkanPendaftar(pendaftar);
            } else if (pilihanMenu == 3) {
                CariPendaftar(pendaftar);
            } else if (pilihanMenu == 4) {
                HitungIPK(pendaftar);
            } else if (pilihanMenu == 5) {
                // Keluar Dari Program
            } else {
                System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }
        } while(true);

    }
}
