package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ q5e Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5e(q5e q5eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = q5eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k5e k5eVar = (k5e) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k5eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k5e k5eVar = new k5e(this.Y, continuation);
        k5eVar.X = obj;
        return k5eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        q5e q5eVar = this.Y;
        List list2 = (List) q5eVar.v0.updateAndGet(new oz0(list, 4, q5eVar));
        String str = ((l5e) q5eVar.w0.get()).a;
        if (str == null || str.length() == 0) {
            q5eVar.Z.m(null, new szc(2, list2));
        }
        return e5f.a;
    }
}
