package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ms3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ns3 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms3(ns3 ns3Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = ns3Var;
        this.Z = str;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ms3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ms3(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            ns3 ns3Var = this.Y;
            obj = j47.t0(((w9a) ns3Var.b).a(), new ls3(ns3Var, this.Z, this.s0, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
