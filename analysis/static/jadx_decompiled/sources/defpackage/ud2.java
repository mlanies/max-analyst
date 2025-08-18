package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ud2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ v4 c;

    public /* synthetic */ ud2(Context context, v4 v4Var, int i) {
        this.a = i;
        this.b = context;
        this.c = v4Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                v4 v4Var = this.c;
                return new v5d(this.b, v4Var.d(fe7.class), v4Var.d(os0.class), v4Var.d(zaa.class), os2.g, 20);
            case 1:
                v4 v4Var2 = this.c;
                return new v5d(this.b, v4Var2.d(fe7.class), v4Var2.d(os0.class), v4Var2.d(zaa.class));
            case 2:
                v4 v4Var3 = this.c;
                return new v5d(this.b, v4Var3.d(fe7.class), v4Var3.d(os0.class), v4Var3.d(zaa.class), os2.g, 20);
            default:
                v4 v4Var4 = this.c;
                return new v5d(this.b, v4Var4.d(fe7.class), v4Var4.d(os0.class), v4Var4.d(zaa.class));
        }
    }
}
