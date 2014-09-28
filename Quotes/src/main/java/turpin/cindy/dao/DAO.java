package turpin.cindy.dao;

import java.io.Serializable;

/*
 * pulled several ideas from this article:
 * http://www.codeproject.com/Articles/251166/The-Generic-DAO-pattern-in-Java-with-Spring-and and
 * this one: http://www.ibm.com/developerworks/library/j-genericdao/
 */
public interface DAO< T, PK extends Serializable >
{

	PK create( T t );

	T read( PK id );

	/** Save changes made to a persistent object. */
	void update( T t );

	/** Remove an object from persistent storage in the database */
	void delete( PK id );

}
