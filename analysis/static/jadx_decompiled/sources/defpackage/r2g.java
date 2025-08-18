package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r2g extends ffe implements a66 {
    public int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ y0g Z;
    public final /* synthetic */ s2g s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2g(y0g y0gVar, s2g s2gVar, Continuation continuation) {
        super(2, continuation);
        this.Z = y0gVar;
        this.s0 = s2gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((r2g) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r2g r2gVar = new r2g(this.Z, this.s0, continuation);
        r2gVar.Y = ((Boolean) obj).booleanValue();
        return r2gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        s2g s2gVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            b1g b1gVar = new b1g(this.Z.a, this.Y);
            zt0 zt0Var = s2gVar.d;
            c32 c32Var = o2g.o;
            ja7 ja7Var = s2gVar.a;
            ja7Var.getClass();
            x97 x97Var = new x97("WebAppSetupScreenCaptureBehavior", ja7Var.b(b1g.Companion.serializer(), b1gVar));
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
        c32 c32Var2 = o2g.o;
        wsf wsfVar = s2gVar.e;
        if (wsfVar != null) {
            iwf.a((iwf) s2gVar.b.getValue(), "WebAppSetupScreenCaptureBehavior", wsfVar.a, wsfVar.b, true, 0, null, null, 240);
        }
        return e5f.a;
    }
}
