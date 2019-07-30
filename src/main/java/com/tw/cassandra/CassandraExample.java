package com.tw.cassandra;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CassandraExample {

	private final static Logger LOGGER = LogManager.getLogger();

	public void printDemo() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			LOGGER.info("Testing {}", i);
			LOGGER.error("Testing {}", i);
			LOGGER.debug("Testing {}", i);
		}
	}
	public static void main(String[] args) {
		new CassandraExample().printDemo();
	}

}
