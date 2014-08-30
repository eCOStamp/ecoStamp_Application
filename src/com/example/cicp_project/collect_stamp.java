package com.example.cicp_project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class collect_stamp extends Fragment{
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View android = inflater.inflate(R.layout.collect_stamp, container, false);
		((TextView)android.findViewById(R.id.textView)).setText("Collect Your Stamp");
		return android;
	}
}
