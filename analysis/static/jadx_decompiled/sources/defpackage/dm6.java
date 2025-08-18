package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dm6 extends g78 {
    public static final AtomicInteger X0 = new AtomicInteger();
    public final t24 A0;
    public final a34 B0;
    public final te C0;
    public final boolean D0;
    public final boolean E0;
    public final tue F0;
    public final am6 G0;
    public final List H0;
    public final dr4 I0;
    public final bt6 J0;
    public final wpa K0;
    public final boolean L0;
    public final boolean M0;
    public final long N0;
    public te O0;
    public tn6 P0;
    public int Q0;
    public boolean R0;
    public volatile boolean S0;
    public boolean T0;
    public zw6 U0;
    public boolean V0;
    public boolean W0;
    public final int v0;
    public final int w0;
    public final Uri x0;
    public final boolean y0;
    public final int z0;

    public dm6(am6 am6Var, t24 t24Var, a34 a34Var, qy5 qy5Var, boolean z, t24 t24Var2, a34 a34Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, tue tueVar, long j4, dr4 dr4Var, te teVar, bt6 bt6Var, wpa wpaVar, boolean z6, j4b j4bVar) {
        super(t24Var, a34Var, qy5Var, i, obj, j, j2, j3);
        this.L0 = z;
        this.z0 = i2;
        this.W0 = z3;
        this.w0 = i3;
        this.B0 = a34Var2;
        this.A0 = t24Var2;
        this.R0 = a34Var2 != null;
        this.M0 = z2;
        this.x0 = uri;
        this.D0 = z5;
        this.F0 = tueVar;
        this.N0 = j4;
        this.E0 = z4;
        this.G0 = am6Var;
        this.H0 = list;
        this.I0 = dr4Var;
        this.C0 = teVar;
        this.J0 = bt6Var;
        this.K0 = wpaVar;
        this.y0 = z6;
        ls5 ls5Var = zw6.b;
        this.U0 = ffc.X;
        this.v0 = X0.getAndIncrement();
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

    @Override // defpackage.go7
    public final void a() {
        this.S0 = true;
    }

    @Override // defpackage.g78
    public final boolean c() {
        throw null;
    }

    public final void d(t24 t24Var, a34 a34Var, boolean z, boolean z2) {
        a34 a34VarB;
        long j;
        long j2;
        if (z) {
            z = this.Q0 != 0;
            a34VarB = a34Var;
        } else {
            a34VarB = a34Var.b(this.Q0);
        }
        try {
            sa4 sa4VarG = g(t24Var, a34VarB, z2);
            if (z) {
                sa4VarG.z(this.Q0);
            }
            while (!this.S0) {
                try {
                    try {
                        if (((la5) this.O0.b).g(sa4VarG, te.Y) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.o.f & 16384) == 0) {
                            throw e;
                        }
                        ((la5) this.O0.b).d(0L, 0L);
                        j = sa4VarG.o;
                        j2 = a34Var.f;
                    }
                } catch (Throwable th) {
                    this.Q0 = (int) (sa4VarG.o - a34Var.f);
                    throw th;
                }
            }
            j = sa4VarG.o;
            j2 = a34Var.f;
            this.Q0 = (int) (j - j2);
        } finally {
            mr0.i(t24Var);
        }
    }

    public final int f(int i) {
        fm9.k(!this.y0);
        if (i >= this.U0.size()) {
            return 0;
        }
        return ((Integer) this.U0.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Type inference failed for: r4v18, types: [mbe] */
    /* JADX WARN: Type inference failed for: r4v34, types: [mbe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sa4 g(defpackage.t24 r31, defpackage.a34 r32, boolean r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm6.g(t24, a34, boolean):sa4");
    }

    @Override // defpackage.go7
    public final void load() {
        te teVar;
        this.P0.getClass();
        if (this.O0 == null && (teVar = this.C0) != null) {
            la5 la5VarM = ((la5) teVar.b).m();
            if ((la5VarM instanceof i3f) || (la5VarM instanceof f26)) {
                this.O0 = this.C0;
                this.R0 = false;
            }
        }
        if (this.R0) {
            t24 t24Var = this.A0;
            t24Var.getClass();
            a34 a34Var = this.B0;
            a34Var.getClass();
            d(t24Var, a34Var, this.M0, false);
            this.Q0 = 0;
            this.R0 = false;
        }
        if (this.S0) {
            return;
        }
        if (!this.E0) {
            d(this.t0, this.b, this.L0, true);
        }
        this.T0 = !this.S0;
    }
}
