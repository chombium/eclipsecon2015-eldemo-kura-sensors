package com.wordpress.chombium.eldemo.sensors;

public interface SensorService {
	class NoSuchSensorOrActuatorException extends Exception {
		private static final long serialVersionUID = 1902980744986085608L;
	};

	/**
	 * Returns the current sensor value
	 * @param sensorName Name(designation) of the sensor
	 * @return The sensor value
	 * @throws NoSuchSensorOrActuatorException
	 */
	Object getSensorValue(String sensorName)
			throws NoSuchSensorOrActuatorException;

	/**
	 * Sets the value of the sensor (actuator)
	 * @param actuatorName Name(designation) of the sensor (actuator)
	 * @param value The value to be set
	 * @throws NoSuchSensorOrActuatorException
	 */
	void setActuatorValue(String actuatorName, Object value)
			throws NoSuchSensorOrActuatorException;
}
