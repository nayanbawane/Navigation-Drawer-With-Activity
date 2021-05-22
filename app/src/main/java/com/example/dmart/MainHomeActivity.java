package com.example.dmart;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.dmart.NavigationActivity.Developer;
import com.example.dmart.NavigationActivity.Feedback;
import com.example.dmart.NavigationActivity.OtherApps;
import com.example.dmart.NavigationActivity.PrivacyPolicy;
import com.example.dmart.NavigationActivity.RateThisApp;
import com.example.dmart.NavigationActivity.ShareLink;


public class MainHomeActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {
        openDrawer(this.drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout2) {
        drawerLayout2.openDrawer((int) GravityCompat.START);
    }

    public void ClickLogo(View view) {
        closeDrawer(this.drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout2) {
        if (drawerLayout2.isDrawerOpen((int) GravityCompat.START)) {
            drawerLayout2.closeDrawer((int) GravityCompat.START);
        }
    }

    public void ClickHome(View view) {
        recreate();
    }

    public void ClickRateThisApp(View view) {
        redirectActivity(this, RateThisApp.class);
    }


    public void ClickOtherApps(View view) {
        redirectActivity(this, OtherApps.class);
    }

    public void ClickShareLink(View view) {
        redirectActivity(this, ShareLink.class);
    }

    public void ClickFeedback(View view) {
        redirectActivity(this, Feedback.class);
    }

    public void ClickDeveloper(View view) {
        redirectActivity(this, Developer.class);
    }

    public void ClickPrivacyPolicy(View view) {
        redirectActivity(this, PrivacyPolicy.class);
    }


    public void ClickLogout(View view) {
        logout(this);
    }

    public static void logout(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure you want to Exit ?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        closeDrawer(this.drawerLayout);
    }
}
