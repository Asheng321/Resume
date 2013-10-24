package ruan.study.Home;

import java.util.Timer;
import java.util.TimerTask;

import ruan.study.geren.Geren;
import ruan.study.huojiang.HuoJiang;
import ruan.study.lianxi.Contact;
import ruan.study.main.CommonActivity;
import ruan.study.xingqu.QiXing;
import ruan.study.xuexiao.Xuexiao;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cheaphome.main.R;

/**
 * ��ҳ����
 * 
 * @author ruan
 * @date 2013.6.20
 */
public class HomeActivity extends CommonActivity {
	/** =================Gallery=============== */
	private Gallery pictureGallery = null;
	//���������gallery������
	private int[] picture = { R.drawable.gallery1,R.drawable.gallery2,R.drawable.gallery3 };
	private int index = 0;
	private LinearLayout linearLayoutGeren,linearLayoutHuojiang,linearLayoutXuexiao
			,linearLayoutXingqu,linearLayoutLianxi;
	private TextView textViewTitle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// ȥ���ֻ�����Ĭ�ϱ���
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//ȥ��������
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.home);
		linearLayoutHome = (LinearLayout) findViewById(R.id.menu_home);
		linearLayoutHome.setOnTouchListener(linearHome);
		linearLayoutHome.setBackgroundColor(Color.rgb(190, 37, 00));
		linearLayoutNews = (LinearLayout) findViewById(R.id.menu_news);
		linearLayoutNews.setOnTouchListener(linearNews);
		linearLayoutKnowledge = (LinearLayout) findViewById(R.id.menu_knowledge);
		linearLayoutKnowledge.setOnTouchListener(linearKnowledge);
		linearLayoutStore = (LinearLayout) findViewById(R.id.menu_store);
		linearLayoutStore.setOnTouchListener(linearStore);
		textViewTitle=(TextView) findViewById(R.id.title);
		textViewTitle.setText("��ҳ");
		
		pictureGallery=(Gallery) findViewById(R.id.gallery);
		
		
		linearLayoutGeren=(LinearLayout) findViewById(R.id.grxx);
		linearLayoutGeren.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Geren.class);
				startActivity(intent);
			}
		});
		linearLayoutHuojiang=(LinearLayout) findViewById(R.id.hjqk);
		linearLayoutHuojiang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), HuoJiang.class);
				startActivity(intent);
			}
		});
		linearLayoutXuexiao=(LinearLayout) findViewById(R.id.xxbx);
		linearLayoutXuexiao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Xuexiao.class);
				startActivity(intent);
			}
		});
		linearLayoutXingqu=(LinearLayout) findViewById(R.id.xqah);
		linearLayoutXingqu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), QiXing.class);
				startActivity(intent);
			}
		});
		
		linearLayoutLianxi=(LinearLayout) findViewById(R.id.lianxi);
		linearLayoutLianxi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Contact.class);
				startActivity(intent);
			}
		});
		
		ImageAdapter adapter = new ImageAdapter(this);
		pictureGallery.setAdapter(adapter);
		Timer timer = new Timer();
		timer.schedule(task, 3000, 5000);
		
		
	}

	@Override
	protected void onRestart() {
		linearLayoutHome.setBackgroundColor(R.color.menu_background_color);
		super.onRestart();
	}
	/**
	 * ��ʱ��
	 */
	private TimerTask task = new TimerTask() {

		@Override
		public void run() {
			Message message = new Message();
			message.what = 2;
			index = pictureGallery.getSelectedItemPosition();
			index++;
			handler.sendMessage(message);
		}
	};

	/**
	 * Handler
	 */
	private Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case 2:
				pictureGallery.setSelection(index);
				break;

			default:
				break;
			}
		}

	};

	@Override
	protected void onResume() {

		super.onResume();
	}

	/**
	 * �˳�
	 */
	private void openQiutDialog() {
		new AlertDialog.Builder(this).setTitle("���ڷɵĴ������").setMessage("�Ƿ��˳���")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {

						System.exit(0);
						finish();
					}
				})
				.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {

					}
				}).show();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			openQiutDialog();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	
	/**
	 * �Զ���һ��ͼƬ��ʾ������
	 * @author TanRuixiang
	 *
	 */
	class ImageAdapter extends BaseAdapter{
		private int GalleryItemBackground;
	    private Context context ; 
	   public ImageAdapter(Context context ){
		   this.context = context ; 
		   TypedArray typedArray = context.obtainStyledAttributes(R.styleable.Gallery);
		   GalleryItemBackground = typedArray.getResourceId(R.styleable.Gallery_android_galleryItemBackground, 0);
	   } 
		@Override
		public int getCount() {
			return Integer.MAX_VALUE;
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView = new ImageView(context);
			imageView.setImageResource(picture[position % picture.length]);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setLayoutParams(new Gallery.LayoutParams(Gallery.LayoutParams.FILL_PARENT, Gallery.LayoutParams.FILL_PARENT));
//			imageView.setBackgroundResource(GalleryItemBackground);
			return imageView;
		}
		
	}
	

}
