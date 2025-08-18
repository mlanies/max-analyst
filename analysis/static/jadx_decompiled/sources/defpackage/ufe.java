package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ufe extends ffe implements e66 {
    public int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ cge Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufe(cge cgeVar, Continuation continuation) {
        super(4, continuation);
        this.Z = cgeVar;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        ufe ufeVar = new ufe(this.Z, (Continuation) obj4);
        ufeVar.Y = (Throwable) obj2;
        return ufeVar.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = this.Y;
            this.X = 1;
            obj = cge.c(this.Z, th, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
