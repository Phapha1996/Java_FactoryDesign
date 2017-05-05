package factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import phoneclass.Phone;

public class PhoneFactory {
	
	public static String PhoneName;			//���������ֻ���������
	
	static{
		try {				//��properties�ļ��л�ȡphone�����ƣ����������Ǹ���������Ҫ���κ�һ�д��룬ֻ��Ҫ�������ļ�����չ��ǿ����ά��
			InputStream in = PhoneFactory.class.getClassLoader().getResourceAsStream("phone.properties");
			Properties pro = new Properties();		
			pro.load(in);		//����������pro��
			PhoneName = pro.getProperty("phonename"); //��������Զ���properties�����ļ��е��ֻ�������
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	//ͨ�����䣬����ͨ������������������ʵ����ע�⣬����Ҫ����ӿڱ�̣�
	public static Phone getPhone() throws Exception{
		return (Phone) Class.forName(PhoneName).newInstance();
	}
	
	
}
