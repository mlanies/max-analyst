package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zy4 extends ffe implements a66 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ az4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy4(m56 m56Var, int i, az4 az4Var, Continuation continuation) {
        super(2, continuation);
        this.X = m56Var;
        this.Y = i;
        this.Z = az4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zy4 zy4Var = (zy4) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zy4Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zy4(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = this.Y;
        m56 m56Var = this.X;
        if (m56Var != null) {
            m56Var.invoke(new Integer(i));
        }
        az4 az4Var = this.Z;
        List<d02> list = ((xy4) az4Var.u0.a.getValue()).a;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (d02 d02VarK : list) {
            if (d02VarK.a == i) {
                d02VarK = d02.k(d02VarK, true);
            } else if (d02VarK.c) {
                d02VarK = d02.k(d02VarK, false);
            }
            arrayList.add(d02VarK);
        }
        q0e q0eVar = az4Var.t0;
        q0eVar.m(null, new xy4(arrayList, ((xy4) q0eVar.getValue()).b));
        return e5f.a;
    }
}
