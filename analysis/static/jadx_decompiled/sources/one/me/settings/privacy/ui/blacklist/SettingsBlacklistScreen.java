package one.me.settings.privacy.ui.blacklist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.aba;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.cla;
import defpackage.ehd;
import defpackage.eqe;
import defpackage.fg7;
import defpackage.gaa;
import defpackage.glc;
import defpackage.hbc;
import defpackage.hob;
import defpackage.iba;
import defpackage.ied;
import defpackage.iha;
import defpackage.je7;
import defpackage.jed;
import defpackage.jp8;
import defpackage.jv5;
import defpackage.kha;
import defpackage.kka;
import defpackage.kke;
import defpackage.nec;
import defpackage.ng3;
import defpackage.o;
import defpackage.od2;
import defpackage.oed;
import defpackage.ped;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rpc;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.woc;
import defpackage.wuc;
import defpackage.x27;
import defpackage.z15;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SettingsBlacklistScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Z = {new hob(SettingsBlacklistScreen.class, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), zr6.e(nec.a, SettingsBlacklistScreen.class, "emptyState", "getEmptyState()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final q7c X;
    public final jv5 Y;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final q7c o;

    public SettingsBlacklistScreen() {
        super(null, 0, 3, null);
        this.a = new glc(wuc.SETTINGS_PRIVACY_BLOCK_LIST);
        this.b = x27.d;
        this.c = createViewModelLazy(ped.class, new jp8(28, new hbc(19)));
        this.o = viewBinding(iha.b);
        this.X = viewBinding(iha.a);
        this.Y = new jv5(new gaa(this), ((iba) ehd.a.getAccessor().c(iba.class)).a(), 12);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == iha.d) {
            ped pedVarM0 = m0();
            pedVarM0.getClass();
            if (bundle != null) {
                pnf.n(pedVarM0, ((w9a) ((kke) pedVarM0.s0.getValue())).b(), null, new oed(pedVarM0, bundle.getLong("user_unblock_id"), null), 2);
            }
        }
    }

    public final ped m0() {
        return (ped) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(iha.c);
        claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        claVar.setTitle(kha.e);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(4, this)));
        linearLayout.addView(claVar);
        aba abaVar = new aba(linearLayout.getContext(), null);
        abaVar.setId(iha.a);
        abaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        abaVar.setIcon(woc.l0);
        abaVar.setTitle(new eqe(kha.d));
        abaVar.onThemeChanged(qp4.u0.j(abaVar));
        linearLayout.addView(abaVar);
        z15 z15Var = new z15(linearLayout.getContext(), null);
        z15Var.setId(iha.b);
        z15Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        z15Var.getContext();
        z15Var.setLayoutManager(new LinearLayoutManager());
        z15Var.setAdapter(this.Y);
        z15Var.setHasFixedSize(true);
        z15Var.setPager(m0());
        linearLayout.addView(z15Var);
        v3c.y(new o(3, null, 12), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((z15) this.o.T0(this, Z[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        w7c w7cVar = m0().u0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new ied(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().y0, getViewLifecycleOwner().Q(), fg7Var), new jed(null, this), 5), getViewLifecycleScope());
    }
}
