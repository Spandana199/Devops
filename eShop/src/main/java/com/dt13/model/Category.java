package com.dt13.model;
	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


	public class Category {
		@Id
		Category CategoryId;
		@Column
		Category CategoryName;
		@Column
		Category CategoryDescription;
		public Category getCategoryId() {
			return CategoryId;
		}
		public void setCategoryId(Category categoryId) {
			CategoryId = categoryId;
		}
		public Category getCategoryName() {
			return CategoryName;
		}
		public void setCategoryName(Category categoryName) {
			CategoryName = categoryName;
		}
		public Category getCategoryDescription() {
			return CategoryDescription;
		}
		public void setCategoryDescription(Category categoryDescription) {
			CategoryDescription = categoryDescription;
		}
	}



