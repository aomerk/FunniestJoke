package com.aok.funniestjoke;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// ...

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    private AdView mAdView;
    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.GREEN));
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        new AlertDialog.Builder(this,R.style.CustomDialogTheme)
                .setTitle("Welcome")
                .setMessage("    These 10 jokes are funniest jokes of all times according to scientists \n  \n They are chosen by Researchers of Oxford University and Undergraduates at the London School of Economics")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("MainActivity", "OK");
                    }
                })
                .show();
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<String> input = new ArrayList<>();
        input.add(getString(R.string.joke1));
        input.add(getString(R.string.joke2));
        input.add(getString(R.string.joke3));
        input.add(getString(R.string.joke4));
        input.add(getString(R.string.joke5));
        input.add(getString(R.string.joke6));
        input.add(getString(R.string.joke7));
        input.add(getString(R.string.joke8));
        input.add(getString(R.string.joke9));
        input.add(getString(R.string.joke10));
        input.add("");
        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
