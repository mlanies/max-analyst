package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tvf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ hwf Z;
    public final /* synthetic */ vvf s0;
    public final /* synthetic */ evf t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvf(String str, hwf hwfVar, vvf vvfVar, evf evfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = hwfVar;
        this.s0 = vvfVar;
        this.t0 = evfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tvf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tvf(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        evf evfVar = this.t0;
        vvf vvfVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y;
            xbe xbeVar = new xbe((str == null || str.length() == 0) ? wbe.c : wbe.b, this.Z.b);
            zt0 zt0Var = vvfVar.g;
            String str2 = evfVar.a;
            ja7 ja7Var = vvfVar.a;
            ja7Var.getClass();
            x97 x97Var = new x97(str2, ja7Var.b(xbe.Companion.serializer(), xbeVar));
            this.X = 1;
            if (zt0Var.o(x97Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        vvf.e(vvfVar, evfVar.a);
        return e5f.a;
    }
}
