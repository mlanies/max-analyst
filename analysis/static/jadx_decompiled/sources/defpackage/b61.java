package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b61 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ h61 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(h61 h61Var, Continuation continuation) {
        super(2, continuation);
        this.Y = h61Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b61 b61Var = (b61) n((s51) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b61Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b61 b61Var = new b61(this.Y, continuation);
        b61Var.X = obj;
        return b61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        Object objD0;
        od2.a0(obj);
        s51 s51Var = (s51) this.X;
        h61 h61Var = this.Y;
        q0e q0eVar = h61Var.o;
        do {
            value = q0eVar.getValue();
            Map map = (Map) value;
            if (tpa.f(s51Var, c51.a) || tpa.f(s51Var, b51.a)) {
                objD0 = oz4.a;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(s51Var.getPriority()), s51Var);
                objD0 = mz7.d0(linkedHashMap);
            }
        } while (!q0eVar.c(value, objD0));
        if ((s51Var instanceof oqf) && ((oqf) s51Var).b != null) {
            j47.T(h61Var.a, null, null, new c61(s51Var, h61Var, null), 3);
        }
        return e5f.a;
    }
}
