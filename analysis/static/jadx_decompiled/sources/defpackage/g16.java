package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final class g16 implements ug7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ q16 b;
    public final /* synthetic */ gh7 c;
    public final /* synthetic */ c o;

    public g16(c cVar, String str, q16 q16Var, gh7 gh7Var) {
        this.o = cVar;
        this.a = str;
        this.b = q16Var;
        this.c = gh7Var;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        Bundle bundle;
        eg7 eg7Var2 = eg7.ON_START;
        c cVar = this.o;
        String str = this.a;
        if (eg7Var == eg7Var2 && (bundle = (Bundle) cVar.l.get(str)) != null) {
            this.b.b(str, bundle);
            cVar.l.remove(str);
        }
        if (eg7Var == eg7.ON_DESTROY) {
            this.c.f(this);
            cVar.m.remove(str);
        }
    }
}
