package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.concretes.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.AbcPRoductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// TODO Spring IOC ile iyileþtirilecek.
		ProductService productService =  new  ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product();
		product.setId(1);
		product.setCategoryId(21);
		product.setName("Lenovo V15");
		product.setUnitPrice(15000);
		product.setUnitsInStock(25);
		
		productService.add(product);
	}

}
