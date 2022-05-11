package example.a11_30androidbatch.send_object_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import example.a11_30androidbatch.R;


public class SuratFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_surat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button b = view.findViewById(R.id.btnSendObjectFragment);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Emp emp = new Emp("Jagjid","Punjab",45,2500.0f);

                Bundle bundle = new Bundle();
                bundle.putSerializable("object",emp);

                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fcv_your_holder,RajkotFragment.class,bundle)
                        .addToBackStack("surat")
                        .commit();


            }
        });

    }
}