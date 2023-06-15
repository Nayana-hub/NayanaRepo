package com.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "Product_test")
public class Product {
	@Id
	@SequenceGenerator(name = "PROD_SQNGEN", sequenceName = "PRODUCT_SEQ", initialValue = 10, allocationSize = 1)
	@GeneratedValue(generator = "PROD_SQNGEN", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@NonNull
	@Column(name = "Product_Name", unique = true)
	private String Product_Name;
	@NonNull
	@Column(name = "Product_Category")
	private String Product_Category;
	@NonNull
	@Column(name = "Product_Unit")
	private String Product_Unit;
	@NonNull
	@Column(name = "Product_Description")
	private String Product_Description;
	@NonNull
	@Column(name = "Product_Quantity")
	private Integer Product_Quantity;
	@NonNull
	@Column(name = "Product_Status")
	private Boolean Product_Status;
	@Column(name = "Product_Code", unique = true)
	@NonNull
	private String Product_Code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}
	public String getProduct_Unit() {
		return Product_Unit;
	}
	public void setProduct_Unit(String product_Unit) {
		Product_Unit = product_Unit;
	}
	public String getProduct_Description() {
		return Product_Description;
	}
	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}
	public Integer getProduct_Quantity() {
		return Product_Quantity;
	}
	public void setProduct_Quantity(Integer product_Quantity) {
		Product_Quantity = product_Quantity;
	}
	public Boolean getProduct_Status() {
		return Product_Status;
	}
	public void setProduct_Status(Boolean product_Status) {
		Product_Status = product_Status;
	}
	public String getProduct_Code() {
		return Product_Code;
	}
	public void setProduct_Code(String product_Code) {
		Product_Code = product_Code;
	}
	
}
