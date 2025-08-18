package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class la6 implements rq4 {
    public final ColorDrawable a;
    public final Resources b;
    public wnc c;
    public final umc d;
    public final ya5 e;
    public final g06 f;

    public la6(ma6 ma6Var) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        f46.I();
        this.b = ma6Var.a;
        this.c = ma6Var.p;
        g06 g06Var = new g06(colorDrawable);
        this.f = g06Var;
        List list = ma6Var.n;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (ma6Var.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = a(ma6Var.m, null);
        drawableArr[1] = a(ma6Var.d, ma6Var.e);
        rsc rscVar = ma6Var.l;
        g06Var.setColorFilter(null);
        drawableArr[2] = c9g.e(g06Var, rscVar);
        drawableArr[3] = a(ma6Var.j, ma6Var.k);
        drawableArr[4] = a(ma6Var.f, ma6Var.g);
        drawableArr[5] = a(ma6Var.h, ma6Var.i);
        if (i2 > 0) {
            List list2 = ma6Var.n;
            if (list2 != null) {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = a((Drawable) it.next(), null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = ma6Var.o;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = a(stateListDrawable, null);
            }
        }
        ya5 ya5Var = new ya5(drawableArr);
        this.e = ya5Var;
        ya5Var.w0 = ma6Var.b;
        if (ya5Var.v0 == 1) {
            ya5Var.v0 = 0;
        }
        umc umcVar = new umc(c9g.d(ya5Var, this.c));
        umcVar.X = null;
        this.d = umcVar;
        umcVar.mutate();
        g();
        f46.I();
    }

    public final Drawable a(Drawable drawable, rsc rscVar) {
        return c9g.e(c9g.c(drawable, this.c, this.b), rscVar);
    }

    public final void b(int i) {
        if (i >= 0) {
            ya5 ya5Var = this.e;
            ya5Var.v0 = 0;
            ya5Var.B0[i] = true;
            ya5Var.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            ya5 ya5Var = this.e;
            ya5Var.v0 = 0;
            ya5Var.B0[i] = false;
            ya5Var.invalidateSelf();
        }
    }

    public final dq4 e(int i) {
        ya5 ya5Var = this.e;
        ya5Var.getClass();
        od2.j(Boolean.valueOf(i >= 0));
        dq4[] dq4VarArr = ya5Var.o;
        od2.j(Boolean.valueOf(i < dq4VarArr.length));
        if (dq4VarArr[i] == null) {
            dq4VarArr[i] = new is(ya5Var, i);
        }
        dq4 dq4Var = dq4VarArr[i];
        dq4Var.j();
        return dq4Var.j() instanceof psc ? (psc) dq4Var.j() : dq4Var;
    }

    public final psc f(int i) {
        dq4 dq4VarE = e(i);
        if (dq4VarE instanceof psc) {
            return (psc) dq4VarE;
        }
        Drawable drawableE = c9g.e(dq4VarE.f(c9g.a), ssc.r);
        dq4VarE.f(drawableE);
        od2.o(drawableE, "Parent has no child drawable!");
        return (psc) drawableE;
    }

    public final void g() {
        ya5 ya5Var = this.e;
        if (ya5Var != null) {
            ya5Var.C0++;
            ya5Var.v0 = 0;
            Arrays.fill(ya5Var.B0, true);
            ya5Var.invalidateSelf();
            c();
            b(1);
            ya5Var.e();
            ya5Var.c();
        }
    }

    public final void h(rsc rscVar) {
        rscVar.getClass();
        psc pscVarF = f(2);
        if (j47.B(pscVarF.X, rscVar)) {
            return;
        }
        pscVarF.X = rscVar;
        pscVarF.Y = null;
        pscVarF.p();
        pscVarF.invalidateSelf();
    }

    public final void i(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.b(null, i);
        } else {
            e(i).f(c9g.c(drawable, this.c, this.b));
        }
    }

    public final void j(Drawable drawable, float f, boolean z) {
        Drawable drawableC = c9g.c(drawable, this.c, this.b);
        drawableC.mutate();
        this.f.o(drawableC);
        ya5 ya5Var = this.e;
        ya5Var.C0++;
        c();
        b(2);
        l(f);
        if (z) {
            ya5Var.e();
        }
        ya5Var.c();
    }

    public final void k(Drawable drawable) {
        od2.k("The given index does not correspond to an overlay image.", 6 < this.e.c.length);
        i(drawable, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(float f) {
        Drawable drawableA = this.e.a(3);
        if (drawableA == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).stop();
            }
            d(3);
        } else {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).start();
            }
            b(3);
        }
        drawableA.setLevel(Math.round(f * 10000.0f));
    }

    public final void m(float f, boolean z) {
        ya5 ya5Var = this.e;
        if (ya5Var.a(3) == null) {
            return;
        }
        ya5Var.C0++;
        l(f);
        if (z) {
            ya5Var.e();
        }
        ya5Var.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(wnc wncVar) {
        this.c = wncVar;
        ColorDrawable colorDrawable = c9g.a;
        umc umcVar = this.d;
        Drawable drawable = umcVar.a;
        ColorDrawable colorDrawable2 = c9g.a;
        if (wncVar == null || wncVar.a != 1) {
            if (drawable instanceof snc) {
                umcVar.o(((snc) drawable).o(colorDrawable2));
                colorDrawable2.setCallback(null);
            }
        } else if (drawable instanceof snc) {
            snc sncVar = (snc) drawable;
            c9g.b(sncVar, wncVar);
            sncVar.z0 = wncVar.d;
            sncVar.invalidateSelf();
        } else {
            umcVar.o(c9g.d(umcVar.o(colorDrawable2), wncVar));
        }
        for (int i = 0; i < this.e.c.length; i++) {
            dq4 dq4VarE = e(i);
            wnc wncVar2 = this.c;
            while (true) {
                Object objJ = dq4VarE.j();
                if (objJ == dq4VarE || !(objJ instanceof dq4)) {
                    break;
                } else {
                    dq4VarE = (dq4) objJ;
                }
            }
            Drawable drawableJ = dq4VarE.j();
            if (wncVar2 == null || wncVar2.a != 2) {
                if (drawableJ instanceof nnc) {
                    nnc nncVar = (nnc) drawableJ;
                    nncVar.b(false);
                    nncVar.c();
                    nncVar.a(0, 0.0f);
                    nncVar.i(0.0f);
                    nncVar.k();
                    nncVar.e(false);
                    int i2 = onc.U0;
                    nncVar.g();
                }
            } else if (drawableJ instanceof nnc) {
                c9g.b((nnc) drawableJ, wncVar2);
            } else if (drawableJ != 0) {
                dq4VarE.f(c9g.a);
                dq4VarE.f(c9g.a(drawableJ, wncVar2, this.b));
            }
        }
    }
}
