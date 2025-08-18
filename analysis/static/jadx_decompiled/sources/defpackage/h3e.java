package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h3e extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ w3e Z;
    public final /* synthetic */ i3e s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3e(w3e w3eVar, i3e i3eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = w3eVar;
        this.s0 = i3eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h3e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h3e(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        tx3 tx3Var = tx3.a;
        int i2 = this.Y;
        i3e i3eVar = this.s0;
        if (i2 == 0) {
            od2.a0(obj);
            w3e w3eVar = this.Z;
            int i3 = w3eVar.Y != 2 ? 1 : 0;
            bc7[] bc7VarArr = i3e.H0;
            db3 db3VarD = ((sc5) i3eVar.Z.getValue()).d(w3eVar.a, w3eVar.Y != 2);
            this.X = i3;
            this.Y = 1;
            if (s36.e(db3VarD, this) == tx3Var) {
                return tx3Var;
            }
            i = i3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.X;
            od2.a0(obj);
        }
        s35 s35Var = i3eVar.w0;
        boolean z = i != 0;
        pnf.o(s35Var, new qnd(z ? woc.n : woc.w, z ? vga.c : vga.d));
        return e5f.a;
    }
}
