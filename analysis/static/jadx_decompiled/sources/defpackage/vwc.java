package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class vwc extends tdc {
    public mof a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final uwc g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public vwc(ViewPager2 viewPager2) {
        this.b = viewPager2;
        rof rofVar = viewPager2.x0;
        this.c = rofVar;
        this.d = (LinearLayoutManager) rofVar.getLayoutManager();
        this.g = new uwc();
        e();
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        mof mofVar;
        int i2 = this.e;
        boolean z = true;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            f(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        }
        uwc uwcVar = this.g;
        if (z && i == 0) {
            g();
            if (!this.k) {
                int i3 = uwcVar.b;
                if (i3 != -1 && (mofVar = this.a) != null) {
                    mofVar.b(i3, 0.0f, 0);
                }
            } else if (uwcVar.c == 0) {
                int i4 = this.h;
                int i5 = uwcVar.b;
                if (i4 != i5) {
                    c(i5);
                }
            }
            d(0);
            e();
        }
        if (this.e == 2 && i == 0 && this.l) {
            g();
            if (uwcVar.c == 0) {
                int i6 = this.i;
                int i7 = uwcVar.b;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    c(i7);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    @Override // defpackage.tdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.g()
            boolean r0 = r5.j
            uwc r1 = r5.g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L3c
            r5.j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.b
            lof r8 = r8.u0
            int r8 = r8.H()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.c
            if (r7 == 0) goto L30
            int r7 = r1.b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.b
        L32:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L48
            r5.c(r7)
            goto L48
        L3c:
            int r7 = r5.e
            if (r7 != 0) goto L48
            int r7 = r1.b
            if (r7 != r2) goto L45
            r7 = r3
        L45:
            r5.c(r7)
        L48:
            int r7 = r1.b
            if (r7 != r2) goto L4d
            r7 = r3
        L4d:
            float r8 = r1.a
            int r0 = r1.c
            mof r4 = r5.a
            if (r4 == 0) goto L58
            r4.b(r7, r8, r0)
        L58:
            int r7 = r1.b
            int r8 = r5.i
            if (r7 == r8) goto L60
            if (r8 != r2) goto L6e
        L60:
            int r7 = r1.c
            if (r7 != 0) goto L6e
            int r7 = r5.f
            if (r7 == r6) goto L6e
            r5.d(r3)
            r5.e()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwc.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i) {
        mof mofVar = this.a;
        if (mofVar != null) {
            mofVar.c(i);
        }
    }

    public final void d(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        mof mofVar = this.a;
        if (mofVar != null) {
            mofVar.a(i);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        uwc uwcVar = this.g;
        uwcVar.b = -1;
        uwcVar.a = 0.0f;
        uwcVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void f(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = this.d.W0();
        }
        d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwc.g():void");
    }
}
