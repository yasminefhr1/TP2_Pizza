package com.fihriyasmine.tp2_pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fihriyasmine.tp2_pizzarecipes.R;
import com.fihriyasmine.tp2_pizzarecipes.classes.Produits;

import org.w3c.dom.Text;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produits> list;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produits> list, Activity activity) {
        this.list = list;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView=inflater.inflate(R.layout.item,null);


        TextView id = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbringredients = convertView.findViewById(R.id.nbrIngredients);
        ImageView photo = convertView.findViewById(R.id.image);
        TextView duree = convertView.findViewById(R.id.duree);

        id.setText(list.get(position).getId()+" ");
        nom.setText(list.get(position).getNom()+" ");
        nbringredients.setText(list.get(position).getNbringredients()+" ");
        photo.setImageResource(list.get(position).getPhoto());
        duree.setText((int) list.get(position).getDuree()+" min");

        return convertView;
    }
}
