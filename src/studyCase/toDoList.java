package studyCase;

import java.util.Scanner;

public class toDoList {
    static final int MAX_TUGAS = 5;
    static String[] listTugas = new String[MAX_TUGAS];
    static int jumlahTugas = 0;

    private static void tambahTugas(String tugasBaru){
        listTugas[jumlahTugas] = tugasBaru;
        jumlahTugas++;
    }

    private static void tampilkanTugas(){
        if (jumlahTugas > 0){
            for (int i = 0; i < jumlahTugas; i++){
                System.out.println(i + 1 + ". " + listTugas[i]);
            }
        } else {
            System.out.println("To-Do List Kosong!");
        }
    }

    private static void hapusTugas(int noTugasDihapus){
        if (noTugasDihapus >= 1 && noTugasDihapus <= jumlahTugas){
            for (int i = noTugasDihapus - 1; i <jumlahTugas - 1;i++){
                listTugas[i] = listTugas[i + 1];
            }
            jumlahTugas--;
        } else {
            System.out.println("Nomer Tugas Tidak Valid!");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-3): ");
            pilihan = userInput.nextInt();

            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;
                case 1:
                    System.out.println("======== TAMBAH TUGAS ==========");
                    if (jumlahTugas < MAX_TUGAS){
                        System.out.print("Masukkan Tugas: ");
                        userInput.nextLine();
                        String tugasBaru = userInput.nextLine();
                        tambahTugas(tugasBaru);
                        System.out.println("Tugas Berhasil Ditambahkan!");
                    } else {
                        System.out.println("Maaf, To-Do List penuh!");
                    }
                    break;
                case 2:
                    System.out.println("======== LIST TUGAS ==========");
                    tampilkanTugas();
                    break;
                case 3:
                    System.out.println("======== HAPUS TUGAS ==========");
                    if (jumlahTugas > 0){
                        tampilkanTugas();
                        System.out.print("Pilih Nomer yang ingin dihapus: ");
                        int noDihapus = userInput.nextInt();
                        hapusTugas(noDihapus);
                    }
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (0-3)");
            }
        } while (pilihan != 0);


    }

}
