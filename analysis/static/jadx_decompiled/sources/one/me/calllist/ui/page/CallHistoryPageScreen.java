package one.me.calllist.ui.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aba;
import defpackage.al6;
import defpackage.bc7;
import defpackage.buc;
import defpackage.fic;
import defpackage.fs;
import defpackage.g81;
import defpackage.h81;
import defpackage.hm9;
import defpackage.hob;
import defpackage.huc;
import defpackage.i24;
import defpackage.i81;
import defpackage.is1;
import defpackage.j47;
import defpackage.je7;
import defpackage.k11;
import defpackage.khe;
import defpackage.ks1;
import defpackage.m81;
import defpackage.nec;
import defpackage.ng3;
import defpackage.q0e;
import defpackage.qm0;
import defpackage.rg1;
import defpackage.rh4;
import defpackage.s;
import defpackage.s81;
import defpackage.t81;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.u1;
import defpackage.u81;
import defpackage.v81;
import defpackage.xt3;
import defpackage.zn5;
import defpackage.zwe;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calllist/ui/page/CallHistoryPageScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "<init>", "()V", "Lv81;", "type", "(Lv81;)V", "buc", "call-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallHistoryPageScreen extends Widget implements xt3, ng3 {
    public final fic X;
    public final qm0 Y;
    public final khe Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public zwe o;
    public final je7 s0;
    public final fs t0;
    public static final /* synthetic */ bc7[] v0 = {new hob(CallHistoryPageScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), rh4.g(nec.a, CallHistoryPageScreen.class, "typeArg", "getTypeArg()Ljava/lang/String;")};
    public static final buc u0 = new buc();
    public static final int w0 = 1;

    public CallHistoryPageScreen() {
        super(null, 0, 3, null);
        this.a = m41getSharedViewModelcp94BC8("call_history_scope_id", u81.class, null);
        this.b = createViewModelLazy(m81.class, new s(11, new g81(this, 0)));
        this.c = tu0.r(3, new g81(this, 1));
        this.X = new fic(new g81(this, 2));
        this.Y = binding(new g81(this, 3));
        this.Z = new khe(new g81(this, 4));
        this.s0 = tu0.r(3, new k11(10));
        this.t0 = new fs(String.class, "type_arg");
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        ((rg1) this.c.getValue()).g(i);
    }

    public final v81 m0() {
        Object next;
        huc hucVar = v81.b;
        bc7 bc7Var = v0[1];
        String str = (String) this.t0.a(this);
        hucVar.getClass();
        Iterator it = v81.Y.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (tpa.f(((v81) next).name(), str)) {
                break;
            }
        }
        v81 v81Var = (v81) next;
        return v81Var == null ? v81.c : v81Var;
    }

    public final EndlessRecyclerView2 n0() {
        bc7 bc7Var = v0[0];
        return (EndlessRecyclerView2) this.Y.getValue();
    }

    public final u81 o0() {
        return (u81) this.a.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        m81 m81VarP0 = p0();
        hm9.n("CallHistoryPageViewModel", "unregister load history callbacks for type=" + m81VarP0.b);
        ks1 ks1Var = m81VarP0.X;
        ks1Var.getClass();
        ks1Var.z0.b(new is1(ks1Var, 4));
        ks1Var.Y.remove(m81VarP0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        p0().s();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        aba abaVar = (aba) this.X.getValue();
        if (abaVar != null) {
            frameLayout.addView(abaVar, -1, -1);
        }
        frameLayout.addView(n0(), -1, -1);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.X.reset();
        zwe zweVar = this.o;
        if (zweVar != null) {
            zweVar.B(n0());
        }
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        p0().y0 = null;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.c.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        i24.s(new zn5(p0().v0, new h81(this, null), 5), getViewLifecycleScope());
        huc hucVar = v81.b;
        v81 v81Var = p0().b;
        hucVar.getClass();
        if (v81Var == v81.c) {
            i24.s(new zn5(p0().x0, new i81(this, null), 5), getViewLifecycleScope());
        }
    }

    public final m81 p0() {
        return (m81) this.b.getValue();
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        long jLongValue;
        al6 al6VarQ;
        Object value;
        Map map;
        Long l = p0().y0;
        if (l == null || (al6VarQ = p0().q((jLongValue = l.longValue()))) == null) {
            return;
        }
        if (i != w0) {
            if (i == 0) {
                u81 u81VarO0 = o0();
                List listSingletonList = Collections.singletonList(al6VarQ);
                u81VarO0.getClass();
                j47.T(u81VarO0.a, null, null, new t81(u81VarO0, listSingletonList, null), 3);
                return;
            }
            return;
        }
        q0e q0eVar = o0().Z;
        do {
            value = q0eVar.getValue();
            s81 s81Var = (s81) value;
            map = s81Var.b;
            s81Var.getClass();
        } while (!q0eVar.c(value, new s81(map, true)));
        o0().q(jLongValue, al6VarQ);
    }

    public CallHistoryPageScreen(v81 v81Var) {
        this();
        String strName = v81Var.name();
        bc7 bc7Var = v0[1];
        this.t0.b(this, strName);
    }
}
