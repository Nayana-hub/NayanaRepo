package com.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.Entity.Product;
import com.Model.ProductDto;
import com.Model.BaseResponse;
@Service
public interface IProductService {
ResponseEntity<BaseResponse<Product>> saveProduct(ProductDto productdto);
ResponseEntity<BaseResponse<Product>>getAllProduct();
ResponseEntity<BaseResponse<Product>> updateProduct(ProductDto productdto,Integer product_id);
ResponseEntity<BaseResponse<Product>>deleteProduct(HttpServletRequest request,Integer product_id);
ResponseEntity<BaseResponse<Product>>getproductById(Integer product_id);
}
