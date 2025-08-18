package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jr extends ffe implements a66 {
    public final /* synthetic */ kr X;
    public final /* synthetic */ wre Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(kr krVar, wre wreVar, Continuation continuation) {
        super(2, continuation);
        this.X = krVar;
        this.Y = wreVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jr jrVar = (jr) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jrVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jr(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        er erVar;
        od2.a0(obj);
        kr krVar = this.X;
        qp4 qp4Var = krVar.y0;
        wre wreVar = this.Y;
        qp4Var.l(wreVar.b, true);
        do {
            q0eVar = krVar.z0;
            value = q0eVar.getValue();
            er erVar2 = (er) value;
            erVar = null;
            if (erVar2 != null) {
                List<wre> list = erVar2.a;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (wre wreVar2 : list) {
                    arrayList.add(tpa.f(wreVar2.b, wreVar.b) ? wre.k(wreVar2, true, null, 14) : wre.k(wreVar2, false, null, 14));
                }
                erVar = new er(arrayList, erVar2.b, krVar.s());
            }
        } while (!q0eVar.c(value, erVar));
        return e5f.a;
    }
}
