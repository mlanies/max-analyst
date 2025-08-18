package defpackage;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class hm implements n3a {
    public final /* synthetic */ im a;

    public hm(im imVar) {
        this.a = imVar;
    }

    @Override // defpackage.n3a
    public final void a() {
        im imVar = this.a;
        rm rmVarV = imVar.V();
        dn dnVar = (dn) rmVarV;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(dnVar.v0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(dnVar);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof dn;
        }
        ((mm) imVar.o.o).c("androidx:appcompat");
        rmVarV.c();
    }
}
