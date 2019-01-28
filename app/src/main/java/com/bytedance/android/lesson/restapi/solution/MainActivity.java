package com.bytedance.android.lesson.restapi.solution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_s3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, RecordVideoActivity.class));

            }

        });

        findViewById(R.id.btn_s4).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PlayVideoActivity.class));
            }
        });
    }


    public void Solution2C1(View view) {
        startActivity(new Intent(this, Solution2C1Activity.class));
    }

    public void Solution2C2(View view) {
        startActivity(new Intent(this, Solution2C2Activity.class));

    }




    //TODO 增加view
    public void Solution2C3(View view){
      //  startActivity(new Intent(this, xxxxxxActivity.class));
    }

    public void Solution2C4(View view){
        //  startActivity(new Intent(this, xxxxxxActivity.class));
    }


}
