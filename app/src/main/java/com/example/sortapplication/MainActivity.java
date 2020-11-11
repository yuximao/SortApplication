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
        Button buttonQuickSort = findViewById(R.id.SortButton);
        Button buttonBubbleSort = findViewById(R.id.bubbleSort);
        Button buttonInsertionSort = findViewById(R.id.InsertionSort);
        Button buttonBinarySearch = findViewById(R.id.binarySearch);
        TextView tv = findViewById(R.id.SortText);
        buttonQuickSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuickSort qs = new QuickSort();
                int[] A={4,6,8,9,3,4};
                tv.setText(qs.sort(A));
            }
        });

        buttonBubbleSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BubbleSort bs = new BubbleSort();
                int[] A={4,7,2,9,0,1};
                tv.setText(bs.bubbleSort(A));
            }
        });

        buttonInsertionSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertionSort is = new InsertionSort();
                int[] A={4,3,13,23,10,4};
                tv.setText(is.insertSort(A));
            }
        });

        buttonBinarySearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BinarySearch bs = new BinarySearch();
                int[] A={4,5,6,7,8};
                tv.setText("The index is: "+bs.search(A, 5));
            }
        });
    }
}