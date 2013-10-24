package ruan.study.set;

import javax.security.auth.PrivateCredentialPermission;

import ruan.study.lianxi.Contact;
import ruan.study.main.CommonActivity;
import android.R.integer;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cheaphome.main.R;

public class Set extends CommonActivity{
	private TextView textViewTitle,textViewYijian,textViewGuanyu;
	private ImageView imageViewSwitch;
	private boolean boolFlag;
	private Intent mailIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.set);
		
		linearLayoutHome = (LinearLayout) findViewById(R.id.menu_home);
		linearLayoutHome.setOnTouchListener(linearHome);
		linearLayoutNews = (LinearLayout) findViewById(R.id.menu_news);
		linearLayoutNews.setOnTouchListener(linearNews);
		linearLayoutKnowledge = (LinearLayout) findViewById(R.id.menu_knowledge);
		linearLayoutKnowledge.setOnTouchListener(linearKnowledge);
		linearLayoutStore = (LinearLayout) findViewById(R.id.menu_store);
		linearLayoutStore.setOnTouchListener(linearStore);
		linearLayoutStore.setBackgroundColor(Color.rgb(190, 37, 00));;
		
		textViewTitle=(TextView) findViewById(R.id.title);
		textViewTitle.setText("设置");
		
		boolFlag=true;
		imageViewSwitch=(ImageView) findViewById(R.id.image_switch);
		imageViewSwitch.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(boolFlag)
				{
					imageViewSwitch.setImageResource(R.drawable.switch_yes);
					boolFlag=!boolFlag;
				}
				else {
					imageViewSwitch.setImageResource(R.drawable.switch_no);
					boolFlag=!boolFlag;
				}
			}
		});
		
		textViewYijian=(TextView) findViewById(R.id.yijian);
		textViewYijian.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri.parse("mailto:"+"455414173@qq.com");    
		         mailIntent = new Intent(android.content.Intent.ACTION_SENDTO);    
		         mailIntent.setData(uri);
		         mailIntent.putExtra(Intent.EXTRA_SUBJECT, "给阮腾飞的个人简历（安卓版）的意见");
		         mailIntent.putExtra(Intent.EXTRA_TEXT, "请在此处留下您的宝贵意见");
		         
		         new AlertDialog.Builder(Set.this)
					.setTitle("确认发邮给阮腾飞？")
					.setPositiveButton("确认", clickListenerMail())
					.setNegativeButton("取消", null)
					.show();
			}
		});
		
		
		textViewGuanyu=(TextView) findViewById(R.id.guanyu);
		textViewGuanyu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), About.class);
				startActivity(intent);
			}
		});
		
		
		
		
		
		
	}

	@Override
	protected void onRestart() {
		linearLayoutStore.setBackgroundColor(R.color.menu_pressed);
		super.onRestart();
	}
	
	private DialogInterface.OnClickListener clickListenerMail()
	{
		return new DialogInterface.OnClickListener(){
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				startActivity(mailIntent);   
			}
			
		};
		
	}
}
