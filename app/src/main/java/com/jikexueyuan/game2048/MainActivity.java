package com.jikexueyuan.game2048;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_debug = findViewById(R.id.btn_start);
        btn_debug.setOnClickListener(this);
        tvScore = (TextView) findViewById(R.id.tvScore);
        Bmob.initialize(this, "f72fba6a46d9b2e149c29d1ad6071c54");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_start:
                GridLayout gameView = findViewById(R.id.gameView);
                FrameLayout f = new FrameLayout(MainActivity.this);
                TextView t = new TextView(MainActivity.this);
                t.setText("");
                t.setTextSize(20);
                f.addView(t);
                gameView.addView(f);
                break;
        }
    }

    public void clearScore(){
        score = 0;
        showScore();
    }

    public void showScore(){
        tvScore.setText(score+"");
    }

    public void addScore(int s){
        score+=s;
        showScore();
    }

    private int score = 0;
    private TextView tvScore;

    private static MainActivity mainActivity = null;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public MainActivity() {
        mainActivity = this;
    }
}