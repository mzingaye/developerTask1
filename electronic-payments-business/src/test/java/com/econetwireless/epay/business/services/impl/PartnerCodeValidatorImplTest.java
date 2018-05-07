/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.dao.requestpartner.api.RequestPartnerDao;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Hp
 */
public class PartnerCodeValidatorImplTest {
    
    PartnerCodeValidatorImpl partnerCodeValidatorImpl;
	
	@Mock
	private RequestPartnerDao requestPartnerDao;

	private String partnerCode="hot-recharge";
	@Before
	public void intiMocks() {
		MockitoAnnotations.initMocks(this);
		partnerCodeValidatorImpl=new PartnerCodeValidatorImpl(requestPartnerDao);
	}

	@Test(expected=Exception.class)
	public void testValidatePartnerCode() {
		partnerCodeValidatorImpl.validatePartnerCode(partnerCode);
		verify(requestPartnerDao, atLeastOnce()).findByCode(partnerCode);
	}
}
