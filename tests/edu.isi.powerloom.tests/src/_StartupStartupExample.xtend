package org.pl.stellaj

class _StartupStartupExample {
//	private static final _StartupStartup123 init = new _StartupStartup123()
	
	new() {
		Stellaj.getInstance().addInitializer(Stellaj.STAGES.BEGIN, 0, [ |
			println("sfsdf")
		] )
	}
	
}