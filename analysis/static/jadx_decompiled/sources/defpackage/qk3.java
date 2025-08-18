package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qk3 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ zk3 c;

    public /* synthetic */ qk3(vy1 vy1Var, zk3 zk3Var, int i) {
        this.a = i;
        this.b = vy1Var;
        this.c = zk3Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new pk3(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new pk3(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
