package com.tlongueira.soapconsumer.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.tlongueira.soapconsumer.dataaccess.NumberConversion;
import com.tlongueira.soapconsumer.dataaccess.NumberConversionSoapType;
import com.tlongueira.soapconsumer.service.DataAccessService;

@Service
public class DataAccessServiceImpl implements DataAccessService {

	@Override
	public String convertirAPalabras(BigInteger numero) {

		NumberConversion service = new NumberConversion();
		NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
		return port.numberToWords(numero);
	}

	@Override
	public String convertirADolares(BigDecimal numero) {
		NumberConversion service = new NumberConversion();
		NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
		return port.numberToDollars(numero);
	}

}
