package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ly6 extends ffe implements a66 {
    public final /* synthetic */ ArrayList X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly6(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.X = arrayList;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ly6 ly6Var = (ly6) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ly6Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ly6(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            c63.U(arrayList, new ky6(0));
        }
        return e5f.a;
    }
}
