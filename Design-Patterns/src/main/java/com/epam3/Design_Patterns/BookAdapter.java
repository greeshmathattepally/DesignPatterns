package com.epam3.Design_Patterns;

public class BookAdapter implements NoteBook{
  Book book;
  public BookAdapter(Book b) {
	  book=b;
  }
  public void write()
  {
	  book.writeAtParts();
  }
}
