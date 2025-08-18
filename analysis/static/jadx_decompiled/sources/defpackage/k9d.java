package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k9d extends g9d {
    public final boolean A0;
    public final List B0;
    public final String z0;

    public k9d(i9d i9dVar) {
        super(i9dVar);
        this.z0 = i9dVar.m;
        this.A0 = i9dVar.n;
        this.B0 = (List) i9dVar.o;
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        bu8 bu8Var = new bu8();
        bu8Var.g = this.z0;
        bu8Var.u = this.A0;
        bu8Var.F = Collections.unmodifiableList(this.B0);
        return bu8Var;
    }
}
