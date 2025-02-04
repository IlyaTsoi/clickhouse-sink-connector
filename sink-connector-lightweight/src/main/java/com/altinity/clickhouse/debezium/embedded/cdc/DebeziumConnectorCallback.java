package com.altinity.clickhouse.debezium.embedded.cdc;

import io.debezium.engine.DebeziumEngine;
import io.debezium.engine.DebeziumEngine.ConnectorCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebeziumConnectorCallback implements ConnectorCallback {
    private static final Logger log = LoggerFactory.getLogger(DebeziumConnectorCallback.class);

    public DebeziumConnectorCallback() {
    }

    @Override
    public void connectorStarted() {
        DebeziumEngine.ConnectorCallback.super.connectorStarted();
    }

    @Override
    public void connectorStopped() {
        DebeziumEngine.ConnectorCallback.super.connectorStopped();

    }

    @Override
    public void taskStarted() {
        DebeziumEngine.ConnectorCallback.super.taskStarted();
    }

    @Override
    public void taskStopped() {
        DebeziumEngine.ConnectorCallback.super.taskStopped();
    }
}
