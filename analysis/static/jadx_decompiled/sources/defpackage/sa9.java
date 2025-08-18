package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sa9 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ wa9 c;

    public /* synthetic */ sa9(mn5 mn5Var, wa9 wa9Var, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = wa9Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new ra9(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new ra9(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
