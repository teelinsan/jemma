/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
package org.energy_home.jemma.javagal.layers.object;

import org.energy_home.jemma.zgd.GatewayEventListener;


/**
 * @author "Ing. Marco Nieddu <marco.nieddu@consoft.it> or <marco.niedducv@gmail.com> from Consoft Sistemi S.P.A.<http://www.consoft.it>, financed by EIT ICT Labs activity SecSES - Secure Energy Systems (activity id 13030)"
 *
 * @param <T>
 */
public class GatewayDeviceEventEntry<T extends GatewayEventListener> {
	long proxyIdentifier;
	private T GatewayEventListener;
	private int discoveryMask;
	private int freshnessMask;
	public T   getGatewayEventListener() {
		return GatewayEventListener;
	}

	public void setGatewayEventListener(
			T  gatewayEventListener) {
		GatewayEventListener = gatewayEventListener;
	}
	
	public long getProxyIdentifier() {
		return proxyIdentifier;
	}

	public void setProxyIdentifier(long proxyIdentifier) {
		this.proxyIdentifier = proxyIdentifier;
	}


	public int getDiscoveryMask() {
		return discoveryMask;
	}


	public void setDiscoveryMask(int discoveryMask) {
		this.discoveryMask = discoveryMask;
	}


	public int getFreshnessMask() {
		return freshnessMask;
	}


	public void setFreshnessMask(int freshnessMask) {
		this.freshnessMask = freshnessMask;
	}
}
