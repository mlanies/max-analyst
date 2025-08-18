package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class zwc implements spf {
    public final /* synthetic */ b9b a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;

    public zwc(b9b b9bVar, Rect rect, Rect rect2, Rect rect3, int i) {
        this.a = b9bVar;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = i;
    }

    @Override // defpackage.spf
    public final void a() {
    }

    @Override // defpackage.spf
    public final void b() {
        b9b b9bVar = this.a;
        View view = (View) b9bVar.c;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            kp.x(recyclerView, new xya(recyclerView, 1));
        }
        b9bVar.c = null;
    }

    @Override // defpackage.spf
    public final void c(Rect rect, View view) {
        v3c v3cVarI;
        z5b callback;
        b9b b9bVar = this.a;
        if (((View) b9bVar.c) == null) {
            View viewJ = b9b.j(view);
            if (viewJ == null) {
                viewJ = (View) view.getParent();
            }
            b9bVar.c = viewJ;
            RecyclerView recyclerView = viewJ instanceof RecyclerView ? (RecyclerView) viewJ : null;
            if (recyclerView != null) {
                kp.x(recyclerView, new xya(recyclerView, 2));
            }
        }
        View view2 = (View) b9bVar.b;
        Rect rect2 = this.b;
        mpf.d(rect2, view2);
        ViewParent parent = view2.getParent();
        f6b f6bVar = parent instanceof f6b ? (f6b) parent : null;
        int iC = (f6bVar == null || (callback = f6bVar.getCallback()) == null) ? rect2.top : callback.c();
        View view3 = (View) b9bVar.c;
        Rect rect3 = this.c;
        if (view3 != null) {
            mpf.d(rect3, view3);
        }
        int i = rect3.top;
        int i2 = this.e;
        Rect rect4 = this.d;
        rect4.top = i + i2;
        rect4.bottom = iC - i2;
        rect4.left = rect3.left;
        rect4.right = rect3.right;
        if (rect4.contains(rect) || (v3cVarI = b9b.i(view)) == null) {
            return;
        }
        v3cVarI.l(rect, rect4);
    }
}
