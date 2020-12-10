package com.finalcrudy.services;

import com.finalcrudy.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service(value = "paymentService")
public class PaymentServicesImpl
    implements com.finalcrudy.services.PaymentServices
{
    @Autowired
    PaymentRepository paymentrepos;
}