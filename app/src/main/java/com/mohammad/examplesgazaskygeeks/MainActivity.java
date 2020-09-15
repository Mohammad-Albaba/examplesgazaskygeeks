package com.mohammad.examplesgazaskygeeks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=findViewById(R.id.textView);
        SeekBar seekBar=findViewById(R.id.seekbar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            textView.setText("start");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText("stop");

            }
        });
        RatingBar ratingBar=findViewById(R.id.ratingbar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

            }
        });
      //  final CheckBox checkBox=findViewById(R.id.check);
//        checkBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                CheckBox cb=(CheckBox) view;
//                if (cb.isChecked()){
//                    System.out.println("Checked");
//                }else {
//                    System.out.println("Unchecked");
//                }
//            }
//        });
//        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                System.out.println("isChecked");
//            }
//        });
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                checkBox.setChecked(true);
//            }
//        });


        final CheckedTextView checkedTextView=findViewById(R.id.checktext);
        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkedTextView.isChecked()){
                    checkedTextView.setChecked(false);
                }else {
                    checkedTextView.setChecked(true);
                }
            }
        });


    }}