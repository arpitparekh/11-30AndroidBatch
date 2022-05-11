package example.a11_30androidbatch.send_string_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import example.a11_30androidbatch.R;

public class AnotherHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_holder);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fcv_another_holder,new MumbaiFragment())
                .commit();

    }
}