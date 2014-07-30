/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.location;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link locationBinding} class defines common constants, which are 
 * used across the whole binding.
 * 
 * @author Patrick Gottschaemmer - Initial contribution
 */
public class LocationBindingConstants {

    public static final String BINDING_ID = "location";
    
    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_MODEL = new ThingTypeUID(BINDING_ID, "model");
    public final static ThingTypeUID THING_TYPE_USER = new ThingTypeUID(BINDING_ID, "user");

    // List of all Channel ids
    public final static String CHANNEL_LOCATABLE = "locatable";
    public final static String CHANNEL_STATE = "state";

}
