package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ieb extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ cla Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ieb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        cla claVar = (cla) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ieb iebVar = new ieb(3, continuation, 0);
                iebVar.Y = claVar;
                iebVar.Z = fkaVar;
                e5f e5fVar = e5f.a;
                iebVar.o(e5fVar);
                return e5fVar;
            default:
                ieb iebVar2 = new ieb(3, continuation, 1);
                iebVar2.Y = claVar;
                iebVar2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                iebVar2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                break;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                break;
        }
        return e5f.a;
    }
}
