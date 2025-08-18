package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class sad {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final iad d;

    static {
        int i = oaf.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public sad(int i) {
        this(i, Bundle.EMPTY);
    }

    public static sad a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        iad iadVarA = bundle3 != null ? iad.a(bundle3) : i != 0 ? new iad(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new sad(i, bundle2, j, iadVarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        iad iadVar = this.d;
        if (iadVar != null) {
            bundle.putBundle(h, iadVar.b());
        }
        return bundle;
    }

    public sad(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public sad(int i, Bundle bundle, long j, iad iadVar) {
        fm9.f(iadVar == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (iadVar == null && i < 0) {
            iadVar = new iad(i);
        }
        this.d = iadVar;
    }
}
