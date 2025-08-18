package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ch7 implements ug7 {
    public final /* synthetic */ fm a;
    public final /* synthetic */ dh7 b;
    public final /* synthetic */ gh7 c;

    public ch7(fm fmVar, dh7 dh7Var, gh7 gh7Var) {
        this.a = fmVar;
        this.b = dh7Var;
        this.c = gh7Var;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        dh7 dh7Var;
        if (eg7Var.a().compareTo(fg7.a) <= 0) {
            hm9.G("LifecycleOnOffsetChangedListener", "handle ON_DESTROY state", null);
            ArrayList arrayList = this.a.v0;
            if (arrayList != null && (dh7Var = this.b) != null) {
                arrayList.remove(dh7Var);
            }
            this.c.f(this);
        }
    }
}
