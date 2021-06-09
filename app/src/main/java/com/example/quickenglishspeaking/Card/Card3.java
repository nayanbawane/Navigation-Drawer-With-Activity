package com.example.quickenglishspeaking.Card;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quickenglishspeaking.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Card3 extends AppCompatActivity {

    PDFView mPDFView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card3);

        MobileAds.initialize(this);
        loadAds();

        mPDFView = (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("003-min.pdf").load();
    }

    private void loadAds(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}