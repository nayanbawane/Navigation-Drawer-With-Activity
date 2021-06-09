package com.example.quickenglishspeaking.Card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.quickenglishspeaking.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Card9 extends AppCompatActivity {

    PDFView mPDFView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card9);

        mPDFView = (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("009-min.pdf").load();
    }

    private void loadAds(){
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}