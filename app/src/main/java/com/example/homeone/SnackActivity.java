package com.example.homeone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

@SuppressLint("Registered")
public class SnackActivity extends AppCompatActivity {

    private static final String TAG = "SnackActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
    }

    public void onClickButton(View view) {
        //Toast.makeText(this, "mes", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(view, "message", Snackbar.LENGTH_LONG);

        snackbar.setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
            }
        });


        snackbar.show();
    }
}
