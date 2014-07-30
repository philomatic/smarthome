/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.location.network;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link location_networkBinding} class defines common constants, which are 
 * used across the whole binding.
 * 
 * @author Patrick Gottschaemmer - Initial contribution
 */
public class LocationNetworkBindingConstants {

    public static final String BINDING_ID = "location_network";
    
    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_SMARTPHONE = new ThingTypeUID(BINDING_ID, "smartphone");

    // List of all Channel ids
    public final static String CHANNEL_PING = "ping";

}
