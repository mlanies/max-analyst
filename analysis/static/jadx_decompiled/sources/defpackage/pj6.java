package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pj6 extends e5c {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        int i = oaf.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public pj6() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.e5c
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.e5c
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(e5c.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pj6)) {
            return false;
        }
        pj6 pj6Var = (pj6) obj;
        return this.c == pj6Var.c && this.b == pj6Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public pj6(boolean z) {
        this.b = true;
        this.c = z;
    }
}
