/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.pojo.INBalanceResponse;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Hp
 */
public class EnquiriesServiceImplTest {

    private EnquiriesServiceImpl enquiriesServiceImpl;
    @Mock
    private ChargingPlatform chargingPlatform;

    SubscriberRequest subscriberRequest;

    INBalanceResponse inBalanceResponse;

    @Mock
    private SubscriberRequestDao subscriberRequestDao;

    @Test
    public void testEnquiriesServiceImpl() {
        MockitoAnnotations.initMocks(this);
        inBalanceResponse = new INBalanceResponse();
        enquiriesServiceImpl = new EnquiriesServiceImpl(chargingPlatform, subscriberRequestDao);
    }

}
