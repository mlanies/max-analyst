package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fib implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ jib c;

    public /* synthetic */ fib(mn5 mn5Var, jib jibVar, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = jibVar;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new eib(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new eib(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
