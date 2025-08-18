package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class c3b {
    public static final c3b d = new c3b(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        int i = oaf.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public c3b(float f2) {
        this(f2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c3b.class != obj.getClass()) {
            return false;
        }
        c3b c3bVar = (c3b) obj;
        return this.a == c3bVar.a && this.b == c3bVar.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = oaf.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public c3b(float f2, float f3) {
        fm9.f(f2 > 0.0f);
        fm9.f(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
