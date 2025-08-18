package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class gbe implements la5 {
    public yze Z;
    public final obe a;
    public final qy5 c;
    public final ArrayList o;
    public int s0;
    public int t0;
    public long[] u0;
    public long v0;
    public final kj6 b = new kj6(9);
    public byte[] Y = oaf.f;
    public final wpa X = new wpa();

    public gbe(obe obeVar, qy5 qy5Var) {
        this.a = obeVar;
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.m = ia9.l("application/x-media3-cues");
        ny5VarA.i = qy5Var.n;
        ny5VarA.G = obeVar.J();
        this.c = new qy5(ny5VarA);
        this.o = new ArrayList();
        this.t0 = 0;
        this.u0 = oaf.g;
        this.v0 = -9223372036854775807L;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        fm9.k(this.t0 == 0);
        yze yzeVarMo6B = pa5Var.mo6B(0, 3);
        this.Z = yzeVarMo6B;
        yzeVarMo6B.e(this.c);
        pa5Var.w();
        pa5Var.J(new vz6(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.t0 = 1;
    }

    public final void a(fbe fbeVar) {
        fm9.l(this.Z);
        byte[] bArr = fbeVar.b;
        int length = bArr.length;
        wpa wpaVar = this.X;
        wpaVar.getClass();
        wpaVar.E(bArr.length, bArr);
        this.Z.b(wpaVar, length, 0);
        this.Z.a(fbeVar.a, 1, length, 0, null);
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        int i = this.t0;
        fm9.k((i == 0 || i == 5) ? false : true);
        this.v0 = j2;
        if (this.t0 == 2) {
            this.t0 = 1;
        }
        if (this.t0 == 4) {
            this.t0 = 3;
        }
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        int i = this.t0;
        fm9.k((i == 0 || i == 5) ? false : true);
        if (this.t0 == 1) {
            int iL = ((sa4) na5Var).c != -1 ? s5c.l(((sa4) na5Var).c) : 1024;
            if (iL > this.Y.length) {
                this.Y = new byte[iL];
            }
            this.s0 = 0;
            this.t0 = 2;
        }
        int i2 = this.t0;
        ArrayList arrayList = this.o;
        if (i2 == 2) {
            byte[] bArr = this.Y;
            if (bArr.length == this.s0) {
                this.Y = Arrays.copyOf(bArr, bArr.length + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            byte[] bArr2 = this.Y;
            int i3 = this.s0;
            sa4 sa4Var = (sa4) na5Var;
            int i4 = sa4Var.read(bArr2, i3, bArr2.length - i3);
            if (i4 != -1) {
                this.s0 += i4;
            }
            long j = sa4Var.c;
            if ((j != -1 && this.s0 == j) || i4 == -1) {
                try {
                    long j2 = this.v0;
                    this.a.G(this.Y, 0, this.s0, j2 != -9223372036854775807L ? new nbe(j2, true) : nbe.c, new bqc(20, this));
                    Collections.sort(arrayList);
                    this.u0 = new long[arrayList.size()];
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        this.u0[i5] = ((fbe) arrayList.get(i5)).a;
                    }
                    this.Y = oaf.f;
                    this.t0 = 4;
                } catch (RuntimeException e) {
                    throw ParserException.a(e, "SubtitleParser failed.");
                }
            }
        }
        if (this.t0 == 3) {
            if (((sa4) na5Var).g(((sa4) na5Var).c != -1 ? s5c.l(((sa4) na5Var).c) : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == -1) {
                long j3 = this.v0;
                for (int iF = j3 == -9223372036854775807L ? 0 : oaf.f(this.u0, j3, true); iF < arrayList.size(); iF++) {
                    a((fbe) arrayList.get(iF));
                }
                this.t0 = 4;
            }
        }
        return this.t0 == 4 ? -1 : 0;
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        return true;
    }

    @Override // defpackage.la5
    public final void release() {
        if (this.t0 == 5) {
            return;
        }
        this.a.reset();
        this.t0 = 5;
    }
}
