package com.epam3.Design_Patterns;

public class NameCollection {
  public String[] names= {"Anna","Bella","Jeff","Besos","Pit"};
  public Iterator getIterator()
  {
	  return new NameIterator();
  }
  private class NameIterator implements Iterator
  {
	  int index;
	  public boolean hasNext() {
		  if(index<names.length) return true;
		  return false;
	  }
	  public Object next()
	  {
		  if(this.hasNext()) return names[index++];
		  return null;
	  }
  }
}
