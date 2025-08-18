package org.apache.http.impl.client;

import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: classes2.dex */
public class DefaultProxyAuthenticationHandler extends AbstractAuthenticationHandler {
    @Override // org.apache.http.client.AuthenticationHandler
    public Map<String, Header> getChallenges(HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException {
        if (httpResponse != null) {
            return parseChallenges(httpResponse.getHeaders(AUTH.PROXY_AUTH));
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    @Override // org.apache.http.client.AuthenticationHandler
    public boolean isAuthenticationRequested(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse != null) {
            return httpResponse.getStatusLine().getStatusCode() == 407;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
