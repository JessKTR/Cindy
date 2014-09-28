package turpin.cindy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import turpin.cindy.model.Author;
import turpin.cindy.model.Quote;

public class MapperQuote implements RowMapper< Quote >
{

	@Override
	public Quote mapRow( final ResultSet rs , final int rowNum ) throws SQLException
	{
		final Quote line = new Quote( );

		line.setQuote( rs.getString( "TEXT" ) );
		line.setId( rs.getInt( "QUOTE_ID" ) );
		line.setAuthor( new Author( rs.getString( "FIRST_NAME" ), rs.getString( "LAST_NAME" ), rs.getInt( "AUTHOR_ID" ) ) );

		return line;
	}
}
