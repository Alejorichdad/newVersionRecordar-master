package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.PastoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentPasto {
    public static List<PastoModel> contentPasto =  new ArrayList<>();

    public static String titulo1 = "CliniLaser";
    public static int imageFile1 = R.drawable.pasto1;
    public static String description1 = "Clinilaser Salud y Belleza";

    public static String titulo2 = "Centro Médico la Riviera";
    public static int imageFile2 = R.drawable.riviera;
    public static String description2 = "Todos los servicios en un mismo lugar.";

    public static String titulo3 = "Sonrisas Sanas";
    public static int imageFile3 = R.drawable.sonrisas;
    public static String description3 = "Consultorio odontológico especializado";

    public static String titulo4 = "Centro de Odontología";
    public static int imageFile4 = R.drawable.cero;
    public static String description4 = "Brindamos tratamientos odontológicos integrales";

    public static String titulo5 = "Hotel Club Xilon";
    public static int imageFile5 = R.drawable.xilon;
    public static String description5 = "Hotel de lujo en pasto";

    public static String titulo6 = "Hotel Don Saul";
    public static int imageFile6 = R.drawable.saul;
    public static String description6 = "Hotel ubicado en centro de Pasto";

    public static String titulo7 = "Clínica Bellatriz";
    public static int imageFile7 = R.drawable.bellatriz;
    public static String description7 = "Recupera la juventud de tu rostro";

    public static String titulo8 = "item title pasto 8";
    public static int imageFile8 = R.drawable.tienda;
    public static String description8 = "item description pasto 8";

    public static String titulo9 = "item title pasto 9";
    public static int imageFile9 = R.drawable.tienda;
    public static String description9 = "item description pasto 9";

    public static String titulo10 = "item title pasto 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description pasto 10";

    public static String titulo11 = "item title pasto 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description pasto 11";

    public static String titulo12 = "item title pasto 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description pasto 12";

    public static String titulo13 = "item title pasto 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description pasto 13";

    public static String titulo14 = "item title pasto 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description pasto 14";

    public static String titulo15 = "item title pasto 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description pasto 15";

    public static void addContentPasto(){
        contentPasto.add(new PastoModel(imageFile1, titulo1, description1));
        contentPasto.add(new PastoModel(imageFile2, titulo2, description2));
        contentPasto.add(new PastoModel(imageFile3, titulo3, description3));
        contentPasto.add(new PastoModel(imageFile4, titulo4, description4));
        contentPasto.add(new PastoModel(imageFile5, titulo5, description5));
        contentPasto.add(new PastoModel(imageFile6, titulo6, description6));
        contentPasto.add(new PastoModel(imageFile7, titulo7, description7));
       // contentPasto.add(new PastoModel(imageFile8, titulo8, description8));
       // contentPasto.add(new PastoModel(imageFile9, titulo9, description9));
       // contentPasto.add(new PastoModel(imageFile10, titulo10, description10));
       // contentPasto.add(new PastoModel(imageFile11, titulo11, description11));
       // contentPasto.add(new PastoModel(imageFile12, titulo12, description12));
       // contentPasto.add(new PastoModel(imageFile13, titulo13, description13));
       // contentPasto.add(new PastoModel(imageFile14, titulo14, description14));
       // contentPasto.add(new PastoModel(imageFile15, titulo15, description15));
    }

    public static List<PastoModel> getContentPasto(){

        addContentPasto();
        return contentPasto;
    }
}
