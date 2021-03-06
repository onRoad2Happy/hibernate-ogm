/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

package org.hibernate.ogm.datastore.infinispan.test.storedprocedures;

import org.hibernate.ogm.backendtck.storedprocedures.NamedParametersStoredProcedureCallTest;
import org.infinispan.util.function.SerializableCallable;

/**
 * Throws a {@link RuntimeException} when the method {@link ExceptionalProcedure#call()} is used.
 *
 * @see NamedParametersStoredProcedureCallTest
 *
 * @author The Viet Nguyen &amp;ntviet18@gmail.com&amp;
 */
public class ExceptionalProcedure implements SerializableCallable<Integer> {

	private Integer param;

	public void setParam(Integer param) {
		this.param = param;
	}

	@Override
	public Integer call() throws Exception {
		throw new RuntimeException( "Failure! This is supposed to happen for tests, don't worry" );
	}
}
