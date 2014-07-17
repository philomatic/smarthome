/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.location.knx.internal;

import static org.eclipse.smarthome.binding.location.knx.LocationKNXBindingConstants.THING_TYPE_KNX_LOCATION_PROVIDER;

import java.util.Collection;

import org.eclipse.smarthome.binding.location.knx.handler.LocationKNXProviderHandler;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

import com.google.common.collect.Lists;

/**
 * The {@link LocationKNXProviderHandlerFactory} is responsible for creating things and thing 
 * handlers.
 * 
 * @author Patrick Gottschaemmer - Initial contribution
 */
public class LocationKNXProviderHandlerFactory extends BaseThingHandlerFactory {
    
    private final static Collection<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Lists.newArrayList(THING_TYPE_KNX_LOCATION_PROVIDER);
    
    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {

        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(THING_TYPE_KNX_LOCATION_PROVIDER)) {
            return new LocationKNXProviderHandler(thing);
        }

        return null;
    }
}
