package com.Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CommonConstants;
import com.Entity.Product;
import com.Model.BaseResponse;
import com.Model.ProductDto;
import com.Repository.ProductRepo;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductRepo productRepo;

	@Override
	public ResponseEntity<BaseResponse<Product>> saveProduct(ProductDto productdto) {
		BaseResponse<Product> baseResponse = new BaseResponse<>();
		try {
			Product product = new Product();
			product.setProduct_Category(productdto.getProduct_Category());
			product.setProduct_Code(productdto.getProduct_Code());
			product.setProduct_Description(productdto.getProduct_description());
			product.setProduct_Name(productdto.getProduct_Name());
			product.setProduct_Quantity(productdto.getProduct_Quantity());
			product.setProduct_Status(productdto.getProduct_Status());
			product.setProduct_Unit(productdto.getProduct_Unit());
			baseResponse.setResponseObject(productRepo.save(product));
			baseResponse.setStatus(CommonConstants.SUCCESS);
			baseResponse.setReasonText(CommonConstants.USER_ADDED_SUCCESSFULLY);
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);

		} catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ServiceImpl : saveUser() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}

	}

	@Override
	public ResponseEntity<BaseResponse<Product>> getAllProduct() {
		BaseResponse<Product> baseResponse = new BaseResponse<>();
		try {
			List<Product> allproduct = productRepo.findAll();

			if (allproduct.size() > 0) {
				baseResponse.setResponseListObject(allproduct);
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.GET_ALL_RECORDS);
				baseResponse.setTotalRecords(allproduct.size());
				return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);
			} else {
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.NO_RECORDS);
				return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);
			}
		} catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ProductServiceImpl : getAllProduct() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}
		
	
		

	}

	@Override
	public ResponseEntity<BaseResponse<Product>> updateProduct(ProductDto productdto, Integer product_id) {
		BaseResponse<Product> baseResponse=new BaseResponse<>();
		try {
			Product product=productRepo.findById(product_id).get();
			product.setProduct_Category(productdto.getProduct_Category());
			product.setProduct_Code(productdto.getProduct_Code());
			product.setProduct_Description(product.getProduct_Description());
			product.setProduct_Name(productdto.getProduct_Name());
			product.setProduct_Quantity(productdto.getProduct_Quantity());
			product.setProduct_Status(productdto.getProduct_Status());
			product.setProduct_Unit(productdto.getProduct_Unit());
			baseResponse.setResponseObject(productRepo.save(product));
			baseResponse.setStatus(CommonConstants.SUCCESS);
			baseResponse.setReasonText(CommonConstants.USER_DATA_UPDATED_SUCCESSFULLY);
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);
		}catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ProductServiceImpl : updateProduct() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public ResponseEntity<BaseResponse<Product>> deleteProduct(HttpServletRequest request, Integer product_id) {
		BaseResponse<Product> baseResponse=new BaseResponse<>();
		try {
			Product product=productRepo.findById(product_id).get();
			if(!product.toString().isEmpty()) {
				productRepo.deleteById(product_id);
				
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.DELETE_RECORD_BY_ID);
				return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);
			}else {
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.NO_RECORDS);
				return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);
			}
		}catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ProductServiceImpl : deleteProduct() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public ResponseEntity<BaseResponse<Product>> getproductById(Integer product_id) {
		BaseResponse<Product> baseResponse=new BaseResponse<>();
		try {
			Product product=productRepo.findById(product_id).get();
			if(!product.toString().isEmpty()) {
		baseResponse.setResponseObject(product);
		baseResponse.setStatus(CommonConstants.SUCCESS);
		baseResponse.setReasonText(CommonConstants.GET_RECORD_BY_ID);
		return new ResponseEntity<BaseResponse<Product>>(baseResponse,null,HttpStatus.OK);
			}
			else {
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.NO_RECORDS);
				return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.OK);
			}
		}catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ContactServiceImpl : deleteContact() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Product>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}
		
	}

}
