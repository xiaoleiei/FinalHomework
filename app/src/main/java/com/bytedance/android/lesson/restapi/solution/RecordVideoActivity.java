package com.bytedance.android.lesson.restapi.solution;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class RecordVideoActivity extends AppCompatActivity {

    private VideoView videoView;
    private static final int REQUEST_VIDEO_CAPTURE = 1;

    private static final int REQUEST_EXTERNAL_CAMERA = 101;
    public Button mBtn;
    private Solution2C2Activity solution2C2Activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_video);

        videoView = findViewById(R.id.img);


        findViewById(R.id.btn_picture).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (ContextCompat.checkSelfPermission(RecordVideoActivity.this,
                            Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                        //todo 在这里申请相机、存储的权限
                        ActivityCompat.requestPermissions(RecordVideoActivity.this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);

                    }
                    else if (ContextCompat.checkSelfPermission(RecordVideoActivity.this, Manifest.permission.RECORD_AUDIO)
                            != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(RecordVideoActivity.this, new String[] {Manifest.permission.RECORD_AUDIO}, REQUEST_VIDEO_CAPTURE);
                    }
                    else {
                        //todo 打开相机拍摄
                        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                        if(takeVideoIntent.resolveActivity(getPackageManager() )!= null){
                            startActivityForResult(takeVideoIntent,REQUEST_VIDEO_CAPTURE);

                        }

                    }
                }
            });


        findViewById(R.id.btn_shangchuan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecordVideoActivity.this, Solution2C2Activity.class));
            }
        });

        }






    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
            //todo 播放刚才录制的视频  ///目前还没有播放
            Uri videoUri = intent.getData();
            videoView.setVideoURI(videoUri);
            videoView.start();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_EXTERNAL_CAMERA: {
                //todo 判断权限是否已经授予
                break;
            }
        }
    }
}

