package factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import phoneclass.Phone;

public class PhoneFactory {
	
	public static String PhoneName;			//定义出这个手机的名称类
	
	static{
		try {				//从properties文件中获取phone的名称，这能让我们更加灵活，不需要改任何一行代码，只需要改配置文件，扩展性强，可维护
			InputStream in = PhoneFactory.class.getClassLoader().getResourceAsStream("phone.properties");
			Properties pro = new Properties();		
			pro.load(in);		//将流加载入pro中
			PhoneName = pro.getProperty("phonename"); //从这里可以读出properties配置文件中的手机类名！
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	//通过反射，可以通过类名来加载这个类的实例，注意，这里要面向接口编程！
	public static Phone getPhone() throws Exception{
		return (Phone) Class.forName(PhoneName).newInstance();
	}
	
	
}
