package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l96 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z96 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l96(z96 z96Var, Continuation continuation) {
        super(2, continuation);
        this.Y = z96Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l96 l96Var = (l96) n((kpa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l96Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l96 l96Var = new l96(this.Y, continuation);
        l96Var.X = obj;
        return l96Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kpa kpaVar = (kpa) this.X;
        b86 b86Var = (b86) kpaVar.a;
        List list = (List) kpaVar.b;
        hm9.n("z96", "got album and items, items size = " + list.size());
        z96 z96Var = this.Y;
        z96Var.z0.m(null, Boolean.FALSE);
        z96Var.B0.setValue(b86Var);
        z96Var.w0.m(null, list);
        return e5f.a;
    }
}
