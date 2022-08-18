package org.merveozer.oopjhomework.week8.Q2;

public class TestRead {

	public static void main(String[] args) {
		
		Author author1 = new Author();
		author1.name = "Ya�ar Kemal";
		
		Book book1 = new Book();
		book1.title = "�nce Mehmet";
		book1.author = author1;
		book1.page = 380;
		book1.isHardCover = true;
		book1.currentPage = 153;
		book1.bookType = BookType.Fiction;
		
		Reader reader = new Reader();
		reader.name = "Alp Can";
		reader.age = 24;
		reader.book = book1;
		reader.sex = 'E';
		
		reader.read(book1, reader);
		reader.sleep(book1, reader);
		reader.getReaderInfo(reader);
		
		System.out.println("******");
		System.out.println(reader.getName());
	}

}
