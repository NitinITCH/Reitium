package com.example.root.reitium.activites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.root.reitium.R;
import com.example.root.reitium.adpaters.AddPayment;

public class LandingAct extends AppCompatActivity {


    CardView cardClick;
    Typeface typeface, typefaceCard, typefaceBottom, typefaceContent, typePercentage;
    private AppBarLayout appBarLayout;
    private android.support.v7.widget.Toolbar toolbar;
    private TabLayout tabLayout;
    private TextView txtPor, txtWallet, txtHome, txtMarket, txtPortf, txtLoadwallet, txtWithdraw, txtReinvest, txtAnal;
    private LinearLayout linerLeft;
    private LinearLayout linearRight;
    private TextView txtSubBalanceSecond, txtSubBalance, txtPortBalance, txtMainBalance, txtPercentage, txtAllTime, txtInial, txtTimeProfit;
    private ImageView imgMain;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        txtHome = findViewById(R.id.txtHome);
        txtMarket = findViewById(R.id.txtMarket);
        txtPortf = findViewById(R.id.txtPortf);

        txtLoadwallet = findViewById(R.id.txtLoadwallet);
        txtWithdraw = findViewById(R.id.txtWithdraw);
        txtReinvest = findViewById(R.id.txtReinvest);
        txtAnal = findViewById(R.id.txtAnal);

//LetterSpacingTextView txt=new LetterSpacingTextView(getApplicationContext());
//txt.setLetterSpacing(10);

        txtPor = findViewById(R.id.txtPor);
        txtWallet = findViewById(R.id.txtWallet);

        txtPortBalance = findViewById(R.id.txtPortBalance);
        txtMainBalance = findViewById(R.id.txtMainBalance);
        txtPercentage = findViewById(R.id.txtPercentage);
        txtAllTime = findViewById(R.id.txtAllTime);
        txtInial = findViewById(R.id.txtInial);
        txtTimeProfit = findViewById(R.id.txtTimeProfit);
        txtSubBalance = findViewById(R.id.txtSubBalance);
        txtSubBalanceSecond = findViewById(R.id.txtSubBalanceSecond);

        AssetManager assetManager = getAssets();

        typeface = Typeface.createFromAsset(assetManager, "font/Montserrat-Regular.otf");
        txtHome.setTypeface(typeface);
        txtMarket.setTypeface(typeface);
        txtPortf.setTypeface(typeface);


        typefaceCard = Typeface.createFromAsset(assetManager, "font/Montserrat-Regular.otf");
        txtLoadwallet.setTypeface(typefaceCard);
        txtWithdraw.setTypeface(typefaceCard);
        txtReinvest.setTypeface(typefaceCard);
        txtAnal.setTypeface(typefaceCard);


        typefaceBottom = Typeface.createFromAsset(assetManager, "font/Montserrat-SemiBold.otf");
        txtPor.setTypeface(typefaceBottom);
        txtWallet.setTypeface(typefaceBottom);

        typefaceContent = Typeface.createFromAsset(assetManager, "font/Montserrat-Light.otf");
        txtPortBalance.setTypeface(typefaceContent);
        txtMainBalance.setTypeface(typefaceContent);
        txtAllTime.setTypeface(typefaceContent);
        txtInial.setTypeface(typefaceContent);
        txtTimeProfit.setTypeface(typefaceContent);
        txtSubBalance.setTypeface(typefaceContent);
        txtSubBalanceSecond.setTypeface(typefaceContent);

        typePercentage = Typeface.createFromAsset(assetManager, "font/Montserrat-Thin.otf");
        txtPercentage.setTypeface(typefaceContent);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        tabLayout=(TabLayout)findViewById(R.id.tablayout);
//        tabLayout.addTab(tabLayout.newTab().setText("Home"));
//        tabLayout.addTab(tabLayout.newTab().setText("Market Place"));
//        tabLayout.addTab(tabLayout.newTab().setText("Portfolio"));
//        ((TextView)findViewById(R.id.subscript)).setText(Html.fromHtml("<sup>$</sup>"));
//        ((TextView)findViewById(R.id.txtSubfirst)).setText(Html.fromHtml("<sup>$</sup>"));
//        ((TextView)findViewById(R.id.txtSubS)).setText(Html.fromHtml("<sup>$</sup>"));


        linearRight = findViewById(R.id.linearRight);
        linearRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandingAct.this, Fav.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });


        linerLeft = findViewById(R.id.linerLeft);
        linerLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandingAct.this, InforMation.class));
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });

        cardClick = findViewById(R.id.cardClick);
        cardClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingAct.this, AddPayment.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

            }
        });

        imgMain = findViewById(R.id.imgMain);

        imgMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingAct.this, GlobelInvest.class);
                startActivity(intent);
                overridePendingTransition(R.anim.animator_in, R.anim.animator_out);
            }
        });


    }

    @Override
    public void onBackPressed() {

    }
}
