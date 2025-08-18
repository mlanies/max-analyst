package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import defpackage.e10;
import defpackage.fm9;
import defpackage.fnb;
import defpackage.oc;
import defpackage.s08;

/* loaded from: classes2.dex */
public class ProgressDialog extends FrgDlgBase {
    public fnb F1;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        String string = this.Z.getString("ru.ok.tamtam.extra.TITLE");
        boolean z = this.Z.getBoolean("ru.ok.tamtam.extra.CANCELABLE");
        String string2 = this.Z.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT", "");
        boolean z2 = this.Z.getBoolean("ru.ok.tamtam.extra.INDETERMINATE");
        this.r1 = z;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        if (string2 == null || string2.isEmpty()) {
            Context contextD0 = d0();
            s08 s08Var = new s08(contextD0);
            s08Var.a.m = z;
            fm9.M(contextD0, string, s08Var, z2);
            return s08Var.create();
        }
        Context contextD02 = d0();
        s08 s08Var2 = new s08(contextD02);
        oc ocVar = s08Var2.a;
        ocVar.m = z;
        e10 e10Var = new e10(1);
        ocVar.k = string2;
        ocVar.l = e10Var;
        fm9.M(contextD02, string, s08Var2, z2);
        return s08Var2.create();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        fnb fnbVar = this.F1;
        if (fnbVar != null) {
            fnbVar.b();
        }
    }
}
