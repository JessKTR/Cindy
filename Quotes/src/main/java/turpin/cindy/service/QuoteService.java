package turpin.cindy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import turpin.cindy.dao.DAOQuote;
import turpin.cindy.model.QuoteRequest;
import turpin.cindy.model.QuoteResponse;

/**
 * @author turpin
 */
@org.springframework.stereotype.Service
public class QuoteService implements Service< QuoteResponse, QuoteRequest >
{
	private final Logger logger = LoggerFactory.getLogger( getClass( ) );

	@Autowired
	private DAOQuote quoteDao;

	@Override
	public QuoteResponse listTotal( QuoteRequest request )
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuoteResponse findItem( QuoteRequest request )
	{
		// TODO Auto-generated method stub
		return null;
	}

}
