// tema program yg berjalanan ini diganti dari JUAL-BELI (atau transaksi) menjadi PERSEWAAN
// jenis data variabel dan teks string hanya diganti beberapa oleh dummyeuy

package oop;

//Inheritance digunakan ketika parent memiliki atribut dan metode dan lalu semuanya diturunkan pada child. 
//Contoh : class Transaksi extends Costumer (Transaksi merupakan kelas child, Costumer merupakan kelas parent).
//contoh inheritance
public class Transaksi extends Customer implements Barang {

    private int kodeBarang;
    private String namaBarang;
    private float harga;

    private int kodeTransaksi;
    private int banyak;

    //konstruktor
    public Transaksi() {
    }

    //dari kelas parent
    public Transaksi(double noId, String nama, String alamat) {
        super(noId, nama, alamat);
    }

    public void setTransaksi(int kodeTransaksi, int banyak) {
        this.kodeTransaksi = kodeTransaksi;
        this.banyak = banyak;
    }

    //total transaksi = banyaknya barang * harga barang
    public float totalTransaksi() {
        return (banyak * harga);
    }

    //override class interface
    public void setBarang(int kodeBarang, String namaBarang, float harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    //output
    public void cetakStruk() {
        System.out.println("\n");
        System.out.println("=============================================================");
        System.out.println("                       Nota Bayar Sewa                       ");
        System.out.println("=============================================================");
        System.out.println("ID Pembeli                  : " + super.getNoId());
        System.out.println("Nama Pembeli                : " + super.getNama());
        System.out.println("Alamat                      : " + super.getAlamat());

        System.out.println("Kode Barang                 : " + kodeBarang);
        System.out.println("Nama Barang                 : " + namaBarang);
        System.out.println("Harga                       : " + harga);

        System.out.println("Kode transaksi              : " + kodeTransaksi);
        System.out.println("Banyak                      : " + banyak);

        System.out.println("Total Transaksi             : " +"Rp. "+totalTransaksi());
        
        System.out.println("=============================================================");
        System.out.println("       Terima kasih dan Nikmati Kegiatan Outdoor Anda!       ");
        System.out.println("=============================================================");
    }

}

