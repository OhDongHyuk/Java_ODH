package quiz.test12.vo;

import java.util.Objects;

import lombok.Data;

@Data
public class Student {
	private static final long serialVersionUID = 6914872964580259399L;
	
	int studentNum;
	String studentR;
	String name;

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNum == other.studentNum
				&& Objects.equals(studentR, other.studentR);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, studentNum, studentR);
	}

	public Student(int studentNum, String studentR, String name) {
		super();
		this.studentNum = studentNum;
		this.studentR = studentR;
		this.name = name;
	}

	
	
	
}
