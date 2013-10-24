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
		textTitle.setText("��Ҳ������һ����Ȥ");
		
		textContent=(TextView) findViewById(R.id.text_content);
		textContent.setText("     ��������С����ģ���С���һ��СС���̻�����Ȥ������Щ��Ȥ�����������ڴ�ѧ����ʵ����\n" +
				"     ��һ��ʱ����ʱ���Ҷ���ѧc���ԣ�����ѧУ�Ľ̲Ĳ��Ǻܺã����Լ���������̷��ǿ��c���ԣ������Աߵ�ͬѧҲ�����Ȿ�鲻�����Ƿ���������̻��������ڣ�������c���Կε�ʱ�򣬽����ķ�֮һ�����õ���������\n" +
				"     �����ʱ���Լ�Ҫ�����ڴ濨�����������Ա��Ϸ����и����ص��̼ң����Ҽ۸���ĺܱ��ˣ������Ҹ������죬��˵�Ҵ����Ƕ��û�������ѧУ���������ʣ���ˣ�ÿ��������Ǯ�˻�ȥ������������ǣ���������Сʱ��̯�ӣ�׬��300��Ǯ��������ѧУ���ۺ��С���ϰ������ˣ�."
				);
	}
	
}
