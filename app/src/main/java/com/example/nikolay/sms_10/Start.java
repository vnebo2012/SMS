package com.example.nikolay.sms_10;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Start extends Activity {

    private EditText numi1;
    private EditText numi2;
    private EditText numi3;
    private EditText numi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        numi1 = (EditText) findViewById(R.id.num1);
        numi2 = (EditText) findViewById(R.id.num2);
        numi3 = (EditText) findViewById(R.id.num3);
        numi4 = (EditText) findViewById(R.id.num4);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, SMSActivity.class);

        intent.putExtra("t1", numi1.getText().toString());
        intent.putExtra("t2", numi2.getText().toString());
        intent.putExtra("t3", numi3.getText().toString());
        intent.putExtra("t4", numi4.getText().toString());
        startActivity(intent);
    }
}
