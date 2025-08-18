package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class jb3 {
    public final Object a;
    public final iy1 b;
    public final c66 c;
    public final Object d;
    public final Throwable e;

    public jb3(Object obj, iy1 iy1Var, c66 c66Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = iy1Var;
        this.c = c66Var;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static jb3 a(jb3 jb3Var, iy1 iy1Var, CancellationException cancellationException, int i) {
        Object obj = jb3Var.a;
        if ((i & 2) != 0) {
            iy1Var = jb3Var.b;
        }
        iy1 iy1Var2 = iy1Var;
        c66 c66Var = jb3Var.c;
        Object obj2 = jb3Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = jb3Var.e;
        }
        jb3Var.getClass();
        return new jb3(obj, iy1Var2, c66Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb3)) {
            return false;
        }
        jb3 jb3Var = (jb3) obj;
        return tpa.f(this.a, jb3Var.a) && tpa.f(this.b, jb3Var.b) && tpa.f(this.c, jb3Var.c) && tpa.f(this.d, jb3Var.d) && tpa.f(this.e, jb3Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        iy1 iy1Var = this.b;
        int iHashCode2 = (iHashCode + (iy1Var == null ? 0 : iy1Var.hashCode())) * 31;
        c66 c66Var = this.c;
        int iHashCode3 = (iHashCode2 + (c66Var == null ? 0 : c66Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ jb3(Object obj, iy1 iy1Var, c66 c66Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : iy1Var, (i & 4) != 0 ? null : c66Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
