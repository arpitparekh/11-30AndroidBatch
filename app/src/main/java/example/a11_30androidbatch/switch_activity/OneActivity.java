package example.a11_30androidbatch.switch_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import example.a11_30androidbatch.R;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Button b1 = findViewById(R.id.btnSwitch);
        Button b2 = findViewById(R.id.btnCamera);
        Button b3 = findViewById(R.id.btnDialer);
        Button b4 = findViewById(R.id.btnSettings);
        Button b5 = findViewById(R.id.btnGmail);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Intent   // Explicit intent
                Intent i = new Intent(OneActivity.this,TwoActivity.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Implicit intent

                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);   // Intent Actions Constants....
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_MAIN);  // show every activity
                i.addCategory(Intent.CATEGORY_APP_EMAIL);
                startActivity(i);

            }
        });


    }
}