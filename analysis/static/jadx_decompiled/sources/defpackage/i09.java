package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class i09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i09(Continuation continuation, MessageWriteWidget messageWriteWidget, View view) {
        super(2, continuation);
        this.Y = messageWriteWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i09 i09Var = (i09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i09 i09Var = new i09(continuation, this.Y, this.Z);
        i09Var.X = obj;
        return i09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jqe jqeVar = (jqe) this.X;
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        this.Y.q0().setInputHint(jqeVar.b(this.Z.getContext()));
        return e5f.a;
    }
}
