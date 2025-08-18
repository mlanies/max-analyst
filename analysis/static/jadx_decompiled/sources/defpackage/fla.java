package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class fla extends WebViewClient {
    public final /* synthetic */ gla a;
    public final /* synthetic */ hla b;

    public fla(gla glaVar, hla hlaVar) {
        this.a = glaVar;
        this.b = hlaVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        zzf zzfVar = this.a.a;
        zzfVar.getClass();
        pnf.o(zzfVar.M0, new bzf(string));
        this.b.destroy();
        return true;
    }
}
