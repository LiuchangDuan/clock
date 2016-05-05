package com.example.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class StopWatchView extends LinearLayout {

	public StopWatchView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		
		tvHour = (TextView) findViewById(R.id.timeHour);
		tvHour.setText("0");
		tvMin = (TextView) findViewById(R.id.timeMin);
		tvMin.setText("0");
		tvSec = (TextView) findViewById(R.id.timeSec);
		tvSec.setText("0");
		tvMSec = (TextView) findViewById(R.id.timeMSec);
		tvMSec.setText("0");
		
		btnLap = (Button) findViewById(R.id.btnSWLap);
		btnPause = (Button) findViewById(R.id.btnSWPause);
		btnReset = (Button) findViewById(R.id.btnSWReset);
		btnResume = (Button) findViewById(R.id.btnSWResume);
		btnStart = (Button) findViewById(R.id.btnSWStart);
		
		btnLap.setVisibility(View.GONE);
		btnPause.setVisibility(View.GONE);
		btnReset.setVisibility(View.GONE);
		btnResume.setVisibility(View.GONE);
		
		lvTimeList = (ListView) findViewById(R.id.lvWatchTime);
		adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1);
		lvTimeList.setAdapter(adapter);
		
	}
	
	private TextView tvHour, tvMin, tvSec, tvMSec;
	private Button btnStart, btnResume, btnReset, btnPause, btnLap;
	private ListView lvTimeList;
	private ArrayAdapter<String> adapter;

}
