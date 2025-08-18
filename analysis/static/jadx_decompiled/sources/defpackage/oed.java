package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oed extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ped Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oed(ped pedVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = pedVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oed) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new oed(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        LinkedHashMap linkedHashMap;
        long j;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        ped pedVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            q0e q0eVar = pedVar.t0;
            do {
                value = q0eVar.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                j = this.Z;
                linkedHashMap.remove(new Long(j));
            } while (!q0eVar.c(value, linkedHashMap));
            qq3 qq3Var = (qq3) pedVar.Z.getValue();
            this.X = 1;
            qq3Var.a(j);
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(pedVar.y0, new ced(new eqe(kha.f)));
        return e5fVar;
    }
}
