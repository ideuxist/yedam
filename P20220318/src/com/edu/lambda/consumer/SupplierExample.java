package com.edu.lambda.consumer;

import java.util.function.IntSupplier;
//Supplier 인터페이스 : 매개값이 (x) -> 반환값(o)
public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSup = //new IntSupplier() {
//
//			@Override
//			public int getAsInt() {
//				// TODO Auto-generated method stub
//				return (int) (Math.random()*10);
//			}
//			
				() -> (int) (Math.random()*10);
				
		
		int result = intSup.getAsInt();
		System.out.println("결과값은 "+result);
	}

}
