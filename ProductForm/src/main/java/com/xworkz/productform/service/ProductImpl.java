package com.xworkz.productform.service;

import com.xworkz.productform.Dto.ProductDto;

public class ProductImpl implements Product {

	@Override
	public boolean isValidAndSave(ProductDto productDTO) {
		boolean valid=true;
		if(productDTO!=null) {
		String companyName=productDTO.getCompanyName();
		if(companyName!=null && !companyName.isEmpty() && companyName.length()>3 && companyName.length()<30) {
			System.out.println("companyName is valid");
		}
		else {
			System.out.println("companyName is not valid");
			valid=false;
		}
		
		String productName=productDTO.getProductName();
		if(productName!=null && !productName.isEmpty() && productName.length()>3 && companyName.length()<30) {
			System.out.println("productName is valid");
		}
		else {
			System.out.println("productName is not valid");
			valid=false;
		}
		
		int productQuantiy=productDTO.getProductQuantiy();
		if(productQuantiy>0 && productQuantiy<10) {
			System.out.println("productQuantiy is valid");
		}
		else {
			System.out.println("productQuantiy is not valid");
			valid=false;
		}
			
		double productCost=productDTO.getProductCost();
		if(productCost>=100) {
			System.out.println("productCost is valid");
		}
		else {
			System.out.println("productCost is not valid");
			valid=false;
		}
		}
		return valid;
	}

}