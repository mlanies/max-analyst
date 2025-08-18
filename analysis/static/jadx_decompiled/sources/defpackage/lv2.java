package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class lv2 implements v1f {
    public final /* synthetic */ View a;
    public final /* synthetic */ mv2 b;
    public final /* synthetic */ boolean c;

    public lv2(View view, mv2 mv2Var, boolean z) {
        this.a = view;
        this.b = mv2Var;
        this.c = z;
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
        View view = this.a;
        if (view == null) {
            return;
        }
        cla claVar = (cla) hm9.x(view, this.b.x0);
        if (this.c) {
            eha searchView = claVar.getSearchView();
            if (searchView != null) {
                searchView.d();
                return;
            }
            return;
        }
        eha searchView2 = claVar.getSearchView();
        if (searchView2 != null) {
            searchView2.b();
        }
    }

    @Override // defpackage.v1f
    public final void b() {
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void f() {
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
    }
}
