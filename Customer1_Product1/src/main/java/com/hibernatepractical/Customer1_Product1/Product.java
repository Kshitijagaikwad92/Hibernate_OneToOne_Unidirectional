package com.hibernatepractical.Customer1_Product1;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
//	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Table(name="Product")
	@Entity(name="Product_details") //naming the entity class

public class Product {

		@Id// it will create as primary key
		@Column(name="Product_ID")
		private int pid;
		@Column(name="Product_Name")
		private String pname;
		@Column(name="Product_Color")
		private String pcolor;
		@Column(name="Product_Price")
		private int pprice;
		
		//constructor of Product
		public Product(int pid, String pname, String pcolor, int pprice) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pcolor = pcolor;
			this.pprice = pprice;
		}

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getPcolor() {
			return pcolor;
		}

		public void setPcolor(String pcolor) {
			this.pcolor = pcolor;
		}

		public int getPprice() {
			return pprice;
		}

		public void setPprice(int pprice) {
			this.pprice = pprice;
		}	
}	
	