package com.example.myapplicati;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplicati.Response.AllAnimes;
import com.example.myapplicati.Response.AnimeResponse;

import java.util.List;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main extends Activity {
    private LinearLayout lin, lin1,lin2;
    private ImageButton search,fav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        lin = findViewById(R.id.linear);
        lin1 = findViewById(R.id.linear1);
        lin2 = findViewById(R.id.linear2);
        search = findViewById(R.id.search);
        fav = findViewById(R.id.love);
        LayoutInflater inflater = getLayoutInflater();
        for(int i = 0; i < 8; i++) {
            View view = inflater.inflate(R.layout.default_lin,null);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Main.this, Classs.class);
                    startActivity(intent);
                }
            });
            lin.addView(view);
        }
        for(int i = 0; i < 8; i++) {
            View view = inflater.inflate(R.layout.default_lin,null);

            ImageView im = view.findViewById(R.id.img);
            im.setImageResource(R.drawable.anime1);
            TextView t = view.findViewById(R.id.txt);
            t.setText("Evangelion");
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Main.this, Classs.class);
                    startActivity(intent);
                }
            });
            lin1.addView(view);
        }
        for(int i = 0; i < 8; i++) {
            View view = inflater.inflate(R.layout.default_lin,null);
            ImageView im = view.findViewById(R.id.img);
            TextView t = view.findViewById(R.id.txt);
            t.setText("Classrom of elite");
            im.setImageResource(R.drawable.anime2);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Main.this, Classs.class);
                    startActivity(intent);
                }
            });
            lin2.addView(view);
        }
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Search.class);
                startActivity(intent);
            }
        });fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Love.class);
                startActivity(intent);
            }
        });
//        getApi();

    }

    public void getApi() {
        /*Log.d("1", "ok");
        Call<List> call = ApiClient.getUserService().getAllAnime();
        Log.d("2", call.toString());
        call.enqueue(new Callback<List>() {

            @Override
            public void onResponse(Call call, Response response) {
                Log.d("2", "ok");
            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }

        });*/
    }
}
