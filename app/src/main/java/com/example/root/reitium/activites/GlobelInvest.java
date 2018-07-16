package com.example.root.reitium.activites;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.reitium.R;
import com.example.root.reitium.adpaters.GridViewAdapter;
import com.example.root.reitium.alltinderact.TinderActivity;
import com.example.root.reitium.modles.CardItem;

import java.util.ArrayList;

public class GlobelInvest extends AppCompatActivity {

    ExpandableHeightGridView gridView;
    GridViewAdapter gridViewAdapter;
    ArrayList<CardItem> cardItemArrayList = new ArrayList<>();
    Typeface typefaceBottom;
    private TextView txtMain, txtPor, txtWallet;
    private ImageView imgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_globel_invest);


        txtPor = findViewById(R.id.txtPor);
        txtWallet = findViewById(R.id.txtWallet);

        typefaceBottom = Typeface.createFromAsset(getAssets(), "font/Montserrat-SemiBold.otf");
        txtPor.setTypeface(typefaceBottom);
        txtWallet.setTypeface(typefaceBottom);

        imgMain = findViewById(R.id.imgMain);

        imgMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        txtMain = findViewById(R.id.txtMain);

        gridView = findViewById(R.id.gridView);

        gridView.setExpanded(true);
        gridView.setFocusable(false);

        gridViewAdapter = new GridViewAdapter(this, cardItemArrayList, new GridViewAdapter.CardListener() {
            @Override
            public void clickOn(int pos) {
                startActivity(new Intent(GlobelInvest.this, TinderActivity.class));
            }
        });

        gridView.setAdapter(gridViewAdapter);

        dummyData();
    }

    private void dummyData() {
        CardItem cardItem;
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.third);
        cardItem.setItem("LONDON");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image3);
        cardItem.setItem("BOMBAY");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image2);
        cardItem.setItem("RUSSIA");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image3);
        cardItem.setItem("ENGLAND");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image1);
        cardItem.setItem("INDIA");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image4);
        cardItem.setItem("USA");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image2);
        cardItem.setItem("CHINA");
        cardItemArrayList.add(cardItem);
        cardItem = new CardItem();
        cardItem.setImage(R.drawable.image5);
        cardItem.setItem("LONDON");
        cardItemArrayList.add(cardItem);

        gridViewAdapter.notifyDataSetChanged();
    }
}
