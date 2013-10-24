package ruan.study.lianxi;

import com.cheaphome.main.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class Contact extends Activity{

	private LinearLayout linearLayoutDianhua,linearLayoutYouxiang;
	private Intent intent,mailIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		intent=new Intent();
		
		linearLayoutDianhua=(LinearLayout) findViewById(R.id.dianhua);
		linearLayoutDianhua.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setAction(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"13205439585"));
				new AlertDialog.Builder(Contact.this)
				.setTitle("确认打电话给阮腾飞？")
				.setPositiveButton("确认", clickListenerDialog())
				.setNegativeButton("取消", null)
				.show();
				
			}
		});
		
		linearLayoutYouxiang=(LinearLayout)findViewById(R.id.youxiang);
		linearLayoutYouxiang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri.parse("mailto:"+"455414173@qq.com");    
		         mailIntent = new Intent(android.content.Intent.ACTION_SENDTO);    
		         mailIntent.setData(uri);
		         mailIntent.putExtra(Intent.EXTRA_SUBJECT, "标题");
		         mailIntent.putExtra(Intent.EXTRA_TEXT, "内容");
		         
		         new AlertDialog.Builder(Contact.this)
					.setTitle("确认发邮给阮腾飞？")
					.setPositiveButton("确认", clickListenerMail())
					.setNegativeButton("取消", null)
					.show();
		         
		         
			}
		});
	}
	
	
	
	private DialogInterface.OnClickListener clickListenerDialog()
	{
		return new DialogInterface.OnClickListener(){

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				startActivity(intent);
			}
			
		};
		
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
