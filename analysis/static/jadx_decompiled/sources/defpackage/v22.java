package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* loaded from: classes2.dex */
public final class v22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v22(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        v22 v22Var = (v22) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        v22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        v22 v22Var = new v22(continuation, this.Y);
        v22Var.X = obj;
        return v22Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v22.o(java.lang.Object):java.lang.Object");
    }
}
