package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class mv2 extends fld {
    public String x0 = "";

    @Override // defpackage.fld, defpackage.y1f
    public final void m(ViewGroup viewGroup, View view, View view2, w1f w1fVar, boolean z, i50 i50Var) throws Resources.NotFoundException {
        eha searchView;
        String string = viewGroup.getResources().getString(r8a.q);
        this.x0 = string;
        if (view2 != null && !z && (searchView = ((cla) hm9.x(view2, string)).getSearchView()) != null) {
            int i = eha.I0;
            searchView.c(true);
        }
        super.m(viewGroup, view, view2, w1fVar, z, i50Var);
    }

    @Override // defpackage.fld
    public final void o() {
        String str = this.x0;
        this.Z.put(str, str);
    }

    @Override // defpackage.fld
    public final e2f p(View view, boolean z) {
        e2f e2fVar = new e2f();
        e2fVar.Q(new lv2(view, this, z));
        return e2fVar;
    }
}
