package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf13_enum_Java_Apisi_ve_Siniflar.Q1;

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
