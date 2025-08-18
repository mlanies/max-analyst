package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wv2 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ gw2 c;

    public /* synthetic */ wv2(mn5 mn5Var, gw2 gw2Var, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = gw2Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new vv2(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new vv2(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
