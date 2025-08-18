package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tgb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vgb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgb(vgb vgbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tgb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tgb(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        vgb vgbVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            gv4 gv4Var = vgbVar.b;
            this.X = 1;
            obj = gv4Var.l(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            pnf.o(vgbVar.w0, g43.b);
        }
        return e5f.a;
    }
}
