package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BarranquillaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentBarranquilla {

    public static List<BarranquillaModel> contentBarranquilla =  new ArrayList<>();

    public static String titulo1 = "Spa Lily Tovar";
    public static int imageFile1 = R.drawable.lily1;
    public static String description1 = "Centro integral de belleza";

    public static String titulo2 = "Directorio de Barranquilla";
    public static int imageFile2 = R.drawable.sec2;
    public static String description2 = "Primer guia comercial de la ciudad";

    public static String titulo3 = "Divercity ";
    public static int imageFile3 = R.drawable.diver;
    public static String description3 = "Una ciudad divertida";

    public static String titulo4 = "Academia del Caribe";
    public static int imageFile4 = R.drawable.aca;
    public static String description4 = "Academia de Artes del Caribe";

    public static String titulo5 = "Politecnico Costa Atlantica";
    public static int imageFile5 = R.drawable.poli;
    public static String description5 = "Institución de educación superior";

    public static String titulo6 = "Auditorías especializadas";
    public static int imageFile6 = R.drawable.wicer;
    public static String description6 = "Profesionales especializados en el área de auditoría, ";

    public static String titulo7 = "Colegio Inca";
    public static int imageFile7 = R.drawable.inca;
    public static String description7 = "Primaria y bachillerato diversificado";

    public static String titulo8 = "Centro Inca";
    public static int imageFile8 = R.drawable.centroinc;
    public static String description8 = "Tu camino al éxito";

    public static String titulo9 = "Indoamérica";
    public static int imageFile9 = R.drawable.indo;
    public static String description9 = "Educación superior profesional tecnológica";

    public static String titulo10 = "Bachillerato técnico autodirigido";
    public static int imageFile10 = R.drawable.bachiinca;
    public static String description10 = "Bachillerato técnico Inca";

    public static String titulo11 = "Prado mar hotel";
    public static int imageFile11 = R.drawable.prado;
    public static String description11 = "El Hotel Pradomar ubicado en Puerto Colombia";

    public static String titulo12 = "Electro Aceite";
    public static int imageFile12 = R.drawable.electro;
    public static String description12 = "Repuestos para automotores";

    public static String titulo13 = "Novasys de Colombia";
    public static int imageFile13 = R.drawable.novasys;
    public static String description13 = "Alquiler de computadores de oficina";

    public static String titulo14 = "Club Deportivo Instenalco";
    public static int imageFile14 = R.drawable.instenalco;
    public static String description14 = "Somos Parte de Tú Desarrollo ";

    public static String titulo15 = "Parque del Sol";
    public static int imageFile15 = R.drawable.parquesol;
    public static String description15 = "Contamos con zonas de esparcimiento familiar";

    public static void addContentBarranquilla(){
        contentBarranquilla.add(new BarranquillaModel(imageFile1, titulo1, description1));
        contentBarranquilla.add(new BarranquillaModel(imageFile2, titulo2, description2));
        contentBarranquilla.add(new BarranquillaModel(imageFile3, titulo3, description3));
        contentBarranquilla.add(new BarranquillaModel(imageFile4, titulo4, description4));
        contentBarranquilla.add(new BarranquillaModel(imageFile5, titulo5, description5));
        contentBarranquilla.add(new BarranquillaModel(imageFile6, titulo6, description6));
        contentBarranquilla.add(new BarranquillaModel(imageFile7, titulo7, description7));
        contentBarranquilla.add(new BarranquillaModel(imageFile8, titulo8, description8));
        contentBarranquilla.add(new BarranquillaModel(imageFile9, titulo9, description9));
        contentBarranquilla.add(new BarranquillaModel(imageFile10, titulo10, description10));
        contentBarranquilla.add(new BarranquillaModel(imageFile11, titulo11, description11));
        contentBarranquilla.add(new BarranquillaModel(imageFile12, titulo12, description12));
        contentBarranquilla.add(new BarranquillaModel(imageFile13, titulo13, description13));
        contentBarranquilla.add(new BarranquillaModel(imageFile14, titulo14, description14));
        contentBarranquilla.add(new BarranquillaModel(imageFile15, titulo15, description15));
    }

    public static List<BarranquillaModel> getContentBarranquilla(){

        addContentBarranquilla();
        return contentBarranquilla;
    }
}
