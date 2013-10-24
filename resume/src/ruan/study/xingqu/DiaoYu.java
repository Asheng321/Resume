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
		textTitle.setText("��ƾ��������������̨");
		
		textContent=(TextView) findViewById(R.id.text_content);
		textContent.setText("   ��С�����ڳ����ߣ���ˮ�����������С�Сʱ������ϲ����һȺС���ȥ���ߵ��㣬���͵Ĳ��������Ҵ����ı���ÿһ�εľ�ϲ��\n    ������˴�ѧ����Ͼ֮�࣬���ǻ�ȥ�����㣬���ʱ����ĸ���һ���ľ���һ���˰������������ź���Ʈ��������ˮ�����޷����������Ҳ�ᡰ���紦�ӡ�");
	}
	
}
