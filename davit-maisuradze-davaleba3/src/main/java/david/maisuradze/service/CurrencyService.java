package david.maisuradze.service;

import david.maisuradze.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService
public class CurrencyService {
    List<Currency> currencyList = new ArrayList<>(Arrays.asList(
            new Currency("USD", 3.05, "ამერიკული დოლარი"),
            new Currency("GEL", 1, "ქართული ლარი"),
            new Currency("EUR", 3.44, "ევრო"),
            new Currency("RUB", 4.43, "რუსული რუბლი")));

    @WebMethod
    public double GetCurrency(Currency cur) {
        if (currencyList.stream().anyMatch(c -> c.getName().equals(cur.getName()))) {
            return currencyList.stream().filter(c -> c.getName().equals(cur.getName())).findFirst().get().getValue();
        }
        return 0;
    }

    @WebMethod
    public String GetCurrencyDescription(Currency cur) {
        if (currencyList.stream().anyMatch(c -> c.getName().equals(cur.getName()))) {
            return cur.getValue() + " " + currencyList.stream().filter(c -> c.getName().equals(cur.getName())).findFirst().get().getDescription();
        }
        return "";
    }

    public String GetDate() {
        return java.time.LocalDate.now().toString();
    }
}
