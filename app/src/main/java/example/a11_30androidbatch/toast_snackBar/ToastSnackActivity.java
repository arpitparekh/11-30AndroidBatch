package example.a11_30androidbatch.toast_snackBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import example.a11_30androidbatch.R;

public class ToastSnackActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_snack);

        // View

        Button b1 = findViewById(R.id.btnToast);

        Button b2 = findViewById(R.id.btnSnackBar);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Toast

                // context ? // context is a my activity's global information

                Toast.makeText(ToastSnackActivity.this,"This is Toast",Toast.LENGTH_LONG).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // SnackBar

                Snackbar.make(view,"This is SnackBar",Snackbar.LENGTH_SHORT).show();

            }
        });


    }
}