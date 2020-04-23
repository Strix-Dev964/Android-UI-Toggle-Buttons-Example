package strix.app.strix_togglebuttonexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

/*
Created by Strix - http://strixdev.co.uk
*/

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleOn, toggleOff;
    private Button btnCheckToggle;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        addListenerOnButton();

    }

    public void addListenerOnButton() {

        toggleOn = findViewById(R.id.toggle1);
        toggleOff = findViewById(R.id.toggle2);
        btnCheckToggle = findViewById(R.id.btnCheckState);

        btnCheckToggle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("toggleButton1 : ").append(toggleOn.getText());
                result.append("\ntoggleButton2 : ").append(toggleOff.getText());

                Toast.makeText(context, result.toString(),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }
}