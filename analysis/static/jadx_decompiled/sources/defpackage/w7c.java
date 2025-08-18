package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class w7c implements j0e, vy1, y66 {
    public final /* synthetic */ j0e a;

    public w7c(j0e j0eVar) {
        this.a = j0eVar;
    }

    @Override // defpackage.gld
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        return this.a.d(on5Var, continuation);
    }

    @Override // defpackage.y66
    public final mn5 e(lx3 lx3Var, int i, int i2) {
        Symbol symbol = r0e.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? lld.e(this, lx3Var, i, i2) : this;
    }

    @Override // defpackage.j0e
    public final Object getValue() {
        return this.a.getValue();
    }
}
