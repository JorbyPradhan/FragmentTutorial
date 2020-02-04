package com.example.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class HomeFragment extends Fragment {
    private Button VTran,SMoneny,VBlan;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentn
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        VTran= v.findViewById(R.id.btn_dollar);
        SMoneny= v.findViewById(R.id.btn_Send);
        VBlan = v.findViewById(R.id.btn_balance);
        VTran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You Clicked Tran",Toast.LENGTH_SHORT).show();
            }
        });
        SMoneny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new BlankFragment();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_body,fragment).addToBackStack("Home").commit();
            }
        });
        VBlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You Clicked Tran",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
