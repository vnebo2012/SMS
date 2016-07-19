package com.example.nikolay.sms_10;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SMSActivity extends Activity {

    //private TextView txt_tel1;
   // private TextView txt_tel2;
   // private TextView txt_tel3;
   // private TextView txt_tel4;


    private TextView numi1;
    private TextView numi2;
    private TextView numi3;
    private TextView numi4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        numi1 = (TextView) findViewById(R.id.tvTel1);
        numi2 = (TextView) findViewById(R.id.tvTel2);
        numi3 = (TextView) findViewById(R.id.tvTel3);
        numi4 = (TextView) findViewById(R.id.tvTel4);



        numi1.setText(getIntent().getStringExtra("t1"));
        numi2.setText(getIntent().getStringExtra("t2"));
        numi3.setText(getIntent().getStringExtra("t3"));
        numi4.setText(getIntent().getStringExtra("t4"));

        //final EditText edittextSmsNumber2 = (EditText) findViewById(R.id.number);

        final EditText edittextSmsText = (EditText) findViewById(R.id.number);

        final TextView edittextTelefony1 = (TextView) findViewById(R.id.tvTel1);
        final TextView edittextTelefony2 = (TextView) findViewById(R.id.tvTel2);
        final TextView edittextTelefony3 = (TextView) findViewById(R.id.tvTel3);
        final TextView edittextTelefony4 = (TextView) findViewById(R.id.tvTel4);


        Button buttonSendSms = (Button) findViewById(R.id.liyka);
        buttonSendSms.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony1.getText().toString();
                String smsText = new String("Лійка душа в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms2 = (Button) findViewById(R.id.umivalnik);
        buttonSendSms2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony1.getText().toString();
                String smsText = new String("Забитий умивальник в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms3 = (Button) findViewById(R.id.unitaz);
        buttonSendSms3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony1.getText().toString();
                String smsText = new String("Забитий унітаз в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms4 = (Button) findViewById(R.id.bashok);
        buttonSendSms4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony1.getText().toString();
                String smsText = new String("Зробити бачок в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms5 = (Button) findViewById(R.id.lam_kimn);
        buttonSendSms5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony2.getText().toString();
                String smsText = new String("Лампочка в кімнаті, в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms6 = (Button) findViewById(R.id.lam_tua);
        buttonSendSms6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony2.getText().toString();
                String smsText = new String("Лампочка в туалеті, в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms7 = (Button) findViewById(R.id.rozetka);
        buttonSendSms7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony2.getText().toString();
                String smsText = new String("Розетка в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms8 = (Button) findViewById(R.id.myxi);
        buttonSendSms8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony2.getText().toString();
                String smsText = new String("Мухі в плафоні, в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms9 = (Button) findViewById(R.id.ligko);
        buttonSendSms9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony3.getText().toString();
                String smsText = new String("Поремонтувати ліжко в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms10 = (Button) findViewById(R.id.cep);
        buttonSendSms10.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony3.getText().toString();
                String smsText = new String("Ланцюжок дверей в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms11 = (Button) findViewById(R.id.paperotrimash);
        buttonSendSms11.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony3.getText().toString();
                String smsText = new String("Ланцюжок дверей в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms12 = (Button) findViewById(R.id.rushnikotrimash);
        buttonSendSms12.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony3.getText().toString();
                String smsText = new String("Ланцюжок дверей в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms13 = (Button) findViewById(R.id.pult);
        buttonSendSms13.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony4.getText().toString();
                String smsText = new String("Потрібен пульт для телевізора в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms14 = (Button) findViewById(R.id.tele);
        buttonSendSms14.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony4.getText().toString();
                String smsText = new String("Не працює телевізор в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
        Button buttonSendSms15 = (Button) findViewById(R.id.voda);
        buttonSendSms15.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                String smsNumber = edittextTelefony4.getText().toString();
                String smsText = new String("Тече вода в" + " " + "№") + edittextSmsText.getText().toString();
                // отправляем сообщение
                smsManager
                        .sendTextMessage(smsNumber, null, smsText, null, null);
            }
        });
    }



}
