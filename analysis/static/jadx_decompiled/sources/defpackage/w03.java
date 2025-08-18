package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w03 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ qp4 c;

    public /* synthetic */ w03(mn5 mn5Var, qp4 qp4Var, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = qp4Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new v03(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new v03(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD3 = this.b.d(new v03(on5Var, this.c, 2), continuation);
                if (objD3 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
