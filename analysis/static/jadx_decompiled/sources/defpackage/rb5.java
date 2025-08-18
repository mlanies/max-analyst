package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final class rb5 extends WebViewClient {
    public final /* synthetic */ FaqWebViewWidget a;

    public rb5(FaqWebViewWidget faqWebViewWidget) {
        this.a = faqWebViewWidget;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            String scheme = url.getScheme();
            FaqWebViewWidget faqWebViewWidget = this.a;
            if (scheme != null && w9e.p0(scheme, "mailto", false)) {
                bc7[] bc7VarArr = FaqWebViewWidget.Z;
                faqWebViewWidget.c.o1(faqWebViewWidget, FaqWebViewWidget.Z[1], j47.T(faqWebViewWidget.getViewLifecycleScope(), null, vx3.b, new tb5(faqWebViewWidget, null), 1));
                return true;
            }
            String scheme2 = url.getScheme();
            if (scheme2 != null && w9e.p0(scheme2, ((fl7) ((al) faqWebViewWidget.o.getValue())).b, false)) {
                bc7[] bc7VarArr2 = FaqWebViewWidget.Z;
                try {
                    faqWebViewWidget.startActivity(new Intent("android.intent.action.VIEW", url));
                } catch (ActivityNotFoundException e) {
                    hm9.p(FaqWebViewWidget.class.getName(), "error handleUrl - " + url + ": " + e.getMessage(), e);
                }
                return true;
            }
        }
        return false;
    }
}
