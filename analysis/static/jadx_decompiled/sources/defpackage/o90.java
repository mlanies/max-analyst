package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class o90 {
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final Range g = new Range(0, Integer.MAX_VALUE);
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        jc6 jc6VarA = a();
        jc6VarA.X = 0;
        jc6VarA.k();
    }

    public o90(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    public static jc6 a() {
        jc6 jc6Var = new jc6();
        jc6Var.b = -1;
        jc6Var.c = -1;
        jc6Var.X = -1;
        Range range = f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        jc6Var.a = range;
        Range range2 = g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        jc6Var.o = range2;
        return jc6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        o90 o90Var = (o90) obj;
        return this.a.equals(o90Var.a) && this.b == o90Var.b && this.c == o90Var.c && this.d.equals(o90Var.d) && this.e == o90Var.e;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return zr6.j(sb, this.e, "}");
    }
}
