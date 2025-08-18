package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class ec3 implements gpb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gpb
    public final Object get() {
        switch (this.a) {
            case 0:
                fc3 fc3Var = (fc3) this.b;
                fc3Var.getClass();
                nb3 nb3Var = (nb3) this.c;
                return nb3Var.f.f(new bg4(nb3Var, fc3Var));
            case 1:
                return new nj6((Context) this.b, (String) this.c);
            default:
                fl5 fl5Var = (fl5) this.b;
                String strC = fl5Var.c();
                return new h24((Context) this.c, strC);
        }
    }
}
