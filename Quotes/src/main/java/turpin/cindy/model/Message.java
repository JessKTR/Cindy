package turpin.cindy.model;

public class Message
{
	private String code;

	private SeverityLevel severity;

	private String friendlyMessage;

	private String path;

	private String detailMessage;

	public String getCode( )
	{
		return code;
	}

	public void setCode( String code )
	{
		this.code = code;
	}

	public SeverityLevel getSeverity( )
	{
		return severity;
	}

	public void setSeverity( SeverityLevel severity )
	{
		this.severity = severity;
	}

	public String getFriendlyMessage( )
	{
		return friendlyMessage;
	}

	public void setFriendlyMessage( String friendlyMessage )
	{
		this.friendlyMessage = friendlyMessage;
	}

	public String getPath( )
	{
		return path;
	}

	public void setPath( String path )
	{
		this.path = path;
	}

	public String getDetailMessage( )
	{
		return detailMessage;
	}

	public void setDetailMessage( String detailMessage )
	{
		this.detailMessage = detailMessage;
	}

}
