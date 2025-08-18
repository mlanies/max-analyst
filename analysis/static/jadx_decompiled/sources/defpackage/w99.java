package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class w99 implements o9f {
    public final mi9 a;

    public w99() {
        mi9 mi9VarB = mi9.b();
        mi9VarB.j(o9f.i0, new dv1());
        mi9VarB.j(tu6.z, 34);
        mi9VarB.j(cne.e0, x99.class);
        mi9VarB.j(cne.d0, x99.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = mi9VarB;
    }

    @Override // defpackage.o9f
    public final q9f N() {
        return q9f.Y;
    }

    @Override // defpackage.t7c
    public final ce3 getConfig() {
        return this.a;
    }
}
