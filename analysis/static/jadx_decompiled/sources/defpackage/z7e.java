package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z7e extends ffe implements a66 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ b8e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7e(m56 m56Var, long j, b8e b8eVar, Continuation continuation) {
        super(2, continuation);
        this.X = m56Var;
        this.Y = j;
        this.Z = b8eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z7e z7eVar = (z7e) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z7eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z7e(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e02 e02Var;
        od2.a0(obj);
        long j = this.Y;
        m56 m56Var = this.X;
        if (m56Var != null) {
            m56Var.invoke(new Long(j));
        }
        b8e b8eVar = this.Z;
        List<e02> list = ((l7e) b8eVar.t0.getValue()).a;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (e02 e02Var2 : list) {
            w3e w3eVar = e02Var2.b;
            long j2 = w3eVar.a;
            long j3 = e02Var2.a;
            if (j2 == j) {
                e02Var = new e02(j3, w3e.k(w3eVar, null, true, false, 191));
            } else if (w3eVar.Z) {
                e02Var = new e02(j3, w3e.k(w3eVar, null, false, false, 191));
            } else {
                arrayList.add(e02Var2);
            }
            e02Var2 = e02Var;
            arrayList.add(e02Var2);
        }
        q0e q0eVar = b8eVar.t0;
        q0eVar.m(null, new l7e(arrayList, ((l7e) q0eVar.getValue()).b));
        return e5f.a;
    }
}
