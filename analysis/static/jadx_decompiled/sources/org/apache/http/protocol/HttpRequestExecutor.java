package org.apache.http.protocol;

import java.io.IOException;
import java.net.ProtocolException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.params.CoreProtocolPNames;

@Deprecated
/* loaded from: classes2.dex */
public class HttpRequestExecutor {
    public boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return (HttpHead.METHOD_NAME.equalsIgnoreCase(httpRequest.getRequestLine().getMethod()) || (statusCode = httpResponse.getStatusLine().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpClientConnection == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        HttpResponse httpResponseReceiveResponseHeader = null;
        int statusCode = 0;
        while (true) {
            if (httpResponseReceiveResponseHeader != null && statusCode >= 200) {
                return httpResponseReceiveResponseHeader;
            }
            httpResponseReceiveResponseHeader = httpClientConnection.receiveResponseHeader();
            if (canResponseHaveBody(httpRequest, httpResponseReceiveResponseHeader)) {
                httpClientConnection.receiveResponseEntity(httpResponseReceiveResponseHeader);
            }
            statusCode = httpResponseReceiveResponseHeader.getStatusLine().getStatusCode();
        }
    }

    public HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpClientConnection == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        httpContext.setAttribute(ExecutionContext.HTTP_REQ_SENT, Boolean.FALSE);
        httpClientConnection.sendRequestHeader(httpRequest);
        HttpResponse httpResponse = null;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
            boolean z = true;
            if (httpEntityEnclosingRequest.expectContinue() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                httpClientConnection.flush();
                if (httpClientConnection.isResponseAvailable(httpRequest.getParams().getIntParameter(CoreProtocolPNames.WAIT_FOR_CONTINUE, 2000))) {
                    HttpResponse httpResponseReceiveResponseHeader = httpClientConnection.receiveResponseHeader();
                    if (canResponseHaveBody(httpRequest, httpResponseReceiveResponseHeader)) {
                        httpClientConnection.receiveResponseEntity(httpResponseReceiveResponseHeader);
                    }
                    int statusCode = httpResponseReceiveResponseHeader.getStatusLine().getStatusCode();
                    if (statusCode >= 200) {
                        z = false;
                        httpResponse = httpResponseReceiveResponseHeader;
                    } else if (statusCode != 100) {
                        throw new ProtocolException("Unexpected response: " + httpResponseReceiveResponseHeader.getStatusLine());
                    }
                }
            }
            if (z) {
                httpClientConnection.sendRequestEntity(httpEntityEnclosingRequest);
            }
        }
        httpClientConnection.flush();
        httpContext.setAttribute(ExecutionContext.HTTP_REQ_SENT, Boolean.TRUE);
        return httpResponse;
    }

    public HttpResponse execute(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpClientConnection == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        }
        if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        try {
            HttpResponse httpResponseDoSendRequest = doSendRequest(httpRequest, httpClientConnection, httpContext);
            return httpResponseDoSendRequest == null ? doReceiveResponse(httpRequest, httpClientConnection, httpContext) : httpResponseDoSendRequest;
        } catch (IOException e) {
            httpClientConnection.close();
            throw e;
        } catch (RuntimeException e2) {
            httpClientConnection.close();
            throw e2;
        } catch (HttpException e3) {
            httpClientConnection.close();
            throw e3;
        }
    }

    public void postProcess(HttpResponse httpResponse, HttpProcessor httpProcessor, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        httpProcessor.process(httpResponse, httpContext);
    }

    public void preProcess(HttpRequest httpRequest, HttpProcessor httpProcessor, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        httpProcessor.process(httpRequest, httpContext);
    }
}
