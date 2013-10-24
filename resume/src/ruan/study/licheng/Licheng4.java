package ruan.study.licheng;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cheaphome.main.R;

public class Licheng4 extends Activity{

	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.licheng4);
		button=(Button) findViewById(R.id.yingyong);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startAnotherApplication("lbq.study.game.pb.main");
			}
		});
	}
	
	/**
	 * 启动另外一个用用
	 * @param packageName  另外一个应用的应用报名
	 * @author ruan 
	 */
	private void startAnotherApplication(String packageName) {
		if(isInstallByread(packageName))
		{
			Intent intent=getPackageManager().getLaunchIntentForPackage(packageName);
			startActivity(intent);
		}
	}
	
	/**  
	 * 判断是否安装目标应用  
	 * @param packageName 目标应用安装后的包名  
	 * @return 是否已安装目标应用  
	 * @author ruan  
	 */    
	private boolean isInstallByread(String packageName) {    
	 return new File("/data/data/" + packageName).exists();    
	}  

}
