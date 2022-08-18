package org.merveozer.oopjhomework.week8.Q2;

public enum BookType {
		Fiction,
		Non_fiction,
		Historical,
		Science,
		Journal;
	
		
		private static String description;

		public static String getDescription() {
			return description;
		}

		public static void setDescription(String description) {
			BookType.description = description;
		}
		
		public static void main(String[] args) {
			BookType.description = " ";
		}
}
