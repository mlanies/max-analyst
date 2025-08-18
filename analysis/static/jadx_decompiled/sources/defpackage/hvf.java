package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hvf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vvf Z;
    public final /* synthetic */ etf s0;
    public final /* synthetic */ evf t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvf(etf etfVar, evf evfVar, vvf vvfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = vvfVar;
        this.s0 = etfVar;
        this.t0 = evfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hvf) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hvf hvfVar = new hvf(this.s0, this.t0, this.Z, continuation);
        hvfVar.Y = obj;
        return hvfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        evf evfVar = this.t0;
        vvf vvfVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            String str = (String) this.Y;
            ja7 ja7Var = vvfVar.a;
            String str2 = this.s0.b;
            vbe vbeVar = wbe.Companion;
            htf htfVar = new htf(str2, str);
            ja7Var.getClass();
            x97 x97Var = new x97(evfVar.a, ja7Var.b(htf.Companion.serializer(), htfVar));
            this.X = 1;
            if (vvfVar.g.o(x97Var, this) == tx3Var) {
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
