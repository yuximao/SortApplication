package com.example.sortapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonBubbleSort = findViewById(R.id.SortButton);
        TextView tv = findViewById(R.id.SortText);
        buttonBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuickSort qs = new QuickSort();
                int[] A={4,6,8,9,3,4};
                tv.setText(qs.sort(A));
            }
        });
    }
}