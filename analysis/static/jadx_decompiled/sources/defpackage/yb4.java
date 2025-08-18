package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class yb4 extends mdc {
    public static TimeInterpolator s;
    public boolean g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;

    public yb4() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = true;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public static void h(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((dec) list.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.mdc
    public final boolean a(dec decVar, dec decVar2, jt jtVar, jt jtVar2) {
        int i;
        int i2;
        int i3 = jtVar.b;
        int i4 = jtVar.c;
        if (decVar2.w()) {
            int i5 = jtVar.b;
            i2 = jtVar.c;
            i = i5;
        } else {
            i = jtVar2.b;
            i2 = jtVar2.c;
        }
        if (decVar == decVar2) {
            return g(decVar, i3, i4, i, i2);
        }
        View view = decVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m(decVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m(decVar2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = decVar2.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        wb4 wb4Var = new wb4();
        wb4Var.a = decVar;
        wb4Var.b = decVar2;
        wb4Var.c = i3;
        wb4Var.d = i4;
        wb4Var.e = i;
        wb4Var.f = i2;
        arrayList.add(wb4Var);
        return true;
    }

    @Override // defpackage.mdc
    public final void d(dec decVar) {
        View view = decVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((xb4) arrayList.get(size)).a == decVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(decVar);
                arrayList.remove(size);
            }
        }
        j(this.k, decVar);
        if (this.h.remove(decVar)) {
            view.setAlpha(1.0f);
            l();
            c(decVar);
        }
        if (this.i.remove(decVar)) {
            view.setAlpha(1.0f);
            c(decVar);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, decVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((xb4) arrayList5.get(size4)).a == decVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(decVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(decVar)) {
                view.setAlpha(1.0f);
                c(decVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(decVar);
        this.o.remove(decVar);
        this.r.remove(decVar);
        this.p.remove(decVar);
        i();
    }

    @Override // defpackage.mdc
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            xb4 xb4Var = (xb4) arrayList.get(size);
            View view = xb4Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(xb4Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            dec decVar = (dec) arrayList2.get(size2);
            l();
            c(decVar);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            dec decVar2 = (dec) arrayList3.get(size3);
            decVar2.a.setAlpha(1.0f);
            c(decVar2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            wb4 wb4Var = (wb4) arrayList4.get(size4);
            dec decVar3 = wb4Var.a;
            if (decVar3 != null) {
                k(wb4Var, decVar3);
            }
            dec decVar4 = wb4Var.b;
            if (decVar4 != null) {
                k(wb4Var, decVar4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    xb4 xb4Var2 = (xb4) arrayList6.get(size6);
                    View view2 = xb4Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(xb4Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    dec decVar5 = (dec) arrayList8.get(size8);
                    decVar5.a.setAlpha(1.0f);
                    c(decVar5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    wb4 wb4Var2 = (wb4) arrayList10.get(size10);
                    dec decVar6 = wb4Var2.a;
                    if (decVar6 != null) {
                        k(wb4Var2, decVar6);
                    }
                    dec decVar7 = wb4Var2.b;
                    if (decVar7 != null) {
                        k(wb4Var2, decVar7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                au1.r(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // defpackage.mdc
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(dec decVar, int i, int i2, int i3, int i4) {
        View view = decVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) decVar.a.getTranslationY());
        m(decVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(decVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        xb4 xb4Var = new xb4();
        xb4Var.a = decVar;
        xb4Var.b = translationX;
        xb4Var.c = translationY;
        xb4Var.d = i3;
        xb4Var.e = i4;
        arrayList.add(xb4Var);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            au1.r(arrayList.get(0));
            throw null;
        }
    }

    public final void j(ArrayList arrayList, dec decVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wb4 wb4Var = (wb4) arrayList.get(size);
            if (k(wb4Var, decVar) && wb4Var.a == null && wb4Var.b == null) {
                arrayList.remove(wb4Var);
            }
        }
    }

    public final boolean k(wb4 wb4Var, dec decVar) {
        if (wb4Var.b == decVar) {
            wb4Var.b = null;
        } else {
            if (wb4Var.a != decVar) {
                return false;
            }
            wb4Var.a = null;
        }
        decVar.a.setAlpha(1.0f);
        View view = decVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(decVar);
        return true;
    }

    public void l() {
    }

    public final void m(dec decVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        decVar.a.animate().setInterpolator(s);
        d(decVar);
    }
}
