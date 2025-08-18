package one.me.profile.screens.addadmins.fromcontacts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.ac;
import defpackage.ay7;
import defpackage.bc;
import defpackage.bc7;
import defpackage.dy7;
import defpackage.em2;
import defpackage.fg7;
import defpackage.fs;
import defpackage.h8e;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.kb;
import defpackage.kpa;
import defpackage.l;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.q7c;
import defpackage.qb;
import defpackage.rb;
import defpackage.ro8;
import defpackage.s;
import defpackage.sb;
import defpackage.suc;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.wea;
import defpackage.x5;
import defpackage.xcb;
import defpackage.yoc;
import defpackage.z7;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zwe;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen;", "Lone/me/sdk/arch/Widget;", "Lkb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "(Ljava/lang/String;JLz84;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AdminsFromContactsScreen extends Widget implements kb {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public zwe Y;
    public h8e Z;
    public final fs a;
    public final je7 b;
    public final je7 c;
    public final q7c o;
    public final ExecutorService s0;
    public final a3g t0;

    static {
        hob hobVar = new hob(AdminsFromContactsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        u0 = new bc7[]{hobVar, zr6.e(oecVar, AdminsFromContactsScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(AdminsFromContactsScreen.class, "emptySearchView", "getEmptySearchView()Lone/me/sdk/uikit/common/views/EmptySearchView;", 0, oecVar)};
    }

    public AdminsFromContactsScreen(String str, long j, z84 z84Var) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str)), new kpa("profile:add_admins_from_contacts:chat_id", Long.valueOf(j))));
    }

    public final void m0(RecyclerView recyclerView) {
        h8e h8eVar = new h8e(recyclerView, this.t0, new em2(4, new l(7, this)));
        this.Z = h8eVar;
        recyclerView.j(h8eVar);
        v3c.y(new qb(h8eVar, null, 0), recyclerView);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.o.T0(this, u0[1]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(wea.b);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.t0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        this.Y = z7.m(recyclerView);
        m0(recyclerView);
        frameLayout.addView(recyclerView);
        EmptySearchView emptySearchView = new EmptySearchView(frameLayout.getContext(), null);
        emptySearchView.setId(wea.a);
        emptySearchView.setGravity(17);
        emptySearchView.setTitle(yoc.d0);
        emptySearchView.setDescription(yoc.c0);
        emptySearchView.setIsButtonVisible(false);
        frameLayout.addView(emptySearchView);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        zwe zweVar = this.Y;
        if (zweVar != null) {
            zweVar.B(n0());
        }
        this.Y = null;
        this.Z = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ac acVar = ((bc) this.c.getValue()).s0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7Var), new rb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((ro8) this.b.getValue()).u0, getViewLifecycleOwner().Q(), fg7Var), new sb(null, this), 5), getViewLifecycleScope());
    }

    public AdminsFromContactsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, "profile:add_admins_from_contacts:chat_id");
        Object objV = ay7.v(bundle, "arg_scope_id", suc.class);
        if (objV != null) {
            this.b = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, ro8.class, null);
            this.c = createViewModelLazy(bc.class, new s(5, new x5(6, this)));
            this.o = viewBinding(wea.b);
            this.X = viewBinding(wea.a);
            ExecutorService executorServiceA = ((iba) xcb.a.getAccessor().c(iba.class)).a();
            this.s0 = executorServiceA;
            this.t0 = new a3g(this, executorServiceA, 1);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
