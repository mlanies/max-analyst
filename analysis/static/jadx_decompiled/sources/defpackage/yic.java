package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class yic implements Closeable {
    public final fi6 X;
    public final cj6 Y;
    public final i8c Z;
    public final mhc a;
    public final sob b;
    public final String c;
    public final int o;
    public final yic s0;
    public final yic t0;
    public final yic u0;
    public final long v0;
    public final long w0;
    public final od x0;

    public yic(mhc mhcVar, sob sobVar, String str, int i, fi6 fi6Var, cj6 cj6Var, i8c i8cVar, yic yicVar, yic yicVar2, yic yicVar3, long j, long j2, od odVar) {
        this.a = mhcVar;
        this.b = sobVar;
        this.c = str;
        this.o = i;
        this.X = fi6Var;
        this.Y = cj6Var;
        this.Z = i8cVar;
        this.s0 = yicVar;
        this.t0 = yicVar2;
        this.u0 = yicVar3;
        this.v0 = j;
        this.w0 = j2;
        this.x0 = odVar;
    }

    public static String a(yic yicVar, String str) {
        String strA = yicVar.Y.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i8c i8cVar = this.Z;
        if (i8cVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        i8cVar.close();
    }

    public final boolean m() {
        int i = this.o;
        return 200 <= i && 299 >= i;
    }

    public final xic n() {
        xic xicVar = new xic();
        xicVar.a = this.a;
        xicVar.b = this.b;
        xicVar.c = this.o;
        xicVar.d = this.c;
        xicVar.e = this.X;
        xicVar.f = this.Y.c();
        xicVar.g = this.Z;
        xicVar.h = this.s0;
        xicVar.i = this.t0;
        xicVar.j = this.u0;
        xicVar.k = this.v0;
        xicVar.l = this.w0;
        xicVar.m = this.x0;
        return xicVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.o + ", message=" + this.c + ", url=" + this.a.b + '}';
    }
}
