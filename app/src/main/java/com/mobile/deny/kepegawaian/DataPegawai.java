package com.mobile.deny.kepegawaian;

public class DataPegawai {
    private String namaPegawai;
    private String descPegawai;
    private int imagePegawai;

    public DataPegawai(String namaPegawai, String descPegawai, int imagePegawai) {
        this.namaPegawai = namaPegawai;
        this.descPegawai = descPegawai;
        this.imagePegawai = imagePegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public String getDescPegawai() {
        return descPegawai;
    }

    public int getImagePegawai() {
        return imagePegawai;
    }
}
