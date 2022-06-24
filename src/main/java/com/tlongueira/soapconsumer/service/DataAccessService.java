package com.tlongueira.soapconsumer.service;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface DataAccessService {

	String convertirAPalabras(BigInteger numero) ;

	String convertirADolares(BigDecimal numero) ;

}
