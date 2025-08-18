package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class me4 extends h0f {
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final SparseArray R;
    public final SparseBooleanArray S;

    public me4(Context context) throws NumberFormatException {
        i(context);
        j(context);
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        g();
    }

    @Override // defpackage.h0f
    public final void a(c0f c0fVar) {
        this.A.put(c0fVar.a, c0fVar);
    }

    @Override // defpackage.h0f
    public final j0f b() {
        return new oe4(this);
    }

    @Override // defpackage.h0f
    public final h0f c() {
        super.c();
        return this;
    }

    @Override // defpackage.h0f
    public final h0f f(int i, int i2) {
        super.f(i, i2);
        return this;
    }

    public final void g() {
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = true;
        this.Q = false;
    }

    public final h0f h(String[] strArr) {
        this.n = h0f.e(strArr);
        return this;
    }

    public final void i(Context context) {
        CaptioningManager captioningManager;
        int i = oaf.a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.u = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.t = zw6.n(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.content.Context r8) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            int r0 = defpackage.oaf.a
            java.lang.String r0 = "display"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            r1 = 0
            if (r0 == 0) goto L12
            android.view.Display r0 = r0.getDisplay(r1)
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L24
            java.lang.String r0 = "window"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r0.getClass()
            android.view.Display r0 = r0.getDefaultDisplay()
        L24:
            int r2 = r0.getDisplayId()
            int r3 = defpackage.oaf.a
            if (r2 != 0) goto Laa
            boolean r2 = defpackage.oaf.P(r8)
            if (r2 == 0) goto Laa
            r2 = 28
            if (r3 >= r2) goto L3d
            java.lang.String r2 = "sys.display-size"
            java.lang.String r2 = defpackage.oaf.G(r2)
            goto L43
        L3d:
            java.lang.String r2 = "vendor.display-size"
            java.lang.String r2 = defpackage.oaf.G(r2)
        L43:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L80
            java.lang.String r4 = r2.trim()     // Catch: java.lang.NumberFormatException -> L6f
            java.lang.String r5 = "x"
            r6 = -1
            java.lang.String[] r4 = r4.split(r5, r6)     // Catch: java.lang.NumberFormatException -> L6f
            int r5 = r4.length     // Catch: java.lang.NumberFormatException -> L6f
            r6 = 2
            if (r5 != r6) goto L6f
            r1 = r4[r1]     // Catch: java.lang.NumberFormatException -> L6f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L6f
            r5 = 1
            r4 = r4[r5]     // Catch: java.lang.NumberFormatException -> L6f
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L6f
            if (r1 <= 0) goto L6f
            if (r4 <= 0) goto L6f
            android.graphics.Point r5 = new android.graphics.Point     // Catch: java.lang.NumberFormatException -> L6f
            r5.<init>(r1, r4)     // Catch: java.lang.NumberFormatException -> L6f
            goto Lc7
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid display size: "
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.z04.u(r1)
        L80:
            java.lang.String r1 = "Sony"
            java.lang.String r2 = defpackage.oaf.c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Laa
            java.lang.String r1 = defpackage.oaf.d
            java.lang.String r2 = "BRAVIA"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto Laa
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r8 = r8.hasSystemFeature(r1)
            if (r8 == 0) goto Laa
            android.graphics.Point r5 = new android.graphics.Point
            r8 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r5.<init>(r8, r0)
            goto Lc7
        Laa:
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            r8 = 23
            if (r3 < r8) goto Lc4
            android.view.Display$Mode r8 = r0.getMode()
            int r0 = r8.getPhysicalWidth()
            r5.x = r0
            int r8 = r8.getPhysicalHeight()
            r5.y = r8
            goto Lc7
        Lc4:
            r0.getRealSize(r5)
        Lc7:
            int r8 = r5.x
            int r0 = r5.y
            r7.f(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me4.j(android.content.Context):void");
    }

    public me4(oe4 oe4Var) {
        d(oe4Var);
        this.C = oe4Var.i0;
        this.D = oe4Var.j0;
        this.E = oe4Var.k0;
        this.F = oe4Var.l0;
        this.G = oe4Var.m0;
        this.H = oe4Var.n0;
        this.I = oe4Var.o0;
        this.J = oe4Var.p0;
        this.K = oe4Var.q0;
        this.L = oe4Var.r0;
        this.M = oe4Var.s0;
        this.N = oe4Var.t0;
        this.O = oe4Var.u0;
        this.P = oe4Var.v0;
        this.Q = oe4Var.w0;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = oe4Var.x0;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.R = sparseArray;
                this.S = oe4Var.y0.clone();
                return;
            }
        }
    }

    public me4() {
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        g();
    }
}
