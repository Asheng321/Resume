package ruan.study.main;

import ruan.study.Home.HomeActivity;
import ruan.study.fun.Fun;
import ruan.study.licheng.Licheng;
import ruan.study.set.Set;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;


/**
 * ʹ���߳���Ϊ����ת��ʱ�������ʹ�ã���Ȼ���������û��ʵ�ʵĺ��壬���Ǻ�����Ϊ�˻�ȡ��������ʱ���õ�
 * 
 * @author ruan
 * @date 2013.6.17
 */
public class CommonActivity extends Activity implements Runnable {
	// �������ЩԪ��֮����û�зŵ�һ�����캯������ȥ���죬��Ϊ�̳�������ÿ��������һ���Լ��Ĺ��캯��
	public Intent intent = new Intent();
	public ProgressDialog progressDialog = null;
	public Handler handler = new Handler();
	public int niProgressCount = 0;
	public static LinearLayout linearLayoutHome = null;
	public static LinearLayout linearLayoutNews = null;
	public static LinearLayout linearLayoutKnowledge = null;
	public static LinearLayout linearLayoutStore = null;
	// ����
	public LinearLayoutHome linearHome = new LinearLayoutHome();
	public LinearLayoutNews linearNews = new LinearLayoutNews();
	public LinearLayoutKnowledge linearKnowledge = new LinearLayoutKnowledge();
	public LinearLayoutStore linearStore = new LinearLayoutStore();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 0, 1, "�˳�"); // �ڶ�������������id
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case 0:
			finish();
			break;
		}
		return true;
	}

	public void logic() {
	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		logic();
	}

	private class LinearLayoutHome implements OnTouchListener {

		@Override
		public boolean onTouch(View arg0, MotionEvent arg1) {
			if (arg1.getAction() == arg1.ACTION_DOWN) {
				intent.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(intent);
			}
			return false;
		}

	}

	private class LinearLayoutNews implements OnTouchListener {

		@Override
		public boolean onTouch(View arg0, MotionEvent arg1) {
			if (arg1.getAction() == arg1.ACTION_DOWN) {
				intent.setClass(getApplicationContext(), Licheng.class);
				startActivity(intent);
			}
			return false;
		}

	}

	private class LinearLayoutKnowledge implements OnTouchListener {

		@Override
		public boolean onTouch(View arg0, MotionEvent arg1) {
			if (arg1.getAction() == arg1.ACTION_DOWN) {
				intent.setClass(getApplicationContext(), Fun.class);
				startActivity(intent);
			}
			return false;
		}

	}

	private class LinearLayoutStore implements OnTouchListener {

		@Override
		public boolean onTouch(View arg0, MotionEvent arg1) {
			if (arg1.getAction() == arg1.ACTION_DOWN) {
				intent.setClass(getApplicationContext(), Set.class);
				startActivity(intent);
			}
			return false;
		}

	}

}
