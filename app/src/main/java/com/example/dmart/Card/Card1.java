package com.example.dmart.Card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dmart.R;
import com.github.barteksc.pdfviewer.PDFView;


public class Card1 extends AppCompatActivity {

    PDFView mPDFView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);



        mPDFView = (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("001.pdf").load();
    }
}