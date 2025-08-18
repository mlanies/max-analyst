package defpackage;

import android.content.Context;
import android.view.MenuItem;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class v2b extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2b(Object obj, int i, Object obj2) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        vnf vnfVarO;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(super/*android.app.Fragment*/.onOptionsItemSelected((MenuItem) this.c));
            case 1:
                return Boolean.valueOf(super/*android.app.Fragment*/.shouldShowRequestPermissionRationale((String) this.c));
            case 2:
                ynf ynfVar = (ynf) ((je7) this.c).getValue();
                pi6 pi6Var = ynfVar instanceof pi6 ? (pi6) ynfVar : null;
                return (pi6Var == null || (vnfVarO = pi6Var.o()) == null) ? ((a) this.b).o() : vnfVarO;
            case 3:
                return ((ruc) this.b).c((Class) this.c);
            default:
                return new js4(lk5.J(lk5.J(((Context) this.b).getCacheDir(), "tracer-lite-".concat((String) this.c)), "drops.json"));
        }
    }
}
