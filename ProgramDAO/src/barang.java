/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author hp
 */
public class barang {
    
    
 @TableColumn(number=1, name ="KODE BARANG")
 private String kode_barang;
 @TableColumn(number=2, name ="NAMA BARANG")
 private String nama_barang;
 @TableColumn(number=3, name ="JUMLAH")
 private int jumlah;
 @TableColumn(number=1, name ="HARGA")
 private long harga; 



    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

}

