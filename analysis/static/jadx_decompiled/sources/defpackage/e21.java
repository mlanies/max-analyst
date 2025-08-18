package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e21 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ je7 c;

    public /* synthetic */ e21(mn5 mn5Var, je7 je7Var, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = je7Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new d21(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new d21(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD3 = this.b.d(new d21(on5Var, this.c, 2), continuation);
                if (objD3 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
