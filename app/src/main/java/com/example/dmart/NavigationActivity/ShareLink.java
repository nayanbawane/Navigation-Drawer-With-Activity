package com.example.dmart.NavigationActivity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.dmart.MainActivity;
import com.example.dmart.R;


public class ShareLink extends AppCompatActivity {
    DrawerLayout drawerLayout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_share_link);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {
        MainActivity.openDrawer(this.drawerLayout);
    }

    public void ClickLogo(View view) {
        MainActivity.closeDrawer(this.drawerLayout);
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
        recreate();
    }

    public void ClickFeedback(View view) {
        MainActivity.redirectActivity(this, ShareLink.class);
    }

    public void ClickDeveloper(View view) {
        MainActivity.redirectActivity(this,Developer.class);
    }

    public void ClickPrivacyPolicy(View view) {
        MainActivity.redirectActivity(this, PrivacyPolicy.class);
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MainActivity.closeDrawer(this.drawerLayout);
    }
}
