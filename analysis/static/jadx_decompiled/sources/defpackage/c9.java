package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c9 extends fk0 {
    public final hg0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final zw6 o;
    public final she p;
    public float q;
    public int r;
    public int s;
    public long t;
    public g78 u;

    public c9(rze rzeVar, int[] iArr, hg0 hg0Var, long j, long j2, long j3, int i, int i2, float f, float f2, zw6 zw6Var, she sheVar) {
        super(rzeVar, iArr);
        if (j3 < j) {
            z04.c0("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = hg0Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = i;
        this.l = i2;
        this.m = f;
        this.n = f2;
        this.o = zw6.j(zw6Var);
        this.p = sheVar;
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
                ww6Var.a(new a9(j, jArr[i]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        g78 g78Var = (g78) mqd.m(list);
        long j = g78Var.Z;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = g78Var.s0;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.n85
    public final int b() {
        return this.r;
    }

    @Override // defpackage.fk0, defpackage.n85
    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.fk0, defpackage.n85
    public final int g(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((g78) mqd.m(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (g78) mqd.m(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jE = oaf.E(this.q, ((g78) list.get(size - 1)).Z - j);
        long j3 = this.j;
        if (jE < j3) {
            return size;
        }
        x(list);
        qy5 qy5Var = this.d[w(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            g78 g78Var = (g78) list.get(i3);
            qy5 qy5Var2 = g78Var.o;
            if (oaf.E(this.q, g78Var.Z - j) >= j3 && qy5Var2.i < qy5Var.i && (i = qy5Var2.u) != -1 && i <= this.l && (i2 = qy5Var2.t) != -1 && i2 <= this.k && i < qy5Var.u) {
                return i3;
            }
        }
        return size;
    }

    @Override // defpackage.fk0, defpackage.n85
    public final void h() {
        this.u = null;
    }

    @Override // defpackage.n85
    public final int k() {
        return this.s;
    }

    @Override // defpackage.fk0, defpackage.n85
    public final void l(float f) {
        this.q = f;
    }

    @Override // defpackage.n85
    public final Object m() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // defpackage.n85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r14, long r16, long r18, java.util.List r20, defpackage.i78[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            she r2 = r0.p
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
            g78 r7 = (defpackage.g78) r7
            qy5 r7 = r7.o
            int r7 = r13.s(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = defpackage.mqd.m(r20)
            g78 r1 = (defpackage.g78) r1
            int r1 = r1.X
            r6 = r7
        L73:
            int r7 = r13.w(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.q(r6, r2)
            if (r2 != 0) goto Lb7
            qy5[] r2 = r0.d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.i
            int r3 = r3.i
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.s = r1
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.r(long, long, long, java.util.List, i78[]):void");
    }

    public final int w(long j) {
        long j2;
        i84 i84Var = (i84) this.g;
        synchronized (i84Var) {
            j2 = i84Var.k;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((a9) this.o.get(i)).a < j4) {
                i++;
            }
            a9 a9Var = (a9) this.o.get(i - 1);
            a9 a9Var2 = (a9) this.o.get(i);
            long j5 = a9Var.a;
            long j6 = a9Var.b;
            j4 = j6 + ((long) (((j4 - j5) / (a9Var2.a - j5)) * (a9Var2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !q(i3, j)) {
                if (d(i3).i <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
