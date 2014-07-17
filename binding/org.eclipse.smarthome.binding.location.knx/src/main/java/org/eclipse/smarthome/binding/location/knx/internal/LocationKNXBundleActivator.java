package org.eclipse.smarthome.binding.location.knx.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LocationKNXBundleActivator implements BundleActivator {

	private Logger logger = LoggerFactory.getLogger(LocationKNXBundleActivator.class);
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.debug("Starting Location KNX Binding");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		logger.debug("Stopping Location KNX Binding");
		
	}

}
