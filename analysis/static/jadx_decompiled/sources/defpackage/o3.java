package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class o3 {
    public p3[] a;
    public int b;
    public int c;
    public yae o;

    public final p3 h() {
        p3 p3VarJ;
        yae yaeVar;
        synchronized (this) {
            try {
                p3[] p3VarArrK = this.a;
                if (p3VarArrK == null) {
                    p3VarArrK = k();
                    this.a = p3VarArrK;
                } else if (this.b >= p3VarArrK.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(p3VarArrK, p3VarArrK.length * 2);
                    this.a = (p3[]) objArrCopyOf;
                    p3VarArrK = (p3[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    p3VarJ = p3VarArrK[i];
                    if (p3VarJ == null) {
                        p3VarJ = j();
                        p3VarArrK[i] = p3VarJ;
                    }
                    i++;
                    if (i >= p3VarArrK.length) {
                        i = 0;
                    }
                } while (!p3VarJ.a(this));
                this.c = i;
                this.b++;
                yaeVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yaeVar != null) {
            yaeVar.z(1);
        }
        return p3VarJ;
    }

    public final j0e i() {
        yae yaeVar;
        synchronized (this) {
            yaeVar = this.o;
            if (yaeVar == null) {
                int i = this.b;
                yaeVar = new yae(1, Integer.MAX_VALUE, 2);
                yaeVar.g(Integer.valueOf(i));
                this.o = yaeVar;
            }
        }
        return yaeVar;
    }

    public abstract p3 j();

    public abstract p3[] k();

    public final void l(p3 p3Var) {
        yae yaeVar;
        int i;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                yaeVar = this.o;
                if (i2 == 0) {
                    this.c = 0;
                }
                continuationArrB = p3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                continuation.resumeWith(e5f.a);
            }
        }
        if (yaeVar != null) {
            yaeVar.z(-1);
        }
    }
}
