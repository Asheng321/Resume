package ruan.study.set;

import com.cheaphome.main.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class About extends Activity{

	private TextView textViewTitle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about);
		textViewTitle=(TextView) findViewById(R.id.title);
		textViewTitle.setText("¹ØÓÚ");
		
	}
	
}
