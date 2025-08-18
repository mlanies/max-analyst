package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ez6 extends ffe implements a66 {
    public final /* synthetic */ fz6 X;
    public final /* synthetic */ a86 Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez6(fz6 fz6Var, a86 a86Var, int i, Continuation continuation) {
        super(2, continuation);
        this.X = fz6Var;
        this.Y = a86Var;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ez6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ez6(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        fz6 fz6Var = this.X;
        ConcurrentHashMap concurrentHashMap = fz6Var.A0;
        a86 a86Var = this.Y;
        List list = (List) concurrentHashMap.get(a86Var);
        e5f e5fVar = e5f.a;
        if (list == null) {
            return e5fVar;
        }
        int i = a86Var instanceof z76 ? 40 : this.Z;
        if (list.size() <= i) {
            return e5fVar;
        }
        fz6Var.A0.put(a86Var, list.subList(0, i));
        return e5fVar;
    }
}
