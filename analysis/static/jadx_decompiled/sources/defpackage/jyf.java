package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jyf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ oyf Z;
    public final /* synthetic */ lyf s0;
    public final /* synthetic */ String t0 = "WebAppRequestPhone";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyf(lyf lyfVar, oyf oyfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = oyfVar;
        this.s0 = lyfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jyf) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jyf jyfVar = new jyf(this.s0, this.Z, continuation);
        jyfVar.Y = obj;
        return jyfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        lyf lyfVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            ryf ryfVar = new ryf(this.Z.a, (String) this.Y);
            zt0 zt0Var = lyfVar.e;
            ja7 ja7Var = lyfVar.a;
            ja7Var.getClass();
            x97 x97Var = new x97(this.t0, ja7Var.b(ryf.Companion.serializer(), ryfVar));
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
        wsf wsfVar = lyfVar.f;
        if (wsfVar != null) {
            iwf.a((iwf) lyfVar.b.getValue(), this.t0, wsfVar.a, wsfVar.b, true, 0, null, null, 240);
        }
        return e5f.a;
    }
}
