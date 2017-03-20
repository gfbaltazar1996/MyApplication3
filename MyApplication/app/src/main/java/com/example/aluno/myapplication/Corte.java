package com.example.aluno.myapplication;

/**
 * Created by Aluno on 23/02/2017.
 */
public class Corte {
    private String corte;
    private String urls;
    private String grana;

    public Corte(String corte,String urls,String grana){
        this.corte = corte;
        this.urls=urls;
        this.grana=grana;
    }

    public String getCorte(){
        return this.corte;
    }

    public String getUrls(){
        return this.urls;
    }

    public String getGrana(){
        return this.grana;
    }
}
