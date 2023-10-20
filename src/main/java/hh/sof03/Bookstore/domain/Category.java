package hh.sof03.Bookstore.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long categoryid;
	
	private String categoryname;
	
	
	public Category(String categoryname) {
		super();
		this.categoryname = categoryname;
	}
	
	

	public Category() {
		super();
	}



	public long getCategoryid() {
		return categoryid;
	}



	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}



	public String getCategoryname() {
		return categoryname;
	}



	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
}
