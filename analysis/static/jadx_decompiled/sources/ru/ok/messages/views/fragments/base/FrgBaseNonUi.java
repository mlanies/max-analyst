package ru.ok.messages.views.fragments.base;

import android.os.Bundle;
import defpackage.hm9;

/* loaded from: classes2.dex */
public abstract class FrgBaseNonUi extends FrgBase {
    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return null;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void v0(Bundle bundle) {
        super.v0(bundle);
        hm9.n("ru.ok.messages.views.fragments.base.FrgBaseNonUi", "set retained ".concat(getClass().getName()));
        a1();
    }
}
