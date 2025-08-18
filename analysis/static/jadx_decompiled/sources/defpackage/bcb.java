package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bcb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ccb Z;
    public final /* synthetic */ xab s0;
    public final /* synthetic */ uab t0;
    public final /* synthetic */ String u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcb(ccb ccbVar, xab xabVar, uab uabVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ccbVar;
        this.s0 = xabVar;
        this.t0 = uabVar;
        this.u0 = str;
        this.v0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bcb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bcb bcbVar = new bcb(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        bcbVar.Y = obj;
        return bcbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        try {
            if (i == 0) {
                od2.a0(obj);
                pnf.o(this.Z.Z, zbb.a);
                ccb ccbVar = this.Z;
                xab xabVar = this.s0;
                uab uabVar = this.t0;
                String str = this.u0;
                int i2 = this.v0;
                fbb fbbVar = ccbVar.b;
                boolean z = ccbVar.Y == i2;
                om8 om8Var = new om8(1, ccbVar, ccb.class, "mapAndNotifyEvent", "mapAndNotifyEvent(Lone/me/profile/screens/avatars/ProfileAvatars$Event;)V", 0, 10);
                this.X = 1;
                if (fbbVar.b(xabVar, uabVar, str, z, om8Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            njcVar = e5fVar;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (!(njcVar instanceof njc)) {
            jqe jqeVar = this.s0.b;
            if (jqeVar != null) {
                pnf.o(this.Z.Z, new wbb((eqe) jqeVar, false));
            }
        } else {
            Throwable thA = pjc.a(njcVar);
            if (!(thA instanceof CancellationException)) {
                hm9.p(this.Z.c, "action " + this.s0 + ": failed", thA);
                jqe jqeVar2 = this.s0.c;
                if (jqeVar2 != null) {
                    pnf.o(this.Z.Z, new wbb((eqe) jqeVar2, true));
                }
            }
        }
        pnf.o(this.Z.Z, vbb.a);
        return e5fVar;
    }
}
