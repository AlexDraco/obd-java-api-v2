package com.obd.agnx.response.common;

import com.obd.agnx.response.OBDResponse;

public class DtcNumberResponse extends OBDResponse {

    public DtcNumberResponse() {
        super("0101");
    }

    @Override
    public String getDefaultResponse() {
        return "41 01 81 02 03 00 04 20"; // Example DTC number response with P0300 and P0420, MIL ON
    }

    @Override
    public String getSimulatedDefaultResponse() {
        return getDefaultResponse(); // DTC number does not vary
    }

    @Override
    public String getSimulatedResponse() {
        return getDefaultResponse();
    }

    @Override
    public String getSimulatedResponse(String initialValue) {
        return getDefaultResponse(); // DTC number does not vary
    }

    public String getNoErrorResponse(){
        return "43 00 00 00 00 00"; // MIL OFF, no error codes
    }
}