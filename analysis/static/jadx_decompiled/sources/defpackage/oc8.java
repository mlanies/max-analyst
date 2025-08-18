package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class oc8 {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final Bundle a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        int i = oaf.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public oc8(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = new Bundle(bundle);
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static oc8 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(e);
        boolean z = bundle.getBoolean(f, false);
        boolean z2 = bundle.getBoolean(g, false);
        boolean z3 = bundle.getBoolean(h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new oc8(bundle2, z, z2, z3);
    }
}
