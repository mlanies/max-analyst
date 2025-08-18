package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bse;
import defpackage.cjg;
import defpackage.drf;
import defpackage.dy7;
import defpackage.fk4;
import defpackage.je7;
import defpackage.kpa;
import defpackage.nhd;
import defpackage.pla;
import defpackage.qqd;
import defpackage.r57;
import defpackage.suc;
import defpackage.tu0;
import defpackage.uge;
import defpackage.xp1;
import defpackage.z84;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/VpnPanelWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "qqd", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class VpnPanelWidget extends Widget {
    public static final /* synthetic */ int c = 0;
    public qqd a;
    public final je7 b;

    public VpnPanelWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r57 r57Var = new r57(this, getContext());
        uge ugeVar = new uge(getContext());
        ugeVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ugeVar.addView(r57Var);
        float f = 12;
        ugeVar.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(0 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        ugeVar.setCallback(new cjg(this, ugeVar, r57Var));
        pla.a(ugeVar, new xp1(ugeVar, ugeVar, 2));
        return ugeVar;
    }

    public VpnPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = createViewModelLazy(drf.class, new nhd(15, new bse(16)));
    }
}
