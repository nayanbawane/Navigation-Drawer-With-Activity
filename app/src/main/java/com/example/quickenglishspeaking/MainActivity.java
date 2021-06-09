package com.example.quickenglishspeaking;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quickenglishspeaking.Adapters.MainAdapter;
import com.example.quickenglishspeaking.Card.Card10;
import com.example.quickenglishspeaking.Card.Card11;
import com.example.quickenglishspeaking.Card.Card12;
import com.example.quickenglishspeaking.Card.Card13;

import com.example.quickenglishspeaking.Card.Card1;
import com.example.quickenglishspeaking.Card.Card14;
import com.example.quickenglishspeaking.Card.Card15;
import com.example.quickenglishspeaking.Card.Card16;
import com.example.quickenglishspeaking.Card.Card17;
import com.example.quickenglishspeaking.Card.Card18;
import com.example.quickenglishspeaking.Card.Card19;
import com.example.quickenglishspeaking.Card.Card2;
import com.example.quickenglishspeaking.Card.Card20;
import com.example.quickenglishspeaking.Card.Card21;
import com.example.quickenglishspeaking.Card.Card22;
import com.example.quickenglishspeaking.Card.Card23;
import com.example.quickenglishspeaking.Card.Card24;
import com.example.quickenglishspeaking.Card.Card25;
import com.example.quickenglishspeaking.Card.Card26;
import com.example.quickenglishspeaking.Card.Card27;
import com.example.quickenglishspeaking.Card.Card28;
import com.example.quickenglishspeaking.Card.Card29;
import com.example.quickenglishspeaking.Card.Card3;
import com.example.quickenglishspeaking.Card.Card30;
import com.example.quickenglishspeaking.Card.Card31;
import com.example.quickenglishspeaking.Card.Card33;
import com.example.quickenglishspeaking.Card.Card34;
import com.example.quickenglishspeaking.Card.Card35;
import com.example.quickenglishspeaking.Card.Card36;
import com.example.quickenglishspeaking.Card.Card37;
import com.example.quickenglishspeaking.Card.Card38;
import com.example.quickenglishspeaking.Card.Card39;
import com.example.quickenglishspeaking.Card.Card4;
import com.example.quickenglishspeaking.Card.Card40;
import com.example.quickenglishspeaking.Card.Card41;
import com.example.quickenglishspeaking.Card.Card42;
import com.example.quickenglishspeaking.Card.Card43;
import com.example.quickenglishspeaking.Card.Card44;
import com.example.quickenglishspeaking.Card.Card45;
import com.example.quickenglishspeaking.Card.Card46;
import com.example.quickenglishspeaking.Card.Card47;
import com.example.quickenglishspeaking.Card.Card48;
import com.example.quickenglishspeaking.Card.Card49;
import com.example.quickenglishspeaking.Card.Card5;
import com.example.quickenglishspeaking.Card.Card50;
import com.example.quickenglishspeaking.Card.Card6;
import com.example.quickenglishspeaking.Card.Card7;
import com.example.quickenglishspeaking.Card.Card8;
import com.example.quickenglishspeaking.Card.Card9;
import com.example.quickenglishspeaking.Classes.RecyclerItemClickListener;
import com.example.quickenglishspeaking.NavigationActivity.Developer;
import com.example.quickenglishspeaking.NavigationActivity.Feedback;
import com.example.quickenglishspeaking.NavigationActivity.OtherApps;
import com.example.quickenglishspeaking.NavigationActivity.RateThisApp;
import com.example.quickenglishspeaking.model.MainModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    RecyclerView recyclerView;
    private boolean doubleBackToExitPressedOnce;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);


        FirebaseMessaging.getInstance().subscribeToTopic("weather")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Done";
                        if (!task.isSuccessful()) {
                            msg = "Failed";
                        }

                    }
                });



        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        recyclerView = findViewById(R.id.recyclarView);
        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.icon, "अध्याय 01 | Chapter 01"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 02 | Chapter 02"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 03 | Chapter 03"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 04 | Chapter 04"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 05 | Chapter 05"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 06 | Chapter 06"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 07 | Chapter 07"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 08 | Chapter 08"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 09 | Chapter 09"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 10 | Chapter 10"));

        list.add(new MainModel(R.drawable.icon, "अध्याय 11 | Chapter 11"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 12 | Chapter 12"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 13 | Chapter 13"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 14 | Chapter 14"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 15 | Chapter 15"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 16 | Chapter 16"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 17 | Chapter 17"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 18 | Chapter 18"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 19 | Chapter 19"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 20 | Chapter 20"));

        list.add(new MainModel(R.drawable.icon, "अध्याय 21 | Chapter 21"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 22 | Chapter 22"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 23 | Chapter 23"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 24 | Chapter 24"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 25 | Chapter 25"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 26 | Chapter 26"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 27 | Chapter 27"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 28 | Chapter 28"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 29 | Chapter 29"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 30 | Chapter 30"));

        list.add(new MainModel(R.drawable.icon, "अध्याय 31 | Chapter 31"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 32 | Chapter 32"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 33 | Chapter 33"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 34 | Chapter 34"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 35 | Chapter 35"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 36 | Chapter 36"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 37 | Chapter 37"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 38 | Chapter 38"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 39 | Chapter 39"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 40 | Chapter 40"));

        list.add(new MainModel(R.drawable.icon, "अध्याय 41 | Chapter 41"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 42 | Chapter 42"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 43 | Chapter 43"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 44 | Chapter 44"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 45 | Chapter 45"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 46 | Chapter 46"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 47 | Chapter 47"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 48 | Chapter 48"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 49 | Chapter 49"));
        list.add(new MainModel(R.drawable.icon, "अध्याय 50 | Chapter 50"));
        list.add(new MainModel(R.drawable.icon, "Chapter are Coming Soon"));


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

                            case 1:
                                Intent intent1 = new Intent(MainActivity.this, Card2.class);
                                startActivity(intent1);
                                break;

                            case 2:
                                Intent intent2 = new Intent(MainActivity.this, Card3.class);
                                startActivity(intent2);
                                break;

                            case 3:
                                Intent intent3 = new Intent(MainActivity.this, Card4.class);
                                startActivity(intent3);
                                break;

                            case 4:
                                Intent intent4 = new Intent(MainActivity.this, Card5.class);
                                startActivity(intent4);
                                break;

                            case 5:
                                Intent intent5 = new Intent(MainActivity.this, Card6.class);
                                startActivity(intent5);
                                break;

                            case 6:
                                Intent intent6 = new Intent(MainActivity.this, Card7.class);
                                startActivity(intent6);
                                break;
//
                            case 7:
                                Intent intent7 = new Intent(MainActivity.this, Card8.class);
                                startActivity(intent7);
                                break;

                            case 8:
                                Intent intent8 = new Intent(MainActivity.this, Card9.class);
                                startActivity(intent8);
                                break;

                            case 9:
                                Intent intent9 = new Intent(MainActivity.this, Card10.class);
                                startActivity(intent9);
                                break;


                            case 10:
                                Intent intent10 = new Intent(MainActivity.this, Card11.class);
                                startActivity(intent10);
                                break;

                            case 11:
                                Intent intent11 = new Intent(MainActivity.this, Card12.class);
                                startActivity(intent11);
                                break;

                            case 12:
                                Intent intent12 = new Intent(MainActivity.this, Card13.class);
                                startActivity(intent12);
                                break;

                            case 13:
                                Intent intent13 = new Intent(MainActivity.this, Card14.class);
                                startActivity(intent13);
                                break;

                            case 14:
                                Intent intent14 = new Intent(MainActivity.this, Card15.class);
                                startActivity(intent14);
                                break;

                            case 15:
                                Intent intent15 = new Intent(MainActivity.this, Card16.class);
                                startActivity(intent15);
                                break;

                            case 16:
                                Intent intent16 = new Intent(MainActivity.this, Card17.class);
                                startActivity(intent16);
                                break;
//
                            case 17:
                                Intent intent17 = new Intent(MainActivity.this, Card18.class);
                                startActivity(intent17);
                                break;

                            case 18:
                                Intent intent18 = new Intent(MainActivity.this, Card19.class);
                                startActivity(intent18);
                                break;

                            case 19:
                                Intent intent19 = new Intent(MainActivity.this, Card20.class);
                                startActivity(intent19);
                                break;

                            case 20:
                                Intent intent20 = new Intent(MainActivity.this, Card21.class);
                                startActivity(intent20);
                                break;

                            case 21:
                                Intent intent21 = new Intent(MainActivity.this, Card22.class);
                                startActivity(intent21);
                                break;

                            case 22:
                                Intent intent22 = new Intent(MainActivity.this, Card23.class);
                                startActivity(intent22);
                                break;

                            case 23:
                                Intent intent23 = new Intent(MainActivity.this, Card24.class);
                                startActivity(intent23);
                                break;

                            case 24:
                                Intent intent24 = new Intent(MainActivity.this, Card25.class);
                                startActivity(intent24);
                                break;

                            case 25:
                                Intent intent25 = new Intent(MainActivity.this, Card26.class);
                                startActivity(intent25);
                                break;

                            case 26:
                                Intent intent26 = new Intent(MainActivity.this, Card27.class);
                                startActivity(intent26);
                                break;
//
                            case 27:
                                Intent intent27 = new Intent(MainActivity.this, Card28.class);
                                startActivity(intent27);
                                break;

                            case 28:
                                Intent intent28 = new Intent(MainActivity.this, Card29.class);
                                startActivity(intent28);
                                break;

                            case 29:
                                Intent intent29 = new Intent(MainActivity.this, Card30.class);
                                startActivity(intent29);
                                break;

                            case 30:
                                Intent intent30 = new Intent(MainActivity.this, Card31.class);
                                startActivity(intent30);
                                break;

                            case 31:
                                Intent intent31 = new Intent(MainActivity.this, Card33.class);
                                startActivity(intent31);
                                break;

                            case 32:
                                Intent intent32 = new Intent(MainActivity.this, Card33.class);
                                startActivity(intent32);
                                break;

                            case 33:
                                Intent intent33 = new Intent(MainActivity.this, Card34.class);
                                startActivity(intent33);
                                break;

                            case 34:
                                Intent intent34 = new Intent(MainActivity.this, Card35.class);
                                startActivity(intent34);
                                break;

                            case 35:
                                Intent intent35 = new Intent(MainActivity.this, Card36.class);
                                startActivity(intent35);
                                break;

                            case 36:
                                Intent intent36 = new Intent(MainActivity.this, Card37.class);
                                startActivity(intent36);
                                break;
//
                            case 37:
                                Intent intent37 = new Intent(MainActivity.this, Card38.class);
                                startActivity(intent37);
                                break;

                            case 38:
                                Intent intent38 = new Intent(MainActivity.this, Card39.class);
                                startActivity(intent38);
                                break;

                            case 39:
                                Intent intent39 = new Intent(MainActivity.this, Card40.class);
                                startActivity(intent39);
                                break;

                            case 40:
                                Intent intent40 = new Intent(MainActivity.this, Card41.class);
                                startActivity(intent40);
                                break;

                            case 41:
                                Intent intent41 = new Intent(MainActivity.this, Card42.class);
                                startActivity(intent41);
                                break;

                            case 42:
                                Intent intent42 = new Intent(MainActivity.this, Card43.class);
                                startActivity(intent42);
                                break;

                            case 43:
                                Intent intent43 = new Intent(MainActivity.this, Card44.class);
                                startActivity(intent43);
                                break;

                            case 44:
                                Intent intent44 = new Intent(MainActivity.this, Card45.class);
                                startActivity(intent44);
                                break;

                            case 45:
                                Intent intent45 = new Intent(MainActivity.this, Card46.class);
                                startActivity(intent45);
                                break;

                            case 46:
                                Intent intent46 = new Intent(MainActivity.this, Card47.class);
                                startActivity(intent46);
                                break;
//
                            case 47:
                                Intent intent47 = new Intent(MainActivity.this, Card48.class);
                                startActivity(intent47);
                                break;

                            case 48:
                                Intent intent48 = new Intent(MainActivity.this, Card49.class);
                                startActivity(intent48);
                                break;

                            case 49:
                                Intent intent49 = new Intent(MainActivity.this, Card50.class);
                                startActivity(intent49);
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
        closeDrawer(this.drawerLayout);
    }

    public void ClickRateThisApp(View view) {
        redirectActivity(this, RateThisApp.class);
    }


    public void ClickOtherApps(View view) {
        redirectActivity(this, OtherApps.class);
    }

    public void ClickShareLink(View view) {
        Intent shareintent = new Intent();
        shareintent.setAction(Intent.ACTION_SEND);
        shareintent.putExtra(Intent.EXTRA_TEXT,"*Quick English Speaking* जिसमे 2500+ से अधिक रोजाना बोले जाने वाले हिंदी से अंग्रेजी के वाक्य दिए गए है जिससे की आप बहुत ही तेजी से अंग्रेजी बोलना सीख सकते है। \n \nआप नीचे दिए गए लिंक से *Quick English Speaking* ऐप डाउनलोड कर सकते हो। \n_");
        shareintent.setType("text/plain");
        startActivity(Intent.createChooser(shareintent,"share via"));
    }

    public void ClickFeedback(View view) {
        redirectActivity(this, Feedback.class);
    }

    public void ClickDeveloper(View view) {
        redirectActivity(this, Developer.class);
    }

    public void ClickPrivacyPolicy(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bhawaniconsultancyservices.blogspot.com/2021/05/privacy-policy.html"));
        startActivity(browserIntent);
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

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Click again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
