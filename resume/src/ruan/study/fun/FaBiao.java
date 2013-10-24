package ruan.study.fun;

import com.cheaphome.main.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FaBiao extends Activity{

	private TextView textViewTitle,textViewFabiao;
	private ImageView imageViewClose,imageViewPost;
	private EditText editText;
	private Intent intent;
	
	/** 自己定义的请求代号，与发表里面是对应的 **/
	private final static int REQUEST_CODE=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fabiao);
		
		intent=new Intent();
		
		textViewTitle=(TextView) findViewById(R.id.title);
		textViewTitle.setText("投稿");
		
		imageViewClose=(ImageView) findViewById(R.id.close);
		imageViewClose.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), Fun.class);
				startActivity(intent);
			}
		});
		
		imageViewPost=(ImageView) findViewById(R.id.post);
		imageViewPost.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(editText.getText().toString().trim()!="")
					{
						intent.setClass(getApplicationContext(), Fun.class);
						String content=editText.getText().toString().trim();
						Bundle bundle=new Bundle();
						bundle.putString("content", content);
						intent.putExtras(bundle);
						setResult(Activity.RESULT_OK, intent);
						finish();
					}
				else {
					Toast.makeText(getApplicationContext(), "请输入内容", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		editText=(EditText) findViewById(R.id.content);
		editText.setFocusable(true);
		
		editText.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				editText.setText("");
				return false;
			}
		});
		
		
	}
	
	
}
