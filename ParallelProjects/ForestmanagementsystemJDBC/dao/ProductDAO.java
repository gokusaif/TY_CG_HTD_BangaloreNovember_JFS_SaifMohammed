package com.cap.forestmanagementsystemjdbc.dao;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.ProductBean;

public interface ProductDAO {

	public boolean deleteProduct(int productId);
	
	public boolean insertProduct(ProductBean prod);
	
	public List<ProductBean> showProducts();

	public boolean updateProduct(int productId,String quantity);

	
}
