package ruan.study.Info;

/**
 * ������
 * @author ruan
 * @date 20130811
 */
public class Tools {
	/**
	 * ������������һ���ַ�����Ȼ�������ַ������н���
	 * Ŀǰ�Ľ��������������ո��ת���ɻ���
	 * �����������ͨ�õķ�������Ҫ���Ŀǰ��������Ϣ
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
			if(string.charAt(i)!=32&&string.charAt(i)!=12288)  //12288�����ķ���
				{
					end=i;//��һλ�ǿո�ע�⿴�����
					if(end==string.length()-1)
						stringBuffer.append(string.substring(start, end+1));
				}
				
			else {
				if(string.charAt(i+1)==32||string.charAt(i+1)==12288) //�����һ�����ǿո���ʲô������
					continue;
				stringBuffer.append("    ").append(string.substring(start, end+1)); //�����˿ո������ȡ��ǰ�������
				stringBuffer.append("\n");
				end=i;
				start=i+1;
			}
		}
		return stringBuffer.toString();
	}
}
