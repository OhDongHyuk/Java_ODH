package day15.practice.shop.shop;

import lombok.Data;


@Data 
public class Manager{
		//멤버 변수
		private String customer;
		private String item[]; //배열을 여기서 지정
		private int itemCount; //뜻이 저장된 개수
		//생성자
		public Manager(String customer, String item) {//뜻과 단어를 같이 추가할 경우
			this.customer = customer;
			this.item = new String[5]; //기본 5개
			this.item[0] = item;
			itemCount++;
		}
		public Manager(String customer) {//단어만 추가할 경우
			this.customer = customer;
			this.item = new String[5]; //안써도 배열만 만들어주는게 좋음
		}
		//복사생성자
		public Manager(Manager w) {
			this.customer = w.customer;
			this.item = new String[5];
			for(int i = 0; i < w.itemCount; i++) {
			    this.item[i] = w.item[i];
			}
			itemCount = w.itemCount;
		}
		//메소드
		/**단어와 뜻을 출력하는 메소드
		 * 매개변수 : 없음
		 * 리턴타입 : 없음 => void
		 * 메소드명 : print
		 */
		public void print() {
			System.out.println("word : " + customer);
			System.out.println("meaning : ");
			for(int i = 0; i < itemCount; i++) {//뜻은 여러개 이기 때문
				System.out.println(i+1 + ". " + item[i]);
			}
		}
		/**제품을 추가하는 메소드
		 * 매개변수 : 추가 될 뜻 => String item
		 * 리턴타입 : void
		 * 메소드명 : addItem
		 */
		//강사님이 한것
		public void addItem(String item) {
			//뜻이 다 찼으면 다 찼다고 출력하고 종료
			if(itemCount == this.item.length) {
				System.out.println("It's all filled.");
				return; //실행 안함
			}
			this.item[itemCount] = item; //n번까지만 뜻을 채우는 방범
			itemCount++;
		}
		/**수정할 제품의 번지와 수정할 제품이 주어지면 제품을 수정하고 수정 여부를 알려주는 메소드
		 * 매개변수 : 수정할 뜻의 번지, 수정할 뜻 => int itemNum, String item
		 * 리턴타입 : 수정 여부 => boolean
		 * 메소드명 : updateItem
		 */
		public boolean updateItem(int itemNum, String item) {
			//수정할 뜻의 번호가 잘못된 경우
			if(itemNum > itemCount || itemNum <= 0) {
				return false;
			}
			//meaningNum는 1부터이고 번지는 0부터이기 때문에 빼기 1을 한다
			this.item[itemNum - 1] = item;
			return true;
		}
		
		
	
}

















