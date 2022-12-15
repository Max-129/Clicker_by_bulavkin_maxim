package com.example.clicker_by_bulavkin_maxim;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Dynamic extends Fragment {
    Button btn1, btn2;
    TextView et_0;
    int count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dynamic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    et_0 = view.findViewById(R.id.et_0);
        btn1 = view.findViewById(R.id.btn_p);
        btn2 = view.findViewById(R.id.btn_2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                String x = Integer.toString(count);

                et_0.setText(x);
                if (count ==20) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new  SecondFragment()).commit();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                String x = Integer.toString(count);
                et_0.setText(x);
                if (count == -20) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new  SecondFragment()).commit();
                }
            }
        });

    }

}