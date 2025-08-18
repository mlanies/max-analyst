package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class tce implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yce b;

    public /* synthetic */ tce(yce yceVar, int i) {
        this.a = i;
        this.b = yceVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        rce rceVar = (rce) obj2;
        switch (this.a) {
            case 0:
                a66 a66Var = this.b.R0;
                if (a66Var != null) {
                    a66Var.invoke(view, rceVar);
                }
                break;
            default:
                a66 a66Var2 = this.b.R0;
                if (a66Var2 != null) {
                    a66Var2.invoke(view, rceVar);
                }
                break;
        }
        return e5f.a;
    }
}
