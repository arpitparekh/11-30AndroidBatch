package example.a11_30androidbatch.send_string_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import example.a11_30androidbatch.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("Second Activity");

        TextView tv = findViewById(R.id.textView);

        Intent i = getIntent();

        String myString = i.getStringExtra("string");

        tv.setText(myString);

    }
}