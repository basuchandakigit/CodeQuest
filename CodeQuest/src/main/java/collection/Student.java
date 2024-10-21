package collection;
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

	@Override
	public String toString() {
		return "Student [name=" + this.name + ", age=" + this.age + "]";
	}
	
	
}
