package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xr2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ cka Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        cka ckaVar = (cka) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                xr2 xr2Var = new xr2(3, continuation, 0);
                xr2Var.Y = ckaVar;
                xr2Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                xr2Var.o(e5fVar);
                return e5fVar;
            case 1:
                xr2 xr2Var2 = new xr2(3, continuation, 1);
                xr2Var2.Y = ckaVar;
                xr2Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                xr2Var2.o(e5fVar2);
                return e5fVar2;
            default:
                xr2 xr2Var3 = new xr2(3, continuation, 2);
                xr2Var3.Y = ckaVar;
                xr2Var3.Z = fkaVar;
                e5f e5fVar3 = e5f.a;
                xr2Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.onThemeChanged(this.Z);
                break;
            case 1:
                od2.a0(obj);
                this.Y.onThemeChanged(this.Z);
                break;
            default:
                od2.a0(obj);
                this.Y.onThemeChanged(this.Z);
                break;
        }
        return e5f.a;
    }
}
