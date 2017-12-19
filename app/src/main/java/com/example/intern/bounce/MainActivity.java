package com.example.intern.bounce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton tap;
    ImageView charImage;
    TextView score;

    float downSpeed, downY, currentY, upY;

    public void init(){

        //currentY = charImage.getY();
        //downY = 10;
        //TranslateAnimation down = new TranslateAnimation(currentY,downY,0,0);

        //down.setDuration(1000);
        //down.setFillAfter(true);
        //charImage.setAnimation(down);
        //charImage.;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        tap = findViewById(R.id.tapBut);
        charImage = findViewById(R.id.charImage);
        score = findViewById(R.id.scoreText);

        //init();

        tap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        upY -=50;
        TranslateAnimation up = new TranslateAnimation(0,0,upY,currentY);
        up.setDuration(100);
        up.setFillAfter(true);
        charImage.setAnimation(up);
        score.setText(upY+", "+currentY);
        currentY = upY;

    }
}
