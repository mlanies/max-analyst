package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t6e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w6e Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6e(w6e w6eVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = w6eVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t6e(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        w6e w6eVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = w6e.B0;
            db3 db3VarD = ((sc5) w6eVar.o.getValue()).d(this.Z, false);
            this.X = 1;
            if (s36.e(db3VarD, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(w6eVar.Z, new ued(woc.w, new eqe(hja.l)));
        return e5f.a;
    }
}
