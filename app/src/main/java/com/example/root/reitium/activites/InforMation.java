package com.example.root.reitium.activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.root.reitium.R;

public class InforMation extends AppCompatActivity {

    Button btnFav;
    LinearLayout favInvest, favLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor_mation);


        favInvest = findViewById(R.id.favInvest);
        favLinear = findViewById(R.id.favLinear);

        favLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InforMation.this, Fav.class);
                startActivity(intent);
                overridePendingTransition(R.anim.animator_in, R.anim.animator_out);

            }
        });

        favInvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InforMation.this, Fav.class);
                startActivity(intent);
                overridePendingTransition(R.anim.animator_in, R.anim.animator_out);

            }
        });

    }
}
