package ch06_class.sec05_chart;

public class Inter {

	public int rank;
	public String title;
	public String author;
	public String translater;
	public String company;
	public int price;
	
	public Inter() {}

	public Inter(int rank, String title, String author, String translater, String company, int price) {
		super();
		this.rank = rank;
		this.title = title;
		this.author = author;
		this.translater = translater;
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Inter [rank=" + rank + ", title=" + title + ", author=" + author + ", translater=" + translater
				+ ", company=" + company + ", price=" + price + "]";
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslater() {
		return translater;
	}

	public void setTranslater(String translater) {
		this.translater = translater;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
