package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class u47 extends s47 {
    public final v47 b;
    public final WeakReference c;

    public u47(v47 v47Var, s47 s47Var) {
        super(s47Var.a);
        this.b = v47Var;
        this.c = new WeakReference(s47Var);
    }

    @Override // defpackage.s47
    public final void a(Set set) {
        s47 s47Var = (s47) this.c.get();
        if (s47Var == null) {
            this.b.c(this);
        } else {
            s47Var.a(set);
        }
    }
}
