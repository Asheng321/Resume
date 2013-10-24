package ruan.study.geren;

import com.cheaphome.main.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class JBXX extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//È¥³ýÈÎÎñÀ¸
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.jibenxinxi);
	}
	
}
