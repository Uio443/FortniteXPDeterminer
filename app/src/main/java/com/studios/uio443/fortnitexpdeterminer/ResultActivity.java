package com.studios.uio443.fortnitexpdeterminer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.pm.ActivityInfo;
import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    TextView bpPercentTextView;
    TextView percentTextView;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_result);

        initViews();

        Bundle extras = getIntent().getExtras();
        Double percent = extras.getDouble("percentage");
        Double bpPercent = extras.getDouble("bpPercentage");

        DecimalFormat df = new DecimalFormat("#.00");




        percentTextView.setText(df.format(percent));
        bpPercentTextView.setText(df.format(bpPercent));

    }

    void initViews(){
        percentTextView = findViewById(R.id.percentTextView);
        resultTextView = findViewById(R.id.resultTextView);
        bpPercentTextView = findViewById(R.id.bpPercentTextView);
    }

}
