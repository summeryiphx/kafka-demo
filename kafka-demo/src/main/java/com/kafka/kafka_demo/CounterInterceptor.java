package com.kafka.kafka_demo;

import java.util.Map;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class CounterInterceptor implements ProducerInterceptor<String,String>{
	
	int success;
	int fail;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void configure(Map<String, ?> configs) {
		// TODO Auto-generated method stub
		
	}

	public ProducerRecord<String, String> onSend(ProducerRecord<String, String> record) {
		// TODO Auto-generated method stub
		return record;
	}

	public void onAcknowledgement(RecordMetadata metadata, Exception exception) {
		if (metadata != null) {
			success++;
		}else {
			fail++;
		}
		
	}

	public void close() {
		System.out.println("success:"+success);
		System.out.println("fail:"+fail);
	}

}
