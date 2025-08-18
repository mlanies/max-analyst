package defpackage;

import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jn6 implements frc {
    public final int a;
    public final sn6 b;
    public int c = -1;

    public jn6(sn6 sn6Var, int i) {
        this.b = sn6Var;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.np8.d(r0)
            sn6 r0 = r6.b
            r0.d()
            int[] r3 = r0.V0
            r3.getClass()
            int[] r3 = r0.V0
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set r1 = r0.U0
            sze r0 = r0.T0
            qze r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L36
            r0 = -3
            r3 = r0
            goto L3a
        L30:
            boolean[] r0 = r0.Y0
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
        L36:
            r3 = r5
            goto L3a
        L38:
            r0[r3] = r1
        L3a:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn6.a():void");
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.frc
    public final void c() throws DrmSession$DrmSessionException, SampleQueueMappingException {
        int i = this.c;
        sn6 sn6Var = this.b;
        if (i == -2) {
            sn6Var.d();
            String str = sn6Var.T0.a(this.a).c[0].w0;
            StringBuilder sb = new StringBuilder(rh4.e(60, str));
            sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
            sb.append(str);
            sb.append(".");
            throw new SampleQueueMappingException(sb.toString());
        }
        if (i == -1) {
            sn6Var.u();
        } else if (i != -3) {
            sn6Var.u();
            sn6Var.G0[i].v();
        }
    }

    @Override // defpackage.frc
    public final boolean d() {
        if (this.c != -3) {
            if (b()) {
                int i = this.c;
                sn6 sn6Var = this.b;
                if (sn6Var.m() || !sn6Var.G0[i].t(sn6Var.e1)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.frc
    public final int e(long j) {
        int iMin;
        if (!b()) {
            return 0;
        }
        int i = this.c;
        sn6 sn6Var = this.b;
        if (sn6Var.m()) {
            return 0;
        }
        qn6 qn6Var = sn6Var.G0[i];
        int iQ = qn6Var.q(j, sn6Var.e1);
        cm6 cm6Var = (cm6) mqd.n(sn6Var.y0);
        if (cm6Var == null || cm6Var.V0) {
            iMin = iQ;
        } else {
            iMin = Math.min(iQ, cm6Var.f(i) - qn6Var.o());
        }
        qn6Var.B(iMin);
        return iMin;
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) {
        oy5 oy5Var;
        int iY = -3;
        if (this.c == -3) {
            o54Var.a(4);
            return -4;
        }
        if (b()) {
            int i2 = this.c;
            sn6 sn6Var = this.b;
            if (!sn6Var.m()) {
                ArrayList arrayList = sn6Var.y0;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((cm6) arrayList.get(i4)).v0;
                        int length = sn6Var.G0.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (sn6Var.Y0[i6] && sn6Var.G0[i6].x() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    maf.I(arrayList, 0, i4);
                    cm6 cm6Var = (cm6) arrayList.get(0);
                    oy5 oy5Var2 = cm6Var.o;
                    if (!oy5Var2.equals(sn6Var.R0)) {
                        sn6Var.v0.b(sn6Var.b, oy5Var2, cm6Var.X, cm6Var.Y, cm6Var.Z);
                    }
                    sn6Var.R0 = oy5Var2;
                }
                if ((arrayList.isEmpty() || ((cm6) arrayList.get(0)).V0) && (iY = sn6Var.G0[i2].y(imcVar, o54Var, i, sn6Var.e1)) == -5) {
                    oy5 oy5VarD = (oy5) imcVar.c;
                    oy5VarD.getClass();
                    if (i2 == sn6Var.M0) {
                        int iX = sn6Var.G0[i2].x();
                        while (i3 < arrayList.size() && ((cm6) arrayList.get(i3)).v0 != iX) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            oy5Var = ((cm6) arrayList.get(i3)).o;
                        } else {
                            oy5Var = sn6Var.Q0;
                            oy5Var.getClass();
                        }
                        oy5VarD = oy5VarD.d(oy5Var);
                    }
                    imcVar.c = oy5VarD;
                }
            }
        }
        return iY;
    }
}
