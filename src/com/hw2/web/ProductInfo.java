package com.hw2.web;

import java.io.Serializable;

public class ProductInfo  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String Name;
	private String Color;
	private String Description;
	private String Barcode;

	public ProductInfo() {
		this.Name = "";
		this.Color = "";
		this.Description = "";
		this.Barcode = "";
	}
	public ProductInfo(String Name,String Color,String Description,String Barcode) {
		this.Name = Name;
		this.Color = Color;
		this.Description = Description;
		this.Barcode = Barcode;
		
	}
	//Name
	public String getName() {
		return Name;
		
	}
	public void setName(String Name){
		this.Name = Name;
		
	}
	//Color
	public String getColor() {
		return Color;
		
	}
	public void setColor(String Color){
		this.Color = Color;
		
	}
	//Description
	public String getDescription() {
		return Description;
		
	}
	public void setDescription(String Description) {
		this.Description = Description;
		
	}
	//
	public String getBarcode() {
		return Barcode;
		
	}
	public void setBarcode(String Barcode){
		this.Barcode = Barcode;
		
	}
	
}