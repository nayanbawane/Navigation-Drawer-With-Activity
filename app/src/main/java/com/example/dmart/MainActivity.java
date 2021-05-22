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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dmart.Adapters.MainAdapter;
import com.example.dmart.Card.Card1;
import com.example.dmart.Classes.RecyclerItemClickListener;
import com.example.dmart.NavigationActivity.Developer;
import com.example.dmart.NavigationActivity.Feedback;
import com.example.dmart.NavigationActivity.OtherApps;
import com.example.dmart.NavigationActivity.PrivacyPolicy;
import com.example.dmart.NavigationActivity.RateThisApp;
import com.example.dmart.NavigationActivity.ShareLink;
import com.example.dmart.model.MainModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        recyclerView = findViewById(R.id.recyclarView);
        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 01 | Chapter 01"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 02 | Chapter 02"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 03 | Chapter 03"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 04 | Chapter 04"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 05 | Chapter 05"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 06 | Chapter 06"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 07 | Chapter 07"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 08 | Chapter 08"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 09 | Chapter 09"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 10 | Chapter 10"));

        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 11 | Chapter 11"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 12 | Chapter 12"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 13 | Chapter 13"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 14 | Chapter 14"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 15 | Chapter 15"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 16 | Chapter 16"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 17 | Chapter 17"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 18 | Chapter 18"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 19 | Chapter 19"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 20 | Chapter 20"));

        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 21 | Chapter 21"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 22 | Chapter 22"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 23 | Chapter 23"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 24 | Chapter 24"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 25 | Chapter 25"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 26 | Chapter 26"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 27 | Chapter 27"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 28 | Chapter 28"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 29 | Chapter 29"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 30 | Chapter 30"));

        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 31 | Chapter 31"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 32 | Chapter 32"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 33 | Chapter 33"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 34 | Chapter 34"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 35 | Chapter 35"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 36 | Chapter 36"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 37 | Chapter 37"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 38 | Chapter 38"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 39 | Chapter 39"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 40 | Chapter 40"));

        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 41 | Chapter 41"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 42 | Chapter 42"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 43 | Chapter 43"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 44 | Chapter 44"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 45 | Chapter 45"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 46 | Chapter 46"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 47 | Chapter 47"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 48 | Chapter 48"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 49 | Chapter 49"));
        list.add(new MainModel(R.drawable.tomato_poha, "अध्याय 50 | Chapter 50"));


        MainAdapter adapter = new MainAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switch (position) {
                            case 0:
                                Intent intent = new Intent(MainActivity.this, Card1.class);
                                startActivity(intent);
                                break;




                            default:
                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }

                ));

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerView.setLayoutManager(layoutManager);

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
