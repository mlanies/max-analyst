package defpackage;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g05 implements Closeable {
    public int X;
    public int Y;
    public int Z;
    public final o43 a;
    public final ide b;
    public ou6 c;
    public int o;
    public int s0;
    public int t0;
    public ColorSpace u0;
    public String v0;

    public g05(o43 o43Var) {
        this.c = ou6.c;
        this.o = -1;
        this.X = 0;
        this.Y = -1;
        this.Z = -1;
        this.s0 = 1;
        this.t0 = -1;
        if (!o43.n0(o43Var)) {
            throw new IllegalArgumentException();
        }
        this.a = o43Var.clone();
        this.b = null;
    }

    public static boolean U(g05 g05Var) {
        return g05Var.o >= 0 && g05Var.Y >= 0 && g05Var.Z >= 0;
    }

    public static g05 a(g05 g05Var) {
        g05 g05Var2 = null;
        if (g05Var != null) {
            ide ideVar = g05Var.b;
            if (ideVar != null) {
                g05Var2 = new g05(ideVar, g05Var.t0);
            } else {
                o43 o43VarO = o43.o(g05Var.a);
                if (o43VarO != null) {
                    try {
                        g05Var2 = new g05(o43VarO);
                    } finally {
                        o43.S(o43VarO);
                    }
                }
            }
            if (g05Var2 != null) {
                g05Var2.g(g05Var);
            }
        }
        return g05Var2;
    }

    public static void d(g05 g05Var) {
        if (g05Var != null) {
            g05Var.close();
        }
    }

    public static boolean m0(g05 g05Var) {
        return g05Var != null && g05Var.e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fc A[EDGE_INSN: B:219:0x01fc->B:137:0x01fc BREAK  A[LOOP:2: B:139:0x0204->B:146:0x0217], EDGE_INSN: B:220:0x01fc->B:137:0x01fc BREAK  A[LOOP:2: B:139:0x0204->B:146:0x0217]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fe A[Catch: IOException -> 0x0237, TryCatch #0 {IOException -> 0x0237, blocks: (B:92:0x0171, B:96:0x017a, B:99:0x0183, B:101:0x018c, B:131:0x01ed, B:135:0x01f3, B:150:0x0225, B:153:0x022c, B:156:0x0233, B:138:0x01fe, B:139:0x0204, B:143:0x020c, B:146:0x0217, B:118:0x01c0, B:122:0x01d0, B:126:0x01db, B:128:0x01e3, B:130:0x01e7, B:112:0x01ab), top: B:189:0x0171 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g05.S():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o43.S(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean e0() {
        /*
            r1 = this;
            monitor-enter(r1)
            o43 r0 = r1.a     // Catch: java.lang.Throwable -> L10
            boolean r0 = defpackage.o43.n0(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            ide r0 = r1.b     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g05.e0():boolean");
    }

    public final void g(g05 g05Var) {
        g05Var.o0();
        this.c = g05Var.c;
        g05Var.o0();
        this.Y = g05Var.Y;
        g05Var.o0();
        this.Z = g05Var.Z;
        g05Var.o0();
        this.o = g05Var.o;
        g05Var.o0();
        this.X = g05Var.X;
        this.s0 = g05Var.s0;
        this.t0 = g05Var.o();
        g05Var.getClass();
        g05Var.o0();
        this.u0 = g05Var.u0;
    }

    public final String m() {
        o43 o43VarO = o43.o(this.a);
        if (o43VarO == null) {
            return "";
        }
        int iMin = Math.min(o(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((qq8) o43VarO.e0()).S(0, 0, iMin, bArr);
            o43VarO.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i = 0; i < iMin; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        } catch (Throwable th) {
            o43VarO.close();
            throw th;
        }
    }

    public final InputStream n() {
        ide ideVar = this.b;
        if (ideVar != null) {
            return (InputStream) ideVar.get();
        }
        o43 o43VarO = o43.o(this.a);
        if (o43VarO == null) {
            return null;
        }
        try {
            return new q5b((qq8) o43VarO.e0());
        } finally {
            o43.S(o43VarO);
        }
    }

    public final void n0() throws IOException {
        S();
    }

    public final int o() {
        o43 o43Var = this.a;
        if (o43Var == null) {
            return this.t0;
        }
        o43Var.e0();
        return ((qq8) o43Var.e0()).U();
    }

    public final void o0() {
        if (this.Y < 0 || this.Z < 0) {
            S();
        }
    }

    public g05(ide ideVar, int i) {
        this.c = ou6.c;
        this.o = -1;
        this.X = 0;
        this.Y = -1;
        this.Z = -1;
        this.s0 = 1;
        this.t0 = -1;
        ideVar.getClass();
        this.a = null;
        this.b = ideVar;
        this.t0 = i;
    }
}
