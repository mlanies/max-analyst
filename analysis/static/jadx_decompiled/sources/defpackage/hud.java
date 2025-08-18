package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class hud extends tdc {
    public boolean a = false;
    public final /* synthetic */ g34 b;

    public hud(g34 g34Var) {
        this.b = g34Var;
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.o();
        }
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
