package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class rn extends k06 {
    public final /* synthetic */ yn u0;
    public final /* synthetic */ bo v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(bo boVar, View view, yn ynVar) {
        super(view);
        this.v0 = boVar;
        this.u0 = ynVar;
    }

    @Override // defpackage.k06
    public final und b() {
        return this.u0;
    }

    @Override // defpackage.k06
    public final boolean c() {
        bo boVar = this.v0;
        if (boVar.getInternalPopup().a()) {
            return true;
        }
        boVar.t0.n(boVar.getTextDirection(), boVar.getTextAlignment());
        return true;
    }
}
