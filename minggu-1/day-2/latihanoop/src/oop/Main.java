// tema program yg berjalanan ini diganti dari JUAL-BELI (atau transaksi) menjadi PERSEWAAN
// jenis data variabel dan teks string hanya diganti beberapa oleh dummyeuy

package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //var temporary 
        double tempNoId = 0;
        String tempNama = "";
        String tempAlamat = "";
        int tempKodeBarang = 0;
        int tempHarga = 0;
        String tempNamaBarang = "";
        int tempKodeTransaksi = 0;
        int tempBanyak = 0;

        //Proses menerima masukan
        System.out.println("======================================================");
        System.out.println("           Input data persewaan alat outdoor          ");
        System.out.println("======================================================");
        System.out.print("Nomor ID Pelanggan (KTP/SIM) : ");
        tempNoId = sc.nextDouble();
        
        tempNama = sc.nextLine();
        System.out.print("Nama Penyewa : ");
        tempNama = sc.nextLine();

        System.out.print("Alamat Tinggal Penyewa : ");
        tempAlamat = sc.nextLine();
        
        System.out.print("\nKode Barang : ");
        tempKodeBarang = sc.nextInt();
        
        tempNamaBarang = sc.nextLine();
        System.out.print("Nama Barang : ");
        tempNamaBarang = sc.nextLine();

        System.out.print("Harga Sewa : ");
        tempHarga = sc.nextInt();

        System.out.print("\nKode Transaksi : ");
        tempKodeTransaksi = sc.nextInt();

        System.out.print("Banyak Barang yang disewa : ");
        tempBanyak = sc.nextInt();

        //eksekusi
        Transaksi t = new Transaksi(tempNoId, tempNama, tempAlamat);
        t.setBarang(tempKodeBarang, tempNamaBarang, tempHarga);
        t.setTransaksi(tempKodeTransaksi, tempBanyak);

        //output hasil masukan dan mengeluarkan total belanja
        t.cetakStruk();
    }

}