package com.test;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BasicPocPortlet
 */

public class BasicPocPortlet extends MVCPortlet {
	private static Log logger = LogFactoryUtil.getLog(BasicPocPortlet.class);
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		logger.info("Mensaje de la vista para consola");
		super.doView(renderRequest, renderResponse);
	}
}
