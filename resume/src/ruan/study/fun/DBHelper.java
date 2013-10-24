package ruan.study.fun;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper  {
	private static final int DATABASE_VERSION=2;
	private static final String DATABASE_NAME="FunDb";
	//通过super调用父类当中的构造函数
	public DBHelper(Context context,String name,CursorFactory factory,int version){
		super(context,name,factory,version);
	}
	
	public DBHelper(Context context,String name,int version){
		super(context,name,null,version);
	}
	
	public DBHelper(Context context,String name){
		super(context,name,null,DATABASE_VERSION);
	}
	
	public DBHelper(Context context){
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db){
		String sql="create table user(ID  INTEGER primary key autoincrement,content not null)";
		db.execSQL(sql);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
//		String sql="create table user(ID  INTEGER primary key autoincrement,content not null)";
//		db.execSQL(sql);
	}

}
