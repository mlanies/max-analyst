package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sw2 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ nx2 c;

    public /* synthetic */ sw2(mn5 mn5Var, nx2 nx2Var, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = nx2Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new rw2(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new rw2(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
            case 2:
                Object objD3 = this.b.d(new rw2(on5Var, this.c, 2), continuation);
                if (objD3 != tx3.a) {
                    break;
                }
                break;
            case 3:
                Object objD4 = this.b.d(new rw2(on5Var, this.c, 3), continuation);
                if (objD4 != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD5 = this.b.d(new rw2(on5Var, this.c, 4), continuation);
                if (objD5 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
