package com.example.www.androideverest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto_somewhere(View view) {

        switch (view.getTag().toString()) {
            case "calculator":
                startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
                break;

            case "list_view":
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
                break;

            case "file_manager":
                startActivity(new Intent(MainActivity.this, FileManagerActivity.class));
                break;

            case "service_test":
                startActivity(new Intent(MainActivity.this, ServiceTestActivity.class));
                break;

            case "sharedpref_test":
                startActivity(new Intent(MainActivity.this, SharedPreferencesActivity.class));
                break;

            case "fore_service_test":
                startActivity(new Intent(MainActivity.this, ForegroundServiceTestActivity.class));
                break;
        }
    }
}
