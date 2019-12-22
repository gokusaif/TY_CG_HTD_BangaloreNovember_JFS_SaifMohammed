package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.ProductBean;

public interface ProductServices {

	public boolean deleteProduct(int productId);
	
	public boolean insertProduct(ProductBean prod);
	
	public List<ProductBean> showProducts();

	public List<ProductBean> viewProducts(int productId);

	public boolean updateProduct(int productId,String quantity);
	

}
