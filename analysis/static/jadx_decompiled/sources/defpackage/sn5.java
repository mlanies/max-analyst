package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sn5 extends ffe implements m56 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ p8c Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ iab t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn5(p8c p8cVar, int i, iab iabVar, Continuation continuation, int i2) {
        super(1, continuation);
        this.X = i2;
        this.Z = p8cVar;
        this.s0 = i;
        this.t0 = iabVar;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                return new sn5(this.Z, this.s0, this.t0, (Continuation) obj, 0).o(e5f.a);
            default:
                return new sn5(this.Z, this.s0, this.t0, (Continuation) obj, 1).o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                tx3 tx3Var = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    List listG = nu0.g(this.Z, this.s0);
                    if (!((ArrayList) listG).isEmpty()) {
                        this.Y = 1;
                        if (((fab) this.t0).a.o(listG, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return Boolean.FALSE;
            default:
                tx3 tx3Var2 = tx3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    od2.a0(obj);
                    List listG2 = nu0.g(this.Z, this.s0);
                    if (!((ArrayList) listG2).isEmpty()) {
                        this.Y = 1;
                        if (((fab) this.t0).a.o(listG2, this) == tx3Var2) {
                            return tx3Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return Boolean.TRUE;
        }
    }
}
