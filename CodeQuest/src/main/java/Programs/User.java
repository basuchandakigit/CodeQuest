package Programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class User {
 private int age;
 private LocalDate dob;
 
 
public int getAge() {
	return Period.between(this.dob, LocalDate.now()).getYears();
}

public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}

 
}
