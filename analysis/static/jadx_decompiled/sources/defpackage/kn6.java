package defpackage;

import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kn6 implements grc {
    public final int a;
    public final tn6 b;
    public int c = -1;

    public kn6(tn6 tn6Var, int i) {
        this.b = tn6Var;
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
            defpackage.fm9.f(r0)
            tn6 r0 = r6.b
            r0.d()
            int[] r3 = r0.V0
            r3.getClass()
            int[] r3 = r0.V0
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set r1 = r0.U0
            tze r0 = r0.T0
            rze r0 = r0.a(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn6.a():void");
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.grc
    public final void c() throws IOException {
        int i = this.c;
        tn6 tn6Var = this.b;
        if (i == -2) {
            tn6Var.d();
            throw new SampleQueueMappingException(zr6.i("Unable to bind a sample queue to TrackGroup with MIME type ", tn6Var.T0.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            tn6Var.D();
        } else if (i != -3) {
            tn6Var.D();
            tn6Var.G0[i].u();
        }
    }

    @Override // defpackage.grc
    public final boolean d() {
        if (this.c != -3) {
            if (b()) {
                int i = this.c;
                tn6 tn6Var = this.b;
                if (tn6Var.z() || !tn6Var.G0[i].s(tn6Var.e1)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.grc
    public final int e(long j) {
        int iMin;
        if (!b()) {
            return 0;
        }
        int i = this.c;
        tn6 tn6Var = this.b;
        if (tn6Var.z()) {
            return 0;
        }
        rn6 rn6Var = tn6Var.G0[i];
        int iP = rn6Var.p(j, tn6Var.e1);
        dm6 dm6Var = (dm6) mqd.n(tn6Var.y0);
        if (dm6Var == null || dm6Var.W0) {
            iMin = iP;
        } else {
            iMin = Math.min(iP, dm6Var.f(i) - rn6Var.n());
        }
        rn6Var.B(iMin);
        return iMin;
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        qy5 qy5Var;
        int iX = -3;
        if (this.c == -3) {
            p54Var.a(4);
            return -4;
        }
        if (b()) {
            int i2 = this.c;
            tn6 tn6Var = this.b;
            if (!tn6Var.z()) {
                ArrayList arrayList = tn6Var.y0;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((dm6) arrayList.get(i4)).v0;
                        int length = tn6Var.G0.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (tn6Var.Y0[i6] && tn6Var.G0[i6].w() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    oaf.X(arrayList, 0, i4);
                    dm6 dm6Var = (dm6) arrayList.get(0);
                    qy5 qy5Var2 = dm6Var.o;
                    if (!qy5Var2.equals(tn6Var.R0)) {
                        tn6Var.v0.m(tn6Var.b, qy5Var2, dm6Var.X, dm6Var.Y, dm6Var.Z);
                    }
                    tn6Var.R0 = qy5Var2;
                }
                if ((arrayList.isEmpty() || ((dm6) arrayList.get(0)).W0) && (iX = tn6Var.G0[i2].x(y7gVar, p54Var, i, tn6Var.e1)) == -5) {
                    qy5 qy5VarF = (qy5) y7gVar.c;
                    qy5VarF.getClass();
                    if (i2 == tn6Var.M0) {
                        int iL = s5c.l(tn6Var.G0[i2].w());
                        while (i3 < arrayList.size() && ((dm6) arrayList.get(i3)).v0 != iL) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            qy5Var = ((dm6) arrayList.get(i3)).o;
                        } else {
                            qy5Var = tn6Var.Q0;
                            qy5Var.getClass();
                        }
                        qy5VarF = qy5VarF.f(qy5Var);
                    }
                    y7gVar.c = qy5VarF;
                }
            }
        }
        return iX;
    }
}
