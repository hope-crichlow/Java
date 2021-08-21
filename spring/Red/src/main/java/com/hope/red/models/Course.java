package com.hope.red.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="courses")
public class Course {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
// MEMBER VARIABLES
    
    @NotEmpty(message = "Course must have a name")
    private String name;
    
    @NotEmpty(message = "Instructor name must be present")
    private String instructor;
    
    @NotNull(message = "Don't forget to add a capacity")
    @Range(min = 1, message = "Capacity of students must be grater than 0")
    private Long capacity;
    
    // CREATED AND UPDATED AT
    @Column(updatable=false)
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private Date createdAt;
   
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    
// RELATIONSHIPS 
   @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
   private List<UserCourse> members;


   
// CONSTRUCTORS
    // EMPTY CONSTRUCTOR
    public Course() {
    	
    }
    // FULL CONSTRUCTOR
	public Course(String name, String instructor, Long capacity) {
		super();
		this.name = name;
		this.instructor = instructor;
		this.capacity = capacity;
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
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public Long getCapacity() {
		return capacity;
	}
	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}
	public List<UserCourse> getMembers() {
		return members;
	}
	public void setMembers(List<UserCourse> members) {
		this.members = members;
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

    
    
}
