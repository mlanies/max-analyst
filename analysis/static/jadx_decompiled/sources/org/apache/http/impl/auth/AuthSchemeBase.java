package org.apache.http.impl.auth;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: classes2.dex */
public abstract class AuthSchemeBase implements AuthScheme {
    private boolean proxy;

    public boolean isProxy() {
        return this.proxy;
    }

    public abstract void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException;

    @Override // org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) throws MalformedChallengeException {
        CharArrayBuffer charArrayBuffer;
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        String name = header.getName();
        int valuePos = 0;
        if (name.equalsIgnoreCase(AUTH.WWW_AUTH)) {
            this.proxy = false;
        } else {
            if (!name.equalsIgnoreCase(AUTH.PROXY_AUTH)) {
                throw new MalformedChallengeException("Unexpected header name: ".concat(name));
            }
            this.proxy = true;
        }
        if (header instanceof FormattedHeader) {
            FormattedHeader formattedHeader = (FormattedHeader) header;
            charArrayBuffer = formattedHeader.getBuffer();
            valuePos = formattedHeader.getValuePos();
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedChallengeException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
        }
        while (valuePos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(valuePos))) {
            valuePos++;
        }
        int i = valuePos;
        while (i < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
            i++;
        }
        String strSubstring = charArrayBuffer.substring(valuePos, i);
        if (!strSubstring.equalsIgnoreCase(getSchemeName())) {
            throw new MalformedChallengeException("Invalid scheme identifier: ".concat(strSubstring));
        }
        parseChallenge(charArrayBuffer, i, charArrayBuffer.length());
    }
}
