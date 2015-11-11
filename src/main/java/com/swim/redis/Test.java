package com.swim.redis;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class Test {

	public static void main(String[] args) {
	    Settings settings = ImmutableSettings.settingsBuilder().put("client.transport.sniff", true).put("cluster.name", "name of node").build();  
	    Client client = new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress("ip of server", 9300));  

	}

}
