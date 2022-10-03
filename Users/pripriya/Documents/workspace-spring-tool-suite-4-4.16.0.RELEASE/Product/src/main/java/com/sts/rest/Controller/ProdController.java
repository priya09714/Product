package com.sts.rest.Controller;

import java.util.List;

//import javax.print.PrintService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Product;
import com.sts.rest.services.ProdServices;


@RestController
public class ProdController {
	@Autowired
	private ProdServices serviceRepo;
	
@GetMapping("/products")
public List<Product> getAllProduts()
{
	return this.serviceRepo.getAllproduts();
}
@PostMapping("/addproduct")
public Product addProduct(@RequestBody Product product)
{
    return this.serviceRepo.addProduct(product);
}
@PutMapping("/updateproducts/{prodid}")
public void updateProduct(@PathVariable int prodid,@RequestBody Product product )
{
     this.serviceRepo.updateProduct(prodid, product);
}
@DeleteMapping("/deleteproducts/{prodid}")
public void deleteProduct(@PathVariable int prodid)
{
    this.serviceRepo.deleteproduct( prodid);
}
}



