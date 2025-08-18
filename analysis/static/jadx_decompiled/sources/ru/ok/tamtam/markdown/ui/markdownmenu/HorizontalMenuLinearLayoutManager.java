package ru.ok.tamtam.markdown.ui.markdownmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pdc;
import defpackage.tu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/tamtam/markdown/ui/markdownmenu/HorizontalMenuLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "markdown-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class HorizontalMenuLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean e() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean f() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g(pdc pdcVar) {
        return pdcVar != null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final pdc s() {
        pdc pdcVarS = super.s();
        t1(pdcVarS);
        return pdcVarS;
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc t(Context context, AttributeSet attributeSet) {
        pdc pdcVar = new pdc(context, attributeSet);
        t1(pdcVar);
        return pdcVar;
    }

    public final void t1(pdc pdcVar) {
        ((ViewGroup.MarginLayoutParams) pdcVar).width = tu0.F(((this.n - K()) - J()) / G());
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        pdc pdcVarU = super.u(layoutParams);
        t1(pdcVarU);
        return pdcVarU;
    }
}
