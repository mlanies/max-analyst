package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import defpackage.f46;
import defpackage.jpc;
import defpackage.oc;
import defpackage.p46;
import defpackage.s08;
import defpackage.v25;
import defpackage.xdf;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoCompressionModeDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class VideoCompressionModeDialog extends FrgDlgBase {
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        v25 v25Var = xdf.Y;
        v25Var.getClass();
        xdf[] xdfVarArr = (xdf[]) f46.e0(v25Var, new xdf[0]);
        ArrayList arrayList = new ArrayList(xdfVarArr.length);
        for (xdf xdfVar : xdfVarArr) {
            arrayList.add(xdfVar.a.a);
        }
        s08 s08VarE = new s08(U0()).e(h0(jpc.k1));
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
        p46 p46Var = new p46(this, xdfVarArr, 4);
        oc ocVar = s08VarE.a;
        ocVar.p = charSequenceArr;
        ocVar.r = p46Var;
        return s08VarE.a();
    }
}
