package com.priceyar.pump;
import android.app.Activity;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.*;
import android.view.View;

import androidx.room.Room;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {
    private AppDb db;
    private LinearLayout box;

    @Override
    protected void onCreate(Bundle b) {
        db = Room.databaseBuilder(
                getApplicationContext(),
                AppDb.class,
                "priceyar_pump.db"
        ).build();

        box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setPadding(12, 12, 12, 12);

        ScrollView sv = new ScrollView(this);
        sv.addView(box);
        setContentView(sv);
