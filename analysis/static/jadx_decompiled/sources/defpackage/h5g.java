package defpackage;

import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class h5g implements je7 {
    public pnf a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ Class c;

    public h5g(Widget widget, Class cls) {
        this.b = widget;
        this.c = cls;
    }

    @Override // defpackage.je7
    public final boolean a() {
        return this.a != null;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        pnf pnfVar = this.a;
        if (pnfVar != null) {
            return pnfVar;
        }
        pnf pnfVarA = this.b.getViewModelStore().a(this.c);
        this.a = pnfVarA;
        return pnfVarA;
    }
}
