package defpackage;

import android.util.Range;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mc0 {
    public static final Range e = new Range(0, Integer.MAX_VALUE);
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final b9b g;
    public final b9b a;
    public final Range b;
    public final Range c;
    public final int d;

    static {
        mb0 mb0Var = mb0.f;
        g = b9b.l(Arrays.asList(mb0Var, mb0.e, mb0.d), new la0(mb0Var, 1));
    }

    public mc0(b9b b9bVar, Range range, Range range2, int i) {
        this.a = b9bVar;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    public static lc0 a() {
        lc0 lc0Var = new lc0();
        lc0Var.b(g);
        Range range = e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        lc0Var.b = range;
        Range range2 = f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        lc0Var.c = range2;
        lc0Var.d = -1;
        return lc0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0Var = (mc0) obj;
        return this.a.equals(mc0Var.a) && this.b.equals(mc0Var.b) && this.c.equals(mc0Var.c) && this.d == mc0Var.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", frameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return zr6.j(sb, this.d, "}");
    }
}
