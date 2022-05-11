package example.a11_30androidbatch.send_string_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import example.a11_30androidbatch.R;

public class MumbaiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mumbai, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button b = view.findViewById(R.id.btnSendFragment);
        EditText editText = view.findViewById(R.id.edtSomething);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data = editText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("string",data);

                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fcv_another_holder,GoaFragment.class,bundle)
                        .addToBackStack("mumbai")
                        .commit();

            }
        });

    }
}