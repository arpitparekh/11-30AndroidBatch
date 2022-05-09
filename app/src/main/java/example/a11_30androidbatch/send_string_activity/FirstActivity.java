package example.a11_30androidbatch.send_string_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import example.a11_30androidbatch.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setTitle("First Activity");

        EditText edt = findViewById(R.id.edtString);

        Button btn = findViewById(R.id.btnSend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = edt.getText().toString();

                Intent i = new Intent(FirstActivity.this,SecondActivity.class);
                i.putExtra("string",str);
                startActivity(i);

//                finish(); // destroy the activity // can not come back

            }
        });

    }
}