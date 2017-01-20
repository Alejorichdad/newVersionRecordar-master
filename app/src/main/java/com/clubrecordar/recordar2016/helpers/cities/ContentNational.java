package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.NationalModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 29/7/16.
 */
public class ContentNational {

    public static List<NationalModel> contentNational =  new ArrayList<>();

    public static String titulo1 = "Sonría";
    public static int imageFile1 = R.drawable.sonria;
    public static String description1 = "El poder de tu sonrisa";

    public static String titulo2 = "Helados Mimos";
    public static int imageFile2 = R.drawable.mimos;
    public static String description2 = "Disfruta con esta deliciosa alianza";

    public static String titulo3 = "Computadores y tecnología";
    public static int imageFile3 = R.drawable.compuworking;
    public static String description3 = "¿Necesitas un computador nuevo?";

    public static String titulo4 = "Escuela de negocios";
    public static int imageFile4 = R.drawable.ceipa;
    public static String description4 = "Somos la universidad de la empresa";

    public static String titulo5 = "Lo mejor en impresión";
    public static int imageFile5 = R.drawable.agn;
    public static String description5 = "Los mejores precios y mayor calidad";

    public static String titulo6 = "Presto desde 1981";
    public static int imageFile6 = R.drawable.presto;
    public static String description6 = "La primera hamburguesa";

    public static String titulo7 = "Agencia de viajes";
    public static int imageFile7 = R.drawable.incoming1;
    public static String description7 = "Mejores planes turísticos";

    public static String titulo8 = "Protección patrimonial";
    public static int imageFile8 = R.drawable.corban;
    public static String description8 = "Acompañamiento de nuestros Clientes";

    public static String titulo9 = "Discoteca Bar Restaurante";
    public static int imageFile9 = R.drawable.casa;
    public static String description9 = "Disfruta con tus amigos";

    public static String titulo10 = "Consultoría";
    public static int imageFile10 = R.drawable.abogado;
    public static String description10 = "Servicios legales y especializados";

    public static String titulo11 = "Las mejores salas de cine";
    public static int imageFile11 = R.drawable.cine;
    public static String description11 = "Los mejores estrenos";

    public static String titulo12 = "100% como nos gusta";
    public static int imageFile12 = R.drawable.kokoriko;
    public static String description12 = "Disfruta esta deliciosa alianza";

    public static String titulo13 = "Servicios turísticos";
    public static int imageFile13 = R.drawable.helios;
    public static String description13 = "Destinos nacionales e internacionales";

    public static String titulo14 = "Próximamente";
    public static int imageFile14 = R.drawable.subw;
    public static String description14 = "Próximamente";

    public static String titulo15 = "Próximamente";
    public static int imageFile15 = R.drawable.kfc;
    public static String description15 = "Próximamente";

    public static void addContentNational(){
        contentNational.add(new NationalModel(imageFile1, titulo1, description1));
        contentNational.add(new NationalModel(imageFile2, titulo2, description2));
        contentNational.add(new NationalModel(imageFile3, titulo3, description3));
        contentNational.add(new NationalModel(imageFile4, titulo4, description4));
        contentNational.add(new NationalModel(imageFile5, titulo5, description5));
        contentNational.add(new NationalModel(imageFile6, titulo6, description6));
        contentNational.add(new NationalModel(imageFile7, titulo7, description7));
        contentNational.add(new NationalModel(imageFile8, titulo8, description8));
        contentNational.add(new NationalModel(imageFile9, titulo9, description9));
        contentNational.add(new NationalModel(imageFile10, titulo10, description10));
        contentNational.add(new NationalModel(imageFile11, titulo11, description11));
        contentNational.add(new NationalModel(imageFile12, titulo12, description12));
        contentNational.add(new NationalModel(imageFile13, titulo13, description13));
        contentNational.add(new NationalModel(imageFile14, titulo14, description14));
        contentNational.add(new NationalModel(imageFile15, titulo15, description15));
    }

    public static List<NationalModel> getContentNational(){

        addContentNational();
        return contentNational;
    }

}
