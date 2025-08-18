package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class nt6 {
    public static final st6 a;

    static {
        Object size = new Size(640, 480);
        eu4 eu4Var = eu4.d;
        fm5 fm5Var = fm5.c;
        Size size2 = msd.c;
        lic licVar = new lic();
        licVar.a = size2;
        licVar.b = 1;
        Object kicVar = new kic(fm5Var, licVar, 0);
        mt6 mt6Var = new mt6(0);
        aa0 aa0Var = ev6.G;
        mi9 mi9Var = mt6Var.b;
        mi9Var.j(aa0Var, size);
        mi9Var.j(o9f.k0, 1);
        mi9Var.j(ev6.B, 0);
        mi9Var.j(ev6.J, kicVar);
        if (!eu4Var.equals(eu4Var)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        mi9Var.j(tu6.A, eu4Var);
        a = new st6(wma.a(mi9Var));
    }
}
