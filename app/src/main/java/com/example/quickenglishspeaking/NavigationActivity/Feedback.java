package com.example.quickenglishspeaking.NavigationActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.quickenglishspeaking.MainActivity;
import com.example.quickenglishspeaking.R;

import static com.example.quickenglishspeaking.MainActivity.closeDrawer;


public class Feedback extends AppCompatActivity {
    DrawerLayout drawerLayout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_feedback);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {
        MainActivity.openDrawer(this.drawerLayout);
    }

    public void ClickLogo(View view) {
        closeDrawer(this.drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickRateThisApp(View view) {
        MainActivity.redirectActivity(this, RateThisApp.class);
    }


    public void ClickOtherApps(View view) {
        MainActivity.redirectActivity(this, OtherApps.class);

    }

    public void ClickShareLink(View view) {
        Intent shareintent = new Intent();
        shareintent.setAction(Intent.ACTION_SEND);
        shareintent.putExtra(Intent.EXTRA_TEXT,"*Quick English Speaking* जिसमे 2500+ से अधिक रोजाना बोले जाने वाले हिंदी से अंग्रेजी के वाक्य दिए गए है जिससे की आप बहुत ही तेजी से अंग्रेजी बोलना सीख सकते है। \n \nआप नीचे दिए गए लिंक से *Quick English Speaking* ऐप डाउनलोड कर सकते हो। \n_");
        shareintent.setType("text/plain");
        startActivity(Intent.createChooser(shareintent,"Share via"));
    }

    public void ClickFeedback(View view) {
        closeDrawer(this.drawerLayout);
    }

    public void ClickDeveloper(View view) {
        MainActivity.redirectActivity(this,Developer.class);
    }

    public void ClickPrivacyPolicy(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bhawaniconsultancyservices.blogspot.com/2021/05/privacy-policy.html"));
        startActivity(browserIntent);
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        closeDrawer(this.drawerLayout);
    }
}
