package com.zhouchatian.bluetoothchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnStartServer;
    private Button btnStartClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStartServer = (Button) findViewById(R.id.start_server_btn);
        btnStartClient = (Button) findViewById(R.id.start_client_btn);
        btnStartServer.setOnClickListener(this);
        btnStartClient.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start_server_btn:
                Intent serverIntent = new Intent(MainActivity.this,ServerActivity.class);
                serverIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(serverIntent);
                break;
            case R.id.start_client_btn:
                Intent clientIntent = new Intent(MainActivity.this,ClientActivity.class);
                clientIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(clientIntent);
                break;

        }
    }
}
