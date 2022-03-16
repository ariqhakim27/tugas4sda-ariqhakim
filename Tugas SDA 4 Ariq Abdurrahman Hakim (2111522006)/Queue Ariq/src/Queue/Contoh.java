package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {
        int i=0;
        boolean bool = true;
        String nama;

        try (Scanner pilih = new Scanner(System.in)) {
            try (Scanner nama1 = new Scanner(System.in)) {
                Queue<String> antrian = new LinkedList<>();
   
                System.out.println("\n================================");
                System.out.println(" \tANTRIAN TIKET MUSIC FEST ");
                System.out.println("================================");
                
                do{
                    System.out.println("1. Jumlah Tiket yang Dipesan   :");
                    System.out.println("2. Tampilkan Penumpang         :");
                    System.out.println("3. Penonton Pertama            :");
                    System.out.println("4. Pemanggilan Penonton        :");
                    System.out.println("5. Apakah Penonton Telah Habis? :");
                    System.out.println("6. Selesai                      :");
                    System.out.println("MASUKKAN PILIHAN [1-6]: ");
                    int input= pilih.nextInt();
                    switch(input){
                        case 1:
                        System.out.println("Masukkan Jumlah Tiket Yang Akan Dipesan");
                        i=0;
                        int h=pilih.nextInt();
                        do{
                            System.out.println("Masukkan Nama Penonton: ");
                            nama= nama1.nextLine();
                            antrian.add(nama);
                            i++;
                        }
                        while(i<h);
                        System.out.println("Queue: "+antrian);
                        System.out.println("");
                        break;

                        case 2:
                        System.out.println("Nama Penonton : "+antrian);
                        System.out.println("");
                        break;

                        case 3:
                        System.out.println("Penonton Pertama : "+antrian.peek());
                        System.out.println("");
                        break;

                        case 4:
                        System.out.println("Penonton "+antrian.peek()+" Silakan Memasuki Gerbang");
                        antrian.poll();
                        System.out.println("");
                        break;

                        case 5:
                        System.out.println("Apakah Penonton Telah Habis? "+antrian.isEmpty());
                        System.out.println("");
                        break;

                        case 6:
                        System.exit(0);
                        break;

                        default:
                        System.err.println("Pilihan Tidak Ada!");
                        System.out.println("");
                        

                    }

                    


                }
                while(bool);
            }
        }
    }
}
