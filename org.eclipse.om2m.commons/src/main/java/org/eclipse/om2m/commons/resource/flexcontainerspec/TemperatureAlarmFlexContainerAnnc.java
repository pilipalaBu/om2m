/*
********************************************************************************
 * Copyright (c) 2014, 2017 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ********************************************************************************

ModuleClass : TemperatureAlarmAnnc

This ModuleClass provides the capabilities to indicates the  detection of abnormal temperatures and raies an alarm if the  triggering criterion is met.

Created: 2018-06-11 12:14:18
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = TemperatureAlarmFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TemperatureAlarmFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class TemperatureAlarmFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "temperatureAlarmAnnc";
	public static final String SHORT_NAME = "temAmAnnc";
	
	public TemperatureAlarmFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + TemperatureAlarmFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
	public void finalizeDeserialization() {
	}
	
}