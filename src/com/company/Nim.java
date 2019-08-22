package com.company;

public class Nim {
    public Nim(int angka){
        this.angka=angka;
    }
    public int getAngka() {
        return angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    int angka;

    @Override
    public String toString() {
        return "Nim{" +
                "angka=" + angka +
                '}';
    }
}
