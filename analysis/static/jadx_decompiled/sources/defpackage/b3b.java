package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b3b implements su0 {
    public static final b3b o = new b3b(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public b3b(float f, float f2) {
        np8.d(f > 0.0f);
        np8.d(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b3b.class != obj.getClass()) {
            return false;
        }
        b3b b3bVar = (b3b) obj;
        return this.a == b3bVar.a && this.b == b3bVar.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = maf.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
