package ruan.study.geren;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.cheaphome.main.R;

public class Geren extends Activity{

	
	private TextView textViewJbxx,textViewJybj,textViewSj,textViewSi;
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
//		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//È¥³ýÈÎÎñÀ¸
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.geren);
		intent=new Intent();
		textViewJbxx=(TextView) findViewById(R.id.jbxx);
		textViewJbxx.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), JBXX.class);
				startActivity(intent);
			}
		}) ;
		textViewJybj=(TextView) findViewById(R.id.jybj);
		textViewJybj.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), JYBJ.class);
				startActivity(intent);
			}
		}) ;
		textViewSj=(TextView) findViewById(R.id.sjysx);
		textViewSj.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), SJ.class);
				startActivity(intent);
			}
		}) ;
		textViewSi=(TextView) findViewById(R.id.yysp);
		textViewSi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Siji.class);
				startActivity(intent);
			}
		}) ;
	}
	
	

	
}
