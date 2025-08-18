package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class e5c {
    public static final String a;

    static {
        int i = oaf.a;
        a = Integer.toString(0, 36);
    }

    public static e5c a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = pj6.d;
            fm9.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(pj6.d, false) ? new pj6(bundle.getBoolean(pj6.e, false)) : new pj6();
        }
        if (i == 1) {
            String str3 = ysa.c;
            fm9.f(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(ysa.c, -1.0f);
            return f == -1.0f ? new ysa() : new ysa(f);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(zr6.h(i, "Unknown RatingType: "));
            }
            String str4 = lte.d;
            fm9.f(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(lte.d, false) ? new lte(bundle.getBoolean(lte.e, false)) : new lte();
        }
        String str5 = ayd.d;
        fm9.f(bundle.getInt(str, -1) == 2);
        int i2 = bundle.getInt(ayd.d, 5);
        float f2 = bundle.getFloat(ayd.e, -1.0f);
        return f2 == -1.0f ? new ayd(i2) : new ayd(i2, f2);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
