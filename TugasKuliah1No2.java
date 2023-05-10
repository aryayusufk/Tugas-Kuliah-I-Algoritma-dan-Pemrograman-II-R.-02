/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritma.dan.pemrograman.ii;

//Mengimport utility scanner untuk mengambil input an dari user
import java.util.Scanner;
/**
 *
 * @author aryay
 */
public class TugasKuliah1No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Scanner untuk mengambil inputan yang berasal dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Memasukan jumlah data dari pengguna
        System.out.print("Masukan jumlah data : ");
        // Memasukan inputan yang telah diberikan dari keyboard pada variabel jumdat
        int jumdat = input.nextInt();
        
        // Membuat array menggunakan tipe data string dengan nama variabel "namaMahasiswa"
        String[] namaMahasiswa = new String[jumdat];
        // Membuat array menggunakan tipe data integer dengan nama variabel "nilaiUTS"
        int[] nilaiUTS = new int[jumdat];
        // Membuat array menggunakan tipe data integer dengan nama variabel "nilaiUAS"
        int[] nilaiUAS = new int[jumdat];
        // Membuat array menggunakan tipe data integer dengan nama variabel "total" dan memberikan nilai awal 0
        int total = 0;
        // Membuat array menggunakan tipe data double dengan nama variabel "rata" dan memberikan nilai awal 0
        double rata = 0;
        
        // Meminta input dari data pengguna
        for (int a = 0; a < jumdat; a++){
            System.out.println("Jumlah Data ke-" + (a + 1));
            
            // Menampilkan output Nama:
            System.out.print("Nama: ");
            // Memasukan inputan yang telah diberikan dari keyboard pada variabel nama
            namaMahasiswa[a] = input.next();
            
            // Menampilkan output Nilai UTS:
            System.out.print("Nilai UTS: ");
            // Memasukan inputan yang telah diberikan dari keyboard pada variabel nilaiUTS
            nilaiUTS[a] = input.nextInt();
            
            // Menampilkan output Nilai UAS:
            System.out.print("Nilai UAS: ");
            // Memasukan inputan yang telah diberikan dari keyboard pada variabel nilaiUAS
            nilaiUAS[a] = input.nextInt();
           
        }
        // Menghitung total nilai
        for (int a = 0; a < jumdat; a++) {
            total = nilaiUTS[a] + nilaiUAS[a];
            // Menghitung Rata Rata
            rata = total / 2;
            
        // Menampilkan output keterangan tabel
        System.out.println("No\tNama\tUTS\tUAS\ttotal\tRata-Rata");
        // Menampilkan output garis pembatas
        System.out.println("=================================================");
        // Menampilkan output hasil akhir dari inputan yang telah di berikan
        System.out.println((a+1)+"\t"+namaMahasiswa[a]+"\t"+nilaiUTS[a]+"\t"+nilaiUAS[a]+"\t"+total+"\t"+rata);
        }
    }
    
}
