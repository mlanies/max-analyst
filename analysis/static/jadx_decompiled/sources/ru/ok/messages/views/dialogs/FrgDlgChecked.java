package ru.ok.messages.views.dialogs;

import androidx.fragment.app.a;
import defpackage.k7d;
import defpackage.q5;
import defpackage.zr6;

/* loaded from: classes2.dex */
public abstract class FrgDlgChecked<T> extends FrgDlgBase {
    @Override // ru.ok.messages.views.dialogs.FrgDlgBase
    public final void l1(q5 q5Var) {
        this.B1 = false;
        Object objB0 = this.I0;
        if (objB0 == null) {
            objB0 = b0();
        }
        if (objB0 == null) {
            String name = getClass().getName();
            a aVar = this.I0;
            throw new IllegalStateException(zr6.l(k7d.k("Class ", name, " should be call from ", aVar != null ? "fragment" : "activity", ", but "), aVar != null ? "getParentFragment()" : "getActivity()", " is null"));
        }
        if (n1().isAssignableFrom(objB0.getClass())) {
            return;
        }
        String name2 = getClass().getName();
        String str = this.I0 != null ? "fragment" : "activity";
        String name3 = n1().getName();
        StringBuilder sbK = k7d.k("Class ", name2, " must be attach to ", str, " that implements ");
        sbK.append(name3);
        throw new IllegalStateException(sbK.toString());
    }

    public abstract Class n1();
}
