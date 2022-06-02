package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 상품 정보 클래스(Entity Class)
 * 
 * 변수
 * productCode int
 * productName String
 * category int
 * productionDate LocalDate
 * 
 * 기본 생성자
 * 
 * 전체 생성자
 * 
 * getter, setter
 * 
 * hashCode()
 * 
 * equals()
 * 
 * toString()
 */

public class Product {
		private int productCode;
		private String productName;
		private int category;
		private LocalDate productionDate;
		
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public Product(int productCode, String productName, int category, LocalDate productionDate) {
			super();
			this.productCode = productCode;
			this.productName = productName;
			this.category = category;
			this.productionDate = productionDate;
		}

		public int getProductCode() {
			return productCode;
		}

		public void setProductCode(int productCode) {
			this.productCode = productCode;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public int getCategory() {
			return category;
		}

		public void setCategory(int category) {
			this.category = category;
		}

		public LocalDate getProductionDate() {
			return productionDate;
		}

		public void setProductionDate(LocalDate productionDate) {
			this.productionDate = productionDate;
		}

		@Override
		public int hashCode() {
			return Objects.hash(category, productCode, productName, productionDate);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return category == other.category && productCode == other.productCode
					&& Objects.equals(productName, other.productName)
					&& Objects.equals(productionDate, other.productionDate);
		}

		@Override
		public String toString() {
			return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
					+ ", productionDate=" + productionDate + "]";
		}
			
		
		
}

