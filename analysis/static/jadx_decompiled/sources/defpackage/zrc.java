package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zrc implements j0e {
    public final /* synthetic */ j0e a;

    public zrc(iy2 iy2Var) {
        ty2 ty2Var = ((jz2) iy2Var).b;
        this.a = (j0e) ((ConcurrentHashMap) ty2Var.Z).computeIfAbsent(0L, new di(4, new jy2(0, ty2Var)));
    }

    @Override // defpackage.gld
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        return this.a.d(on5Var, continuation);
    }

    @Override // defpackage.j0e
    public final Object getValue() {
        return (e52) this.a.getValue();
    }
}
