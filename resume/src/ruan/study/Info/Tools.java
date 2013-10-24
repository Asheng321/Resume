package ruan.study.Info;

/**
 * 工具类
 * @author ruan
 * @date 20130811
 */
public class Tools {
	/**
	 * 输入的是任意的一个字符串，然后对这个字符串进行解析
	 * 目前的解析仅仅是碰到空格就转换成换行
	 * 这个方法不是通用的方法，主要针对目前的新闻消息
	 * @param string
	 * @return
	 */
	public static String strAnalysis(String string)
	{
		StringBuffer stringBuffer=new StringBuffer();
		int start=0;
		int end=0;
		for (int i = 0; i < string.length(); i++) {
			int c=(int)string.charAt(i);
			char ca=string.charAt(i);
			if(string.charAt(i)!=32&&string.charAt(i)!=12288)  //12288是中文符号
				{
					end=i;//第一位是空格？注意看看别的
					if(end==string.length()-1)
						stringBuffer.append(string.substring(start, end+1));
				}
				
			else {
				if(string.charAt(i+1)==32||string.charAt(i+1)==12288) //如果下一个还是空格，则什么都不做
					continue;
				stringBuffer.append("    ").append(string.substring(start, end+1)); //发现了空格后马上取出前面的数据
				stringBuffer.append("\n");
				end=i;
				start=i+1;
			}
		}
		return stringBuffer.toString();
	}
}
