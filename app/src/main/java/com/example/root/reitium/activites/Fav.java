package com.example.root.reitium.activites;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.root.reitium.R;

public class Fav extends AppCompatActivity {

    LinearLayout linearLayout;
    private TextView txtPor, txtWallet;
    private Typeface typefaceBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);


        txtPor = findViewById(R.id.txtPor);
        txtWallet = findViewById(R.id.txtWallet);

        typefaceBottom = Typeface.createFromAsset(getAssets(), "font/Montserrat-SemiBold.otf");
        txtPor.setTypeface(typefaceBottom);
        txtWallet.setTypeface(typefaceBottom);

        linearLayout = findViewById(R.id.linerLeft);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fav.this, LandingAct.class));
                overridePendingTransition(R.anim.animator_in, R.anim.animator_out);
            }
        });
    }
}
