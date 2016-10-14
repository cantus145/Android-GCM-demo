/**
 * ==============================
 * App name:Android-GCM-demo
 * Android package name:com.example.android_gcm_demo
 * <p>
 * <p>
 * Server API Key : AIzaSyCSkW2Slq2LfAEjsn54smt4wgmHX5wFlQU
 * Sender ID:427183792487
 * <p>
* <p>
* ==============================
* 【Android】接收GCM推播通知訊息
* http://dean-android.blogspot.tw/2015/01/androidgcm.html
*/
package com.example.android_gcm_demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


public class GCMActivity extends Activity {
    String TAG = "TAG";
    Context context;

    //UI
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcm);
        context = this;
        findView();
    }

    private void findView() {
        txv = (TextView) findViewById(R.id.txv);
    }

}
