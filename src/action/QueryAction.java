package action;

import java.util.Map;

import demo.BookDAO;

public class QueryAction
{
	private String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	private Map<String, Integer> result;
	
	public Map<String, Integer> getResult()
	{
		return result;
	}

	public void setResult(Map<String, Integer> result)
	{
		this.result = result;
	}

	public String execute() throws Exception
	{
		try
		{
			//û��struts2�Ļ�������ʹ�����д�����HttpServletRequest
			//HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
			//String name = request.getParameter("name");
			BookDAO book = new BookDAO();
			Map<String, Integer> books = book.getBooks(name);
			//��ˣ�������滻Ϊ
			//request.setAttribute("result", books);
			setResult(books);
			return "success";
		}
		catch(Exception e)
		{
			return "error";
		}
	}
}
