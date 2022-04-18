package example.a11_30androidbatch.send_object_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import example.a11_30androidbatch.R;

public class GoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        TextView tv = findViewById(R.id.tvObject);

        Intent i = getIntent();

        Student studentObject = (Student) i.getSerializableExtra("object");

        tv.setText(studentObject.name+"\n"+studentObject.address+"\n"+studentObject.roll_no);

    }
}