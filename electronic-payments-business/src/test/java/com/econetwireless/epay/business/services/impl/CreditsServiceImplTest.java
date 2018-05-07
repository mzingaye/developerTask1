/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.messages.AirtimeTopupRequest;
import com.econetwireless.utils.pojo.INCreditResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Hp
 */
public class CreditsServiceImplTest {

    private CreditsServiceImpl creditsService;

    @Mock
    ChargingPlatform chargingPlatform;

    @Mock
    SubscriberRequestDao subscriberRequestDao;

    @Mock
    SubscriberRequest subscriberRequest;

    @Mock
    INCreditResponse inCreditResponse;

    @Mock
    AirtimeTopupRequest airtimeTopupRequest;

    private String partnerCode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        creditsService = new CreditsServiceImpl(chargingPlatform, subscriberRequestDao);
        partnerCode = "hot-recharge";

    }

    @Test(expected = Exception.class)
    public void testCreditMethod() {
        final AirtimeTopupRequest airtimeTopupRequest = new AirtimeTopupRequest();
        airtimeTopupRequest.setPartnerCode(partnerCode);
        airtimeTopupRequest.setReferenceNumber("TOPUP-REF-0123");
        airtimeTopupRequest.setAmount(1.11);
        airtimeTopupRequest.setMsisdn("772984803");
        creditsService.credit(airtimeTopupRequest);

    }

}
