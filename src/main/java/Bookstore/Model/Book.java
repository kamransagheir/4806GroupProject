package Bookstore.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Book {


    private String isbn;

    private String bookName;


	private String picture;
    private String description;
    private String author;
    private String publisher;

    @Id
    @GeneratedValue
    private Long id;

    // The Bookstore that the Book belongs to
    @ManyToOne
    private Bookstore store;

    @ManyToMany(mappedBy = "books")
    private List<Cart> carts;



    public Book() {

    }

    public Book(String bookName, String ISBN, String picture, String description, String author, String publisher) {
        this.bookName = bookName;
    	this.isbn = ISBN;
        this.picture = picture;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
     
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Bookstore getStore() {
        return store;
    }

    public void setStore(Bookstore store) {
        this.store = store;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public void addCarts(Cart cart){
        carts.add(cart);
    }

    public Long getId() {
        return id;
    }


}