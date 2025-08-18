package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yr extends ffe implements a66 {
    public final /* synthetic */ zr X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(zr zrVar, Continuation continuation) {
        super(2, continuation);
        this.X = zrVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yr yrVar = (yr) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yrVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yr(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        od2.a0(obj);
        zr zrVar = this.X;
        bc7[] bc7VarArr = zr.J0;
        ze0 ze0Var = zrVar.w() ? this.X.z0 : this.X.y0;
        Collection<c62> collectionValues = (this.X.w() ? this.X.w0 : this.X.x0).values();
        ArrayList arrayList = new ArrayList(z53.S(collectionValues, 10));
        for (c62 c62Var : collectionValues) {
            ze0 ze0Var2 = c62Var.b;
            arrayList.add(new c62(Boolean.valueOf(tpa.f(ze0Var, ze0Var2)), ze0Var2, c62Var.c, c62Var.o));
        }
        q0e q0eVar = this.X.H0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, arrayList));
        return e5f.a;
    }
}
