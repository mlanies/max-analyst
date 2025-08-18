package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c61 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ s51 Y;
    public final /* synthetic */ h61 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(s51 s51Var, h61 h61Var, Continuation continuation) {
        super(2, continuation);
        this.Y = s51Var;
        this.Z = h61Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c61) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c61(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        LinkedHashMap linkedHashMap;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        s51 s51Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue = ((oqf) s51Var).b.longValue();
            this.X = 1;
            if (j47.x(jLongValue, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        q0e q0eVar = this.Z.o;
        do {
            value = q0eVar.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.remove(Integer.valueOf(s51Var.getPriority()));
        } while (!q0eVar.c(value, mz7.d0(linkedHashMap)));
        return e5f.a;
    }
}
