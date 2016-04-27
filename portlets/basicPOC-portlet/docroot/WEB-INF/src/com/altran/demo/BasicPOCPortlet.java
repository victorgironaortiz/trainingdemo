package com.altran.demo;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BasicPOCPortlet
 */
public class BasicPOCPortlet extends MVCPortlet {
 
	Log logger = LogFactoryUtil.getLog(BasicPOCPortlet.class);
	
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		logger.info("Portlet initial log message");
		super.doView(renderRequest, renderResponse);
	}
}
