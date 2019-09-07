package com.example.sept9_4itb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Sept7-4ITB", "onCreate() has executed");
    }

    protected void onStart(){
        super.onStart();
        Log.d("Sept7-4ITB","onStart() has executed");
    }

    protected void onResume(){
        super.onResume();
        Log.d("Sept7-4ITB","onResume() has executed");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Sept7-4ITB","onPause() has executed");

    }

    protected void onStop(){
        super.onStop();
        Log.d("Sept7-4ITB","onStop() has executed");

    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Sept7-4ITB","onRestart() has executed");

    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("Sept7-4ITB","onDestroy() has executed");

    }

    public void displayMsg(View v){
        //Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show;
        //toast.show();
        Snackbar sbar = Snackbar.make(v,"Button was clicked",Snackbar.LENGTH_LONG);
        sbar.show();
    }
}
