package cn.bdqn;
/**
 * 
 * @author �����
 *����Person�࣬������private String name,
 *����дgetter��setter������
 *��д��	���޲ι��캯���ʹ��ι��캯����
 *������public void speak()��
 *���������ѽѽ����
 *
 */
//Person��
public class Person {
	//����
	private String name;
	//�޲ι���
	public Person(){
	}
	//�вι���
	public Person(String name) {
		super();
		this.name = name;
	}
	//get��set����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//�����������ѽѽ��
	public void speak(){
		System.out.println("����ѽѽ��");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
