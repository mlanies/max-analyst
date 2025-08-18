package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e53 {
    public static final /* synthetic */ bc7[] k;
    public final Context a;
    public final View b;
    public int c;
    public int d;
    public final ar0 e = new ar0();
    public final yj f = new yj(this);
    public m56 g = new pz2(2);
    public float[] h = s36.c;
    public final int i = tu0.G(1 * fk4.d().getDisplayMetrics().density);
    public final us j;

    static {
        oi9 oi9Var = new oi9(e53.class, "imageAttaches", "getImageAttaches()Ljava/util/List;");
        nec.a.getClass();
        k = new bc7[]{oi9Var};
    }

    public e53(Context context, View view) {
        this.a = context;
        this.b = view;
        view.addOnAttachStateChangeListener(new ck(3, this));
        this.j = new us(0);
    }

    public static int d(int i) {
        return (int) Math.rint(i * 0.4f);
    }

    public final a53 a(int i, int i2) {
        umc umcVarE;
        int length = this.h.length;
        for (int i3 = 0; i3 < length; i3++) {
            sq4 sq4VarI = this.e.i(i3);
            zt6 zt6Var = sq4VarI instanceof zt6 ? (zt6) sq4VarI : null;
            if (zt6Var != null && (umcVarE = zt6Var.e()) != null && umcVarE.getBounds().contains(i, i2)) {
                bc7 bc7Var = k[0];
                a53 a53Var = (a53) x53.j0(i3, (List) this.f.b);
                if (a53Var == null) {
                    return null;
                }
                return a53Var;
            }
        }
        return null;
    }

    public final void b(int i, int i2) {
        umc umcVarE;
        int length = this.h.length;
        int i3 = i;
        for (int i4 = 0; i4 < length; i4++) {
            ar0 ar0Var = this.e;
            sq4 sq4VarI = ar0Var.i(i4);
            zt6 zt6Var = sq4VarI instanceof zt6 ? (zt6) sq4VarI : null;
            if (zt6Var != null && (umcVarE = zt6Var.e()) != null) {
                int i5 = zt6Var.Z + i3;
                int i6 = this.c + i;
                int i7 = this.i;
                if (i5 > i6) {
                    i2 += ((zt6) ar0Var.i(i4 - 1)).s0 + i7;
                    i3 = i;
                }
                umcVarE.setBounds(i3, i2, zt6Var.Z + i3, zt6Var.s0 + i2);
                i3 += zt6Var.Z + i7;
            }
        }
    }

    public final void c(int i) {
        ar0 ar0Var;
        int i2;
        String str;
        boolean z;
        double d;
        boolean z2;
        int iD;
        boolean z3;
        if (this.h.length == 0) {
            return;
        }
        ar0 ar0Var2 = this.e;
        if (((ArrayList) ar0Var2.b).size() <= 0) {
            return;
        }
        this.d = 0;
        String str2 = "Array is empty.";
        if (this.h.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        float f = i;
        double d2 = 0.45f * f;
        double d3 = f * 0.6f;
        int iE = ote.e((int) Math.rint(((int) Math.rint(d2)) / r4[0]), (int) Math.rint(d2), (int) Math.rint(d3));
        int length = this.h.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.i;
            if (i3 >= length) {
                this.d -= i6;
                this.c = i;
                return;
            }
            sq4 sq4VarI = ar0Var2.i(i3);
            zt6 zt6Var = sq4VarI instanceof zt6 ? (zt6) sq4VarI : null;
            if (zt6Var == null) {
                ar0Var = ar0Var2;
                i2 = length;
                str = str2;
                d = d2;
            } else {
                float f2 = iE;
                ar0Var = ar0Var2;
                int i7 = iE;
                i2 = length;
                int iRint = (int) Math.rint(this.h[i3] * f2);
                float[] fArr = this.h;
                if (fArr.length == 0) {
                    throw new NoSuchElementException(str2);
                }
                if (fArr[0] <= 1.0f || i3 != 0) {
                    str = str2;
                    z = false;
                } else {
                    z = true;
                    str = str2;
                }
                if (i3 == fArr.length - 1) {
                    z2 = true;
                    d = d2;
                } else {
                    d = d2;
                    z2 = false;
                }
                boolean z4 = i3 < fArr.length - 1 && Float.compare(fArr[i3], fArr[i3 + 1]) == 0;
                if (z || z2) {
                    iE = (!z || this.h.length <= 3) ? i7 : (int) Math.rint(d3);
                    iD = i - i4;
                    z3 = true;
                } else {
                    if (z4 && i5 == 0) {
                        iD = i / 2;
                    } else if (i5 == 1) {
                        iD = i - i4;
                    } else {
                        int i8 = i - i4;
                        iD = i8 - iRint < d(i) ? i8 - d(i) < d(i) ? i8 : i8 - d(i) : iRint < d(i) ? d(i) : (int) Math.rint(f2 * this.h[i3]);
                    }
                    iE = i7;
                    z3 = false;
                }
                boolean z5 = (i5 != 1 || z3) ? z3 : true;
                zt6Var.s0 = iE;
                zt6Var.Z = iD;
                i5++;
                i4 += iD + i6;
                if (z5) {
                    this.d = iE + i6 + this.d;
                    iE = ote.e((int) Math.rint(((int) Math.rint(d)) / this.h[i3]), (int) Math.rint(d), (int) Math.rint(d3));
                    i4 = 0;
                    i5 = 0;
                }
            }
            i3++;
            ar0Var2 = ar0Var;
            length = i2;
            str2 = str;
            d2 = d;
        }
    }

    public final void e(int i, int i2, int[] iArr) {
        y2b y2bVar;
        umc umcVarE;
        int length = this.h.length;
        for (int i3 = 0; i3 < length; i3++) {
            sq4 sq4VarI = this.e.i(i3);
            zt6 zt6Var = sq4VarI instanceof zt6 ? (zt6) sq4VarI : null;
            if (zt6Var != null && (y2bVar = (y2b) this.j.get(zt6Var)) != null && (umcVarE = zt6Var.e()) != null && umcVarE.getBounds().contains(i, i2)) {
                y2bVar.setHotspot(y2bVar.getBounds().centerX(), y2bVar.getBounds().centerY());
                y2bVar.setState(iArr);
                return;
            }
        }
    }

    public final void f() {
        Iterator it = this.j.entrySet().iterator();
        while (it.hasNext()) {
            ((y2b) ((Map.Entry) it.next()).getValue()).onThemeChanged(qp4.u0.b(this.a).i());
        }
    }

    public final boolean g(Drawable drawable) {
        int i = 0;
        while (true) {
            ar0 ar0Var = this.e;
            if (i >= ((ArrayList) ar0Var.b).size()) {
                if (x53.c0(this.j.values(), drawable)) {
                    break;
                }
                return false;
            }
            if (drawable == ar0Var.i(i).e()) {
                break;
            }
            i++;
        }
        return true;
    }
}
