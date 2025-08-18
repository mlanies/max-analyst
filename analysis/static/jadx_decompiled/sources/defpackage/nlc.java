package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nlc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mg4 Y;
    public final /* synthetic */ vlc Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlc(mg4 mg4Var, vlc vlcVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = mg4Var;
        this.Z = vlcVar;
        this.s0 = j;
        this.t0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nlc(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int iOrdinal = this.Y.ordinal();
            vlc vlcVar = this.Z;
            if (iOrdinal == 0) {
                t19 t19VarD = vlcVar.d();
                this.X = 1;
                t19VarD.getClass();
                if (ote.j(t19VarD.a, new q19(t19VarD, this.s0, this.t0, 0), this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                t19 t19VarD2 = vlcVar.d();
                this.X = 2;
                t19VarD2.getClass();
                if (ote.j(t19VarD2.a, new q19(t19VarD2, this.s0, this.t0, 1), this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
