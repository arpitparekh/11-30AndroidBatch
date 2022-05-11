package example.a11_30androidbatch.send_object_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import example.a11_30androidbatch.R;

public class YourHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_holder);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fcv_your_holder,new SuratFragment())
                .commit();

    }
}