package ruan.study.fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.PrivateCredentialPermission;

import ruan.study.main.CommonActivity;
import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.cheaphome.main.R;

public class Fun extends CommonActivity{
	
	private DBHelper dbHelper;
	private SQLiteDatabase sqLiteDatabase;
	private TextView textViewTitle,textViewFabiao;
	private ListView listView;
	private SimpleAdapter simpleAdapter;
	private String strSql;
	private Cursor cursor;
	private Intent intent;
	
	/** 自己定义的请求代号，与发表里面是对应的 **/
	private final static int REQUEST_CODE=1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fun);
		linearLayoutHome = (LinearLayout) findViewById(R.id.menu_home);
		linearLayoutHome.setOnTouchListener(linearHome);
		linearLayoutNews = (LinearLayout) findViewById(R.id.menu_news);
		linearLayoutNews.setOnTouchListener(linearNews);
		linearLayoutKnowledge = (LinearLayout) findViewById(R.id.menu_knowledge);
		linearLayoutKnowledge.setOnTouchListener(linearKnowledge);
		linearLayoutKnowledge.setBackgroundColor(Color.rgb(190, 37, 00));
		linearLayoutStore = (LinearLayout) findViewById(R.id.menu_store);
		linearLayoutStore.setOnTouchListener(linearStore);
		
		intent=new Intent();
		
		textViewFabiao=(TextView) findViewById(R.id.text_fabiao);
		textViewFabiao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.setClass(getApplicationContext(), FaBiao.class);
				startActivityForResult(intent,REQUEST_CODE);
			}
		});
		
		textViewTitle=(TextView) findViewById(R.id.title);
		textViewTitle.setText("开心一刻");
		dbHelper=new DBHelper(getApplicationContext());
		dbHelper.getWritableDatabase();
		listView=(ListView)findViewById(R.id.list);
        DBBindList();
		
		
	}
	
	/**
	 * 将数据库的内容绑定到listview上
	 */
	public void DBBindList()
	{
		String str = new String();
			simpleAdapter= new SimpleAdapter(getApplicationContext(), getListItems(),
					R.layout.content_listview, new String[]{"content"}, 
					new int[]{R.id.content});
			listView.setAdapter(simpleAdapter);
			
        
		
	}
	
	public void insert(ContentValues contentValues)
	{
		sqLiteDatabase=dbHelper.getWritableDatabase();
		sqLiteDatabase.insert("user", null, contentValues);
		dbHelper.close();
		DBBindList();
	}
	
	/**
	 * 读取数据库中的内容
	 * @return 内容
	 */
	public List<Map<String,String>> getListItems(){
		Map<String,String> item;
		List<Map<String,String>> listItems= new  ArrayList<Map<String,String>>();
		sqLiteDatabase=dbHelper.getReadableDatabase();
		strSql="select * from FunDb";
		cursor=sqLiteDatabase.query("user", new String[]{"content"}, null, null, null, null, null);
		
		 cursor.moveToFirst();
		    for(int i=0;i<cursor.getCount();i++){
		    	item=new HashMap<String,String>();
		    	item.put("content", cursor.getString(cursor.getColumnIndex("content")));
		    	listItems.add(item);
		    	cursor.moveToNext();
		    }
		    dbHelper.close();
		    return listItems;
 }
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		//super.onActivityResult(requestCode, resultCode, data);
		if(resultCode==Activity.RESULT_OK)
		{
			Bundle bundle=data.getExtras();
			String content=bundle.getString("content");
			ContentValues contentValues =new ContentValues();
			contentValues.put("content", content);
			insert(contentValues);
		}
	}

	@Override
	protected void onRestart() {
		linearLayoutKnowledge.setBackgroundColor(R.color.menu_pressed);
		super.onRestart();
	}
	

}
