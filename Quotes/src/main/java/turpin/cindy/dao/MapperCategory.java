package turpin.cindy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import turpin.cindy.model.Category;

public class MapperCategory implements RowMapper< Category >
{

	@Override
	public Category mapRow( final ResultSet rs , final int rowNum ) throws SQLException
	{
		final Category line = new Category( );

		line.setCategory( rs.getString( "CATEGORY" ) );
		line.setId( rs.getInt( "CATEGORY_ID" ) );
		return line;
	}

}
