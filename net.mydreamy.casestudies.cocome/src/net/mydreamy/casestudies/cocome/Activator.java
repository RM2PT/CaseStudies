package net.mydreamy.casestudies.cocome;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import services.CoCoMEProcessSale;
import services.impl.CoCoMEProcessSaleImpl;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		/* Instance Service */
		CoCoMEProcessSale cocomeservice = new CoCoMEProcessSaleImpl();
		
		/* XML to JAXB*/
		
		
		
		/* Register OSGI Services */ 
		bundleContext.registerService(cocomeservice.getClass().getName(), cocomeservice, null);
		
		
		System.out.println("starting");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		
		/* JAXB to XML */
		Activator.context = null;
		System.out.println("stop");
	}

}
