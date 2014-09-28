package turpin.cindy.model;

/**
 * An enumeration of the status types indicating the overall success of a service request.
 * <p>
 * 
 * @see #ERROR
 * @see #SUCCESS
 * @see #VALIDATION_FAILED
 * @see #getFriendlyName()
 */
public enum ResponseStatus
{
	/**
	 * Indicates a service request was successful.
	 */
	SUCCESS ( "Success" ),
	/**
	 * Indicates a service failed validation, either before the request was attempted or during
	 * processing of the response.
	 */
	VALIDATION_FAILED ( "Validation Failed" ),
	/**
	 * Indicates a service request failed.
	 */
	ERROR ( "Error" );

	private String friendlyName;

	private ResponseStatus( final String friendlyName )
	{
		this.friendlyName = friendlyName;
	}

	/**
	 * @return - the friendly display name for this {@linkplain ResponseStatus}
	 */
	public String getFriendlyName( )
	{
		return friendlyName;
	}

}
