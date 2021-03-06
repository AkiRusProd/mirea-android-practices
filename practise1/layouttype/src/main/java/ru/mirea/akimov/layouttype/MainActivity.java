package ru.mirea.akimov.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private TextView saveText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveText = (TextView)findViewById(R.id.saveNotice);
        saveButton = (Button) findViewById(R.id.button);

        View.OnClickListener oclBtnSave = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                saveText.setText("All done! Saved.");
            }
        };

        saveButton.setOnClickListener(oclBtnSave);
    }
}