package ruan.study.xingqu;

import com.cheaphome.main.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DiaoYu extends Activity{
	private ImageView imageViewQixing,imageViewDiaoyu,imageViewBaitan,imageViewDinglan,image;
	private Intent intent;
	private TextView textTitle,textContent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xingqu);
		intent=new Intent();
		
		imageViewDinglan=(ImageView) findViewById(R.id.img_dinglan);
		imageViewDinglan.setImageResource(R.drawable.dinglan2);
		
		
		imageViewQixing=(ImageView) findViewById(R.id.img_qixing);
		imageViewQixing.setImageResource(R.drawable.cebian2_1);
		imageViewQixing.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				intent.setClass(getApplicationContext(), QiXing.class);
				startActivity(intent);
				finish();
			}
		});
		
		imageViewDiaoyu=(ImageView) findViewById(R.id.img_diaoyu);
		imageViewDiaoyu.setImageResource(R.drawable.cebian2_2);
		
		imageViewBaitan=(ImageView) findViewById(R.id.img_baitan);
		imageViewBaitan.setImageResource(R.drawable.cebian2_3);
		imageViewBaitan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), BaiTan.class);
				startActivity(intent);
				finish();
			}
		});
		
		image=(ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.diaoyu);
		
		textTitle=(TextView) findViewById(R.id.text_title);
		textTitle.setText("任凭风浪起，稳坐钓鱼台");
		
		textContent=(TextView) findViewById(R.id.text_content);
		textContent.setText("   从小生活在长江边，对水有着特殊的情感。小时候，总是喜欢跟一群小伙伴去江边钓鱼，钓竿的颤动，给我带来的便是每一次的惊喜。\n    如今上了大学，闲暇之余，还是会去钓钓鱼，这个时候钓的更是一种心境，一个人安安静静，吹着湖面飘来的阵阵水汽，无法按捺的情绪也会“静如处子”");
	}
	
}
