package com.program.action;

import org.jboss.soa.esb.actions.AbstractActionLifecycle;
import org.jboss.soa.esb.client.ServiceInvoker;
import org.jboss.soa.esb.couriers.FaultMessageException;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.listeners.message.MessageDeliverException;
import org.jboss.soa.esb.message.Message;
import org.jboss.soa.esb.services.registry.RegistryException;

public class ESBExampleAction extends AbstractActionLifecycle {
	ConfigTree configTree;

	public ESBExampleAction(ConfigTree configTree) {
		this.configTree = configTree;
	}

	public Message process(Message message) throws MessageDeliverException,
			FaultMessageException, RegistryException {

		message.getProperties().setProperty("name", "sandy");
		System.out
				.println("$$$!!!!!!!!!!!!!!!!!!!!!!!!$$$$$$$$ IN ESB Example Action class For serice 1 $$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		ServiceInvoker invoker = new ServiceInvoker("test", "testService2");
		invoker.deliverAsync(message);
		return message;
	}

	public Message secondService(Message message) {

		System.out
				.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$ IN ESB Example Action class For serice 2 $$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&& "
				+ message.getProperties().getProperty("name")
				+ " &&&&&&&&&&&&&&&&&&&&&&&&&&&");
		return message;
	}

}
