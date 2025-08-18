package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mo2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ w12 Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        w12 w12Var = (w12) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                mo2 mo2Var = new mo2(3, continuation, 0);
                mo2Var.Y = w12Var;
                mo2Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                mo2Var.o(e5fVar);
                return e5fVar;
            default:
                mo2 mo2Var2 = new mo2(3, continuation, 1);
                mo2Var2.Y = w12Var;
                mo2Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                mo2Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.a().m().a.a.d);
                break;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().g);
                break;
        }
        return e5f.a;
    }
}
