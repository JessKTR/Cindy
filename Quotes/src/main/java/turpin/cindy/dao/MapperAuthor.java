package turpin.cindy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import turpin.cindy.model.Author;

public class MapperAuthor implements RowMapper< Author >
{

	@Override
	public Author mapRow( final ResultSet rs , final int rowNum ) throws SQLException
	{
		final Author line = new Author( );

		line.setFirstName( rs.getString( "FIRST_NAME" ) );
		line.setLastName( rs.getString( "LAST_NAME" ) );
		line.setId( rs.getInt( "AUTHOR_ID" ) );

		return line;
	}

}
