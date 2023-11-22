package com.example.alertmsg;

import com.example.alertmsg.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showAlertButton = findViewById(R.id.showAlertButton);

        showAlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert");
                builder.setMessage("This is an alert message.");

                // Set up the positive button (OK button)
                builder.setPositiveButton("OK", null);

                // Show the dialog
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
