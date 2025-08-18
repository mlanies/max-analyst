package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class vu7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv7 b;

    public /* synthetic */ vu7(mv7 mv7Var, int i) {
        this.a = i;
        this.b = mv7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                mv7 mv7Var = this.b;
                mv7Var.s0.m(null, x53.D0((List) mv7Var.Z.take()));
                break;
            default:
                mv7 mv7Var2 = this.b;
                mv7Var2.Y.m(null, x53.D0((List) mv7Var2.X.take()));
                break;
        }
        return e5f.a;
    }
}
