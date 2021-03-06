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

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class for parsing WMO precipitation codes
 * 
 * @see WMORegister
 * 
 * @author moryakov
 */
public class WMOPrecipitationRegister implements WMORegister<String> {

	private static final String registerFileName = "codes.wmo.int-49-2-AerodromePresentOrForecastWeather.rdf";

	ConcurrentHashMap<String, WMORegisterDescription> wmoPrecipitationCodes = new ConcurrentHashMap<String, WMORegisterDescription>();

	public WMOPrecipitationRegister() {

	}

	private Locale locale = Locale.US;

	public WMOPrecipitationRegister(Locale locale) {
		this.locale = locale;
	}

	@Override
	public Locale getLocale() {
		return locale;
	}

	@Override
	public ConcurrentHashMap<String, WMORegisterDescription> getContent() {

		return this.wmoPrecipitationCodes;
	}

	@Override
	public String getRegisterFileName() {

		return registerFileName;
	}

}
