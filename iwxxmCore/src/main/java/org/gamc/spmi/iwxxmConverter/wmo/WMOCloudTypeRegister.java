/**
 * Copyright (C) 2018 Dmitry Moryakov, Main aeronautical meteorological center, Moscow, Russia
 * moryakovdv[at]gmail[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gamc.spmi.iwxxmConverter.wmo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.TreeMap;

import javax.imageio.stream.FileImageInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**Class for parsing WMO Cloud codes
 * @see WMORegister
 * 
 * @author moryakov*/
public class WMOCloudTypeRegister implements WMORegister<Integer> {

	private static final String registerFileName = "codes.wmo.int-49-2-SigConvectiveCloudType.rdf";
	
	TreeMap<Integer, WMORegisterDescription> wmoCloudTypeCodes = new TreeMap<Integer, WMORegisterDescription>();
	public static final int missingCode = 63; 
	
	
	@Override
	public TreeMap<Integer, WMORegisterDescription> getContent() {
		
		return wmoCloudTypeCodes;
	}

	public WMOCloudTypeRegister() {
		
	}
	
	private Locale locale = Locale.US;
	public WMOCloudTypeRegister(Locale locale) {
		this.locale = locale;
	}
	
	
	@Override
	public Locale getLocale() {
		return locale;
	}
	
	
	/**Returns integer code for string cloud type representation,*/
	public Integer getCloudTypeByStringCode(String strType) {
		
		switch(strType) {
			case "CB":
				return 9;
			case "TCU":
				return 32;
			default:
				return missingCode;
		}
		
		 
	}

	@Override
	public String getRegisterFileName() {

		return registerFileName;
	}

	@Override
	public void putToContent(String wmoCode, WMORegisterDescription description) {
		this.wmoCloudTypeCodes.put(Integer.valueOf(wmoCode), description);
	}
	

}
