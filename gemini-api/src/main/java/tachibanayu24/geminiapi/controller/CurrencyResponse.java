package tachibanayu24.geminiapi.controller;

import lombok.Builder;
import lombok.Getter;
import tachibanayu24.geminiapi.domain.Currency;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

    private List<Currency> currencies;
}
