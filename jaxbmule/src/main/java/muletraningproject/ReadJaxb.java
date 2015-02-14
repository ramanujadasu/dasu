package muletraningproject;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.jaxb.Shiporder;

public class ReadJaxb implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("onCall in ReadJaxb class.");
		Shiporder shiporder = (Shiporder)eventContext.getMessage().getPayload();
		eventContext.getMessage().setOutboundProperty("Name", shiporder.getOrderperson());
		return eventContext.getMessage();
	}

}
