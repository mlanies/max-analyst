package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class e89 extends ffe implements a66 {
    public final /* synthetic */ l89 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e89(l89 l89Var, Continuation continuation) {
        super(2, continuation);
        this.X = l89Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e89(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = this.X.i;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Scrolling to last message", null);
        }
        MessageModel messageModel = (MessageModel) x53.q0(((l29) this.X.e.getValue()).a);
        e5f e5fVar = e5f.a;
        if (messageModel == null) {
            return e5fVar;
        }
        this.X.l.updateAndGet(new oe2(8));
        wwc.j(this.X.o, messageModel.c, true, 4);
        return e5fVar;
    }
}
