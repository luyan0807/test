package edu.bms.entity;

public class BookBarcode {
        private Integer id;//自增
        private String isbn;//图书国际编码
        private String barcode;//借阅编码
        private boolean state;//图书状态：借阅或者在馆  0借阅false   1在馆true
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getBarcode() {
			return barcode;
		}
		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
		public void setState(boolean state) {
			this.state = state;
		}
		public boolean isState() {
			return state;
		}
        
}
