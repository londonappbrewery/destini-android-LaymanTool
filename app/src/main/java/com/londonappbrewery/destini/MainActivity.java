package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView mStoryText;
    private Button mButtonOption1;
    private Button mButtonOption2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonOption1 = findViewById(R.id.buttonTop);
        mButtonOption2 = findViewById(R.id.buttonBottom);
        mStoryText = findViewById(R.id.storyTextView);

        mStoryText.setText(R.string.T1_Story);
        mButtonOption1.setText(R.string.T1_Ans1);
        mButtonOption2.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mButtonOption1.getText().equals(getResources().getString(R.string.T1_Ans1)))
                        || (mButtonOption1.getText().equals(getResources().getString(R.string.T2_Ans1)))) {
                    mStoryText.setText(R.string.T3_Story);
                    mButtonOption1.setText(R.string.T3_Ans1);
                    mButtonOption2.setText(R.string.T3_Ans2);
                } else if (mButtonOption1.getText().equals(getResources().getString(R.string.T3_Ans1))) {
                    mStoryText.setText(R.string.T6_End);
                    mButtonOption1.setVisibility(View.INVISIBLE);
                    mButtonOption2.setVisibility(View.INVISIBLE);
                }


            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonOption2.getText().equals(getResources().getString(R.string.T1_Ans2))
                ) {
                    mStoryText.setText(R.string.T2_Story);
                    mButtonOption1.setText(R.string.T2_Ans1);
                    mButtonOption2.setText(R.string.T2_Ans2);
                } else {
                    if (mButtonOption2.getText().equals(getResources().getString(R.string.T3_Ans2))) {
                        mStoryText.setText(R.string.T5_End);
                    } else {
                        mStoryText.setText(R.string.T4_End);
                    }
                    mButtonOption1.setVisibility(View.INVISIBLE);
                    mButtonOption2.setVisibility(View.INVISIBLE);
                }

            }
        });


    }
}
