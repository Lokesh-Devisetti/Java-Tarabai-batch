package com.bitlabs.Entity;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;

	public class Employee1 {

		@Autowired
		@Qualifier("address1")
		private Address1 address;

		public Employee1() {
			super();
			// TODO Auto-generated constructor stub
			
		}

		
		public Employee1(Address1 address) {
			super();
			this.address = address;
			System.out.println("This is constructor injection");
		}

		public Address1 getAddress() {
			return address;
		}

		
		public void setAddress1(Address1 address) {
			this.address = address;
			System.out.println("This is setter injection");
		}

		@Override
		public String toString() {
			return "Employee [address=" + address + "]";
		}
		
		
	}


