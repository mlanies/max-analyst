package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public abstract class r97 {
    public static final wz a;

    static {
        wz wzVar = new wz(4);
        Collections.addAll(wzVar, 2, 7, 4, 5);
        a = wzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(anc ancVar, g05 g05Var) {
        g05Var.o0();
        Integer numValueOf = Integer.valueOf(g05Var.X);
        wz wzVar = a;
        int iIndexOf = wzVar.indexOf(numValueOf);
        if (iIndexOf >= 0) {
            return ((Number) wzVar.get(iIndexOf % wzVar.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations".toString());
    }

    public static final int b(anc ancVar, g05 g05Var) {
        ancVar.getClass();
        g05Var.o0();
        int i = g05Var.o;
        if (i != 90 && i != 180 && i != 270) {
            return 0;
        }
        g05Var.o0();
        return g05Var.o;
    }

    public static final int c(anc ancVar, jic jicVar, g05 g05Var, boolean z) {
        int i;
        int i2;
        if (!z || jicVar == null) {
            return 8;
        }
        int iB = b(ancVar, g05Var);
        g05Var.o0();
        int iA = a.contains(Integer.valueOf(g05Var.X)) ? a(ancVar, g05Var) : 0;
        boolean z2 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
        if (z2) {
            g05Var.o0();
            i = g05Var.Z;
        } else {
            g05Var.o0();
            i = g05Var.Y;
        }
        if (z2) {
            g05Var.o0();
            i2 = g05Var.Y;
        } else {
            g05Var.o0();
            i2 = g05Var.Z;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(jicVar.a / f, jicVar.b / f2);
        float f3 = f * fMax;
        float f4 = jicVar.c;
        if (f3 > f4) {
            fMax = f4 / f;
        }
        if (f2 * fMax > f4) {
            fMax = f4 / f2;
        }
        int i3 = (int) ((fMax * 8) + jicVar.d);
        if (i3 > 8) {
            return 8;
        }
        if (i3 < 1) {
            return 1;
        }
        return i3;
    }
}
