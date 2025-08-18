package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class cm6 extends f78 {
    public static final AtomicInteger W0 = new AtomicInteger();
    public final r24 A0;
    public final z24 B0;
    public final nw4 C0;
    public final boolean D0;
    public final boolean E0;
    public final sue F0;
    public final zl6 G0;
    public final List H0;
    public final cr4 I0;
    public final at6 J0;
    public final yaf K0;
    public final boolean L0;
    public final boolean M0;
    public nw4 N0;
    public sn6 O0;
    public int P0;
    public boolean Q0;
    public volatile boolean R0;
    public boolean S0;
    public zw6 T0;
    public boolean U0;
    public boolean V0;
    public final int v0;
    public final int w0;
    public final Uri x0;
    public final boolean y0;
    public final int z0;

    public cm6(zl6 zl6Var, r24 r24Var, z24 z24Var, oy5 oy5Var, boolean z, r24 r24Var2, z24 z24Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, sue sueVar, cr4 cr4Var, nw4 nw4Var, at6 at6Var, yaf yafVar, boolean z6, i4b i4bVar) {
        super(r24Var, z24Var, oy5Var, i, obj, j, j2, j3);
        this.L0 = z;
        this.z0 = i2;
        this.V0 = z3;
        this.w0 = i3;
        this.B0 = z24Var2;
        this.A0 = r24Var2;
        this.Q0 = z24Var2 != null;
        this.M0 = z2;
        this.x0 = uri;
        this.D0 = z5;
        this.F0 = sueVar;
        this.E0 = z4;
        this.G0 = zl6Var;
        this.H0 = list;
        this.I0 = cr4Var;
        this.C0 = nw4Var;
        this.J0 = at6Var;
        this.K0 = yafVar;
        this.y0 = z6;
        ls5 ls5Var = zw6.b;
        this.T0 = ffc.X;
        this.v0 = W0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (lz7.T(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.fo7
    public final void a() {
        this.R0 = true;
    }

    @Override // defpackage.f78
    public final boolean c() {
        throw null;
    }

    public final void d(r24 r24Var, z24 z24Var, boolean z, boolean z2) {
        z24 z24VarB;
        long j;
        long j2;
        if (z) {
            z = this.P0 != 0;
            z24VarB = z24Var;
        } else {
            z24VarB = z24Var.b(this.P0);
        }
        try {
            ra4 ra4VarG = g(r24Var, z24VarB, z2);
            if (z) {
                ra4VarG.z(this.P0);
            }
            while (!this.R0) {
                try {
                    try {
                        if (((ka5) this.N0.b).i(ra4VarG, nw4.X) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.o.X & 16384) == 0) {
                            throw e;
                        }
                        ((ka5) this.N0.b).d(0L, 0L);
                        j = ra4VarG.o;
                        j2 = z24Var.f;
                    }
                } catch (Throwable th) {
                    this.P0 = (int) (ra4VarG.o - z24Var.f);
                    throw th;
                }
            }
            j = ra4VarG.o;
            j2 = z24Var.f;
            this.P0 = (int) (j - j2);
        } finally {
            kq0.f(r24Var);
        }
    }

    public final int f(int i) {
        np8.f(!this.y0);
        if (i >= this.T0.size()) {
            return 0;
        }
        return ((Integer) this.T0.get(i)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ra4 g(defpackage.r24 r23, defpackage.z24 r24, boolean r25) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm6.g(r24, z24, boolean):ra4");
    }

    @Override // defpackage.fo7
    public final void load() {
        nw4 nw4Var;
        this.O0.getClass();
        if (this.N0 == null && (nw4Var = this.C0) != null) {
            ka5 ka5Var = (ka5) nw4Var.b;
            if ((ka5Var instanceof h3f) || (ka5Var instanceof e26)) {
                this.N0 = nw4Var;
                this.Q0 = false;
            }
        }
        if (this.Q0) {
            r24 r24Var = this.A0;
            r24Var.getClass();
            z24 z24Var = this.B0;
            z24Var.getClass();
            d(r24Var, z24Var, this.M0, false);
            this.P0 = 0;
            this.Q0 = false;
        }
        if (this.R0) {
            return;
        }
        if (!this.E0) {
            d(this.t0, this.b, this.L0, true);
        }
        this.S0 = !this.R0;
    }
}
