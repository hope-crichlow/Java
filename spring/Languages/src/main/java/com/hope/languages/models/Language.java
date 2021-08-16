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
import javax.validation.constraints.NotEmpty;
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
    @NotEmpty()
    @Size(min=3, max=20)
    private String name;
    
    	// Required, between 3 and 20 characters
    @NotEmpty()
    @Size(min=3, max=20)
    private String creator;
    
    	// Required
    @NotEmpty()
    private String version; 
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
    
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
