package com.example.root.reitium.alltinderact;


import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.root.reitium.R;
import com.example.root.reitium.modles.Profile;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;

/**
 * Created by root on 21/4/18.
 */
@Layout(R.layout.tinder_card_view)
public class TinderCard {

    @View(R.id.linearFirst)
    public LinearLayout linearFirst;
    @View(R.id.viewOne)
    public android.view.View viewone;
    @View(R.id.viewTwo)
    public android.view.View viewtwo;
    @View(R.id.ViewThree)
    public android.view.View ViewThree;
    @View(R.id.viewFour)
    public android.view.View viewfour;
    @View(R.id.profileImageView)
    public ImageView profileImageView;
    @View(R.id.txtType)
    public TextView txtType;
    @View(R.id.txtBadroom)
    public TextView txtBadroom;
    @View(R.id.txtBath)
    public TextView txtBath;
    @View(R.id.txtBahroom)
    public TextView txtBahroom;
    @View(R.id.nameAgeTxt)
    public TextView nameAgeTxt;
    @View(R.id.locationNameTxt)
    public TextView locationNameTxt;
    @View(R.id.locationNameTxto)
    public TextView locationNameTxto;
    @View(R.id.nameAgeTxto)
    public TextView nameAgeTxto;
    @View(R.id.txtTypeo)
    public TextView txtTypeo;
    @View(R.id.txtBadroomo)
    public TextView txtBadroomo;
    @View(R.id.txtBatho)
    public TextView txtBatho;
    @View(R.id.txtBahroomo)
    public TextView txtBahroomo;
    public Profile mProfile;
    public Context mContext;
    public SwipePlaceHolderView mSwipeView;
    int images[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};
    int count = 0;


    public TinderCard(Context context, Profile profile, SwipePlaceHolderView swipeView) {
        mContext = context;
        mProfile = profile;
        mSwipeView = swipeView;
    }

    @Resolve
    public void onResolved() {

        AssetManager assetManager = mContext.getAssets();

        Typeface typeface = Typeface.createFromAsset(assetManager, "font/Montserrat-Medium.otf");
        txtBadroomo.setTypeface(typeface);
        txtBatho.setTypeface(typeface);
        txtBahroomo.setTypeface(typeface);
        txtType.setTypeface(typeface);
        nameAgeTxt.setTypeface(typeface);
        locationNameTxt.setTypeface(typeface);
        txtBadroom.setTypeface(typeface);
        txtBath.setTypeface(typeface);
        txtBahroom.setTypeface(typeface);
        locationNameTxto.setTypeface(typeface);
        nameAgeTxto.setTypeface(typeface);
        txtTypeo.setTypeface(typeface);

        linearFirst.setAlpha((float) 0.7);
//        viewone.setBackgroundColor(Color.rgb(255,255,255));


        Glide.with(mContext).load(mProfile.getImageUrl()).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)).into(profileImageView);

        profileImageView.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                if (count < images.length) {
                    profileImageView.setImageResource(images[count]);

                    if (count == 0) {
                        viewfour.setBackgroundColor(Color.rgb(102, 102, 102));
                        viewone.setBackgroundColor(Color.rgb(255, 255, 255));
                        viewtwo.setBackgroundColor(Color.rgb(102, 102, 102));
                    } else if (count == 1) {
                        viewone.setBackgroundColor(Color.rgb(102, 102, 102));
                        viewtwo.setBackgroundColor(Color.rgb(255, 255, 255));
                    } else if (count == 2) {
                        viewtwo.setBackgroundColor(Color.rgb(102, 102, 102));
                        ViewThree.setBackgroundColor(Color.rgb(255, 255, 255));
                    } else if (count == 3) {
                        ViewThree.setBackgroundColor(Color.rgb(102, 102, 102));
                        viewfour.setBackgroundColor(Color.rgb(255, 255, 255));
                    } else {
                        viewfour.setBackgroundColor(Color.rgb(102, 102, 102));
                        viewone.setBackgroundColor(Color.rgb(255, 255, 255));
                    }

                    count++;
                    if (count == images.length) {
                        count = 0;
                    }
                }

            }
        });

        //        nameAgeTxt.setText(mProfile.getName() + ", " + mProfile.getAge());
//        locationNameTxt.setText(mProfile.getLocation());
    }

    void imagRotate(int pos) {
        for (int i = 0; i < 4; i++) {

        }
    }

    @SwipeOut
    public void onSwipedOut() {
        Log.d("EVENT", "onSwipedOut");
        mSwipeView.addView(this);
    }

    @SwipeCancelState
    public void onSwipeCancelState() {
        Log.d("EVENT", "onSwipeCancelState");
    }

    @SwipeIn
    public void onSwipeIn() {
        Log.d("EVENT", "onSwipedIn");
    }

    @SwipeInState
    public void onSwipeInState() {
        Log.d("EVENT", "onSwipeInState");
    }

    @SwipeOutState
    public void onSwipeOutState() {
        Log.d("EVENT", "onSwipeOutState");
    }


}
