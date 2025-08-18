package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d7e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ i7e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7e(i7e i7eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = i7eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((d7e) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d7e d7eVar = new d7e(this.Z, continuation);
        d7eVar.Y = obj;
        return d7eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kpa kpaVar = (kpa) this.Y;
            List list = (List) kpaVar.a;
            d6e d6eVar = (d6e) kpaVar.b;
            this.X = 1;
            if (i7e.q(this.Z, list, d6eVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
