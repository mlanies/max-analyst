package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ayd extends e5c {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        int i = oaf.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public ayd(int i) {
        fm9.e("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    @Override // defpackage.e5c
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.e5c
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(e5c.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayd)) {
            return false;
        }
        ayd aydVar = (ayd) obj;
        return this.b == aydVar.b && this.c == aydVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public ayd(int i, float f) {
        boolean z = false;
        fm9.e("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        fm9.e("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
