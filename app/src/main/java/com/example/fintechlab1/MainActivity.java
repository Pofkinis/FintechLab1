package com.example.fintechlab1;

import static com.example.fintechlab1.Services.CalculationService.getCharactersCount;
import static com.example.fintechlab1.Services.CalculationService.getWordsCount;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner typeSelection;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.typeSelection = findViewById(R.id.typeSpinner);
        ArrayList<String> typeSelectOptions = new ArrayList<>();

        typeSelectOptions.add("Words");
        typeSelectOptions.add("Characters");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, typeSelectOptions);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.typeSelection.setAdapter(arrayAdapter);
    }

    @SuppressLint("SetTextI18n")
    public void btnCalculateWordsOnClick(View view) {
        EditText edUserInput = findViewById(R.id.textInput);
        TextView resultOutput = findViewById(R.id.result);
        String userInputText = edUserInput.getText().toString();
        String selection = this.typeSelection.getSelectedItem().toString();

        if (TextUtils.isEmpty(userInputText)) {
            android.widget.Toast.makeText(this, "Please enter some text", android.widget.Toast.LENGTH_SHORT).show();
            return;
        }

        if(selection.equalsIgnoreCase("Characters")){
            int count = getCharactersCount(userInputText);
            resultOutput.setText(count + " characters");
        }

        if(selection.equalsIgnoreCase("Words")){
            int count = getWordsCount(userInputText);
            resultOutput.setText(count + " words");
        }
    }
}