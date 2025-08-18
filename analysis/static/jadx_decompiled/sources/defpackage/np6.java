package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class np6 implements Closeable {
    public static final Logger X = Logger.getLogger(zo6.class.getName());
    public final mp6 a;
    public final qo6 b;
    public final fu0 c;
    public final boolean o;

    public np6(fu0 fu0Var, boolean z) {
        this.c = fu0Var;
        this.o = z;
        mp6 mp6Var = new mp6(fu0Var);
        this.a = mp6Var;
        this.b = new qo6(mp6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x027a, code lost:
    
        throw new java.io.IOException(defpackage.zr6.h(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r17, defpackage.cc1 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.a(boolean, cc1):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    public final void d(cc1 cc1Var) throws IOException {
        if (this.o) {
            if (!a(true, cc1Var)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        aw0 aw0Var = zo6.a;
        aw0 aw0VarE = this.c.e(aw0Var.c.length);
        Level level = Level.FINE;
        Logger logger = X;
        if (logger.isLoggable(level)) {
            logger.fine(naf.h("<< CONNECTION " + aw0VarE.d(), new Object[0]));
        }
        if (!aw0Var.equals(aw0VarE)) {
            throw new IOException("Expected a connection header but was ".concat(aw0VarE.j()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        if (r16 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        r5.j(defpackage.naf.b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.cc1 r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.g(cc1, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        throw new java.io.IOException(defpackage.zr6.h(r7, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.m(int, int, int, int):java.util.List");
    }

    public final void n(cc1 cc1Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = naf.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            fu0 fu0Var = this.c;
            fu0Var.readInt();
            fu0Var.readByte();
            byte[] bArr2 = naf.a;
            cc1Var.getClass();
            i -= 5;
        }
        List listM = m(nu0.A(i, i2, i4), i4, i2, i3);
        ((kp6) cc1Var.c).getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            kp6 kp6Var = (kp6) cc1Var.c;
            kp6Var.u0.c(new hp6(kp6Var.o + '[' + i3 + "] onHeaders", kp6Var, i3, listM, z), 0L);
            return;
        }
        synchronized (((kp6) cc1Var.c)) {
            rp6 rp6VarG = ((kp6) cc1Var.c).g(i3);
            if (rp6VarG != null) {
                rp6VarG.j(naf.u(listM), z);
                return;
            }
            kp6 kp6Var2 = (kp6) cc1Var.c;
            if (kp6Var2.Z) {
                return;
            }
            if (i3 <= kp6Var2.X) {
                return;
            }
            if (i3 % 2 == kp6Var2.Y % 2) {
                return;
            }
            rp6 rp6Var = new rp6(i3, (kp6) cc1Var.c, false, z, naf.u(listM));
            kp6 kp6Var3 = (kp6) cc1Var.c;
            kp6Var3.X = i3;
            kp6Var3.c.put(Integer.valueOf(i3), rp6Var);
            ((kp6) cc1Var.c).s0.f().c(new dp6(((kp6) cc1Var.c).o + '[' + i3 + "] onStream", rp6Var, cc1Var), 0L);
        }
    }

    public final void o(cc1 cc1Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = naf.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.c.readInt() & Integer.MAX_VALUE;
        List listM = m(nu0.A(i - 4, i2, i4), i4, i2, i3);
        kp6 kp6Var = (kp6) cc1Var.c;
        synchronized (kp6Var) {
            if (kp6Var.L0.contains(Integer.valueOf(i5))) {
                kp6Var.U(i5, 2);
                return;
            }
            kp6Var.L0.add(Integer.valueOf(i5));
            kp6Var.u0.c(new hp6(kp6Var.o + '[' + i5 + "] onRequest", kp6Var, i5, listM), 0L);
        }
    }
}
