package com.example.cicp_project;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;



public class collect_stamp extends Fragment{
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View android = inflater.inflate(R.layout.collect_stamp, container, false);
		ImageView img;
		img= (ImageView) android.findViewById(R.id.img);
		img.setImageResource(R.drawable.collect);
		
		Button CollectButton,ReturnButton;
		CollectButton=(Button)android.findViewById(R.id.CollectButton);
		ReturnButton=(Button)android.findViewById(R.id.CancelButton);
		CollectButton.setVisibility(View.GONE);
		ReturnButton.setVisibility(View.GONE);
		TableLayout table;
		table=(TableLayout)android.findViewById(R.id.table);
		table.setVisibility(View.GONE);
		
		return android;
	}
}
