package com.cb.activity;

import com.cb.R;
import com.cb.widget.VerticalSeekBar;
import com.cb.widget.VerticalSeekBar_Reverse;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

/**
 * Vertical SeekBar test
 * @author Justin Chen
 * @version 2014.3.19
 */

public class MainActivity extends Activity {

	VerticalSeekBar verticalSeekBar = null;
	VerticalSeekBar_Reverse verticalSeekBar_Reverse = null;
	TextView vsProgress, vs_reverseProgress = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		verticalSeekBar = (VerticalSeekBar) findViewById(R.id.vertical_Seekbar);
		verticalSeekBar_Reverse = (VerticalSeekBar_Reverse) findViewById(R.id.seekbar_reverse);
		vsProgress = (TextView) findViewById(R.id.percent);
		vs_reverseProgress = (TextView) findViewById(R.id.percent_reverse);

		verticalSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				vsProgress.setText(progress + "");
			}
		});

		verticalSeekBar_Reverse.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				vs_reverseProgress.setText(progress + "");

			}
		});

	}
}