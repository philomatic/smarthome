package org.eclipse.smarthome.core.location.internal;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class LocationBundleActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
