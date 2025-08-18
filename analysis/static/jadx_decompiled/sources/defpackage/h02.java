package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class h02 implements k2f {
    public final rxd a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final d9f e;
    public final d9f f;
    public final int g;

    public h02(Context context, d9f d9fVar, d9f d9fVar2) {
        pa7 pa7Var = new pa7();
        kj6.b.b(pa7Var);
        pa7Var.d = true;
        this.a = new rxd(19, pa7Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(fw0.c);
        this.e = d9fVar2;
        this.f = d9fVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(wg0.i("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ja0 a(defpackage.ja0 r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h02.a(ja0):ja0");
    }
}
