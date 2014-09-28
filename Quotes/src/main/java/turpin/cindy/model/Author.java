package turpin.cindy.model;

import org.springframework.stereotype.Component;

@Component
public class Author
{
	private String firstName;
	private String lastName;
	private Integer id;

	public Author( )
	{
	}

	public Author( String firstName , String lastName , Integer id )
	{
		super( );
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public Integer getId( )
	{
		return id;
	}

	public void setId( Integer id )
	{
		this.id = id;
	}

	public String getFirstName( )
	{
		return firstName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getLastName( )
	{
		return lastName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

}
