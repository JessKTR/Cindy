package turpin.cindy.service;

import turpin.cindy.model.Request;
import turpin.cindy.model.Response;

public interface Service< T extends Response, Q extends Request >
{

	T listTotal( Q request );

	T findItem( Q request );

}
