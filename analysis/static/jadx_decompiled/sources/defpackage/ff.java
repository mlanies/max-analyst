package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ff extends q42 {
    public final /* synthetic */ int c = 0;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(int i, gf gfVar) {
        super(i);
        this.e = gfVar;
    }

    @Override // defpackage.q42
    public void b(k6g k6gVar) {
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && gfVar.k == k6gVar.a.c()) {
                    gfVar.k = -1;
                    gfVar.i();
                    x6g x6gVar = gfVar.e;
                    if (x6gVar != null) {
                        gfVar.c(x6gVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.q42
    public final void c(k6g k6gVar) {
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && gfVar.k == -1) {
                    j6g j6gVar = k6gVar.a;
                    if ((j6gVar.c() & gfVar.j) != 0) {
                        gfVar.k = j6gVar.c();
                        this.d = gfVar.e;
                        gfVar.j();
                        break;
                    }
                }
                break;
            default:
                if ((k6gVar.a.c() & 8) != 0) {
                    hc8 hc8Var = (hc8) this.e;
                    View view = hc8Var.c;
                    int iC = hc8Var.c();
                    View view2 = hc8Var.b;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iC + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                    view2.setTranslationY(0.0f);
                    zmf.l((View) this.d, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q42
    public final x6g d(x6g x6gVar, List list) {
        Object next;
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (gfVar.g) {
                    return x6gVar;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((k6g) next).a.c() == gfVar.k) {
                        }
                    } else {
                        next = null;
                    }
                }
                return ((k6g) next) != null ? gfVar.h(gf.f(gfVar, x6gVar)) : x6gVar;
            default:
                return x6gVar;
        }
    }

    @Override // defpackage.q42
    public l7b e(k6g k6gVar, l7b l7bVar) {
        x6g x6gVar;
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && (x6gVar = (x6g) this.d) != null && gfVar.k == k6gVar.a.c()) {
                    x6g x6gVarF = gf.f(gfVar, x6gVar);
                    gfVar.g(x6gVarF, l7bVar);
                    gfVar.h(x6gVarF);
                    break;
                }
                break;
        }
        return l7bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(View view, hc8 hc8Var) {
        super(1);
        this.d = view;
        this.e = hc8Var;
    }
}
