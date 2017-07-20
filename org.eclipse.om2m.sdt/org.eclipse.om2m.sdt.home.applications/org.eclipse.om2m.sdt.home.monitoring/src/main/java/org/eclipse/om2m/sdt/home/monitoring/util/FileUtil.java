package org.eclipse.om2m.sdt.home.monitoring.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.om2m.sdt.home.monitoring.servlet.HomeServlet;
import org.osgi.framework.BundleContext;


public class FileUtil {

	private static Log LOGGER = LogFactory.getLog(HomeServlet.class);

	public static String getFileAsString(final String path,BundleContext context) {
		String res = "";
		if (context != null) {				
			URL url = context.getBundle().getResource(path);
			LOGGER.info("url ="+url);
			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
				while (br.ready()) {
					res += br.readLine();
				}
			} catch (Exception e) {		
				e.printStackTrace();
			} finally {
				try { br.close(); } 
				catch (Exception ignored) {}
			}
		}
		return res;
	}

}