package com.example.builditbigger.free;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main_paid, container, false);

        return root;
    }
}
