package com.clubrecordar.recordar2016.cities.models;

/**
 * Created by willians on 18/7/16.
 */
public class NationalModel {
    private int idImagen;
    private String titulo_imagen;
    private  String beneficio;

    public NationalModel(int idImagen, String titulo_imagen, String beneficio){

        this.idImagen = idImagen;
        this.titulo_imagen = titulo_imagen;
        this.beneficio = beneficio;

    }

    public int getIdImagen(){
        return idImagen;
    }
    public String getTitulo_imagen(){
        return titulo_imagen;
    }
    public String getBeneficio(){
        return beneficio;
    }

}
