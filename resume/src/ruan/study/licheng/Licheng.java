package ruan.study.licheng;

import java.util.ArrayList;
import java.util.HashMap;

import ruan.study.XList.XListView;
import ruan.study.main.CommonActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.cheaphome.main.R;

public class Licheng extends CommonActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.licheng);
		linearLayoutHome = (LinearLayout) findViewById(R.id.menu_home);
		linearLayoutHome.setOnTouchListener(linearHome);
		linearLayoutNews = (LinearLayout) findViewById(R.id.menu_news);
		linearLayoutNews.setOnTouchListener(linearNews);
		linearLayoutNews.setBackgroundColor(Color.rgb(190, 37, 00));
		linearLayoutKnowledge = (LinearLayout) findViewById(R.id.menu_knowledge);
		linearLayoutKnowledge.setOnTouchListener(linearKnowledge);
		linearLayoutStore = (LinearLayout) findViewById(R.id.menu_store);
		linearLayoutStore.setOnTouchListener(linearStore);
		
		textViewTitle=(TextView) findViewById(R.id.title);
		textViewTitle.setText("历程");
		
		intent=new Intent();
		
		textViewLicheng1=(TextView) findViewById(R.id.licheng1);
		textViewLicheng1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Licheng1.class);
				startActivity(intent);
			}
		});
		
		textViewLicheng2=(TextView) findViewById(R.id.licheng2);
		textViewLicheng2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Licheng2.class);
				startActivity(intent);
				
			}
		});
		textViewLicheng3=(TextView) findViewById(R.id.licheng3);
		textViewLicheng3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Licheng3.class);
				startActivity(intent);
				
			}
		});
		textViewLicheng4=(TextView) findViewById(R.id.licheng4);
		textViewLicheng4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Licheng4.class);
				startActivity(intent);
				
			}
		});
	}
	
	@Override
	protected void onRestart() {
		linearLayoutNews.setBackgroundColor(R.color.menu_pressed);
		super.onRestart();
	}
	
	
	
	private XListView listView;
	private SimpleAdapter adapter;
	private ArrayList<String> arrayListLink;//把链接记录下来
	private Intent intent;
	private ProgressBar progressBar;
	private Handler handler;
	private TextView textViewTitle,textViewLicheng1,textViewLicheng2,textViewLicheng3,textViewLicheng4;
	
	private static final int NI_CLODE_PROGRESSBAR = 1;
	/** 这个用于显示的条目 **/
	private ArrayList<HashMap<String, String>> listitem=new ArrayList<HashMap<String,String>>();
	/** 这个用于保存实际的全部信息 **/
	private ArrayList<HashMap<String, String>> listitemStore=new ArrayList<HashMap<String,String>>();
	/** 新闻的页数 **/
	private int niPage;
	

	
	
}
