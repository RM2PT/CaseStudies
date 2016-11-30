package net.mydreamy.casestudies.library;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import services.LibraryManagementSystem;
import services.impl.LibraryManagementSystemImpl;

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
		LibraryManagementSystem libraryservice = new LibraryManagementSystemImpl();
		/* XML to JAXB*/
		
		
		
		/* Register OSGI Services */ 
		bundleContext.registerService(libraryservice.getClass().getName(), libraryservice, null);
		
		
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
