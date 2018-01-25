package demo;
import java.util.*;

public class BookDAO
{
	private static Map<String, Integer> books = new LinkedHashMap<String, Integer>();
	static
	{
		books.put("J2EE整合详解与典型案例", 79);
		books.put("jack", 89);
		books.put("bean", 69);
		books.put("lucy", 69);
		books.put("tom", 79);
		books.put("tim", 65);
		books.put("lu", 69);
		books.put("to", 79);
		books.put("ti", 65);
		books.put("lcy", 69);
		books.put("om", 79);
		books.put("im", 65);
		books.put("ucy", 69);
		books.put("t", 79);
		books.put("tq", 65);
		
	}
	public Map<String, Integer> getBooks(String name)
	{
		Map<String, Integer> books = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry: BookDAO.books.entrySet())
		{
			if(entry.getKey().toLowerCase().contains(name.toLowerCase()))
			{
				books.put(entry.getKey(), entry.getValue());
			}
		}
		return books;
	}
	public Map<String, Integer> getBook(String name)
	{
		Map<String, Integer> books = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry: BookDAO.books.entrySet())
		{
			if(entry.getKey().equals(name))
			{
				books.put(entry.getKey(), entry.getValue());
			}
		}
		return books;
	}
}
