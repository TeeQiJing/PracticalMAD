package com.practical.appdatastorage;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstLoginFragment extends Fragment {
    private Button btnSubmit;
    private Context context;
    private EditText ETUsername;


    public FirstLoginFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_login, container, false);
        btnSubmit = view.findViewById(R.id.BtnSubmit);
        context = view.getContext();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETUsername = getView().findViewById(R.id.ETUsername);
                String filename = "user_file";
                String fileContents = ETUsername.getText().toString();
                try(FileOutputStream fos = context.openFileOutput(filename, Context.MODE_PRIVATE)){
                    fos.write(fileContents.getBytes());

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
        return view;
    }
}