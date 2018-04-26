package by.tc.task01.entity.appliance;

public class TextBook extends Appliance {
	
	private String title;
	private String subject;
	private String author;
	private int numberOfPages;
	
	public TextBook(){
		
	}
	
	public TextBook( String title,String subject,String author,int numberOfPages){
		this.title = title;
		this.subject = subject;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public String toString(){
		return "TextBook{" 
				+ "title=" + this.title +
		" ,subject=" + this.subject + 
		", author=" + this.author +
		", numberOfPages" + this.numberOfPages + "}";
	}

}
