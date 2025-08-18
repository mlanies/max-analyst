package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class ck4 {
    public final long a;

    public /* synthetic */ ck4(long j) {
        this.a = j;
    }

    public static final /* synthetic */ ck4 a(long j) {
        return new ck4(j);
    }

    public static long b(int i, float f) {
        return Float.floatToIntBits(f) + (i << 32);
    }

    public static final float c(long j, Context context) {
        return d(j, context.getResources().getDisplayMetrics());
    }

    public static final float d(long j, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension((int) (j >> 32), e(j), displayMetrics);
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck4) {
            return this.a == ((ck4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Dimension(encodedValue="), this.a, ")");
    }
}
