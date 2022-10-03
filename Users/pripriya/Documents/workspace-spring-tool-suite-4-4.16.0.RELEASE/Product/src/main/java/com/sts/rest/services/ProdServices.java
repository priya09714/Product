package com.sts.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Product;
import com.sts.rest.repository.custRepository;

@Service
public class ProdServices

{
@Autowired
private  custRepository serviceRepo;
public List<Product>getAllproduts()
	  {
			List<Product> list=new ArrayList<Product>();
			this.serviceRepo.findAll().forEach(list::add);
			return list;
		}
		public Product addProduct(Product product)
		{
			return this.serviceRepo.save(product);
		}
		public void updateProduct(Integer id,Product product)
		{
			this.serviceRepo.save(product);
			
		}
		public void deleteCustomer(Integer id)
		{
			this.serviceRepo.deleteById(id);
		}
		public void deleteproduct(int prodid) {
			// TODO Auto-generated method stub
			
		}
	}



