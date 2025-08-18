package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c73 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final y9d a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final boolean h;

    static {
        int i2 = oaf.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public c73(y9d y9dVar, int i2, int i3, int i4, Uri uri, CharSequence charSequence, Bundle bundle, boolean z) {
        this.a = y9dVar;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.h = z;
    }

    public static ffc a(List list, z9d z9dVar, k3b k3bVar) {
        ww6 ww6Var = new ww6(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c73 c73Var = (c73) list.get(i2);
            if (c(c73Var, z9dVar, k3bVar)) {
                ww6Var.a(c73Var);
            } else {
                if (c73Var.h) {
                    Bundle bundle = new Bundle(c73Var.g);
                    c73Var = new c73(c73Var.a, c73Var.b, c73Var.c, c73Var.d, c73Var.e, c73Var.f, bundle, false);
                }
                ww6Var.a(c73Var);
            }
        }
        return ww6Var.j();
    }

    public static c73 b(int i2, Bundle bundle) {
        int i3;
        Bundle bundle2 = bundle.getBundle(i);
        y9d y9dVarA = bundle2 == null ? null : y9d.a(bundle2);
        int i4 = bundle.getInt(j, -1);
        int i5 = bundle.getInt(k, 0);
        CharSequence charSequence = bundle.getCharSequence(l, "");
        Bundle bundle3 = bundle.getBundle(m);
        boolean z = i2 < 3 || bundle.getBoolean(n, true);
        Uri uri = (Uri) bundle.getParcelable(o);
        int i6 = bundle.getInt(p, 0);
        Bundle bundle4 = Bundle.EMPTY;
        if (y9dVarA == null) {
            y9dVarA = null;
        }
        if (i4 != -1) {
            fm9.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", y9dVarA == null);
            i3 = i4;
        } else {
            i3 = -1;
        }
        Uri uri2 = uri != null ? uri : null;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        Bundle bundle5 = new Bundle(bundle3);
        fm9.j("Exactly one of sessionCommand and playerCommand should be set", (y9dVarA == null) != (i3 == -1));
        return new c73(y9dVarA, i3, i6, i5, uri2, charSequence, bundle5, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.c73 r1, defpackage.z9d r2, defpackage.k3b r3) {
        /*
            y9d r0 = r1.a
            if (r0 == 0) goto Lf
            r2.getClass()
            jx6 r2 = r2.a
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L1a
        Lf:
            r2 = -1
            int r1 = r1.b
            if (r1 == r2) goto L1c
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L1c
        L1a:
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c73.c(c73, z9d, k3b):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c73)) {
            return false;
        }
        c73 c73Var = (c73) obj;
        return f46.B(this.a, c73Var.a) && this.b == c73Var.b && this.c == c73Var.c && this.d == c73Var.d && f46.B(this.e, c73Var.e) && TextUtils.equals(this.f, c73Var.f) && this.h == c73Var.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.h), this.e});
    }
}
