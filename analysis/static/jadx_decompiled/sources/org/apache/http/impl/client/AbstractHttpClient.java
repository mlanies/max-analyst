package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.DefaultedHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@Deprecated
/* loaded from: classes2.dex */
public abstract class AbstractHttpClient implements HttpClient {
    private ClientConnectionManager connManager;
    private CookieStore cookieStore;
    private CredentialsProvider credsProvider;
    private HttpParams defaultParams;
    private BasicHttpProcessor httpProcessor;
    private ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    private AuthenticationHandler proxyAuthHandler;
    private RedirectHandler redirectHandler;
    private HttpRequestExecutor requestExec;
    private HttpRequestRetryHandler retryHandler;
    private ConnectionReuseStrategy reuseStrategy;
    private HttpRoutePlanner routePlanner;
    private AuthSchemeRegistry supportedAuthSchemes;
    private CookieSpecRegistry supportedCookieSpecs;
    private AuthenticationHandler targetAuthHandler;
    private UserTokenHandler userTokenHandler;

    public AbstractHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.defaultParams = httpParams;
        this.connManager = clientConnectionManager;
    }

    private HttpHost determineTarget(HttpUriRequest httpUriRequest) {
        URI uri = httpUriRequest.getURI();
        if (uri.isAbsolute()) {
            return new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        return null;
    }

    public synchronized void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        getHttpProcessor().addInterceptor(httpRequestInterceptor);
    }

    public synchronized void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        getHttpProcessor().addInterceptor(httpResponseInterceptor);
    }

    public synchronized void clearRequestInterceptors() {
        getHttpProcessor().clearRequestInterceptors();
    }

    public synchronized void clearResponseInterceptors() {
        getHttpProcessor().clearResponseInterceptors();
    }

    public abstract AuthSchemeRegistry createAuthSchemeRegistry();

    public abstract ClientConnectionManager createClientConnectionManager();

    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectHandler, authenticationHandler, authenticationHandler2, userTokenHandler, httpParams);
    }

    public abstract ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy();

    public abstract ConnectionReuseStrategy createConnectionReuseStrategy();

    public abstract CookieSpecRegistry createCookieSpecRegistry();

    public abstract CookieStore createCookieStore();

    public abstract CredentialsProvider createCredentialsProvider();

    public abstract HttpContext createHttpContext();

    public abstract HttpParams createHttpParams();

    public abstract BasicHttpProcessor createHttpProcessor();

    public abstract HttpRequestRetryHandler createHttpRequestRetryHandler();

    public abstract HttpRoutePlanner createHttpRoutePlanner();

    public abstract AuthenticationHandler createProxyAuthenticationHandler();

    public abstract RedirectHandler createRedirectHandler();

    public abstract HttpRequestExecutor createRequestExecutor();

    public abstract AuthenticationHandler createTargetAuthenticationHandler();

    public abstract UserTokenHandler createUserTokenHandler();

    public HttpParams determineParams(HttpRequest httpRequest) {
        return new ClientParamsStack(null, getParams(), httpRequest.getParams(), null);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        return execute(httpUriRequest, (HttpContext) null);
    }

    public final synchronized AuthSchemeRegistry getAuthSchemes() {
        try {
            if (this.supportedAuthSchemes == null) {
                this.supportedAuthSchemes = createAuthSchemeRegistry();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.supportedAuthSchemes;
    }

    public final synchronized ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy() {
        try {
            if (this.keepAliveStrategy == null) {
                this.keepAliveStrategy = createConnectionKeepAliveStrategy();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.keepAliveStrategy;
    }

    @Override // org.apache.http.client.HttpClient
    public final synchronized ClientConnectionManager getConnectionManager() {
        try {
            if (this.connManager == null) {
                this.connManager = createClientConnectionManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.connManager;
    }

    public final synchronized ConnectionReuseStrategy getConnectionReuseStrategy() {
        try {
            if (this.reuseStrategy == null) {
                this.reuseStrategy = createConnectionReuseStrategy();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.reuseStrategy;
    }

    public final synchronized CookieSpecRegistry getCookieSpecs() {
        try {
            if (this.supportedCookieSpecs == null) {
                this.supportedCookieSpecs = createCookieSpecRegistry();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.supportedCookieSpecs;
    }

    public final synchronized CookieStore getCookieStore() {
        try {
            if (this.cookieStore == null) {
                this.cookieStore = createCookieStore();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cookieStore;
    }

    public final synchronized CredentialsProvider getCredentialsProvider() {
        try {
            if (this.credsProvider == null) {
                this.credsProvider = createCredentialsProvider();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.credsProvider;
    }

    public final synchronized BasicHttpProcessor getHttpProcessor() {
        try {
            if (this.httpProcessor == null) {
                this.httpProcessor = createHttpProcessor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.httpProcessor;
    }

    public final synchronized HttpRequestRetryHandler getHttpRequestRetryHandler() {
        try {
            if (this.retryHandler == null) {
                this.retryHandler = createHttpRequestRetryHandler();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.retryHandler;
    }

    @Override // org.apache.http.client.HttpClient
    public final synchronized HttpParams getParams() {
        try {
            if (this.defaultParams == null) {
                this.defaultParams = createHttpParams();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultParams;
    }

    public final synchronized AuthenticationHandler getProxyAuthenticationHandler() {
        try {
            if (this.proxyAuthHandler == null) {
                this.proxyAuthHandler = createProxyAuthenticationHandler();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.proxyAuthHandler;
    }

    public final synchronized RedirectHandler getRedirectHandler() {
        try {
            if (this.redirectHandler == null) {
                this.redirectHandler = createRedirectHandler();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.redirectHandler;
    }

    public final synchronized HttpRequestExecutor getRequestExecutor() {
        try {
            if (this.requestExec == null) {
                this.requestExec = createRequestExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.requestExec;
    }

    public synchronized HttpRequestInterceptor getRequestInterceptor(int i) {
        return getHttpProcessor().getRequestInterceptor(i);
    }

    public synchronized int getRequestInterceptorCount() {
        return getHttpProcessor().getRequestInterceptorCount();
    }

    public synchronized HttpResponseInterceptor getResponseInterceptor(int i) {
        return getHttpProcessor().getResponseInterceptor(i);
    }

    public synchronized int getResponseInterceptorCount() {
        return getHttpProcessor().getResponseInterceptorCount();
    }

    public final synchronized HttpRoutePlanner getRoutePlanner() {
        try {
            if (this.routePlanner == null) {
                this.routePlanner = createHttpRoutePlanner();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routePlanner;
    }

    public final synchronized AuthenticationHandler getTargetAuthenticationHandler() {
        try {
            if (this.targetAuthHandler == null) {
                this.targetAuthHandler = createTargetAuthenticationHandler();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.targetAuthHandler;
    }

    public final synchronized UserTokenHandler getUserTokenHandler() {
        try {
            if (this.userTokenHandler == null) {
                this.userTokenHandler = createUserTokenHandler();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.userTokenHandler;
    }

    public void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> cls) {
        getHttpProcessor().removeRequestInterceptorByClass(cls);
    }

    public void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> cls) {
        getHttpProcessor().removeResponseInterceptorByClass(cls);
    }

    public synchronized void setAuthSchemes(AuthSchemeRegistry authSchemeRegistry) {
        this.supportedAuthSchemes = authSchemeRegistry;
    }

    public synchronized void setCookieSpecs(CookieSpecRegistry cookieSpecRegistry) {
        this.supportedCookieSpecs = cookieSpecRegistry;
    }

    public synchronized void setCookieStore(CookieStore cookieStore) {
        this.cookieStore = cookieStore;
    }

    public synchronized void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.credsProvider = credentialsProvider;
    }

    public synchronized void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.retryHandler = httpRequestRetryHandler;
    }

    public synchronized void setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.keepAliveStrategy = connectionKeepAliveStrategy;
    }

    public synchronized void setParams(HttpParams httpParams) {
        this.defaultParams = httpParams;
    }

    public synchronized void setProxyAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        this.proxyAuthHandler = authenticationHandler;
    }

    public synchronized void setRedirectHandler(RedirectHandler redirectHandler) {
        this.redirectHandler = redirectHandler;
    }

    public synchronized void setReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.reuseStrategy = connectionReuseStrategy;
    }

    public synchronized void setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        this.routePlanner = httpRoutePlanner;
    }

    public synchronized void setTargetAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        this.targetAuthHandler = authenticationHandler;
    }

    public synchronized void setUserTokenHandler(UserTokenHandler userTokenHandler) {
        this.userTokenHandler = userTokenHandler;
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        if (httpUriRequest != null) {
            return execute(determineTarget(httpUriRequest), httpUriRequest, httpContext);
        }
        throw new IllegalArgumentException("Request must not be null.");
    }

    public synchronized void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i) {
        getHttpProcessor().addInterceptor(httpRequestInterceptor, i);
    }

    public synchronized void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i) {
        getHttpProcessor().addInterceptor(httpResponseInterceptor, i);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return execute(httpHost, httpRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        HttpContext defaultedHttpContext;
        RequestDirector requestDirectorCreateClientRequestDirector;
        if (httpRequest != null) {
            synchronized (this) {
                HttpContext httpContextCreateHttpContext = createHttpContext();
                defaultedHttpContext = httpContext == null ? httpContextCreateHttpContext : new DefaultedHttpContext(httpContext, httpContextCreateHttpContext);
                requestDirectorCreateClientRequestDirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), getHttpProcessor().copy(), getHttpRequestRetryHandler(), getRedirectHandler(), getTargetAuthenticationHandler(), getProxyAuthenticationHandler(), getUserTokenHandler(), determineParams(httpRequest));
            }
            try {
                return requestDirectorCreateClientRequestDirector.execute(httpHost, httpRequest, defaultedHttpContext);
            } catch (HttpException e) {
                throw new ClientProtocolException(e);
            }
        }
        throw new IllegalArgumentException("Request must not be null.");
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) execute(httpUriRequest, responseHandler, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) execute(determineTarget(httpUriRequest), httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) execute(httpHost, httpRequest, responseHandler, null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        if (responseHandler != null) {
            HttpResponse httpResponseExecute = execute(httpHost, httpRequest, httpContext);
            try {
                T tHandleResponse = responseHandler.handleResponse(httpResponseExecute);
                HttpEntity entity = httpResponseExecute.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                }
                return tHandleResponse;
            } catch (Throwable th) {
                HttpEntity entity2 = httpResponseExecute.getEntity();
                if (entity2 != null) {
                    try {
                        entity2.consumeContent();
                    } catch (Throwable th2) {
                        this.log.warn("Error consuming content after an exception.", th2);
                    }
                }
                if (!(th instanceof Error)) {
                    if (!(th instanceof RuntimeException)) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        throw new UndeclaredThrowableException(th);
                    }
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
        }
        throw new IllegalArgumentException("Response handler must not be null.");
    }
}
