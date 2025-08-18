package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes.dex */
public final class tz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tz2 tz2Var = (tz2) n((aj6) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tz2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tz2 tz2Var = new tz2(continuation, this.Y);
        tz2Var.X = obj;
        return tz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        aj6 aj6Var = (aj6) this.X;
        ChatsTabWidget chatsTabWidget = this.Y;
        bc7[] bc7VarArr = ChatsTabWidget.C0;
        String name = ChatsTabWidget.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null) {
            chatsTabWidget.getClass();
            if (ir6Var.c()) {
                ir6Var.d(us7.X, name, "handleHeaderStateUpdate: state=" + aj6Var, null);
            }
        }
        c2f.b(chatsTabWidget.o0());
        j90 j90Var = new j90();
        j90Var.U(0);
        c2f.a(chatsTabWidget.o0(), j90Var);
        cla claVarO0 = chatsTabWidget.o0();
        CharSequence charSequenceB = aj6Var.a.b(chatsTabWidget.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        claVarO0.setTitle(charSequenceB);
        cla claVarO02 = chatsTabWidget.o0();
        jqe jqeVar = aj6Var.b;
        claVarO02.setSubtitle(jqeVar != null ? jqeVar.b(chatsTabWidget.getContext()) : null);
        chatsTabWidget.o0().setTextShimmerEnabled(aj6Var.b != null);
        return e5f.a;
    }
}
