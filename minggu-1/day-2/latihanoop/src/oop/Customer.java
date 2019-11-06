// tema program yg berjalanan ini diganti dari JUAL-BELI (atau transaksi) menjadi PERSEWAAN
// jenis data variabel dan teks string hanya diganti beberapa oleh dummyeuy


package oop;

//contoh class objek :

public class Customer {

    private double noId;
    private String nama;
    private String alamat;

    //konstruktor
    public Customer() {
    }

    public Customer(double noId, String nama, String alamat) {
        this.noId = noId;
        this.nama = nama;
        this.alamat = alamat;
    }

    //proses get set
    public double getNoId() {
        return noId;
    }

    public void setNoId(double noId) {
        this.noId = noId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}