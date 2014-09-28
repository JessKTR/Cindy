package turpin.cindy.model;

import java.util.ArrayList;
import java.util.List;

public class Response
{
	List< Message > messages = new ArrayList< Message >( );

	ResponseStatus status = ResponseStatus.SUCCESS;

	public List< Message > getMessages( )
	{
		return messages;
	}

	public List< Message > getInfo( )
	{
		return getMessagesBySeverityLevel( SeverityLevel.INFO );
	}

	public List< Message > getWarnings( )
	{
		return getMessagesBySeverityLevel( SeverityLevel.WARN );
	}

	public List< Message > getErrors( )
	{
		return getMessagesBySeverityLevel( SeverityLevel.ERROR );
	}

	public List< Message > getMessagesBySeverityLevel( final SeverityLevel level )
	{
		final List< Message > errors = new ArrayList< Message >( );
		for ( final Message message : messages )
		{
			if( message.getSeverity( ) == level )
			{
				errors.add( message );
			}
		}
		return errors;
	}

	public ResponseStatus getStatus( )
	{
		return status;
	}

	public void setStatus( final ResponseStatus status )
	{
		this.status = status;
	}
}
