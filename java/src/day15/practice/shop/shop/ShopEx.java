package day15.practice.shop.shop;

import lombok.Data;

@Data
public class ShopEx {

	//멤버변수
	//단어들
	private Manager customerList[];
	private int customerCount; //저장된 단어의 개수
		
	//생성자
	public ShopEx() {
		customerList = new Manager[10];
	}
	
	public ShopEx(Manager customerList[]) {
		//기존 단어장의 크기와 10을 비교해서 큰 수로 단어장 크기를 선택
		int size = customerList.length > 10 ? customerList.length : 10; 
		this.customerList = new Manager[size];
		for(int i = 0; i < customerList.length; i++) {
			this.customerList[i] = new Manager(customerList[i]);
		}
		customerCount = customerList.length;
	}
	
	
	//메소드
	/**고객들을 출력하는 메소드
	 * 매개변수 : 없다
	 * 리턴타입 : void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println("====================");
		for(int i = 0; i < customerCount; i++) {
			customerList[i].print();
			System.out.println("====================");
		}
	}
	//1
	/**고객이 추가되면 명단에 고객을 추가하는 메소드(단어 객체를 넘겨주는 경우)
	 * 매개변수 : 고객(고객 객체) => Manager customer
	 * 리턴타입 : void
	 * 메소드명 : insert
	 */
	public void insert(Manager customer) {
		//단어장에 단어가 다 찼으면 추가를 하지 못함
		if(customerCount == customerList.length) {
			System.out.println("Vocabulary is full");
			return;
		}
		//깊은 복사를 위해 Word의 복사 생성자를 이용하여 새 단어를 생성한 후 추가
		customerList[customerCount++] = new Manager(customer); 
	}
	//2 + //6
	/**고객과 제품이 주어지면 고객명단에 추가하는 메소드(단어와 뜻을 넘겨주는 경우)
	 * 매개변수 : 고객과 제품 => String customer, String item 
	 * 리턴타입 : int
	 * 메소드명 : insert(메소드 오버로딩)
	 * @return 
	 */
	public int insert(String customer, String item) {
		//단어장에 단어가 다 찼으면 추가를 하지 못함
		if(customerCount == customerList.length) {
			System.out.println("Customer is full");
			return ;
		}
		int index = indexOf(customer);
		//없는 단어이면 새 단어로 추가
		if(index == -1) {
		//단어와 뜻을 이용해 단어 객체를 생성한 후 단어장에 추가
			customerList[customerCount++] = new Manager(customer, item); 
			return ;
		}
		//있는 단어이면 뜻을 추가
		customerList[index].addItem(item);
		
	}
	
	//4
	/**고객이 주어지면 고객이 있는 위치를 알려주는 메소드
	 * 고객이 없으면 -1 (배열의 번지는 0부터 이기 때문에 음수로 리턴)
	 * 매개변수 : 단어 => String customer
	 * 리턴타입 : 위치 => 번지 => 정수 => int
	 * 메소드명 :indexOf
	 */
	public int indexOf(String customer) {
		//단어장에 등록된 단어들을 조회
		for(int i = 0; i < customerCount; i++) {
			//단어가 같으면 i번지를 리턴
			if(customerList[i].getCustomer().equals(customer)) {
				return i;
			}
		}
		//일치하는 단어가 없는 경우이므로 -1을 리턴
		return -1;
	}
	//5
	/**고객이 주어지면 고객명단에 해당 고객을 출력하는 메소드
	 * 매개변수 : 단어 => String customer
	 * 리턴타입 : void
	 * 메소드명 : search
	 */
	public void search(String customer) {
		int index = indexOf(customer);
		
		if(index == -1) {
			System.out.println("No customers found");
			return;
		}
		
		customerList[index].print();
	}
	//7
	/**고객과 수정할 제품의 번호와 수정할 제품이 주어지면 제품을 수정하는 메소드
	 * 매개변수 : 고객, 수정할 제품의 번호, 수정할 제품
	 * 			=>String customer, int itemIndex, String item
	 * 리턴타입 : void
	 * 메소드명 : updateItem
	 */
	public void updateItem(String customer, int itemIndex, String item) {
		
		int index = indexOf(customer);
		if(index == -1) {
			System.out.println("No customers found");
			return;
		}
		//뜻이 없는 칸의 숫자를 입력했을때
		if(!customerList[index].updateItem(itemIndex, item)) {
			System.out.println("Wrong number");
		}
	}

}
class TV{
	
}
class Radio{
	
}
class Aircon{
	
	
}

































