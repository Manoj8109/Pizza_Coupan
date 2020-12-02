package com.onlinepizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="admin_table")
	public class Admin {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer adminId;
		@Column
	    //@OnetoOne
		private String adminType;
		 @Column
	     /*@OnetoOne
	 	@joinColumn(name="password")*/
		private String password;
		 
		 /**
		  * Default Constructor
		  */
		public Admin() {
			
		}
		
		/**
		 * Parameterized  Constructor
		 * @param adminId
		 * @param adminType
		 * @param password
		 */
	public Admin(Integer adminId , String adminType, String password) {
		super();
		this.adminId=adminId;
		this.adminType=adminType;
		this.password=password;
		
	}
	/**
	 * 
	 * Getters and Setters
	 */
		public int getAdminId() {
			return adminId;
		}

		public void setAdminId(Integer adminId) {
			this.adminId = adminId;
		}

		public String getAdminType() {
			return adminType;
		}

		public void setAdminType(String adminType) {
			this.adminType = adminType;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		/**
		 * toString method
		 */
	@Override
		public String toString() {
			return "admin [adminId=" + adminId + ", adminType=" + adminType + ", password=" + password + "]";
		}

}
