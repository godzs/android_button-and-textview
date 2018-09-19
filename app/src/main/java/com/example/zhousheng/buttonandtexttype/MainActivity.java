package com.example.zhousheng.buttonandtexttype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            int count=10;
                public void onClick (View v) {
                    TextView name = findViewById(R.id.text1);
                    TextView name1 = findViewById(R.id.text2);
                    count--;
                    if(count>=0)
                    name.setText(count + "");
                    else {
                        name.setText("end");
                        name1.setText("stop");
                    }
                }
        });
    }
}
