package Testing;

import java.util.Objects;

public class Employee {
private int age;
private String name;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [age=" + this.age + ", name=" + this.name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(age, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return this.age == other.age && Objects.equals(this.name, other.name);
}



}
