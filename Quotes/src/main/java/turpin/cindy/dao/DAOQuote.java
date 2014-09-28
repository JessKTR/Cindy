package turpin.cindy.dao;

import java.util.Properties;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import turpin.cindy.model.Quote;

/**
 * @author turpin
 */
@Repository
public class DAOQuote implements DAO< Quote, Integer >
{

	private final Logger logger = LoggerFactory.getLogger( getClass( ) );

	@Autowired
	public MapperQuote quoteMapper;

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplateObject;

	@Resource ( name = "quote-sql" )
	private Properties quoteSql;

	@Override
	public Integer create( Quote quote )
	{
		final MapSqlParameterSource paramMap = mapCheckParams( quote );
		final String query = quoteSql.getProperty( "quote.add" );

		final String [] primaryKeyNames =
			{ "QUOTE_ID" };
		final KeyHolder keyHolder = new GeneratedKeyHolder( );
		Integer insertedId = -1;

		try
		{
			logger.debug( "jdbcTemplateObject = {} quoteSql = {}", jdbcTemplateObject, quoteSql );
			jdbcTemplateObject.update( query, paramMap, keyHolder, primaryKeyNames );
			insertedId = keyHolder.getKey( ).intValue( );
			logger.debug( "New quote row inserted: {}, insertedId = {}", quote, insertedId );
		}
		catch ( final DuplicateKeyException e )
		{
			logger.error( "Duplicate Key" );
		}
		return insertedId;
	}

	private MapSqlParameterSource mapCheckParams( Quote quote )
	{
		final MapSqlParameterSource paramMap = new MapSqlParameterSource( );
		logger.debug( "quote = {}", quote );

		paramMap.addValue( "authorId", quote.getAuthor( ) );

		paramMap.addValue( "quote", quote.getQuote( ) );

		logger.debug( "paramMap = {}", paramMap.getValues( ) );
		return paramMap;
	}

	@Override
	public Quote read( Integer id )
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update( Quote quote )
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete( Integer id )
	{
		// TODO Auto-generated method stub

	}

}
