package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xpe extends vj0 implements Handler.Callback {
    public final ob6 C0;
    public final p54 D0;
    public a04 E0;
    public final ebe F0;
    public boolean G0;
    public int H0;
    public dbe I0;
    public ibe J0;
    public kbe K0;
    public kbe L0;
    public int M0;
    public final Handler N0;
    public final o75 O0;
    public final y7g P0;
    public boolean Q0;
    public boolean R0;
    public qy5 S0;
    public long T0;
    public long U0;
    public long V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpe(o75 o75Var, Looper looper) {
        Handler handler;
        super(3);
        qqd qqdVar = ebe.W;
        this.O0 = o75Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = oaf.a;
            handler = new Handler(looper, this);
        }
        this.N0 = handler;
        this.F0 = qqdVar;
        this.C0 = new ob6();
        this.D0 = new p54(1);
        this.P0 = new y7g(18);
        this.V0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    @Override // defpackage.vj0
    public final int D(qy5 qy5Var) {
        if (!Objects.equals(qy5Var.n, "application/x-media3-cues")) {
            qqd qqdVar = (qqd) this.F0;
            qqdVar.getClass();
            if (!((b46) qqdVar.b).a(qy5Var)) {
                String str = qy5Var.n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return ia9.j(str) ? vj0.b(1, 0, 0, 0) : vj0.b(0, 0, 0, 0);
                }
            }
        }
        return vj0.b(qy5Var.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        fm9.j("Legacy decoding is disabled, can't handle " + this.S0.n + " samples (expected application/x-media3-cues).", Objects.equals(this.S0.n, "application/cea-608") || Objects.equals(this.S0.n, "application/x-mp4-cea-608") || Objects.equals(this.S0.n, "application/cea-708"));
    }

    public final long G() {
        if (this.M0 == -1) {
            return Long.MAX_VALUE;
        }
        this.K0.getClass();
        if (this.M0 >= this.K0.u()) {
            return Long.MAX_VALUE;
        }
        return this.K0.i(this.M0);
    }

    public final long H(long j) {
        fm9.k(j != -9223372036854775807L);
        fm9.k(this.T0 != -9223372036854775807L);
        return j - this.T0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r7 = this;
            r0 = 1
            r7.G0 = r0
            qy5 r1 = r7.S0
            r1.getClass()
            ebe r2 = r7.F0
            qqd r2 = (defpackage.qqd) r2
            r2.getClass()
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L4f
            int r4 = r1.G
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L33;
                case 1566015601: goto L2a;
                case 1566016562: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r5
            goto L3d
        L1f:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3d
        L2a:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3d
            goto L1d
        L33:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3c
            goto L1d
        L3c:
            r0 = 0
        L3d:
            switch(r0) {
                case 0: goto L49;
                case 1: goto L49;
                case 2: goto L41;
                default: goto L40;
            }
        L40:
            goto L4f
        L41:
            u02 r0 = new u02
            java.util.List r1 = r1.q
            r0.<init>(r4, r1)
            goto L70
        L49:
            n02 r0 = new n02
            r0.<init>(r3, r4)
            goto L70
        L4f:
            java.lang.Object r0 = r2.b
            b46 r0 = (defpackage.b46) r0
            boolean r2 = r0.a(r1)
            if (r2 == 0) goto L78
            obe r0 = r0.e(r1)
            vn0 r1 = new vn0
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L70:
            r7.I0 = r0
            long r1 = r7.w0
            r0.a(r1)
            return
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = defpackage.wg0.i(r0, r3)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.J():void");
    }

    public final void K(zz3 zz3Var) {
        zw6 zw6Var = zz3Var.a;
        o75 o75Var = this.O0;
        o75Var.a.x0.f(27, new z72(5, zw6Var));
        u75 u75Var = o75Var.a;
        u75Var.j1 = zz3Var;
        u75Var.x0.f(27, new q64(16, zz3Var));
    }

    public final void L() {
        this.J0 = null;
        this.M0 = -1;
        kbe kbeVar = this.K0;
        if (kbeVar != null) {
            kbeVar.w();
            this.K0 = null;
        }
        kbe kbeVar2 = this.L0;
        if (kbeVar2 != null) {
            kbeVar2.w();
            this.L0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        K((zz3) message.obj);
        return true;
    }

    @Override // defpackage.vj0
    public final String k() {
        return "TextRenderer";
    }

    @Override // defpackage.vj0
    public final boolean m() {
        return this.R0;
    }

    @Override // defpackage.vj0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.vj0
    public final void p() {
        this.S0 = null;
        this.V0 = -9223372036854775807L;
        zz3 zz3Var = new zz3(H(this.U0), ffc.X);
        Handler handler = this.N0;
        if (handler != null) {
            handler.obtainMessage(1, zz3Var).sendToTarget();
        } else {
            K(zz3Var);
        }
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        if (this.I0 != null) {
            L();
            dbe dbeVar = this.I0;
            dbeVar.getClass();
            dbeVar.release();
            this.I0 = null;
            this.H0 = 0;
        }
    }

    @Override // defpackage.vj0
    public final void r(long j, boolean z) {
        this.U0 = j;
        a04 a04Var = this.E0;
        if (a04Var != null) {
            a04Var.clear();
        }
        zz3 zz3Var = new zz3(H(this.U0), ffc.X);
        Handler handler = this.N0;
        if (handler != null) {
            handler.obtainMessage(1, zz3Var).sendToTarget();
        } else {
            K(zz3Var);
        }
        this.Q0 = false;
        this.R0 = false;
        this.V0 = -9223372036854775807L;
        qy5 qy5Var = this.S0;
        if (qy5Var == null || Objects.equals(qy5Var.n, "application/x-media3-cues")) {
            return;
        }
        if (this.H0 == 0) {
            L();
            dbe dbeVar = this.I0;
            dbeVar.getClass();
            dbeVar.flush();
            dbeVar.a(this.w0);
            return;
        }
        L();
        dbe dbeVar2 = this.I0;
        dbeVar2.getClass();
        dbeVar2.release();
        this.I0 = null;
        this.H0 = 0;
        J();
    }

    @Override // defpackage.vj0
    public final void x(qy5[] qy5VarArr, long j, long j2) {
        this.T0 = j2;
        qy5 qy5Var = qy5VarArr[0];
        this.S0 = qy5Var;
        if (Objects.equals(qy5Var.n, "application/x-media3-cues")) {
            this.E0 = this.S0.H == 1 ? new ur8() : new y8(25);
            return;
        }
        F();
        if (this.I0 != null) {
            this.H0 = 1;
        } else {
            J();
        }
    }

    @Override // defpackage.vj0
    public final void z(long j, long j2) {
        boolean z;
        long jI;
        if (this.y0) {
            long j3 = this.V0;
            if (j3 != -9223372036854775807L && j >= j3) {
                L();
                this.R0 = true;
            }
        }
        if (this.R0) {
            return;
        }
        qy5 qy5Var = this.S0;
        qy5Var.getClass();
        boolean zEquals = Objects.equals(qy5Var.n, "application/x-media3-cues");
        Handler handler = this.N0;
        boolean zD = false;
        zD = false;
        zD = false;
        y7g y7gVar = this.P0;
        if (zEquals) {
            this.E0.getClass();
            if (!this.Q0) {
                p54 p54Var = this.D0;
                if (y(y7gVar, p54Var, 0) == -4) {
                    if (p54Var.f(4)) {
                        this.Q0 = true;
                    } else {
                        p54Var.y();
                        ByteBuffer byteBuffer = p54Var.X;
                        byteBuffer.getClass();
                        long j4 = p54Var.Z;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.C0.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        ww6 ww6VarI = zw6.i();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            ww6VarI.a(yz3.a(bundle2));
                        }
                        b04 b04Var = new b04(j4, bundle.getLong("d"), ww6VarI.j());
                        p54Var.v();
                        zD = this.E0.d(b04Var, j);
                    }
                }
            }
            long jC = this.E0.c(this.U0);
            if (jC == Long.MIN_VALUE && this.Q0 && !zD) {
                this.R0 = true;
            }
            if (jC != Long.MIN_VALUE && jC <= j) {
                zD = true;
            }
            if (zD) {
                zw6 zw6VarI = this.E0.i(j);
                long jN = this.E0.n(j);
                zz3 zz3Var = new zz3(H(jN), zw6VarI);
                if (handler != null) {
                    handler.obtainMessage(1, zz3Var).sendToTarget();
                } else {
                    K(zz3Var);
                }
                this.E0.u(jN);
            }
            this.U0 = j;
            return;
        }
        F();
        this.U0 = j;
        if (this.L0 == null) {
            dbe dbeVar = this.I0;
            dbeVar.getClass();
            dbeVar.b(j);
            try {
                dbe dbeVar2 = this.I0;
                dbeVar2.getClass();
                this.L0 = (kbe) dbeVar2.c();
            } catch (SubtitleDecoderException e) {
                z04.v("Subtitle decoding failed. streamFormat=" + this.S0, e);
                zz3 zz3Var2 = new zz3(H(this.U0), ffc.X);
                if (handler != null) {
                    handler.obtainMessage(1, zz3Var2).sendToTarget();
                } else {
                    K(zz3Var2);
                }
                L();
                dbe dbeVar3 = this.I0;
                dbeVar3.getClass();
                dbeVar3.release();
                this.I0 = null;
                this.H0 = 0;
                J();
                return;
            }
        }
        if (this.s0 != 2) {
            return;
        }
        if (this.K0 != null) {
            long jG = G();
            z = false;
            while (jG <= j) {
                this.M0++;
                jG = G();
                z = true;
            }
        } else {
            z = false;
        }
        kbe kbeVar = this.L0;
        boolean z2 = z;
        if (kbeVar != null) {
            z2 = z;
            if (!kbeVar.f(4)) {
                z2 = z;
                if (kbeVar.c <= j) {
                    kbe kbeVar2 = this.K0;
                    if (kbeVar2 != null) {
                        kbeVar2.w();
                    }
                    this.M0 = kbeVar.g(j);
                    this.K0 = kbeVar;
                    this.L0 = null;
                    z2 = true;
                }
            } else if (!z) {
                z2 = z;
                if (G() == Long.MAX_VALUE) {
                    if (this.H0 == 2) {
                        L();
                        dbe dbeVar4 = this.I0;
                        dbeVar4.getClass();
                        dbeVar4.release();
                        this.I0 = null;
                        this.H0 = 0;
                        J();
                        z2 = z;
                    } else {
                        L();
                        this.R0 = true;
                        z2 = z;
                    }
                }
            }
        }
        if (z2) {
            this.K0.getClass();
            int iG = this.K0.g(j);
            if (iG == 0 || this.K0.u() == 0) {
                jI = this.K0.c;
            } else if (iG == -1) {
                kbe kbeVar3 = this.K0;
                jI = kbeVar3.i(kbeVar3.u() - 1);
            } else {
                jI = this.K0.i(iG - 1);
            }
            zz3 zz3Var3 = new zz3(H(jI), this.K0.p(j));
            if (handler != null) {
                handler.obtainMessage(1, zz3Var3).sendToTarget();
            } else {
                K(zz3Var3);
            }
        }
        if (this.H0 == 2) {
            return;
        }
        while (!this.Q0) {
            try {
                ibe ibeVar = this.J0;
                if (ibeVar == null) {
                    dbe dbeVar5 = this.I0;
                    dbeVar5.getClass();
                    ibeVar = (ibe) dbeVar5.f();
                    if (ibeVar == null) {
                        return;
                    } else {
                        this.J0 = ibeVar;
                    }
                }
                if (this.H0 == 1) {
                    ibeVar.b = 4;
                    dbe dbeVar6 = this.I0;
                    dbeVar6.getClass();
                    dbeVar6.d(ibeVar);
                    this.J0 = null;
                    this.H0 = 2;
                    return;
                }
                int iY = y(y7gVar, ibeVar, 0);
                if (iY == -4) {
                    if (ibeVar.f(4)) {
                        this.Q0 = true;
                        this.G0 = false;
                    } else {
                        qy5 qy5Var2 = (qy5) y7gVar.c;
                        if (qy5Var2 == null) {
                            return;
                        }
                        ibeVar.v0 = qy5Var2.s;
                        ibeVar.y();
                        this.G0 &= !ibeVar.f(1);
                    }
                    if (!this.G0) {
                        dbe dbeVar7 = this.I0;
                        dbeVar7.getClass();
                        dbeVar7.d(ibeVar);
                        this.J0 = null;
                    }
                } else if (iY == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                z04.v("Subtitle decoding failed. streamFormat=" + this.S0, e2);
                zz3 zz3Var4 = new zz3(H(this.U0), ffc.X);
                if (handler != null) {
                    handler.obtainMessage(1, zz3Var4).sendToTarget();
                } else {
                    K(zz3Var4);
                }
                L();
                dbe dbeVar8 = this.I0;
                dbeVar8.getClass();
                dbeVar8.release();
                this.I0 = null;
                this.H0 = 0;
                J();
                return;
            }
        }
    }
}
