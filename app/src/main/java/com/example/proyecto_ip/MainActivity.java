package com.example.proyecto_ip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.WindowManager;
import android.view.animation.Animation;
import com.example.proyecto_ip.R;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animacion1= AnimationUtils.loadAnimation(this, R.anim.dezplazamiento_arriba);
        Animation animacion2= AnimationUtils.loadAnimation(this, R.anim.deplazamiento_abajo);

        TextView ipTextView = findViewById(R.id.textip);
        ImageView logoImageView = findViewById(R.id.logoip);

        ipTextView.setAnimation(animacion2);
        logoImageView.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Principal.class);
                startActivity(intent);
                finish();
            }
        },  4000);


    }
}