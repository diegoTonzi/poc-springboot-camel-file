package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum CardOperatorEnum {

	VISA(1, 101, "VISA", PaymentMethodEnum.CREDITCARD),

	MASTERCARD(2, 102, "MASTERCARD", PaymentMethodEnum.CREDITCARD),

	AMEX(3, 103, "AMEX", PaymentMethodEnum.CREDITCARD),

	DINERS(4, 104, "DINERS", PaymentMethodEnum.CREDITCARD),

	HIPERCARD(5, 105, "HIPERCARD", PaymentMethodEnum.CREDITCARD),

	AURA(6, 106, "AURA", PaymentMethodEnum.CREDITCARD),

	ELO(7, 107, "ELO", PaymentMethodEnum.CREDITCARD),

	PLENOCARD(8, 108, "PLENOCARD", PaymentMethodEnum.CREDITCARD),

	PERSONALCARD(9, 109, "PERSONALCARD", PaymentMethodEnum.CREDITCARD),

	JCB(10, 110, "JCB", PaymentMethodEnum.CREDITCARD),

	DISCOVER(11, 111, "DISCOVER", PaymentMethodEnum.CREDITCARD),

	BRASILCARD(12, 112, "BRASILCARD", PaymentMethodEnum.CREDITCARD),

	FORTBRASIL(13, 113, "FORTBRASIL", PaymentMethodEnum.CREDITCARD),

	CARDBAN(14, 114, "CARDBAN", PaymentMethodEnum.CREDITCARD),

	VALECARD(15, 115, "VALECARD", PaymentMethodEnum.CREDITCARD),

	CABAL(16, 116, "CABAL", PaymentMethodEnum.CREDITCARD),

	MAIS(17, 117, "MAIS", PaymentMethodEnum.CREDITCARD),

	AVISTA(18, 118, "AVISTA", PaymentMethodEnum.CREDITCARD),

	GRANDCARD(19, 119, "GRANDCARD", PaymentMethodEnum.CREDITCARD),

	SOROCRED(20, 120, "SOROCRED", PaymentMethodEnum.CREDITCARD),

	VERDECARD(21, 121, "VERDECARD", PaymentMethodEnum.CREDITCARD),

	UPBRASIL(22, 122, "UPBRASIL", PaymentMethodEnum.CREDITCARD),

	BANESECARD(23, 123, "BANESECARD", PaymentMethodEnum.CREDITCARD),

	HIPER(24, 124, "HIPER", PaymentMethodEnum.CREDITCARD),

	VISA_ELECTRON(1, 801, "VISA ELECTRON", PaymentMethodEnum.DEBITCARD),

	MAESTRO(2, 802, "MAESTRO", PaymentMethodEnum.DEBITCARD),

	DEBIT_ELO(3, 803, "ELO", PaymentMethodEnum.DEBITCARD),

	BANRICOMPRAS(4, 804, "Banricompras", PaymentMethodEnum.DEBITCARD),

	DEBIT_CABAL(5, 805, "CABAL", PaymentMethodEnum.DEBITCARD);

	private final Integer id;
	private final int publicCode;
	private final String name;
	private final PaymentMethodEnum paymentMethodEnum;
	private final String arrangementCode;


	CardOperatorEnum(int id, int publicCode, String name, PaymentMethodEnum paymentMethodEnum) {
		this.id = id;
		this.publicCode = publicCode;
		this.name = name;
		this.paymentMethodEnum = paymentMethodEnum;
		this.arrangementCode = "123"; // TODO ZRQ-1134 Codigo enviado pela bandeira que teremos que perguntar ao Leandro
	}

	public Integer getId() {
		return id;
	}

	@JsonValue
	public int getPublicCode() {
		return publicCode;
	}

	public String getName() {
		return name;
	}

	public PaymentMethodEnum getPaymentMethodEnum() {
		return paymentMethodEnum;
	}

	public String getArrangementCode () {
		return arrangementCode;
	}

	@JsonCreator
	public static CardOperatorEnum fromPublicCode(Integer code) {
		if (code == null) {
			return null;
		}
		for (CardOperatorEnum operator : CardOperatorEnum.values()) {
			if (operator.getPublicCode() == code) {
				return operator;
			}
		}
		return null;
	}


}
