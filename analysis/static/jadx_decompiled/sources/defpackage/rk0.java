package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class rk0 {
    public final Uri a;
    public kl b = kl.o;
    public final el c = new el();

    public rk0(Uri uri) {
        this.a = uri;
    }

    public final sk0 a(za7 za7Var) {
        return new sk0(this.a, this.b, this.c, za7Var);
    }

    public final void b(String str, String str2) {
        this.c.a(new n9e(str, str2));
    }

    public final void c(String str, boolean z) {
        this.c.a(new yp0(str, z));
    }
}
