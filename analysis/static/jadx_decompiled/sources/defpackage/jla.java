package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;
import org.apache.http.HttpHost;

/* loaded from: classes2.dex */
public final class jla extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final zzf a;
    public final s23 b;
    public final khe c = new khe(new s4a(11));

    public jla(zzf zzfVar, s23 s23Var) {
        this.a = zzfVar;
        this.b = s23Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        Object njcVar;
        if (webView != null) {
            j5c j5cVar = (j5c) this.c.getValue();
            Context context = webView.getContext();
            int i = lla.a;
            ThreadLocal threadLocal = j5cVar.a;
            byte[] bArr = (byte[]) threadLocal.get();
            if (bArr == null) {
                bArr = new byte[65536];
                threadLocal.set(bArr);
            }
            try {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
                ThreadLocal threadLocal2 = j5cVar.b;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    threadLocal2.set(bArr2);
                }
                int i2 = 0;
                while (true) {
                    try {
                        int i3 = inputStreamOpenRawResource.read(bArr2, 0, bArr2.length);
                        if (i3 < 0) {
                            break;
                        }
                        int i4 = i2 + i3;
                        if (bArr.length < i4) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i2);
                            threadLocal.set(bArr3);
                            bArr = bArr3;
                        }
                        if (i3 > 0) {
                            System.arraycopy(bArr2, 0, bArr, i2, i3);
                            i2 = i4;
                        }
                    } finally {
                    }
                }
                v3c.i(inputStreamOpenRawResource, null);
                njcVar = new String(bArr, 0, i2, a52.a);
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            String str2 = (String) (njcVar instanceof njc ? null : njcVar);
            if (str2 != null) {
                webView.evaluateJavascript(str2, new ila(0));
            }
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        q0e q0eVar = this.a.E0;
        cpa cpaVar = cpa.a;
        cpa cpaVar2 = cpa.b;
        q0eVar.getClass();
        q0eVar.m(cpaVar, cpaVar2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a.E0.m(null, cpa.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.E0.m(null, cpa.o);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        zzf zzfVar = this.a;
        if (((t33) zzfVar.Z).g.getBoolean("web_app:ssl_check", false)) {
            sslErrorHandler.proceed();
        } else {
            zzfVar.E0.m(null, cpa.o);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        s23 s23Var = this.b;
        s23Var.getClass();
        if (!tpa.f(url.getScheme(), HttpHost.DEFAULT_SCHEME_NAME) && !tpa.f(url.getScheme(), "https")) {
            try {
                s23Var.a.startActivity(new Intent("android.intent.action.VIEW", url));
                return true;
            } catch (ActivityNotFoundException unused) {
                return true;
            } catch (Exception e) {
                hm9.p("WebAppUrlInterceptor", "Unexpected exception when try to open activity by link", e);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
