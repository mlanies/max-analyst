package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nx2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kx2 kx2Var = (kx2) n((gi9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kx2 kx2Var = new kx2(this.Y, continuation);
        kx2Var.X = obj;
        return kx2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gi9 gi9Var = (gi9) this.X;
        xb9 xb9Var = (xb9) this.Y.B0.getValue();
        xb9Var.getClass();
        if (!gi9Var.i()) {
            List listB = xb9Var.b(gi9Var);
            if (!listB.isEmpty()) {
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "MissedContactsController", zr6.i("requestForChatListScreen: ids=[", x53.n0(listB, null, null, null, null, 63), "]"), null);
                }
                xb9Var.h().d(listB);
            }
        }
        return e5f.a;
    }
}
