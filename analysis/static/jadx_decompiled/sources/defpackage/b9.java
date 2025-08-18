package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b9 extends ek0 {
    public final gg0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final zw6 o;
    public final rhe p;
    public float q;
    public int r;
    public int s;
    public long t;
    public f78 u;

    public b9(qze qzeVar, int[] iArr, int i, gg0 gg0Var, long j, long j2, long j3, int i2, int i3, float f, float f2, zw6 zw6Var, rhe rheVar) {
        super(qzeVar, iArr);
        long j4 = j3 < j ? j : j3;
        this.g = gg0Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j4 * 1000;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = zw6.j(zw6Var);
        this.p = rheVar;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ww6 ww6Var = (ww6) arrayList.get(i);
            if (ww6Var != null) {
                ww6Var.a(new z8(j, jArr[i]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        f78 f78Var = (f78) mqd.m(list);
        long j = f78Var.Z;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = f78Var.s0;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.m85
    public final int b() {
        return this.r;
    }

    @Override // defpackage.ek0, defpackage.m85
    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.ek0, defpackage.m85
    public final int g(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((f78) mqd.m(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (f78) mqd.m(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jW = maf.w(this.q, ((f78) list.get(size - 1)).Z - j);
        long j3 = this.j;
        if (jW < j3) {
            return size;
        }
        x(list);
        oy5 oy5Var = this.d[w(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            f78 f78Var = (f78) list.get(i3);
            oy5 oy5Var2 = f78Var.o;
            if (maf.w(this.q, f78Var.Z - j) >= j3 && oy5Var2.s0 < oy5Var.s0 && (i = oy5Var2.C0) != -1 && i <= this.l && (i2 = oy5Var2.B0) != -1 && i2 <= this.k && i < oy5Var.C0) {
                return i3;
            }
        }
        return size;
    }

    @Override // defpackage.ek0, defpackage.m85
    public final void h() {
        this.u = null;
    }

    @Override // defpackage.m85
    public final int k() {
        return this.s;
    }

    @Override // defpackage.ek0, defpackage.m85
    public final void l(float f) {
        this.q = f;
    }

    @Override // defpackage.m85
    public final Object m() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // defpackage.m85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(long r14, long r16, long r18, java.util.List r20, defpackage.h78[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            rhe r2 = r0.p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.r
            r1 = r1[r4]
            long r4 = r1.h()
            long r6 = r1.e()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.h()
            long r6 = r6.e()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = x(r20)
        L43:
            int r1 = r0.s
            if (r1 != 0) goto L51
            r1 = 1
            r0.s = r1
            int r1 = r13.w(r2)
            r0.r = r1
            return
        L51:
            int r6 = r0.r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = defpackage.mqd.m(r20)
            f78 r7 = (defpackage.f78) r7
            oy5 r7 = r7.o
            int r7 = r13.q(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = defpackage.mqd.m(r20)
            f78 r1 = (defpackage.f78) r1
            int r1 = r1.X
            r6 = r7
        L73:
            int r7 = r13.w(r2)
            boolean r2 = r13.s(r6, r2)
            if (r2 != 0) goto Lb5
            oy5[] r2 = r0.d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.h
            if (r10 != 0) goto L8f
            goto La1
        L8f:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L96
            long r4 = r18 - r4
            goto L98
        L96:
            r4 = r18
        L98:
            float r4 = (float) r4
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La1:
            int r2 = r2.s0
            int r3 = r3.s0
            if (r2 <= r3) goto Lac
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lac
            goto Lb4
        Lac:
            if (r2 >= r3) goto Lb5
            long r2 = r0.i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb5
        Lb4:
            r7 = r6
        Lb5:
            if (r7 != r6) goto Lb8
            goto Lb9
        Lb8:
            r1 = 3
        Lb9:
            r0.s = r1
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.t(long, long, long, java.util.List, h78[]):void");
    }

    public final int w(long j) {
        long j2;
        h84 h84Var = (h84) this.g;
        synchronized (h84Var) {
            j2 = h84Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((z8) this.o.get(i)).a < j4) {
                i++;
            }
            z8 z8Var = (z8) this.o.get(i - 1);
            z8 z8Var2 = (z8) this.o.get(i);
            long j5 = z8Var.a;
            long j6 = z8Var.b;
            j4 = j6 + ((long) (((j4 - j5) / (z8Var2.a - j5)) * (z8Var2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !s(i3, j)) {
                if (d(i3).s0 <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
