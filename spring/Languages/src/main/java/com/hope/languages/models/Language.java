package com.hope.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "languages")
public class Language {

	// MEMBER VARIALBES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    	// Required, between 3 and 20 characters
    @NotNull()
    @Size(min=3, max=20)
    private String name;
    
    	// Required, between 3 and 20 characters
    @NotNull()
    @Size(min=3, max=20)
    private String creator;
    
    	// Required
    @NotNull()
    private String version; 
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
    
    // CONSTRUCTORS
    	
    	// EMPTY CONSTRUCTOR
    public Language() {
    	
    }
    
    	// FULL CONSTRUCTOR
	public Language(String name, String creator, String version) {
		super();
		this.name = name;
		this.creator = creator;
		this.version = version;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
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
