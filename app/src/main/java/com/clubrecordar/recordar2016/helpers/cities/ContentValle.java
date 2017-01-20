package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.ValleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentValle {
    public static List<ValleModel> contentValle =  new ArrayList<>();

    public static String titulo1 = "Corporacion Eloisa Tamayo";
    public static int imageFile1 = R.drawable.eliosa;
    public static String description1 = "Institución de Educación Para El Trabajo y El desarrollo Humano";

    public static String titulo2 = "Sonricentro";
    public static int imageFile2 = R.drawable.sonricentro;
    public static String description2 = "Clínica odontológica";

    public static String titulo3 = "Odonto INT";
    public static int imageFile3 = R.drawable.odontoint;
    public static String description3 = "Odontología Integral";

    public static String titulo4 = "Spa Diana Ardila";
    public static int imageFile4 = R.drawable.dianaradila;
    public static String description4 = "Armonía para tu vida";

    public static String titulo5 = "Pineda Junior";
    public static int imageFile5 = R.drawable.pineda;
    public static String description5 = "Escuela deportiva";

    public static String titulo6 = "Hotel Sicarare";
    public static int imageFile6 = R.drawable.sicarare;
    public static String description6 = "El Hotel de los grandes eventos en valledupar";

    public static String titulo7 = "Optica Precisa";
    public static int imageFile7 = R.drawable.optica;
    public static String description7 = "El cuidado de tus ojos";

    public static String titulo8 = "item title valle 8";
    public static int imageFile8 = R.drawable.tienda;
    public static String description8 = "item description valle 8";

    public static String titulo9 = "item title valle 9";
    public static int imageFile9 = R.drawable.tienda;
    public static String description9 = "item description valle 9";

    public static String titulo10 = "item title valle 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description valle 10";

    public static String titulo11 = "item title valle 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description valle 11";

    public static String titulo12 = "item title valle 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description valle 12";

    public static String titulo13 = "item title valle 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description valle 13";

    public static String titulo14 = "item title valle 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description valle 14";

    public static String titulo15 = "item title valle 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description valle 15";

    public static void addContentValle(){
        contentValle.add(new ValleModel(imageFile1, titulo1, description1));
        contentValle.add(new ValleModel(imageFile2, titulo2, description2));
        contentValle.add(new ValleModel(imageFile3, titulo3, description3));
        contentValle.add(new ValleModel(imageFile4, titulo4, description4));
        contentValle.add(new ValleModel(imageFile5, titulo5, description5));
        contentValle.add(new ValleModel(imageFile6, titulo6, description6));
        contentValle.add(new ValleModel(imageFile7, titulo7, description7));
      //  contentValle.add(new ValleModel(imageFile8, titulo8, description8));
      //  contentValle.add(new ValleModel(imageFile9, titulo9, description9));
      //  contentValle.add(new ValleModel(imageFile10, titulo10, description10));
      //  contentValle.add(new ValleModel(imageFile11, titulo11, description11));
      //  contentValle.add(new ValleModel(imageFile12, titulo12, description12));
      //  contentValle.add(new ValleModel(imageFile13, titulo13, description13));
      //  contentValle.add(new ValleModel(imageFile14, titulo14, description14));
      //  contentValle.add(new ValleModel(imageFile15, titulo15, description15));
    }

    public static List<ValleModel> getContentValle(){

        addContentValle();
        return contentValle;
    }
}
