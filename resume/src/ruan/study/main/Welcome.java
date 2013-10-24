package ruan.study.main;

import com.cheaphome.main.R;

import ruan.study.Home.HomeActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Welcome extends Activity implements Runnable{
	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		imageView=(ImageView) findViewById(R.id.image_welcome);
		new Thread(this).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

	@Override
	public void run() {
			try {
				//time
				Thread.sleep(1000);
//				Log.e("sysout", imageView.getAlpha()+"");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			imageView.setAlpha(imageView.getAlpha()-10);
//			if(imageView.getAlpha()<50)
//			{
				Intent intent=new Intent();
				intent.setClass(Welcome.this,HomeActivity.class);
				startActivity(intent);
				Welcome.this.finish();
//			}
	}	

}
