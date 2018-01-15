package ronaldotree.adv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileOutputStreams {
	public static void main(String[] args) {
		// 바이트 기반 스트림 - 파일 쓰기
		// 객체를 바이트 기반 스트림으로 파일에 저장
		// 즉, 클래스에 대한 객체를 직렬화해서 파일에 저장함

		String name = "혜교";
		Users u = new Users("rotree", "123456", "수빈", 26);
		int age = 57;

		String fpath = "c:/Java/data01.dat";
		try (FileOutputStream fos = new FileOutputStream(fpath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeUTF(name); // 직렬화로 문자형을 파일에 저장
			oos.writeObject(u); // 직렬화로 객체를 파일에 저장
			oos.writeInt(age); // 직렬화로 숫자를 파일에 저장

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

// 클래스를 직려로하해서 파일에 저장하려면 해당 클래스는 Serializale 인터페이스를 구현해야 함
class Users implements Serializable {

	private static final long serialVersionUID = -7084598854L;
	String userid;
	String passwd;
	String name;
	int age;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String userid, String passwd, String name, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", age=" + age + "]";
	}
}