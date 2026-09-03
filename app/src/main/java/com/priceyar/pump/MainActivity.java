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
        TextView title = new TextView(this);
        title.setText("قیمت‌یار پمپ");
        title.setTextSize(24);
        title.setPadding(16, 20, 16, 20);
        box.addView(title);

        Button priceBtn = new Button(this);
        priceBtn.setText("قیمت مواد اولیه");
        box.addView(priceBtn);

        Button modelBtn = new Button(this);
        modelBtn.setText("مدل‌های پمپ");
        box.addView(modelBtn);

        Button summaryBtn = new Button(this);
        summaryBtn.setText("لیست نهایی قیمت");
        box.addView(summaryBtn);
        priceBtn.setOnClickListener(v -> showMessage("بخش قیمت مواد اولیه"));
        modelBtn.setOnClickListener(v -> showMessage("بخش مدل‌های پمپ"));
        summaryBtn.setOnClickListener(v -> showMessage("لیست نهایی قیمت"));
    }

    private void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
    private String money(double value) {
        return String.format(Locale.US, "%,.0f", value);
    }
