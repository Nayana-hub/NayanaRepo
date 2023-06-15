package com.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CommonConstants;
import com.Entity.Product;
import com.Exception.ResourceNotFoundException;
import com.Model.BaseResponse;
import com.Model.ProductDto;
import com.Service.IProductService;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

	@Autowired
	IProductService productService;

	/*
	 * @PostMapping("/product") public ResponseEntity<BaseResponse<Product>>
	 * saveProduct(@RequestBody ProductDto productdto) { BaseResponse<Product> p =
	 * new BaseResponse<>(); try { String validate = validaterequest(productdto); if
	 * (validate.trim().isEmpty()) { return productService.saveProduct(productdto);
	 * } else { p.setStatus(CommonConstants.FAIL); p.setReasonText(validate); return
	 * new ResponseEntity<BaseResponse<Product>>(p, null, HttpStatus.BAD_REQUEST); }
	 * } catch (Exception e) { p.setStatus(CommonConstants.FAIL);
	 * p.setReasonText("Exception In ProductController : saveProduct ::" +
	 * e.getMessage()); return new ResponseEntity<BaseResponse<Product>>(p, null,
	 * HttpStatus.BAD_REQUEST); }
	 * 
	 * }
	 */
	@PostMapping("/product")
	public ResponseEntity<BaseResponse<Product>> saveProduct(@RequestBody ProductDto productdto) {
		BaseResponse<Product> p = new BaseResponse<>();

		String validate = validaterequest(productdto);
		if (validate.trim().isEmpty()) {
			return productService.saveProduct(productdto);
		} else {
		throw new ResourceNotFoundException("Exception In ProductController  postProduct");
		}

	}

	private String validaterequest(ProductDto productdto) {
		StringBuilder validate = new StringBuilder();
		if (productdto == null) {
			validate.append("fail");
		}

		return validate.toString();
	}

	@GetMapping("/get")
	public ResponseEntity<BaseResponse<Product>> getAllProduct() {
		BaseResponse<Product> p = new BaseResponse<>();
		try {
			return productService.getAllProduct();
		} catch (Exception e) {
			p.setStatus(CommonConstants.FAIL);
			p.setReasonText("Exception In ProductController : getProduct ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(p, null, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{product_id}")
	public ResponseEntity<BaseResponse<Product>> updateProduct(@RequestBody ProductDto productdto,
			@PathVariable("product_id") Integer product_id) {
		BaseResponse<Product> p = new BaseResponse<>();
		
			if (!productdto.toString().isEmpty()) {
				return productService.updateProduct(productdto, product_id);
			} else {
				p.setStatus(CommonConstants.FAIL);
				p.setReasonText(CommonConstants.PPUID);
			throw new ResourceNotFoundException("Exception in product controller getProduct");
			}

		
	}

	@DeleteMapping("/delete/{product_id}")
	public ResponseEntity<BaseResponse<Product>> deleteProduct(HttpServletRequest request,
			@PathVariable("product_id") Integer product_id) {
		BaseResponse<Product> p = new BaseResponse<>();
		try {
			return productService.deleteProduct(request, product_id);

		} catch (Exception e) {
			p.setStatus(CommonConstants.FAIL);
			p.setReasonText("Exception In ProductController: deletebyid ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(p, null, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/getById")
	public ResponseEntity<BaseResponse<Product>> getProductById(@RequestParam Integer product_id) {
		BaseResponse<Product> p = new BaseResponse<>();
		try {
			return productService.getproductById(product_id);
		} catch (Exception e) {
			p.setStatus(CommonConstants.FAIL);
			p.setReasonText("Exception In ProductController : getProductById ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(p, null, HttpStatus.BAD_REQUEST);
		}

	}

}