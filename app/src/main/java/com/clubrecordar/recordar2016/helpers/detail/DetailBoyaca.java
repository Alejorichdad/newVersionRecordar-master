package com.clubrecordar.recordar2016.helpers.detail;

import com.clubrecordar.recordar2016.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 31/7/16.
 */
public class DetailBoyaca {

    public static JSONObject mainContentBoyaca =  new JSONObject();
    public static JSONObject contentBoyaca1 =  new JSONObject();
    public static JSONObject contentBoyaca2 =  new JSONObject();
    public static JSONObject contentBoyaca3 =  new JSONObject();
    public static JSONObject contentBoyaca4 =  new JSONObject();
    public static JSONObject contentBoyaca5 =  new JSONObject();
    public static JSONObject contentBoyaca6 =  new JSONObject();
    public static JSONObject contentBoyaca7 =  new JSONObject();
    public static JSONObject contentBoyaca8 =  new JSONObject();
    public static JSONObject contentBoyaca9 =  new JSONObject();
    public static JSONObject contentBoyaca10 =  new JSONObject();
    public static JSONObject contentBoyaca11 =  new JSONObject();
    public static JSONObject contentBoyaca12 =  new JSONObject();
    public static JSONObject contentBoyaca13 =  new JSONObject();
    public static JSONObject contentBoyaca14 =  new JSONObject();
    public static JSONObject contentBoyaca15 =  new JSONObject();

    /* DATA */

    public static String title1 = "Hotel Sochagota";
    public static String description1 = "Contacto: beneficio para los afiliados: descuentos especial en pasadía.";
    public static String phone1 = "3212694313";
    public static String email1 = "info@hotelsochagota.com";
    public static int imageFile1 = R.drawable.sochagd;
    public static String coords1 = "5.762587, -73.110439";

    public static String title2 = "Hotel la Posada Colonial Paipa";
    public static String description2 = "Contacto: beneficio para los afiliados: 20% descuento para la gente de Recordar.";
    public static String phone2 = "0387850073";
    public static String email2 = "alianzas@clubrecordar.com";
    public static int imageFile2 = R.drawable.posada;
    public static String coords2 = "5.780356, -73.118963";

    public static String title3 = "Hotel Boyaca plaza";
    public static String description3 = "Contacto: beneficio para los afiliados: 30% descuento en servicios de nuestro hotel.";
    public static String phone3 = "0387431070";
    public static String email3 = "comercial@hotelboyacaplaza.co";
    public static int imageFile3 = R.drawable.boyacad;
    public static String coords3 = "5.531424, -73.363655";

    public static String title4 = "Instituto Turístico Paipa";
    public static String description4 = "Contacto: beneficio para los afiliados: 30% descuento, en grupo sexta personas gratis.";
    public static String phone4 = " 3212095655";
    public static String email4 = "reservas@termalespaipa.co";
    public static int imageFile4 = R.drawable.itp;
    public static String coords4 = "5.771992, -73.115821";

    public static String title5 = "titulo5";
    public static String description5 = "description5";
    public static String phone5 = "544567";
    public static String email5 = "some@gmail.com";
    public static int imageFile5 = R.drawable.tienda;
    public static String coords5 = "37.7749,-122.4194";

    public static String title6 = "titulo6";
    public static String description6 = "description6";
    public static String phone6 = "644567";
    public static String email6 = "some@gmail.com";
    public static int imageFile6 = R.drawable.tienda;
    public static String coords6 = "37.7749,-122.4194";

    public static String title7 = "titulo7";
    public static String description7 = "description7";
    public static String phone7 = "744567";
    public static String email7 = "some@gmail.com";
    public static int imageFile7 = R.drawable.tienda;
    public static String coords7 = "37.7749,-122.4194";

    public static String title8 = "titulo8";
    public static String description8 = "description8";
    public static String phone8 = "844567";
    public static String email8 = "some@gmail.com";
    public static int imageFile8 = R.drawable.tienda;
    public static String coords8 = "37.7749,-122.4194";

    public static String title9 = "titulo9";
    public static String description9 = "description9";
    public static String phone9 = "944567";
    public static String email9 = "some@gmail.com";
    public static int imageFile9 = R.drawable.tienda;
    public static String coords9 = "37.7749,-122.4194";

    public static String title10 = "titulo10";
    public static String description10 = "description10";
    public static String phone10 = "1044567";
    public static String email10 = "some@gmail.com";
    public static int imageFile10 = R.drawable.tienda;
    public static String coords10 = "37.7749,-122.4194";

    public static String title11 = "titulo11";
    public static String description11 = "description11";
    public static String phone11 = "1144567";
    public static String email11 = "some@gmail.com";
    public static int imageFile11 = R.drawable.tienda;
    public static String coords11 = "37.7749,-122.4194";

    public static String title12 = "titulo12";
    public static String description12 = "description12";
    public static String phone12 = "1244567";
    public static String email12 = "some@gmail.com";
    public static int imageFile12 = R.drawable.tienda;
    public static String coords12 = "37.7749,-122.4194";

    public static String title13 = "titulo13";
    public static String description13 = "description13";
    public static String phone13 = "1344567";
    public static String email13 = "some@gmail.com";
    public static int imageFile13 = R.drawable.tienda;
    public static String coords13 = "37.7749,-122.4194";

    public static String title14 = "titulo14";
    public static String description14 = "description14";
    public static String phone14 = "1444567";
    public static String email14 = "some@gmail.com";
    public static int imageFile14 = R.drawable.tienda;
    public static String coords14 = "37.7749,-122.4194";

    public static String title15 = "titulo15";
    public static String description15 = "description15";
    public static String phone15 = "1544567";
    public static String email15 = "some@gmail.com";
    public static int imageFile15 = R.drawable.tienda;
    public static String coords15 = "37.7749,-122.4194";


    public static void addObjectsBoyaca(){
        try {

            mainContentBoyaca.put("item1", getFirstItemData());
            mainContentBoyaca.put("item2", getSecItemData());
            mainContentBoyaca.put("item3", getThirdItemData());
            mainContentBoyaca.put("item4", getFourItemData());
            mainContentBoyaca.put("item5", getFifthItemData());
            mainContentBoyaca.put("item6", getSixthItemData());
            mainContentBoyaca.put("item7", getSevenththItemData());
            mainContentBoyaca.put("item8", getEighthItemData());
            mainContentBoyaca.put("item9", getNinthItemData());
            mainContentBoyaca.put("item10", getTenthItemData());
            mainContentBoyaca.put("item11", getEleventhItemData());
            mainContentBoyaca.put("item12", getTwelvethItemData());
            mainContentBoyaca.put("item13", getThirdteenthItemData());
            mainContentBoyaca.put("item14", getFourteenthItemData());
            mainContentBoyaca.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailBoyaca(){
        addObjectsBoyaca();
        return mainContentBoyaca;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentBoyaca1.put("title", title1);
        contentBoyaca1.put("description", description1);
        contentBoyaca1.put("phone", phone1);
        contentBoyaca1.put("email", email1);
        contentBoyaca1.put("image", imageFile1);
        contentBoyaca1.put("coords", coords1);

        return contentBoyaca1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentBoyaca2.put("title", title2);
        contentBoyaca2.put("description", description2);
        contentBoyaca2.put("phone", phone2);
        contentBoyaca2.put("email", email2);
        contentBoyaca2.put("image", imageFile2);
        contentBoyaca2.put("coords", coords2);

        return contentBoyaca2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentBoyaca3.put("title", title3);
        contentBoyaca3.put("description", description3);
        contentBoyaca3.put("phone", phone3);
        contentBoyaca3.put("email", email3);
        contentBoyaca3.put("image", imageFile3);
        contentBoyaca3.put("coords", coords3);

        return contentBoyaca3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentBoyaca4.put("title", title4);
        contentBoyaca4.put("description", description4);
        contentBoyaca4.put("phone", phone4);
        contentBoyaca4.put("email", email4);
        contentBoyaca4.put("image", imageFile4);
        contentBoyaca4.put("coords", coords4);

        return contentBoyaca4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentBoyaca5.put("title", title5);
        contentBoyaca5.put("description", description5);
        contentBoyaca5.put("phone", phone5);
        contentBoyaca5.put("email", email5);
        contentBoyaca5.put("image", imageFile5);
        contentBoyaca5.put("coords", coords5);

        return contentBoyaca5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentBoyaca6.put("title", title6);
        contentBoyaca6.put("description", description6);
        contentBoyaca6.put("phone", phone6);
        contentBoyaca6.put("email", email6);
        contentBoyaca6.put("image", imageFile6);
        contentBoyaca6.put("coords", coords6);

        return contentBoyaca6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentBoyaca7.put("title", title7);
        contentBoyaca7.put("description", description7);
        contentBoyaca7.put("phone", phone7);
        contentBoyaca7.put("email", email7);
        contentBoyaca7.put("image", imageFile7);
        contentBoyaca7.put("coords", coords7);

        return contentBoyaca7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentBoyaca8.put("title", title8);
        contentBoyaca8.put("description", description8);
        contentBoyaca8.put("phone", phone8);
        contentBoyaca8.put("email", email8);
        contentBoyaca8.put("image", imageFile8);
        contentBoyaca8.put("coords", coords8);

        return contentBoyaca8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentBoyaca9.put("title", title9);
        contentBoyaca9.put("description", description9);
        contentBoyaca9.put("phone", phone9);
        contentBoyaca9.put("email", email9);
        contentBoyaca9.put("image", imageFile9);
        contentBoyaca9.put("coords", coords9);

        return contentBoyaca9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentBoyaca10.put("title", title10);
        contentBoyaca10.put("description", description10);
        contentBoyaca10.put("phone", phone10);
        contentBoyaca10.put("email", email10);
        contentBoyaca10.put("image", imageFile10);
        contentBoyaca10.put("coords", coords10);

        return contentBoyaca10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentBoyaca11.put("title", title11);
        contentBoyaca11.put("description", description11);
        contentBoyaca11.put("phone", phone11);
        contentBoyaca11.put("email", email11);
        contentBoyaca11.put("image", imageFile11);
        contentBoyaca11.put("coords", coords11);

        return contentBoyaca11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentBoyaca12.put("title", title12);
        contentBoyaca12.put("description", description12);
        contentBoyaca12.put("phone", phone12);
        contentBoyaca12.put("email", email12);
        contentBoyaca12.put("image", imageFile12);
        contentBoyaca12.put("coords", coords12);

        return contentBoyaca12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentBoyaca13.put("title", title13);
        contentBoyaca13.put("description", description13);
        contentBoyaca13.put("phone", phone13);
        contentBoyaca13.put("email", email13);
        contentBoyaca13.put("image", imageFile13);
        contentBoyaca13.put("coords", coords13);

        return contentBoyaca13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentBoyaca14.put("title", title14);
        contentBoyaca14.put("description", description14);
        contentBoyaca14.put("phone", phone14);
        contentBoyaca14.put("email", email14);
        contentBoyaca14.put("image", imageFile14);
        contentBoyaca14.put("coords", coords14);

        return contentBoyaca14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentBoyaca15.put("title", title15);
        contentBoyaca15.put("description", description15);
        contentBoyaca15.put("phone", phone15);
        contentBoyaca15.put("email", email15);
        contentBoyaca15.put("image", imageFile15);
        contentBoyaca15.put("coords", coords15);

        return contentBoyaca15;
    }
}
