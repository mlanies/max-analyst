package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import defpackage.d10;
import defpackage.dpc;
import defpackage.e52;
import defpackage.jpc;
import defpackage.oc;
import defpackage.p46;
import defpackage.s08;
import defpackage.vl;
import defpackage.x46;
import defpackage.y8a;

/* loaded from: classes2.dex */
public class FrgDlgStopLiveLocation extends FrgDlgChecked<x46> {
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        e52 e52VarC = ((y8a) vl.b()).e().C(this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID"));
        s08 s08Var = new s08(U0());
        e52VarC.k0();
        s08 s08VarE = s08Var.e(e52VarC.u0);
        s08VarE.b(jpc.r0);
        s08 s08VarC = s08VarE.c(dpc.D, new p46(this, e52VarC, 3));
        int i = jpc.r;
        d10 d10Var = new d10(2, this);
        oc ocVar = s08VarC.a;
        ocVar.k = ocVar.a.getText(i);
        ocVar.l = d10Var;
        return s08VarC.a();
    }

    @Override // ru.ok.messages.views.dialogs.FrgDlgChecked
    public final Class n1() {
        return x46.class;
    }
}
