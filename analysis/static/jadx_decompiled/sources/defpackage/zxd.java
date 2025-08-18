package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zxd extends d5c {
    public final int b;
    public final float c;

    public zxd(int i) {
        np8.c("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zxd)) {
            return false;
        }
        zxd zxdVar = (zxd) obj;
        return this.b == zxdVar.b && this.c == zxdVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public zxd(int i, float f) {
        boolean z = false;
        np8.c("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        np8.c("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
