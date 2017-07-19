package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum PaymentReleaseUpdateReasonEnum {

	/**
	 * Quando a payment release � criada
	 */
	CREATION(1),

	/**
	 * Quando � feito um adiantamento de escrow
	 */
	ADVANCE_PAYMENT(2),

	/**
	 * Um update nao classificado, por favor EVITE usa-lo
	 */
	@Deprecated
	GENERAL_UPDATE(3),

	/**
	 * Inicio da liberacao de escrow
	 */
	START_RELEASE(4),

	/**
	 * Release recomecado geralmente por falha na fila de liberacao de escrow
	 */
	RESTART_RELEASE(5),

	/**
	 * Release terminado com sucesso
	 */
	FINSHED_RELEASE(6),

	/**
	 * Suspensao da transacao e da payment release, quando � aberta uma disputa
	 */
	SUSPENSION(7),

	/**
	 * Liberacao da payment release quando o vendedor ganha a disputa
	 * ou um passo antes de cancelar a PR a favor do comprador
	 */
	UNSUSPENSION(8),

	/**
	 * Quando sao cobradas taxas do vendedor(frete, etc) ou quando perde uma disputa ou acontece um cancelamento
	 */
	RELEASE_VALUE_CHANGE(9);

	private Integer code;

	PaymentReleaseUpdateReasonEnum(Integer code) {
		this.code = code;
	}


	@JsonValue
	public Integer getCode() {

		return code;
	}

	@JsonCreator
	public static PaymentReleaseUpdateReasonEnum fromCode(Integer code) {
		for (final PaymentReleaseUpdateReasonEnum c : values()) {
			if (c.getCode().equals(code)) {
				return c;
			}
		}
		return null;
	}

}
