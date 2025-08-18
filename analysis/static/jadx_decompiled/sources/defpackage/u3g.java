package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class u3g {
    public final zzf a;

    public u3g(zzf zzfVar) {
        this.a = zzfVar;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        c8d c8dVar = this.a.D0;
        j47.T((sx3) c8dVar.a, ((w9a) ((kke) c8dVar.b)).a(), null, new ca7(str, str2, c8dVar, null), 2);
    }

    @JavascriptInterface
    public final void resolveShare(String str, byte[] bArr, String str2, String str3) {
        zzf zzfVar = this.a;
        zzfVar.getClass();
        pnf.n(zzfVar, null, null, new szf(zzfVar, str, bArr, str2, str3, null), 3);
    }
}
