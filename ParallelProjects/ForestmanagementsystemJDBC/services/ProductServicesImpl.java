package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.ProductBean;
import com.cap.forestmanagementsystemjdbc.dao.ProductDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class ProductServicesImpl implements ProductServices{

	ProductDAO dao=Factory.productDaoObject();
	
	public boolean insertProduct(ProductBean prod) {
		
		return dao.insertProduct(prod) ;
	}

	
	public boolean deleteProduct(int productId) {
		
		return dao.deleteProduct(productId);
	}


	@Override
	public List<ProductBean> showProducts() {
		
		return dao.showProducts();
	}


	@Override
	public boolean updateProduct(int productId,String quantity) {
		
		return dao.updateProduct(productId,quantity);
	}

}
