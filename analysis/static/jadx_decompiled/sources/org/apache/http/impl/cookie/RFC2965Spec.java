package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: classes2.dex */
public class RFC2965Spec extends RFC2109Spec {
    public RFC2965Spec() {
        this(null, false);
    }

    private static CookieOrigin adjustEffectiveHost(CookieOrigin cookieOrigin) {
        String host = cookieOrigin.getHost();
        for (int i = 0; i < host.length(); i++) {
            char cCharAt = host.charAt(i);
            if (cCharAt == '.' || cCharAt == ':') {
                return cookieOrigin;
            }
        }
        return new CookieOrigin(host.concat(".local"), cookieOrigin.getPort(), cookieOrigin.getPath(), cookieOrigin.isSecure());
    }

    private BasicClientCookie createCookie(String str, String str2, CookieOrigin cookieOrigin) {
        BasicClientCookie basicClientCookie = new BasicClientCookie(str, str2);
        basicClientCookie.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
        basicClientCookie.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
        return basicClientCookie;
    }

    private BasicClientCookie createCookie2(String str, String str2, CookieOrigin cookieOrigin) {
        BasicClientCookie2 basicClientCookie2 = new BasicClientCookie2(str, str2);
        basicClientCookie2.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
        basicClientCookie2.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
        basicClientCookie2.setPorts(new int[]{cookieOrigin.getPort()});
        return basicClientCookie2;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec
    public void formatCookieAsVer(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        String attribute;
        int[] ports;
        super.formatCookieAsVer(charArrayBuffer, cookie, i);
        if (!(cookie instanceof ClientCookie) || (attribute = ((ClientCookie) cookie).getAttribute(ClientCookie.PORT_ATTR)) == null) {
            return;
        }
        charArrayBuffer.append("; $Port");
        charArrayBuffer.append("=\"");
        if (attribute.trim().length() > 0 && (ports = cookie.getPorts()) != null) {
            int length = ports.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 > 0) {
                    charArrayBuffer.append(",");
                }
                charArrayBuffer.append(Integer.toString(ports[i2]));
            }
        }
        charArrayBuffer.append("\"");
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 1;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
        charArrayBuffer.append(SM.COOKIE2);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookieOrigin != null) {
            return super.match(cookie, adjustEffectiveHost(cookieOrigin));
        }
        throw new IllegalArgumentException("Cookie origin may not be null");
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws ParseException, MalformedCookieException {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (cookieOrigin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        CookieOrigin cookieOriginAdjustEffectiveHost = adjustEffectiveHost(cookieOrigin);
        HeaderElement[] elements = header.getElements();
        ArrayList arrayList = new ArrayList(elements.length);
        for (HeaderElement headerElement : elements) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            BasicClientCookie basicClientCookieCreateCookie2 = header.getName().equals(SM.SET_COOKIE2) ? createCookie2(name, value, cookieOriginAdjustEffectiveHost) : createCookie(name, value, cookieOriginAdjustEffectiveHost);
            NameValuePair[] parameters = headerElement.getParameters();
            HashMap map = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                map.put(nameValuePair.getName().toLowerCase(Locale.ENGLISH), nameValuePair);
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                NameValuePair nameValuePair2 = (NameValuePair) ((Map.Entry) it.next()).getValue();
                String lowerCase = nameValuePair2.getName().toLowerCase(Locale.ENGLISH);
                basicClientCookieCreateCookie2.setAttribute(lowerCase, nameValuePair2.getValue());
                CookieAttributeHandler cookieAttributeHandlerFindAttribHandler = findAttribHandler(lowerCase);
                if (cookieAttributeHandlerFindAttribHandler != null) {
                    cookieAttributeHandlerFindAttribHandler.parse(basicClientCookieCreateCookie2, nameValuePair2.getValue());
                }
            }
            arrayList.add(basicClientCookieCreateCookie2);
        }
        return arrayList;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookieOrigin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        super.validate(cookie, adjustEffectiveHost(cookieOrigin));
    }

    public RFC2965Spec(String[] strArr, boolean z) {
        super(strArr, z);
        registerAttribHandler(ClientCookie.DOMAIN_ATTR, new RFC2965DomainAttributeHandler());
        registerAttribHandler(ClientCookie.PORT_ATTR, new RFC2965PortAttributeHandler());
        registerAttribHandler(ClientCookie.COMMENTURL_ATTR, new RFC2965CommentUrlAttributeHandler());
        registerAttribHandler(ClientCookie.DISCARD_ATTR, new RFC2965DiscardAttributeHandler());
        registerAttribHandler(ClientCookie.VERSION_ATTR, new RFC2965VersionAttributeHandler());
    }
}
