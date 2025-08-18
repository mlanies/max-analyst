package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a2f extends z1f {
    public final /* synthetic */ us a;
    public final /* synthetic */ b2f b;

    public a2f(b2f b2fVar, us usVar) {
        this.b = b2fVar;
        this.a = usVar;
    }

    @Override // defpackage.z1f, defpackage.v1f
    public final void c(w1f w1fVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(w1fVar);
        w1fVar.D(this);
    }
}
