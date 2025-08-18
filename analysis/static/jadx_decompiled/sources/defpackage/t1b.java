package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* loaded from: classes.dex */
public final class t1b implements um1 {
    public final w7c X;
    public final je7 Y;
    public final os1 a;
    public final q1b b;
    public xg1 c;
    public final q0e o;

    public t1b(oqa oqaVar, kr1 kr1Var, os1 os1Var, q1b q1bVar, je7 je7Var) {
        khe kheVarD = n31.a.getAccessor().d(jr1.class);
        je7 je7Var2 = yi1.a;
        khe kheVarD2 = zi1.a.getAccessor().d(ir1.class);
        this.a = os1Var;
        this.b = q1bVar;
        q0e q0eVarA = r0e.a(new qma(null, null, null, false, false, true, null, iaf.o, false, null));
        this.o = q0eVarA;
        this.X = new w7c(q0eVarA);
        je7 je7VarR = tu0.r(3, new s4a(25));
        this.Y = je7VarR;
        os1Var.d(this);
        Continuation continuation = null;
        od2.L(new zn5(((ugf) je7VarR.getValue()).d, new p1b(2, null), 5), (sx3) kheVarD.getValue());
        od2.L(new j31(new j31(new m58(((ir1) kheVarD2.getValue()).o, 24), ((cra) oqaVar).w0, new r1b(3, continuation, 0), 4), ((wr1) kr1Var).I, new jf1((Object) this, je7Var, continuation, 5), 4), (sx3) kheVarD.getValue());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.b.b();
        this.c = null;
    }
}
