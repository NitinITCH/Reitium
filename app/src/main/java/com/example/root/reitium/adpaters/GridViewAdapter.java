package com.example.root.reitium.adpaters;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.reitium.R;
import com.example.root.reitium.modles.CardItem;

import java.util.ArrayList;

/**
 * Created by root on 23/4/18.
 */

public class GridViewAdapter extends BaseAdapter {


    Context context;
    ArrayList<CardItem> cardItems;
    LayoutInflater inflater;
    CardListener cardListener;

    public GridViewAdapter(Context context, ArrayList<CardItem> cardItems, CardListener cardListener) {
        this.context = context;
        this.cardItems = cardItems;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.cardListener = cardListener;
    }

    @Override
    public int getCount() {
        return cardItems.size();
    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Viewholder viewholder = new Viewholder();
        AssetManager assetManager = context.getAssets();

        Typeface typeface = Typeface.createFromAsset(assetManager, "font/Montserrat-Medium.otf");

        View view = inflater.inflate(R.layout.carditem, null);
        viewholder.imageView = view.findViewById(R.id.imageView);
        viewholder.textView = view.findViewById(R.id.textView);
        viewholder.textView.setTypeface(typeface);
        viewholder.textView.setText(cardItems.get(position).getItem());
        viewholder.imageView.setImageResource(cardItems.get(position).getImage());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardListener.clickOn(position);

            }
        });

        return view;
    }

    public interface CardListener {
        void clickOn(int pos);
    }

    public class Viewholder {

        ImageView imageView;
        TextView textView;
    }
}
