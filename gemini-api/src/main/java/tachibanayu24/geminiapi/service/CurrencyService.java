package tachibanayu24.geminiapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tachibanayu24.geminiapi.domain.Currency;
import tachibanayu24.geminiapi.domain.CurrencyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    public Currency save(String name, String symbol) {
        return currencyRepository.save(Currency.newCurrency(name, symbol));
    }

    public void delete(Long id) {
        currencyRepository.findById(id).ifPresent(currency -> currencyRepository.delete(currency));
    }
}
