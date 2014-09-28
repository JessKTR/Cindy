package turpin.cindy.model;

import org.springframework.stereotype.Component;

@Component
public class Category
{
	private String category;
	private Integer id;

	public Category( )
	{
	}

	public Category( String category )
	{
		super( );
		this.category = category;
	}

	public Integer getId( )
	{
		return id;
	}

	public void setId( Integer id )
	{
		this.id = id;
	}

	public String getCategory( )
	{
		return category;
	}

	public void setCategory( String category )
	{
		this.category = category;
	}
}
