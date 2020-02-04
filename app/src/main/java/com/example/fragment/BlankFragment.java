package com.example.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class BlankFragment extends Fragment {
private EditText amount,accoutnumber;
private Button Send;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        amount = view.findViewById(R.id.edt_amount);
        accoutnumber = view.findViewById(R.id.edt_account);
        Send = view.findViewById(R.id.btn_SendTo);
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new MessageFragment();
                Bundle bundle = new Bundle();
                bundle.putString("account",accoutnumber.getText().toString().trim());
                bundle.putString("amount",amount.getText().toString().trim());
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.content_body,fragment).addToBackStack("Home").commit();
            }
        });
        return view;
    }

}
