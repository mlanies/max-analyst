package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b83 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d83 Y;
    public final /* synthetic */ kz6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b83(d83 d83Var, kz6 kz6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = d83Var;
        this.Z = kz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b83 b83Var = new b83(this.Y, this.Z, continuation);
        b83Var.X = obj;
        return b83Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        od2.a0(obj);
        d83 d83Var = this.Y;
        kz6 kz6Var = this.Z;
        try {
            tp7 tp7Var = (tp7) d83Var.d.getValue();
            long j = kz6Var.c;
            tp7Var.getClass();
            njcVar = (es8) tp7.b(tp7Var, j, false, 26).e();
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            return null;
        }
        return njcVar;
    }
}
