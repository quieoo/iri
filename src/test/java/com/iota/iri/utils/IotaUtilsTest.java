package com.iota.iri.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IotaUtilsTest {

    @Test
    public void testStringFileSizeConversion() {
        assertEquals("Space should be accepted in conversion", 1000000000l, IotaUtils.parseFileSize("1 GB"));
        assertEquals("Space should be accepted in conversion", 1073741824l, IotaUtils.parseFileSize("1 GiB"));
        

        assertEquals("No space should eb allowed in conversion", 1000000000l, IotaUtils.parseFileSize("1GB"));
        assertEquals("No space should eb allowed in conversion", 1073741824l, IotaUtils.parseFileSize("1GiB"));
        

        assertEquals("-1 should return -1", -1l, IotaUtils.parseFileSize("-1"));
    }
}
