package com.wordpress.chombium.eldemo.sensors;

public interface SensorChangedListener {
	/**
	 * Callback which is called when a sensor value has changed
	 * @param sensorName The name (designation) of the sensor
	 * @param newValue The new value
	 */
	void sensorChanged(String sensorName, Object newValue);
}
