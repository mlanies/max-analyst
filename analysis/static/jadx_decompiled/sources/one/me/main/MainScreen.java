package one.me.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bvc;
import defpackage.c66;
import defpackage.coc;
import defpackage.e11;
import defpackage.ex7;
import defpackage.fk4;
import defpackage.glc;
import defpackage.hm9;
import defpackage.hob;
import defpackage.huc;
import defpackage.ia3;
import defpackage.ir6;
import defpackage.ix7;
import defpackage.je7;
import defpackage.jx7;
import defpackage.kld;
import defpackage.kx7;
import defpackage.lld;
import defpackage.lx7;
import defpackage.m64;
import defpackage.nec;
import defpackage.nj4;
import defpackage.od2;
import defpackage.ox7;
import defpackage.q6a;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.r6a;
import defpackage.s36;
import defpackage.s6a;
import defpackage.t6a;
import defpackage.tfg;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.tu3;
import defpackage.u6a;
import defpackage.us7;
import defpackage.uu3;
import defpackage.vu5;
import defpackage.vxb;
import defpackage.w12;
import defpackage.w7c;
import defpackage.wca;
import defpackage.wq0;
import defpackage.wuc;
import defpackage.x27;
import defpackage.yq0;
import defpackage.z7b;
import defpackage.zj7;
import defpackage.zn5;
import defpackage.znc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/main/MainScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "route", "Landroid/os/Bundle;", "routeArgs", "(Ljava/lang/String;Landroid/os/Bundle;)V", "ix7", "huc", "main-screen_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class MainScreen extends Widget {
    public final q7c X;
    public final String Y;
    public final je7 a;
    public final glc b;
    public final LinkedHashMap c;
    public final q7c o;
    public static final /* synthetic */ bc7[] s0 = {new hob(MainScreen.class, "rootView", "getRootView()Landroid/widget/FrameLayout;", 0), z7b.g(nec.a, MainScreen.class, "bottomBarView", "getBottomBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0)};
    public static final huc Z = new huc();
    public static final kld t0 = lld.b(0, 1, 0, 4);

    public MainScreen() {
        super(null, 0, 3, null);
        this.a = createViewModelLazy(ox7.class, new nj4(19, new zj7(3, this)));
        this.b = new glc(new e11(0, this, MainScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 25), new e11(0, this, MainScreen.class, "getCurrentParams", "getCurrentParams()Lone/me/sdk/statistics/params/Params;", 0, 26), 4);
        this.c = new LinkedHashMap();
        this.o = viewBinding(wca.h);
        this.X = viewBinding(wca.a);
        this.Y = MainScreen.class.getName();
        setRetainViewMode(tu3.b);
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final void m0(t6a t6aVar) {
        wuc wucVar;
        uu3 chatsTabWidget;
        uu3 uu3Var;
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(t6aVar);
        Object obj2 = obj;
        if (obj == null) {
            w12 w12VarB = s36.b(getContext());
            w12VarB.setId(t6aVar.c);
            linkedHashMap.put(t6aVar, w12VarB);
            obj2 = w12VarB;
        }
        ViewGroup viewGroup = (ViewGroup) obj2;
        ((FrameLayout) this.o.T0(this, s0[0])).addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
        String str = t6aVar.d;
        Bundle bundle = null;
        boolean z = false;
        if (str.length() <= 0) {
            str = null;
        }
        znc childRouter = getChildRouter(viewGroup, str);
        int i = 1;
        childRouter.e = 1;
        if (!childRouter.n()) {
            ex7.b.getClass();
            String strA = m64.a(ex7.c.a);
            String str2 = t6aVar.d;
            if (tpa.f(str2, strA)) {
                uu3 contactListWidget = new ContactListWidget(bundle, i, z ? 1 : 0);
                wucVar = wuc.CONTACTS_TAB;
                uu3Var = contactListWidget;
            } else if (tpa.f(str2, m64.a(ex7.d.a))) {
                uu3 callHistoryScreen = new CallHistoryScreen();
                wucVar = wuc.CALL_HISTORY_TAB;
                uu3Var = callHistoryScreen;
            } else if (tpa.f(str2, m64.a(ex7.e.a))) {
                chatsTabWidget = new ChatsTabWidget(getArgs().getString("folder_id"));
                wucVar = wuc.CHATS_LIST_TAB;
                chatsTabWidget.addLifecycleListener(new ia3(4, wucVar));
                chatsTabWidget.setRetainViewMode(tu3.b);
                coc cocVar = new coc(chatsTabWidget, null, null, null, false, -1);
                cocVar.d(str);
                childRouter.R(cocVar);
            } else {
                if (!tpa.f(str2, m64.a(ex7.f.a))) {
                    throw new IllegalStateException(("invalid screen! " + str2).toString());
                }
                uu3 settingsListScreen = new SettingsListScreen();
                wucVar = wuc.SETTINGS_TAB;
                uu3Var = settingsListScreen;
            }
            chatsTabWidget = uu3Var;
            chatsTabWidget.addLifecycleListener(new ia3(4, wucVar));
            chatsTabWidget.setRetainViewMode(tu3.b);
            coc cocVar2 = new coc(chatsTabWidget, null, null, null, false, -1);
            cocVar2.d(str);
            childRouter.R(cocVar2);
        }
        childRouter.I();
    }

    public final void n0(t6a t6aVar) {
        ViewGroup viewGroup = (ViewGroup) this.c.get(t6aVar);
        if (viewGroup == null) {
            return;
        }
        znc childRouter = getChildRouter(viewGroup, t6aVar.d, false);
        if (childRouter != null) {
            childRouter.F();
        }
        ((FrameLayout) this.o.T0(this, s0[0])).removeView(viewGroup);
    }

    public final u6a o0() {
        return (u6a) this.X.T0(this, s0[1]);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        t0.g(Boolean.TRUE);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ix7 ix7Var = new ix7(this, getContext());
        ix7Var.setId(wca.h);
        ix7Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        u6a u6aVar = new u6a(ix7Var.getContext());
        u6aVar.setId(wca.a);
        u6aVar.setElevation(fk4.d().getDisplayMetrics().density * 8.0f);
        tfg.s(u6aVar.getContext().getApplicationContext());
        u6aVar.setBlurEnabled(Boolean.FALSE);
        br7.d(u6aVar, new x27(0, new yq0(3, 1, false), 1), null);
        qp4 qp4VarB = qp4.u0.b(ix7Var.getContext());
        od2.L(new zn5((w7c) qp4VarB.t0, new jx7(this, ix7Var, qp4VarB, null), 5), getViewLifecycleScope());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ix7Var.addView(u6aVar, layoutParams);
        return ix7Var;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            n0((t6a) it.next());
        }
        linkedHashMap.clear();
    }

    @Override // defpackage.uu3
    public final void onRestoreInstanceState(Bundle bundle) {
        Object next;
        String string = bundle.getString("main:selected_tag");
        if (string == null) {
            return;
        }
        ox7 ox7VarR0 = r0();
        Iterator it = ox7VarR0.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (tpa.f(((t6a) next).d, string)) {
                    break;
                }
            }
        }
        t6a t6aVar = (t6a) next;
        if (t6aVar == null) {
            return;
        }
        ox7VarR0.o = t6aVar;
    }

    @Override // defpackage.uu3
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("main:selected_tag", r0().o.d);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        t6a t6aVar = r0().o;
        znc zncVarP0 = p0();
        uu3 uu3VarG = zncVarP0 != null ? zncVarP0.g(t6aVar.d) : null;
        Widget widget = uu3VarG instanceof Widget ? (Widget) uu3VarG : null;
        if (widget != null) {
            widget.onUpdateArgs(bundle, bundle2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        for (t6a t6aVar : r0().c) {
            u6a u6aVarO0 = o0();
            boolean zF = tpa.f(t6aVar, r0().o);
            vu5 vu5Var = new vu5(this, 11, t6aVar);
            wq0 wq0Var = new wq0(u6aVarO0.getContext(), null);
            wq0Var.setId(t6aVar.e);
            tpa.J(vxb.tag_tab_item, wq0Var, t6aVar);
            wq0Var.setText(t6aVar.a);
            s6a s6aVar = t6aVar.b;
            if (s6aVar instanceof q6a) {
                q6a q6aVar = (q6a) s6aVar;
                wq0Var.H0.setImageDrawable((Drawable) q6aVar.a.invoke(wq0Var.getContext()));
                c66 c66Var = q6aVar.b;
                if (c66Var == null) {
                    c66Var = wq0Var.K0;
                }
                wq0Var.L0 = c66Var;
                wq0Var.w();
            } else {
                if (!(s6aVar instanceof r6a)) {
                    throw new NoWhenBranchMatchedException();
                }
                wq0Var.setIcon(((r6a) s6aVar).a);
            }
            wq0Var.setSelected(zF);
            tu0.K(wq0Var, 300L, vu5Var);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            float f = 4;
            layoutParams.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            layoutParams.rightMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
            u6aVarO0.addView(wq0Var, layoutParams);
            u6aVarO0.setWeightSum(u6aVarO0.getChildCount());
        }
        od2.L(new zn5(r0().Y, new kx7(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().s0, new lx7(this, null), 5), getViewLifecycleScope());
        m0(r0().o);
    }

    public final znc p0() {
        t6a t6aVar = r0().o;
        ViewGroup viewGroup = (ViewGroup) this.c.get(t6aVar);
        if (viewGroup == null) {
            return null;
        }
        return getChildRouter(viewGroup, t6aVar.d);
    }

    public final wuc q0() {
        int i = r0().o.c;
        return i == wca.g ? wuc.CONTACTS_TAB : i == wca.c ? wuc.CALL_HISTORY_TAB : i == wca.j ? wuc.SETTINGS_TAB : wuc.CHATS_LIST_TAB;
    }

    public final ox7 r0() {
        return (ox7) this.a.getValue();
    }

    public final void s0(t6a t6aVar) {
        String str = this.Y;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "handleClick, selected item=" + t6aVar, null);
        }
        if (tpa.f(r0().o, t6aVar)) {
            return;
        }
        n0(r0().o);
        r0().o = t6aVar;
        u6a u6aVarO0 = o0();
        u6aVarO0.getClass();
        int i = 0;
        while (i < u6aVarO0.getChildCount()) {
            int i2 = i + 1;
            View childAt = u6aVarO0.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ((wq0) childAt).setSelected(tpa.v(childAt, vxb.tag_tab_item) == t6aVar);
            i = i2;
        }
        m0(t6aVar);
        this.b.a();
    }

    public MainScreen(String str, Bundle bundle) {
        this();
        getArgs().putString("main:arg:deep_link", str);
        getArgs().putAll(bundle);
    }
}
