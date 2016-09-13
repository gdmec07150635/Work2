package cn.edu.gdmec.a07150635.work2;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("work2","Apk onCreate,朕知道了");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work2","Apk onStart 了，朕知道了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("work2","apk onResume,朕知道了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","apk onPause,朕知道了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","apk onStop,朕知道了");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","apk onRestart,朕知道了");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work2","apk onDestroy,朕知道了");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
