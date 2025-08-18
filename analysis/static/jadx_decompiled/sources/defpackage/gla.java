package defpackage;

import android.net.Uri;
import android.os.Message;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class gla extends WebChromeClient {
    public final zzf a;

    public gla(zzf zzfVar) {
        this.a = zzfVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        hla hlaVar = new hla(webView.getContext(), null, 0, 14);
        hlaVar.setWebViewClient(new fla(this, hlaVar));
        ((WebView.WebViewTransport) (message != null ? message.obj : null)).setWebView(hlaVar);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        hla hlaVar = webView instanceof hla ? (hla) webView : null;
        if (hlaVar == null) {
            return false;
        }
        ValueCallback<Uri[]> filePathCallback = hlaVar.getFilePathCallback();
        if (filePathCallback != null) {
            filePathCallback.onReceiveValue(null);
        }
        hlaVar.setFilePathCallback(valueCallback);
        zzf zzfVar = this.a;
        zzfVar.getClass();
        pnf.o(zzfVar.M0, new gzf(fileChooserParams));
        return true;
    }
}
