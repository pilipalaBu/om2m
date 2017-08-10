/*
ModuleClass : BrightnessAnnc



This ModuleClass describes the brightness of a light, e.g. from  a lamp. Brightness is scaled as a percentage. A lamp or a monitor  can be adjusted to a level of light between very dim (0% is the  minimum brightness) and very bright (100% is the maximum  brightness).

Created: 2017-08-09 15:38:05
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = BrightnessFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = BrightnessFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class BrightnessFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "brightnessAnnc";
	public static final String SHORT_NAME = "brigsAnnc";
	
	public BrightnessFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + BrightnessFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}