package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class j61 extends yb4 {
    public final /* synthetic */ k61 t;

    public j61(k61 k61Var) {
        this.t = k61Var;
        this.d = 300L;
        this.c = 300L;
        this.f = 300L;
        this.e = 300L;
    }

    @Override // defpackage.yb4
    public final void l() {
        RecyclerView recyclerView = this.t.a;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
    }
}
