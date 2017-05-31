package com.example.terry.myapplication1;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "onCreate: ===================================================This is a test application");
        Log.d(TAG,"=================================================================================");
    }
}
