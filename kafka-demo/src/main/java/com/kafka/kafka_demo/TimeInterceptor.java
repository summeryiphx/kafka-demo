package com.kafka.kafka_demo;

import java.util.Map;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class TimeInterceptor implements ProducerInterceptor<String, String>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void configure(Map<String, ?> configs) {
		// TODO Auto-generated method stub
		
	}

	public ProducerRecord<String, String> onSend(ProducerRecord<String, String> record) {
		
		//创建一个ProducerRecord对象,并返回
		ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>(record.topic(), record.partition(), 
				record.key(), System.currentTimeMillis()+"--"+record.value());
		return producerRecord;
	}

	public void onAcknowledgement(RecordMetadata metadata, Exception exception) {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
