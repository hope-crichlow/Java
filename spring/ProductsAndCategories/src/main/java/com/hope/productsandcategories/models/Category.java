package com.hope.productsandcategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="categories")
public class Category {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
// MEMBER VARIABLES
	    private String name;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
// RELATIONSHIPS
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "categories_products", // name of middle table
	        joinColumns = @JoinColumn(name = "category_id"), // foreign key name of the table(model) you're currently in
	        inverseJoinColumns = @JoinColumn(name = "product_id") // foreign key name of the opposite table(model)
	    )  
// LIST OF PRODUCTS IN CATEGORY 
	    private List<Product> products; // Attribute that relationship is attached to

// CONSTRUCTORS
	    // EMPTY CONSTRUCTOR
	    public Category() {
	        
	    }
	    
	    public Category(String name) {
			super();
			this.name = name;
		}
	    
// GETTERS AND SETTERS
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		// OTHER METHODS
	 	// Updates createdAt
	 	 @PrePersist
	 	 protected void onCreate(){
	 	     this.createdAt = new Date();
	 	 }
	 	 
	 	 // Updates UpdatedAt
	 	 @PreUpdate
	 	 protected void onUpdate(){
	 	     this.updatedAt = new Date();
	 	 }
}
