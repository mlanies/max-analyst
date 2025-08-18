package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class on2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ChatScreen s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on2(w7c w7cVar, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = w7cVar;
        this.s0 = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((on2) n((p35) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        on2 on2Var = new on2((w7c) this.Y, continuation, this.s0);
        on2Var.X = obj;
        return on2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        od2.a0(obj);
        Object objA = ((p35) this.X).a();
        Throwable thA = pjc.a(objA);
        e5f e5fVar = e5f.a;
        if (thA == null) {
            try {
                ChatScreen.v0(this.s0, (sy8) objA);
                njcVar = e5fVar;
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            if (!this.Z) {
                od2.a0(njcVar);
            }
        }
        return e5fVar;
    }
}
