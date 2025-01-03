package com.practical.appdatastorage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    private Button btnGallery, btnSettings;


    private static final String USER_FILE_NAME = "user_file";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        btnGallery = findViewById(R.id.BtnViewGallery);
        btnSettings = findViewById(R.id.BtnSettings);

        btnGallery.setOnClickListener(v -> btnGalleryOnClick());
        btnSettings.setOnClickListener(v -> btnSettingsOnClick());

        File UserFile = new File(context.getFilesDir(), USER_FILE_NAME);

        if(UserFile.exists()){
            FragmentContainerView FCVCreateUser = findViewById(R.id.FCVCreateUser);
            FCVCreateUser.setVisibility(View.GONE);

            String username = readUserName();

            TextView TVWelcome = findViewById(R.id.TVWelcome);
            TVWelcome.setText("Welcome Mr " + username);
        }


    }

    private void btnSettingsOnClick(){
        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
        startActivity(intent);
    }

    private void btnGalleryOnClick(){
        Intent intent = new Intent(getApplicationContext(), GalleryActivity.class);
        startActivity(intent);
    }

    protected String readUserName(){
        String FileContent = "";
        FileInputStream FIS = null;

        try{
            FIS = getApplicationContext().openFileInput(USER_FILE_NAME);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        InputStreamReader inputStreamReader = new InputStreamReader(FIS, StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(inputStreamReader)){
            String line = reader.readLine();
            while(line != null){
                stringBuilder.append(line).append('\n');
                line = reader.readLine();
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            FileContent = stringBuilder.toString();
        }

        return FileContent;

    }
}