package your.app;

import er.extensions.ERXFrameworkPrincipal;

public class mavenOldSchoolFramework extends ERXFrameworkPrincipal {
	protected static mavenOldSchoolFramework sharedInstance;
	@SuppressWarnings("unchecked")
	public final static Class<? extends ERXFrameworkPrincipal> REQUIRES[] = new Class[] {};

	static {
		setUpFrameworkPrincipalClass(mavenOldSchoolFramework.class);
	}

	public static mavenOldSchoolFramework sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = sharedInstance(mavenOldSchoolFramework.class);
		}
		return sharedInstance;
	}

	@Override
	public void finishInitialization() {
		log.debug("mavenOldSchoolFramework loaded");
	}
}
