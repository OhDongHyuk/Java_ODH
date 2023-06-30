package day22.practice2.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;


//한 사람의 전화번호
@Data
@AllArgsConstructor
public class Phone {
	private String name, num;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(num, other.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
	
	
}
