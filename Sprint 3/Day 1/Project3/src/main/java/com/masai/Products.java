package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Products {

	private Integer id;
	private String name;
	private Integer price;
	private String brand;
	private String category;
	private String registration_number;
	private Integer manufacturer_id;

	public Products() {
	}

	public Products(Integer id, String name, Integer price, String brand, String category, String registration_number,
			Integer manufacturer_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.registration_number = registration_number;
		this.manufacturer_id = manufacturer_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	public Integer getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(Integer manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
				+ category + ", registration_number=" + registration_number + ", manufacturer_id=" + manufacturer_id
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(id, other.id);
	}

	public List<Products> data() {
		List<Products> list = new ArrayList<>();
		list.add(new Products(11, "Tesla E3", 25175434, "Tesla", "Cars", "TA007", 102));
		list.add(new Products(17, "Tesla E2", 1145040, "Tesla", "Trucks", "TR010", 202));
		list.add(new Products(15, "MT 15", 145040, "Yamaha", "Bikes", "MT15", 515));
		list.add(new Products(26, "FZ-X", 125040, "Yamaha", "Bikes", "FZ26", 15));

		return list;
	}

}
