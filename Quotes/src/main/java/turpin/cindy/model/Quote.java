package turpin.cindy.model;

import org.springframework.stereotype.Component;

@Component
public class Quote
{
	private Integer id;
	private String text;
	private Author author;

	public Quote( )
	{
	}

	public Quote( String quote , Author author )
	{
		super( );
		text = quote;
		this.author = author;
	}

	public Integer getId( )
	{
		return id;
	}

	public void setId( Integer id )
	{
		this.id = id;
	}

	public String getQuote( )
	{
		return text;
	}

	public void setQuote( String quote )
	{
		text = quote;
	}

	public Author getAuthor( )
	{
		return author;
	}

	public void setAuthor( Author author )
	{
		this.author = author;
	}

}
