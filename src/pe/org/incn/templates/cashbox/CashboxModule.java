package pe.org.incn.templates.cashbox;

import org.json.JSONObject;
import pe.org.incn.base.BaseModule;
import pe.org.incn.base.EpsonPrintable;
import pe.org.incn.base.Printable;
import pe.org.incn.exceptions.NotFoundTemplateException;

/**
 * CashboxModule
 *
 * @author enea <enea.so@live.com>
 */
public class CashboxModule extends BaseModule {

    public CashboxModule(EpsonPrintable printer) {
        super(printer);
    }

    @Override
    public Printable buildTemplate(String template, JSONObject json) throws NotFoundTemplateException {
        switch (template) {
            case "payment-document":
                return new PaymentDocument(json, this.printer);
        }

        throw new NotFoundTemplateException();
    }

}