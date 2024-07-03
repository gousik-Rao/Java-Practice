package pack.Practice;

public class Library { // outer class
	private String libraryName;
	public Library(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryName() {
		return  libraryName;
	}
	
	// Inner class
	public class Book{
		String author,title;
	
		public Book(String author,String title) {
			this.author = author;
			this.title = title;
		}
		public void getBookDetails() {
			System.out.println( "Author: "+author +" \nTitle: "+ title+" \nLibrary Name: "+Library.this.getLibraryName());
		}
		
		public void setBookDetails(String author, String title) {
			this.author = author;
			this.title = title;
		}
	}
}
