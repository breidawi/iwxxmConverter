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

import com.helger.commons.id.factory.FileIntIDFactory;

/**Class for parsing WMO deposit codes (0-20-086)
 * @see WMORegister
 * 
 * @author moryakov*/
public class WMORunWayDepositsRegister implements WMORegister<Integer>{

	private static final String registerFileName = "codes.wmo.int-bufr4-codeflag-0-20-086.rdf";
	
	TreeMap<Integer, WMORegisterDescription> wmoDepositsCodes = new TreeMap<Integer, WMORegisterDescription>();
	
	public WMORunWayDepositsRegister() {

	}

	private Locale locale = Locale.US;

	public WMORunWayDepositsRegister(Locale locale) {
		this.locale = locale;
	}

	@Override
	public Locale getLocale() {
		return locale;
	}
	
	@Override
	public TreeMap<Integer, WMORegisterDescription> getContent() {
		// TODO Auto-generated method stub
		return wmoDepositsCodes;
	}

	@Override
	public void putToContent(String wmoCode, WMORegisterDescription description) {
		this.wmoDepositsCodes.put(Integer.valueOf(wmoCode), description);
	}
	
	
	@Override
	public String getRegisterFileName() {

		return registerFileName;
	}

}
