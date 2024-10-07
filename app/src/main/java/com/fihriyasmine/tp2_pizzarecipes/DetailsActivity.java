package com.fihriyasmine.tp2_pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);

        TextView vnom=findViewById(R.id.nom);
        TextView vdecription=findViewById(R.id.description);
        TextView vpreparation=findViewById(R.id.preparation);
        TextView vdetaisIngred=findViewById(R.id.ingredients);
        ImageView vphoto=findViewById(R.id.image);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String description = intent.getStringExtra("description");
        String preparation = intent.getStringExtra("preparation");
        String detaisIngred = intent.getStringExtra("detaisIngred");
        int photo = intent.getIntExtra("photo", 0);

        vnom.setText(nom+" ");
        vdecription.setText(description+" ");
        vdetaisIngred.setText(detaisIngred+" ");
        vpreparation.setText(preparation+" ");
        vphoto.setImageResource(photo);


        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this,ListPizza.class);
                startActivity(intent);
            }
        });

    }
}