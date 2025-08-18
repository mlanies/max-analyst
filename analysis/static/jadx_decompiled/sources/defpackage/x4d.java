package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x4d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y4d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4d(y4d y4dVar, Continuation continuation) {
        super(2, continuation);
        this.Y = y4dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        x4d x4dVar = (x4d) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        x4dVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        x4d x4dVar = new x4d(this.Y, continuation);
        x4dVar.X = obj;
        return x4dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List<v4d> list = (List) this.X;
        y4d y4dVar = this.Y;
        y4dVar.a.clear();
        for (v4d v4dVar : list) {
            y4dVar.a.put(new Long(v4dVar.a), v4dVar);
        }
        return e5f.a;
    }
}
