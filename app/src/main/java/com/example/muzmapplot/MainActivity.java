package com.example.muzmapplot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    Button showmap;
    Fragment selectedFragment = null;

    public String[] lat = new String[10];
    public String[] lon = new String[10];

    public int len;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showmap = (Button) findViewById(R.id.shoMap);
        showmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                selectedFragment = new MuzMap();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,selectedFragment).commit();

            }
        });
    }




    }

