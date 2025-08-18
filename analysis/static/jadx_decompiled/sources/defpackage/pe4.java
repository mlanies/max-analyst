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
public final class pe4 extends g0f {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;
    public boolean z;

    public pe4() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    @Override // defpackage.g0f
    public final g0f a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    public final void b() {
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = true;
        this.K = false;
        this.L = true;
    }

    public final g0f c(String[] strArr) {
        ww6 ww6VarI = zw6.i();
        for (String str : strArr) {
            str.getClass();
            ww6VarI.a(maf.E(str));
        }
        this.n = ww6VarI.j();
        return this;
    }

    public final void d(Context context) {
        CaptioningManager captioningManager;
        int i = maf.a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.s = zw6.n(i >= 21 ? locale.toLanguageTag() : locale.toString());
                }
            }
        }
    }

    public final void e(int i, sze szeVar, qe4 qe4Var) {
        SparseArray sparseArray = this.M;
        Map map = (Map) sparseArray.get(i);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i, map);
        }
        if (map.containsKey(szeVar) && maf.a(map.get(szeVar), qe4Var)) {
            return;
        }
        map.put(szeVar, qe4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Context r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            int r0 = defpackage.maf.a
            r1 = 0
            r2 = 17
            if (r0 < r2) goto L16
            java.lang.String r3 = "display"
            java.lang.Object r3 = r9.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L16
            android.view.Display r3 = r3.getDisplay(r1)
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != 0) goto L28
            java.lang.String r3 = "window"
            java.lang.Object r3 = r9.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r3.getClass()
            android.view.Display r3 = r3.getDefaultDisplay()
        L28:
            int r4 = r3.getDisplayId()
            if (r4 != 0) goto Laa
            boolean r4 = defpackage.maf.C(r9)
            if (r4 == 0) goto Laa
            r4 = 28
            if (r0 >= r4) goto L3f
            java.lang.String r4 = "sys.display-size"
            java.lang.String r4 = defpackage.maf.z(r4)
            goto L45
        L3f:
            java.lang.String r4 = "vendor.display-size"
            java.lang.String r4 = defpackage.maf.z(r4)
        L45:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L80
            java.lang.String r5 = r4.trim()     // Catch: java.lang.NumberFormatException -> L71
            java.lang.String r6 = "x"
            r7 = -1
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch: java.lang.NumberFormatException -> L71
            int r6 = r5.length     // Catch: java.lang.NumberFormatException -> L71
            r7 = 2
            if (r6 != r7) goto L71
            r1 = r5[r1]     // Catch: java.lang.NumberFormatException -> L71
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L71
            r6 = 1
            r5 = r5[r6]     // Catch: java.lang.NumberFormatException -> L71
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L71
            if (r1 <= 0) goto L71
            if (r5 <= 0) goto L71
            android.graphics.Point r6 = new android.graphics.Point     // Catch: java.lang.NumberFormatException -> L71
            r6.<init>(r1, r5)     // Catch: java.lang.NumberFormatException -> L71
            goto Lcd
        L71:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r4 = r1.length()
            if (r4 == 0) goto L80
            java.lang.String r4 = "Invalid display size: "
            r4.concat(r1)
        L80:
            java.lang.String r1 = "Sony"
            java.lang.String r4 = defpackage.maf.c
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Laa
            java.lang.String r1 = defpackage.maf.d
            java.lang.String r4 = "BRAVIA"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto Laa
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r9 = r9.hasSystemFeature(r1)
            if (r9 == 0) goto Laa
            android.graphics.Point r6 = new android.graphics.Point
            r9 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r6.<init>(r9, r0)
            goto Lcd
        Laa:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r9 = 23
            if (r0 < r9) goto Lc4
            android.view.Display$Mode r9 = r3.getMode()
            int r0 = r9.getPhysicalWidth()
            r6.x = r0
            int r9 = r9.getPhysicalHeight()
            r6.y = r9
            goto Lcd
        Lc4:
            if (r0 < r2) goto Lca
            r3.getRealSize(r6)
            goto Lcd
        Lca:
            r3.getSize(r6)
        Lcd:
            int r9 = r6.x
            int r0 = r6.y
            r8.a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe4.f(android.content.Context):void");
    }

    public pe4(Context context) throws NumberFormatException {
        d(context);
        f(context);
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    public pe4(ne4 ne4Var) {
        this.a = ne4Var.a;
        this.b = ne4Var.b;
        this.c = ne4Var.c;
        this.d = ne4Var.o;
        this.e = ne4Var.X;
        this.f = ne4Var.Y;
        this.g = ne4Var.Z;
        this.h = ne4Var.s0;
        this.i = ne4Var.t0;
        this.j = ne4Var.u0;
        this.k = ne4Var.v0;
        this.l = ne4Var.w0;
        this.m = ne4Var.x0;
        this.n = ne4Var.y0;
        this.o = ne4Var.z0;
        this.p = ne4Var.A0;
        this.q = ne4Var.B0;
        this.r = ne4Var.C0;
        this.s = ne4Var.D0;
        this.t = ne4Var.E0;
        this.u = ne4Var.F0;
        this.v = ne4Var.G0;
        this.w = ne4Var.H0;
        this.x = ne4Var.I0;
        this.y = ne4Var.J0;
        this.I = ne4Var.K0;
        this.z = ne4Var.L0;
        this.A = ne4Var.M0;
        this.B = ne4Var.N0;
        this.C = ne4Var.O0;
        this.D = ne4Var.P0;
        this.E = ne4Var.Q0;
        this.F = ne4Var.R0;
        this.G = ne4Var.S0;
        this.H = ne4Var.T0;
        this.J = ne4Var.U0;
        this.K = ne4Var.V0;
        this.L = ne4Var.W0;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = ne4Var.X0;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.M = sparseArray;
                this.N = ne4Var.Y0.clone();
                return;
            }
        }
    }
}
