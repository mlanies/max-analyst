package one.me.calls.ui.view.mode.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.e71;
import defpackage.gaa;
import defpackage.jg6;
import defpackage.pdc;
import defpackage.sh0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/view/mode/grid/CallGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "e71", "sh0", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallGridLayoutManager extends GridLayoutManager {
    public final Context M;
    public final int N;
    public final sh0 O;
    public e71 P;

    public CallGridLayoutManager(Context context, int i, sh0 sh0Var) {
        super(2);
        this.M = context;
        this.N = i;
        this.O = sh0Var;
        this.P = new gaa(this);
    }

    public final void C1(jg6 jg6Var) {
        int iC = this.P.c();
        sh0 sh0Var = this.O;
        ((ViewGroup.MarginLayoutParams) jg6Var).height = ((iC - (sh0Var.j() * this.N)) + 1) / sh0Var.j();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.a
    public final boolean g(pdc pdcVar) {
        pdc pdcVarS = s();
        return (pdcVar instanceof jg6) && ((ViewGroup.MarginLayoutParams) pdcVarS).width == ((ViewGroup.MarginLayoutParams) pdcVar).width && ((ViewGroup.MarginLayoutParams) pdcVarS).height == ((ViewGroup.MarginLayoutParams) pdcVar).height;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final pdc s() {
        pdc pdcVarS = super.s();
        C1((jg6) pdcVarS);
        return pdcVarS;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.a
    public final pdc t(Context context, AttributeSet attributeSet) {
        pdc pdcVarT = super.t(context, attributeSet);
        C1((jg6) pdcVarT);
        return pdcVarT;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.a
    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        pdc pdcVarU = super.u(layoutParams);
        C1((jg6) pdcVarU);
        return pdcVarU;
    }
}
