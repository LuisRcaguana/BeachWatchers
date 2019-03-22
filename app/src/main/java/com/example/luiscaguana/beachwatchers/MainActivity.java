package com.example.luiscaguana.beachwatchers;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

public class MainActivity extends AppCompatActivity {

    private CircularImageView imagelogo;
    private TextView tv1;
    private TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagelogo = findViewById(R.id.imgLogoi);
        Animation animRocket = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imagelogo.startAnimation(animRocket);

        tv1 = findViewById(R.id.texto1);
        Animation animNombre = AnimationUtils.loadAnimation(this, R.anim.animacion_iz_derc);
        tv1.startAnimation(animNombre);

        tv2 = findViewById(R.id.texto2);
        Animation animtex2 = AnimationUtils.loadAnimation(this, R.anim.animacion_logo);
        tv2.startAnimation(animtex2);
        launchLoginActivity();
    }

    public void launchLoginActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, loginActivity.class));
            }
        }, 12000);
    }


}
