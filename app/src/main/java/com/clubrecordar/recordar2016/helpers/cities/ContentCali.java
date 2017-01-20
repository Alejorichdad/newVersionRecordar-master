package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.CaliModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentCali {
    public static List<CaliModel> contentCali =  new ArrayList<>();

    public static String titulo1 = "Ortho Oral";
    public static int imageFile1 = R.drawable.ortho;
    public static String description1 = "Ortodoncia y odontología integral";

    public static String titulo2 = "Spa Libi´d";
    public static int imageFile2 = R.drawable.spalib;
    public static String description2 = "La naturaleza de tu piel";

    public static String titulo3 = "Centro de Capacitación y Educación Dirigida";
    public static int imageFile3 = R.drawable.cced;
    public static String description3 = "Institución de formación para el trabajo y el desarrollo humano";

    public static String titulo4 = "Fomento IPS";
    public static int imageFile4 = R.drawable.fomento;
    public static String description4 = "Institución prestadora de servicios en salud";

    public static String titulo5 = "Laboratorios Angel";
    public static int imageFile5 = R.drawable.angel;
    public static String description5 = "Buscamos tu bienestar";

    public static String titulo6 = "Odontología A.H";
    public static int imageFile6 = R.drawable.ah;
    public static String description6 = "Verte sonreír, nuestra razón de ser";

    public static String titulo7 = "Hotel Torre Cali";
    public static int imageFile7 = R.drawable.torre;
    public static String description7 = "Ubicado muy cerca del centro de la ciudad";

    public static String titulo8 = "Médical Colombia";
    public static int imageFile8 = R.drawable.medical;
    public static String description8 = "Cuidando tu salud en casa";

    public static String titulo9 = "Hotel Casa Toscano";
    public static int imageFile9 = R.drawable.toscano;
    public static String description9 = "!Escapate en Toscano! a la Sucursal del Cielo";

    public static String titulo10 = "Tienda Vieja";
    public static int imageFile10 = R.drawable.tienda1;
    public static String description10 = "La mejor discoteca, viejoteca ";

    public static String titulo11 = "El Rancho de Jonas";
    public static int imageFile11 = R.drawable.rancho;
    public static String description11 = "Uno de los mejores restaurantes en Cali";

    public static String titulo12 = "item title cali 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description cali 12";

    public static String titulo13 = "item title cali 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description cali 13";

    public static String titulo14 = "item title cali 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description cali 14";


    public static String titulo15 = "item title cali 15";
    public static int imageFile15= R.drawable.angel;
    public static String description15 = "item description cali 15";

    public static void addContentCali(){

        contentCali.add(new CaliModel(imageFile1, titulo1, description1));
        contentCali.add(new CaliModel(imageFile2, titulo2, description2));
        contentCali.add(new CaliModel(imageFile3, titulo3, description3));
        contentCali.add(new CaliModel(imageFile4, titulo4, description4));
        contentCali.add(new CaliModel(imageFile5, titulo5, description5));
        contentCali.add(new CaliModel(imageFile6, titulo6, description6));
        contentCali.add(new CaliModel(imageFile7, titulo7, description7));
        contentCali.add(new CaliModel(imageFile8, titulo8, description8));
        contentCali.add(new CaliModel(imageFile9, titulo9, description9));
        contentCali.add(new CaliModel(imageFile10, titulo10, description10));
        contentCali.add(new CaliModel(imageFile11, titulo11, description11));
       // contentCali.add(new CaliModel(imageFile12, titulo12, description12));
       //contentCali.add(new CaliModel(imageFile13, titulo13, description13));
        //contentCali.add(new CaliModel(imageFile14, titulo14, description14));
        //contentCali.add(new CaliModel(imageFile15, titulo15, description15));
    }

    public static List<CaliModel> getContentCali(){

        addContentCali();
        return contentCali;
    }
}
