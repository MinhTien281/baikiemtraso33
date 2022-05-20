package com.example.baikiemtraso3;

import java.util.ArrayList;

public class Lich {
    String lop, ca;

    public Lich(String lop, String ca) {
        this.lop = lop;
        this.ca = ca;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    ArrayList<Lich> list = new ArrayList<>();

    public static ArrayList<Lich> dulieu() {
        String lop[] = {"ĐTTT20A", "ĐTTT20A", "ĐTTT20A", "ĐTTT20B", "ĐTTT20B", "ĐTTT20B", "ĐTTT21A", "ĐTTT21A"};
        String ca[] = {"Ca 1"," Ca 2", "Ca 3","Ca 4", "Ca 5"};
        ArrayList<Lich> x = new ArrayList<>();
        for (int i=0; i< ca.length; i++){
            x.add(new Lich(lop[i],ca[i]));

        }
        return x;
    }
}
