package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ qa Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(je7 je7Var, qa qaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = je7Var;
        this.Z = qaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pa paVar = (pa) n((oa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        paVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pa paVar = new pa(this.Y, this.Z, continuation);
        paVar.X = obj;
        return paVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        jqe eqeVar;
        ArrayList arrayListB;
        od2.a0(obj);
        oa oaVar = (oa) this.X;
        ((ir1) this.Y.getValue()).h(oaVar.c);
        qa qaVar = this.Z;
        q0e q0eVar = qaVar.o;
        do {
            value = q0eVar.getValue();
            na naVar = (na) value;
            Map map = oaVar.a;
            eqeVar = map.isEmpty() ? new eqe(b8a.g2) : new aqe(a8a.a, map.size());
            qaVar.b.getClass();
            arrayListB = qx7.b(map);
            naVar.getClass();
        } while (!q0eVar.c(value, new na(eqeVar, arrayListB)));
        return e5f.a;
    }
}
