package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Deprecated
/* loaded from: classes2.dex */
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException, NumberFormatException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null) {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                throw new MalformedCookieException("Negative max-age attribute: ".concat(str));
            }
            setCookie.setExpiryDate(new Date((i * 1000) + System.currentTimeMillis()));
        } catch (NumberFormatException unused) {
            throw new MalformedCookieException("Invalid max-age attribute: ".concat(str));
        }
    }
}
