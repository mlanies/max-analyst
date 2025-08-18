package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class aa8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da8 b;

    public /* synthetic */ aa8(da8 da8Var, int i) {
        this.a = i;
        this.b = da8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da8 da8Var = this.b;
                if (((e98) da8Var.g.b).e.a() == null) {
                    da8Var.R();
                    break;
                }
                break;
            default:
                da8 da8Var2 = this.b;
                da8Var2.getClass();
                ComponentName componentNameB = da8Var2.c.a.b();
                jo7 jo7Var = new jo7();
                jo7Var.c = da8Var2;
                jo7Var.a = new n68(jo7Var);
                q68 q68Var = new q68(da8Var2.a, componentNameB, jo7Var);
                da8Var2.h = q68Var;
                q68Var.a.b.connect();
                break;
        }
    }
}
