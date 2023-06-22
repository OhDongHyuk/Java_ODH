package day17.practice.service;

import day17.practice.vo.Product;

public class ShopServiceImp implements ShopService{

	@Override
	public int store(Product[] list, int count, Product product) {
		//입고할 제품이 없으면 입고하지 않고, 기존 제품 수를 알림.
		if(product == null) {
			return count;//기존 제품 수 리턴
		}
		//제품 리스트가 없으면
		if(list == null) {
			return 0;
		}
		//제품 리스트의 크기가 count보다 작으면
		if(list.length < count) {
			return list.length;
		}
		//제품수가 잘못되면(음수이면)
		if(count < 0) {
			return 0;
		}
		
		int index = indexOf(list, count, product);
		return 0;
	}

}
