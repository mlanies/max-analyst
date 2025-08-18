package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes.dex */
public final class ecf extends EnhancedVectorDrawable implements kre {
    public final int a;
    public final m56 b;

    public ecf(Context context, int i, m56 m56Var) {
        super(context, i == 1 ? woc.h2 : woc.i2);
        this.a = i;
        this.b = m56Var;
        onThemeChanged(qp4.u0.b(context).i());
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        dcf dcfVar = (dcf) this.b.invoke(fkaVar);
        c54.Z(this, "mark_path", dcfVar.a);
        c54.Z(this, "background_path", dcfVar.b);
    }
}
