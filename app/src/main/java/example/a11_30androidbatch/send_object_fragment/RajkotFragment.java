package example.a11_30androidbatch.send_object_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import example.a11_30androidbatch.R;

public class RajkotFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rajkot, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.tvobjectFragment);

        Bundle bundle = getArguments();

        Emp emp = (Emp) bundle.getSerializable("object");

        textView.setText(emp.name+"\n"+emp.address+"\n"+emp.age+"\n"+emp.salary);

    }
}