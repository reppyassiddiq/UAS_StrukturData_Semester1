package com.company;

public class Employee {
    private String namaBarang;
    private String jenisBarang;
    private int harga;

    public Employee(String namaBarang, String jenisBarang, int harga) {
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "namaBarang='" + namaBarang + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", harga=" + harga +
                '}';
    }
}
