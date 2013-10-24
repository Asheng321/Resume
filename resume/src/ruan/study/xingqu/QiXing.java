package ruan.study.xingqu;

import com.cheaphome.main.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class QiXing extends Activity{
	private Intent intent;
	private ImageView imageViewQixing,imageViewDiaoyu,imageViewBaitan,imageViewDinglan;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xingqu);
		intent=new Intent();
		
		imageViewDinglan=(ImageView) findViewById(R.id.img_dinglan);
		imageViewDinglan.setImageResource(R.drawable.dinglan1);
		
		imageViewQixing=(ImageView) findViewById(R.id.img_qixing);
		imageViewQixing.setImageResource(R.drawable.cebian1_1);
		
		
		imageViewDiaoyu=(ImageView) findViewById(R.id.img_diaoyu);
		imageViewDiaoyu.setImageResource(R.drawable.cebian1_2);
		imageViewDiaoyu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), DiaoYu.class);
				startActivity(intent);
				finish();
			}
		});
		imageViewBaitan=(ImageView) findViewById(R.id.img_baitan);
		imageViewBaitan.setImageResource(R.drawable.cebian1_3);
		imageViewBaitan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), BaiTan.class);
				startActivity(intent);
				finish();
			}
		});
	}
	
}
