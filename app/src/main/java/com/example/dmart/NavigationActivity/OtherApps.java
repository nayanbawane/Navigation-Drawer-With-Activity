package com.example.dmart.NavigationActivity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.dmart.MainHomeActivity;
import com.example.dmart.R;


public class OtherApps extends AppCompatActivity {
    DrawerLayout drawerLayout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_other_apps);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {
        MainHomeActivity.openDrawer(this.drawerLayout);
    }

    public void ClickLogo(View view) {
        MainHomeActivity.closeDrawer(this.drawerLayout);
    }

    public void ClickHome(View view) {
        MainHomeActivity.redirectActivity(this, MainHomeActivity.class);
    }

    public void ClickRateThisApp(View view) {
        MainHomeActivity.redirectActivity(this, RateThisApp.class);
    }


    public void ClickOtherApps(View view) {
        recreate();

    }

    public void ClickShareLink(View view) {
        MainHomeActivity.redirectActivity(this, ShareLink.class);
    }

    public void ClickFeedback(View view) {
        MainHomeActivity.redirectActivity(this, OtherApps.class);
    }

    public void ClickDeveloper(View view) {
        MainHomeActivity.redirectActivity(this,Developer.class);
    }

    public void ClickPrivacyPolicy(View view) {
        MainHomeActivity.redirectActivity(this, PrivacyPolicy.class);
    }

    public void ClickLogout(View view) {
        MainHomeActivity.logout(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MainHomeActivity.closeDrawer(this.drawerLayout);
    }
}