package com.eddmash.androidcomponents;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.eddmash.dialogs.ImagePickerDialog;

public class ImagePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImagePickerDialog imagePickerDialog = new ImagePickerDialog();
        imagePickerDialog.show(getSupportFragmentManager(), "image_picker");
    }

}
