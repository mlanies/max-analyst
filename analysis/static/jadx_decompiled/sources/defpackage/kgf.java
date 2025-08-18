package defpackage;

import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class kgf {
    public final /* synthetic */ int a;
    public boolean b;
    public Surface c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final Object p;
    public final fgf q;
    public final Object r;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kgf(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r4.a = r6
            switch(r6) {
                case 1: goto L70;
                default: goto L5;
            }
        L5:
            r4.<init>()
            em5 r6 = new em5
            r0 = 0
            r6.<init>(r0)
            dm5 r0 = new dm5
            r1 = 0
            r0.<init>(r1)
            r6.e = r0
            dm5 r0 = new dm5
            r0.<init>(r1)
            r6.f = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.c = r0
            r4.p = r6
            r6 = 0
            if (r5 == 0) goto L57
            android.content.Context r5 = r5.getApplicationContext()
            int r2 = defpackage.maf.a
            r3 = 17
            if (r2 < r3) goto L43
            java.lang.String r2 = "display"
            java.lang.Object r2 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            if (r2 == 0) goto L43
            ggf r3 = new ggf
            r3.<init>(r2)
            goto L44
        L43:
            r3 = r6
        L44:
            if (r3 != 0) goto L58
            java.lang.String r2 = "window"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto L57
            hgf r2 = new hgf
            r2.<init>(r5)
            r3 = r2
            goto L58
        L57:
            r3 = r6
        L58:
            r4.q = r3
            if (r3 == 0) goto L5e
            igf r6 = defpackage.igf.X
        L5e:
            r4.r = r6
            r4.i = r0
            r4.j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.g = r5
            r5 = 0
            r4.h = r5
            return
        L70:
            r4.<init>()
            em5 r6 = new em5
            r0 = 1
            r6.<init>(r0)
            dm5 r0 = new dm5
            r1 = 1
            r0.<init>(r1)
            r6.e = r0
            dm5 r0 = new dm5
            r0.<init>(r1)
            r6.f = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.c = r0
            r4.p = r6
            r6 = 0
            if (r5 != 0) goto L96
        L94:
            r2 = r6
            goto La5
        L96:
            java.lang.String r2 = "display"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
            if (r5 == 0) goto L94
            ggf r2 = new ggf
            r2.<init>(r4, r5)
        La5:
            r4.q = r2
            if (r2 == 0) goto Lab
            jgf r6 = defpackage.jgf.X
        Lab:
            r4.r = r6
            r4.i = r0
            r4.j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.g = r5
            r5 = 0
            r4.h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgf.<init>(android.content.Context, int):void");
    }

    public static void a(kgf kgfVar, Display display) {
        kgfVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            kgfVar.i = refreshRate;
            kgfVar.j = (refreshRate * 80) / 100;
        } else {
            z04.c0("Unable to query display refresh rate");
            kgfVar.i = -9223372036854775807L;
            kgfVar.j = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        Surface surface2;
        switch (this.a) {
            case 0:
                if (maf.a >= 30 && (surface = this.c) != null && this.h != Integer.MIN_VALUE && this.f != 0.0f) {
                    this.f = 0.0f;
                    dgf.a(surface, 0.0f);
                    break;
                }
                break;
            default:
                if (oaf.a >= 30 && (surface2 = this.c) != null && this.h != Integer.MIN_VALUE && this.f != 0.0f) {
                    this.f = 0.0f;
                    egf.a(surface2, 0.0f);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgf.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L36;
                default: goto L5;
            }
        L5:
            int r0 = defpackage.oaf.a
            r1 = 30
            if (r0 < r1) goto L35
            android.view.Surface r0 = r3.c
            if (r0 == 0) goto L35
            int r1 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L16
            goto L35
        L16:
            boolean r1 = r3.b
            if (r1 == 0) goto L26
            float r1 = r3.e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L26
            float r2 = r3.g
            float r1 = r1 * r2
            goto L27
        L26:
            r1 = 0
        L27:
            if (r4 != 0) goto L30
            float r4 = r3.f
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L30
            goto L35
        L30:
            r3.f = r1
            defpackage.egf.a(r0, r1)
        L35:
            return
        L36:
            int r0 = defpackage.maf.a
            r1 = 30
            if (r0 < r1) goto L66
            android.view.Surface r0 = r3.c
            if (r0 == 0) goto L66
            int r1 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L47
            goto L66
        L47:
            boolean r1 = r3.b
            if (r1 == 0) goto L57
            float r1 = r3.e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L57
            float r2 = r3.g
            float r1 = r1 * r2
            goto L58
        L57:
            r1 = 0
        L58:
            if (r4 != 0) goto L61
            float r4 = r3.f
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L61
            goto L66
        L61:
            r3.f = r1
            defpackage.dgf.a(r0, r1)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgf.d(boolean):void");
    }
}
