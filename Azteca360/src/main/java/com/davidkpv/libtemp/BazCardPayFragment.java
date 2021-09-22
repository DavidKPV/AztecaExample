package com.davidkpv.libtemp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.davidkpv.libtemp.databinding.FragmentCardFormBinding;

public class BazCardPayFragment extends Fragment {

    private FragmentCardFormBinding binding;

    public BazCardPayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment with data binding
        binding = FragmentCardFormBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        binding.etCardNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.tilCardNumber.setError(null);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        return view;
    }

}