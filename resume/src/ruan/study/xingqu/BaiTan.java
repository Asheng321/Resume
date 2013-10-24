package ruan.study.xingqu;

import com.cheaphome.main.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BaiTan extends Activity{

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
		imageViewDinglan.setImageResource(R.drawable.dinglan3);
		
		imageViewQixing=(ImageView) findViewById(R.id.img_qixing);
		imageViewQixing.setImageResource(R.drawable.cebian3_1);
		imageViewQixing.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), QiXing.class);
				startActivity(intent);
				finish();
			}
		});
		
		imageViewDiaoyu=(ImageView) findViewById(R.id.img_diaoyu);
		imageViewDiaoyu.setImageResource(R.drawable.cebian3_2);
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
		imageViewBaitan.setImageResource(R.drawable.cebian3_3);
		
		image=(ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.baitan);
		
		textTitle=(TextView) findViewById(R.id.text_title);
		textTitle.setText("这也可以是一种兴趣");
		
		textContent=(TextView) findViewById(R.id.text_content);
		textContent.setText("     家里是做小生意的，大小便对一个小小的商机感兴趣，而这些兴趣，很有幸能在大学付诸实践。\n" +
				"     大一的时候，那时候大家都是学c语言，但是学校的教材不是很好，我自己上网买了谭浩强的c语言，发现旁边的同学也觉得这本书不错，于是发现了这个商机，以至于，后来上c语言课的时候，教室四分之一都是用的我卖的书\n" +
				"     大二的时候，自己要买张内存卡，无意中在淘宝上发现有个本地的商家，而且价格给的很便宜，于是我跟他聊天，我说我从他那儿拿货，我在学校卖，如果卖剩下了，每样少两块钱退回去，后来的情况是，摆了三个小时的摊子，赚了300块钱（后来被学校的眼红的小店老板撵走了）."
				);
	}
	
}
