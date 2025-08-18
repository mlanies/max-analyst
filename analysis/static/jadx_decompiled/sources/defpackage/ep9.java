package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ep9 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fm Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep9(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        fm fmVar = (fm) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ep9 ep9Var = new ep9(3, continuation, 0);
                ep9Var.Y = fmVar;
                ep9Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                ep9Var.o(e5fVar);
                return e5fVar;
            default:
                ep9 ep9Var2 = new ep9(3, continuation, 1);
                ep9Var2.Y = fmVar;
                ep9Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                ep9Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                break;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                break;
        }
        return e5f.a;
    }
}
