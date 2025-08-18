package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class ou3 implements aoc {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ ou3(uu3 uu3Var, Cloneable cloneable, int i, int i2) {
        this.a = i2;
        this.b = uu3Var;
        this.d = cloneable;
        this.c = i;
    }

    @Override // defpackage.aoc
    public final void a() {
        switch (this.a) {
            case 0:
                uu3 uu3Var = this.b;
                uu3Var.router.U(uu3Var.instanceId, (Intent) this.d, this.c);
                break;
            default:
                uu3 uu3Var2 = this.b;
                uu3Var2.router.M(uu3Var2.instanceId, (String[]) this.d, this.c);
                break;
        }
    }
}
