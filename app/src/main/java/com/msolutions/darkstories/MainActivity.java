package com.msolutions.darkstories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.msolutions.obm.Story;

public class MainActivity extends AppCompatActivity {

    private TextView txtQuestion;
    private TextView txtAnswer;
    private int index = 0;

    private Button btnNext;
    private Button btnBack;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Story.getInstance().neverDoThisButIAmTooLazy();
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.TYPE_STATUS_BAR);

        txtAnswer = findViewById(R.id.txtAnswer);
        txtQuestion = findViewById(R.id.txtQuestion);
        btnNext = findViewById(R.id.btnNext);
        btnBack = findViewById(R.id.btnBack);

        txtQuestion.setText(Story.getInstance().getStories().get(index).getQuestion());
        txtAnswer.setText(Story.getInstance().getStories().get(index).getAnswer());


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > 0) {
                    index--;
                    txtQuestion.setText(Story.getInstance().getStories().get(index).getQuestion());
                    txtAnswer.setText(Story.getInstance().getStories().get(index).getAnswer());
                } else {
                    if(toast != null){
                        toast.cancel();
                    }
                    toast = Toast.makeText(getApplicationContext(), "You reached the start, where you wanna go back??", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Story.getInstance().getStories().size() - 1) {
                    index++;
                    txtQuestion.setText(Story.getInstance().getStories().get(index).getQuestion());
                    txtAnswer.setText(Story.getInstance().getStories().get(index).getAnswer());
                } else {
                    if(toast != null){
                        toast.cancel();
                    }
                    toast = Toast.makeText(getApplicationContext(), "Sadly that was all, but more will come soon :D!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }
}
