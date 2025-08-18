package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ba0 extends hz3 {
    public final Context a;
    public final d9f b;
    public final d9f c;
    public final String d;

    public ba0(Context context, d9f d9fVar, d9f d9fVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (d9fVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = d9fVar;
        if (d9fVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = d9fVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3Var = (hz3) obj;
        if (this.a.equals(((ba0) hz3Var).a)) {
            ba0 ba0Var = (ba0) hz3Var;
            if (this.b.equals(ba0Var.b) && this.c.equals(ba0Var.c) && this.d.equals(ba0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return zr6.l(sb, this.d, "}");
    }
}
