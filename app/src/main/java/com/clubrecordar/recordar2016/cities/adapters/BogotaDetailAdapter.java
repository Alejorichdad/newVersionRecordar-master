package com.clubrecordar.recordar2016.cities.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BogotaModel;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetEighteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetNineteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSeventeenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSixteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTwelvethActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTwentiethActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTwentyfirstActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTwentythirdActivity;
import com.clubrecordar.recordar2016.helpers.detail.DetailBogota;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class BogotaDetailAdapter extends RecyclerView.Adapter<BogotaDetailAdapter.BogotaDetailViewHolder> {

    private List<BogotaModel> items;
    Context context;
    private Intent intent;


    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;
    public int image;

    public class BogotaDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public BogotaDetailViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            idImagen = (ImageView) v.findViewById(R.id.idImagen);
            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);

        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();

            switch (getLayoutPosition()){
                case 0:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item1").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item1").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item1").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item1").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item1").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFirstActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 1:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item2").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item2").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item2").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item2").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item2").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSecActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 2:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item3").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item3").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item3").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item3").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item3").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetThirdActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 3:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item4").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item4").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item4").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item4").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item4").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFourthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 4:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item5").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item5").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item5").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item5").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item5").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item5").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFifthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 5:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item6").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item6").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item6").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item6").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item6").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item6").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSixthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 6:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item7").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item7").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item7").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item7").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item7").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item7").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSeventhActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 7:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item8").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item8").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item8").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item8").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item8").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item8").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetEighthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 8:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item9").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item9").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item9").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item9").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item9").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item9").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetNinthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 9:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item10").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item10").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item10").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item10").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item10").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item10").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 10:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item11").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item11").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item11").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item11").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item11").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item11").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetEleventhActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 11:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item12").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item12").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item12").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item12").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item12").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item12").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTwelvethActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 12:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item13").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item13").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item13").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item13").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item13").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item13").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetThirteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 13:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item14").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item14").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item14").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item14").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item14").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item14").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFourteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 14:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item15").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item15").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item15").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item15").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item15").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item15").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFifteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 15:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item16").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item16").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item16").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item16").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item16").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item16").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSixteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 16:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item17").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item17").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item17").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item17").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item17").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item17").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSeventeenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 17:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item18").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item18").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item18").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item18").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item18").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item18").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetEighteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 18:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item19").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item19").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item19").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item19").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item19").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item19").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetNineteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 19:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item20").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item20").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item20").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item20").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item20").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item20").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTwentyfirstActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 20:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item21").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item21").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item21").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item21").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item21").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item21").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTwentiethActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 21:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item22").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item22").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item22").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item22").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item22").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item22").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTwentiethActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 22:
                    try {
                        title = (String) DetailBogota.getDetailBogota().getJSONObject("item23").get("title");
                        description = (String) DetailBogota.getDetailBogota().getJSONObject("item23").get("description");
                        phone = (String) DetailBogota.getDetailBogota().getJSONObject("item23").get("phone");
                        email = (String) DetailBogota.getDetailBogota().getJSONObject("item23").get("email");
                        coords = (String) DetailBogota.getDetailBogota().getJSONObject("item23").get("coords");
                        image = (int) DetailBogota.getDetailBogota().getJSONObject("item23").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTwentythirdActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
            }
        }

        public void setTitle(String title){
            titulo_imagen.setText(title);
        }

        public void setBenefit(String benefit){
            beneficio.setText(benefit);
        }

        public void setImage(int urlImg){
            //Log.e(context.toString(),"ssss");
            Picasso.with(context)
                    .load(urlImg)
                    .fit()
                    .centerCrop()
                    .into(idImagen);
        }
    }

    public BogotaDetailAdapter(List<BogotaModel> items) {
        this.items = items;
    }

    @Override
    public BogotaDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.bogota_card, viewGroup, false);
        return new BogotaDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BogotaDetailViewHolder viewHolder, int position) {
        BogotaModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
