package com.example.login_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextWatcher;
import android.text.*;
import android.view.View.OnClickListener;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.voice_login);

        final Button voice_login_button = (Button) findViewById(R.id.voice_login_button);
        //voice_login_button.setVisibility(View.GONE);

        voice_login_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(
                        MainActivity.this,
                        PasscodeActivity.class);
                startActivity(mIntent);
            }
        });
        //Intent shake = new Intent(MainActivity.this, ShakeListenerTestActivity.class);
        //startActivity(shake);
    }
}
