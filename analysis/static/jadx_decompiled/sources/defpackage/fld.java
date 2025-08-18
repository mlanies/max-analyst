package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class fld extends y1f {
    public final us Z = new us(0);
    public final ArrayList s0 = new ArrayList();
    public final ArrayList t0 = new ArrayList();
    public w1f u0;
    public w1f v0;
    public w1f w0;

    public static void n(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (fnf.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                n(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    @Override // defpackage.y1f, defpackage.zu3
    public final void f(zu3 zu3Var, uu3 uu3Var) {
        this.o = true;
        this.t0.clear();
    }

    @Override // defpackage.y1f
    public final void k(ViewGroup viewGroup, View view, View view2, w1f w1fVar, boolean z) {
        if (view2 != null) {
            ArrayList arrayList = this.t0;
            if (arrayList.size() > 0) {
                view2.setVisibility(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    eld eldVar = (eld) it.next();
                    eldVar.b.addView(eldVar.a);
                }
                arrayList.clear();
            }
        }
        super.k(viewGroup, view, view2, w1fVar, z);
    }

    @Override // defpackage.y1f
    public final e2f l(ViewGroup viewGroup, View view, View view2, boolean z) {
        w1f w1fVar;
        this.u0 = null;
        this.v0 = null;
        e2f e2fVarP = p(view2, z);
        this.w0 = e2fVarP;
        w1f w1fVar2 = this.v0;
        return (w1fVar2 == null || (w1fVar = this.u0) == null || ((this instanceof mv2) ^ true)) ? hm9.P(0, this.u0, w1fVar2, e2fVarP) : hm9.P(0, hm9.P(1, w1fVar, w1fVar2), this.w0);
    }

    @Override // defpackage.y1f
    public void m(ViewGroup viewGroup, View view, View view2, w1f w1fVar, boolean z, i50 i50Var) {
        i50 i50Var2 = new i50(this, viewGroup, view, view2, w1fVar, z, i50Var, 4);
        o();
        if (view2 == null || view2.getParent() != null || this.s0.size() <= 0) {
            i50Var2.g();
            return;
        }
        view2.getViewTreeObserver().addOnPreDrawListener(new zkd(this, view2, i50Var2));
        viewGroup.addView(view2);
    }

    public abstract void o();

    public abstract e2f p(View view, boolean z);
}
