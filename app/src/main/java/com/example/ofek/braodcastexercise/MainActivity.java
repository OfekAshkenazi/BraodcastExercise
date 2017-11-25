package com.example.ofek.braodcastexercise;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.sendBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent=new Intent();
                intent.setAction("com.example.ofek.braodcastexercise.MY_ACION");
                intent.putExtra("KeyName","code1id");
//                intent.setComponent(
//                        new ComponentName("com.example.ofek.braodcastexercise","com.example.ofek.braodcastexercise.MainActivity"));
                sendBroadcast(intent);
            }
        });
    }
    public static class MyBroadcastReceiver extends BroadcastReceiver{
        public MyBroadcastReceiver() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "works!!!!!!!!!!", Toast.LENGTH_SHORT).show();
        }
    }
}
