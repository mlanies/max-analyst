package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public class v8 implements n66, Serializable {
    public final boolean X;
    public final int Y;
    public final int Z;
    public final Object a;
    public final Class b;
    public final String c;
    public final String o;

    public v8(int i, Class cls, String str, int i2) {
        this(i, i2, cls, fq1.NO_RECEIVER, "<init>", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return this.X == v8Var.X && this.Y == v8Var.Y && this.Z == v8Var.Z && tpa.f(this.a, v8Var.a) && tpa.f(this.b, v8Var.b) && this.c.equals(v8Var.c) && this.o.equals(v8Var.o);
    }

    @Override // defpackage.n66
    public final int getArity() {
        return this.Y;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((rh4.d(rh4.d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.o) + (this.X ? 1231 : 1237)) * 31) + this.Y) * 31) + this.Z;
    }

    public final String toString() {
        nec.a.getClass();
        return oec.a(this);
    }

    public v8(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.o = str2;
        this.X = false;
        this.Y = i;
        this.Z = i2 >> 1;
    }
}
