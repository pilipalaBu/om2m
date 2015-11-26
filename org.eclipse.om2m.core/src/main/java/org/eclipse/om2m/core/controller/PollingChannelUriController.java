/*******************************************************************************
 * Copyright (c) 2013-2015 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thierry Monteil (Project co-founder) - Management and initial specification,
 *         conception and documentation.
 *     Mahdi Ben Alaya (Project co-founder) - Management and initial specification,
 *         conception, implementation, test and documentation.
 *     Khalil Drira - Management and initial specification.
 *     Guillaume Garzone - Initial specification, conception, implementation, test
 *         and documentation.
 *     François Aïssaoui - Initial specification, conception, implementation, test
 *         and documentation.
 *******************************************************************************/
package org.eclipse.om2m.core.controller;

import org.eclipse.om2m.commons.constants.ResponseStatusCode;
import org.eclipse.om2m.commons.resource.RequestPrimitive;
import org.eclipse.om2m.commons.resource.ResponsePrimitive;

/**
 * Controller for polling channel uri
 *
 */
public class PollingChannelUriController extends Controller {

	@Override
	public ResponsePrimitive doCreate(RequestPrimitive request) {
		ResponsePrimitive response = new ResponsePrimitive(request);
		response.setResponseStatusCode(ResponseStatusCode.OPERATION_NOT_ALLOWED);
		return response;
	}

	@Override
	public ResponsePrimitive doRetrieve(RequestPrimitive request) {
		ResponsePrimitive response = new ResponsePrimitive(request);
		response.setResponseStatusCode(ResponseStatusCode.NOT_IMPLEMENTED);
		return response;
	}

	@Override
	public ResponsePrimitive doUpdate(RequestPrimitive request) {
		ResponsePrimitive response = new ResponsePrimitive(request);
		response.setResponseStatusCode(ResponseStatusCode.OPERATION_NOT_ALLOWED);
		return response;
	}

	@Override
	public ResponsePrimitive doDelete(RequestPrimitive request) {
		ResponsePrimitive response = new ResponsePrimitive(request);
		response.setResponseStatusCode(ResponseStatusCode.OPERATION_NOT_ALLOWED);
		return response;
	}

}
