package org.eclipse.smarthome.core.location.internal;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocationBundleActivator implements BundleActivator {
	
	private Logger logger = LoggerFactory.getLogger(LocationBundleActivator.class);

	@Override
	public void start(BundleContext context) throws Exception {
		logger.debug("Starting Location Bundle");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
