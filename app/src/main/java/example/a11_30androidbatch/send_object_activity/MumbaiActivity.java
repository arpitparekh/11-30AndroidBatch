package example.a11_30androidbatch.send_object_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import example.a11_30androidbatch.R;

public class MumbaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        Button b = findViewById(R.id.btnSendObject);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Student s = new Student("Sanket","ahmedabad",12);

                Intent i = new Intent(MumbaiActivity.this,GoaActivity.class);
                i.putExtra("object",s);
                startActivity(i);

            }
        });

    }
}