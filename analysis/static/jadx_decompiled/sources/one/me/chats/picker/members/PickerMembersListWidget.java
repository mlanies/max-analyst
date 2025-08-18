package one.me.chats.picker.members;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ap8;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.bo6;
import defpackage.dle;
import defpackage.dy7;
import defpackage.em2;
import defpackage.fg7;
import defpackage.fs;
import defpackage.fza;
import defpackage.h8e;
import defpackage.hob;
import defpackage.iza;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jza;
import defpackage.k56;
import defpackage.kpa;
import defpackage.kza;
import defpackage.lq0;
import defpackage.lza;
import defpackage.mp8;
import defpackage.mxa;
import defpackage.nec;
import defpackage.nxa;
import defpackage.nz4;
import defpackage.od2;
import defpackage.oec;
import defpackage.pza;
import defpackage.qb;
import defpackage.qm0;
import defpackage.suc;
import defpackage.tu0;
import defpackage.txa;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.wld;
import defpackage.wz7;
import defpackage.xp8;
import defpackage.ys2;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/chats/picker/members/PickerMembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lmxa;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "decorsEnabled", "(Ljava/lang/String;JZLz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PickerMembersListWidget extends Widget implements mxa {
    public static final /* synthetic */ bc7[] x0;
    public final ExecutorService X;
    public final nxa Y;
    public final nxa Z;
    public final fs a;
    public final fs b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public final qm0 t0;
    public dle u0;
    public bo6 v0;
    public h8e w0;

    static {
        hob hobVar = new hob(PickerMembersListWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        x0 = new bc7[]{hobVar, zr6.e(oecVar, PickerMembersListWidget.class, "decorsEnabled", "getDecorsEnabled()Z", 0), zr6.f(PickerMembersListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0, oecVar)};
    }

    public PickerMembersListWidget(String str, long j, boolean z, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("chat_id", Long.valueOf(j)), new kpa("decors_enabled", Boolean.valueOf(z))));
    }

    public final void m0(EndlessRecyclerView2 endlessRecyclerView2) {
        em2 em2Var = new em2(4, new wz7(18, this));
        h8e h8eVar = new h8e(endlessRecyclerView2, this.Y, em2Var);
        this.w0 = h8eVar;
        endlessRecyclerView2.j(h8eVar);
        bo6 bo6Var = new bo6(em2Var);
        this.v0 = bo6Var;
        endlessRecyclerView2.j(bo6Var);
        v3c.y(new qb(h8eVar, null, 3), endlessRecyclerView2);
    }

    public final boolean n0() {
        bc7 bc7Var = x0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final txa o0() {
        return (txa) this.c.getValue();
    }

    @Override // defpackage.uu3
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        od2.L(new zn5(o0().u0, new lq0(2, (pza) this.o.getValue(), pza.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 28), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(p0());
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        dle dleVar = this.u0;
        if (dleVar != null) {
            dleVar.B(p0());
        }
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((pza) this.o.getValue()).Y, getViewLifecycleOwner().Q(), fg7.o), new jza(null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().Z, new kza(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().u0, new lza(this, null), 5), getViewLifecycleScope());
    }

    public final EndlessRecyclerView2 p0() {
        bc7 bc7Var = x0[2];
        return (EndlessRecyclerView2) this.t0.getValue();
    }

    @Override // defpackage.mxa
    public final void z(long j, fza fzaVar) {
        o0().q(j, fzaVar);
    }

    public PickerMembersListWidget(Bundle bundle) {
        w7c w7cVarX;
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, 0L, "chat_id");
        this.b = new fs(Boolean.class, Boolean.TRUE, "decors_enabled");
        Object objV = ay7.v(bundle, Widget.ARG_SCOPE_ID, suc.class);
        if (objV != null) {
            this.c = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, txa.class, null);
            final int i = 0;
            je7 je7VarCreateViewModelLazy = createViewModelLazy(pza.class, new jp8(13, new k56(this) { // from class: hza
                public final /* synthetic */ PickerMembersListWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    PickerMembersListWidget pickerMembersListWidget = this.b;
                    int i2 = 1;
                    switch (i) {
                        case 0:
                            bc7[] bc7VarArr = PickerMembersListWidget.x0;
                            bc7 bc7Var = PickerMembersListWidget.x0[0];
                            long jLongValue = ((Number) pickerMembersListWidget.a.a(pickerMembersListWidget)).longValue();
                            ys2 ys2Var = ys2.a;
                            return new pza(jLongValue, (mp8) ys2Var.getAccessor().c(mp8.class), (kq8) ys2Var.getAccessor().c(kq8.class), ys2Var.getAccessor().d(iy2.class));
                        case 1:
                            bc7[] bc7VarArr2 = PickerMembersListWidget.x0;
                            aba abaVar = new aba(pickerMembersListWidget.getContext(), null);
                            abaVar.setIcon(woc.O0);
                            abaVar.setTitle(new eqe(yoc.d));
                            abaVar.setSubtitle(new eqe(yoc.c));
                            return abaVar;
                        default:
                            bc7[] bc7VarArr3 = PickerMembersListWidget.x0;
                            EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), null, 6);
                            endlessRecyclerView2.setId(p8a.d0);
                            endlessRecyclerView2.setClipChildren(false);
                            endlessRecyclerView2.setClipToPadding(false);
                            endlessRecyclerView2.setClipToOutline(false);
                            endlessRecyclerView2.setHasFixedSize(true);
                            endlessRecyclerView2.getContext();
                            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                            endlessRecyclerView2.setAdapter(pickerMembersListWidget.Y);
                            endlessRecyclerView2.j(new c03(new u15(endlessRecyclerView2, i2), new ga(endlessRecyclerView2, 25, pickerMembersListWidget), new pz2(1), new pz2(1)));
                            endlessRecyclerView2.l(new w54(endlessRecyclerView2));
                            if (pickerMembersListWidget.n0()) {
                                pickerMembersListWidget.m0(endlessRecyclerView2);
                            }
                            pickerMembersListWidget.u0 = z7.m(endlessRecyclerView2);
                            return endlessRecyclerView2;
                    }
                }
            }));
            this.o = je7VarCreateViewModelLazy;
            ExecutorService executorServiceA = ys2.a.c().a();
            this.X = executorServiceA;
            this.Y = new nxa(this, executorServiceA, 0);
            this.Z = new nxa(this, executorServiceA, 0);
            final int i2 = 1;
            this.s0 = binding(new k56(this) { // from class: hza
                public final /* synthetic */ PickerMembersListWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    PickerMembersListWidget pickerMembersListWidget = this.b;
                    int i22 = 1;
                    switch (i2) {
                        case 0:
                            bc7[] bc7VarArr = PickerMembersListWidget.x0;
                            bc7 bc7Var = PickerMembersListWidget.x0[0];
                            long jLongValue = ((Number) pickerMembersListWidget.a.a(pickerMembersListWidget)).longValue();
                            ys2 ys2Var = ys2.a;
                            return new pza(jLongValue, (mp8) ys2Var.getAccessor().c(mp8.class), (kq8) ys2Var.getAccessor().c(kq8.class), ys2Var.getAccessor().d(iy2.class));
                        case 1:
                            bc7[] bc7VarArr2 = PickerMembersListWidget.x0;
                            aba abaVar = new aba(pickerMembersListWidget.getContext(), null);
                            abaVar.setIcon(woc.O0);
                            abaVar.setTitle(new eqe(yoc.d));
                            abaVar.setSubtitle(new eqe(yoc.c));
                            return abaVar;
                        default:
                            bc7[] bc7VarArr3 = PickerMembersListWidget.x0;
                            EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), null, 6);
                            endlessRecyclerView2.setId(p8a.d0);
                            endlessRecyclerView2.setClipChildren(false);
                            endlessRecyclerView2.setClipToPadding(false);
                            endlessRecyclerView2.setClipToOutline(false);
                            endlessRecyclerView2.setHasFixedSize(true);
                            endlessRecyclerView2.getContext();
                            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                            endlessRecyclerView2.setAdapter(pickerMembersListWidget.Y);
                            endlessRecyclerView2.j(new c03(new u15(endlessRecyclerView2, i22), new ga(endlessRecyclerView2, 25, pickerMembersListWidget), new pz2(1), new pz2(1)));
                            endlessRecyclerView2.l(new w54(endlessRecyclerView2));
                            if (pickerMembersListWidget.n0()) {
                                pickerMembersListWidget.m0(endlessRecyclerView2);
                            }
                            pickerMembersListWidget.u0 = z7.m(endlessRecyclerView2);
                            return endlessRecyclerView2;
                    }
                }
            });
            final int i3 = 2;
            this.t0 = binding(new k56(this) { // from class: hza
                public final /* synthetic */ PickerMembersListWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    PickerMembersListWidget pickerMembersListWidget = this.b;
                    int i22 = 1;
                    switch (i3) {
                        case 0:
                            bc7[] bc7VarArr = PickerMembersListWidget.x0;
                            bc7 bc7Var = PickerMembersListWidget.x0[0];
                            long jLongValue = ((Number) pickerMembersListWidget.a.a(pickerMembersListWidget)).longValue();
                            ys2 ys2Var = ys2.a;
                            return new pza(jLongValue, (mp8) ys2Var.getAccessor().c(mp8.class), (kq8) ys2Var.getAccessor().c(kq8.class), ys2Var.getAccessor().d(iy2.class));
                        case 1:
                            bc7[] bc7VarArr2 = PickerMembersListWidget.x0;
                            aba abaVar = new aba(pickerMembersListWidget.getContext(), null);
                            abaVar.setIcon(woc.O0);
                            abaVar.setTitle(new eqe(yoc.d));
                            abaVar.setSubtitle(new eqe(yoc.c));
                            return abaVar;
                        default:
                            bc7[] bc7VarArr3 = PickerMembersListWidget.x0;
                            EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), null, 6);
                            endlessRecyclerView2.setId(p8a.d0);
                            endlessRecyclerView2.setClipChildren(false);
                            endlessRecyclerView2.setClipToPadding(false);
                            endlessRecyclerView2.setClipToOutline(false);
                            endlessRecyclerView2.setHasFixedSize(true);
                            endlessRecyclerView2.getContext();
                            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                            endlessRecyclerView2.setAdapter(pickerMembersListWidget.Y);
                            endlessRecyclerView2.j(new c03(new u15(endlessRecyclerView2, i22), new ga(endlessRecyclerView2, 25, pickerMembersListWidget), new pz2(1), new pz2(1)));
                            endlessRecyclerView2.l(new w54(endlessRecyclerView2));
                            if (pickerMembersListWidget.n0()) {
                                pickerMembersListWidget.m0(endlessRecyclerView2);
                            }
                            pickerMembersListWidget.u0 = z7.m(endlessRecyclerView2);
                            return endlessRecyclerView2;
                    }
                }
            });
            pza pzaVar = (pza) je7VarCreateViewModelLazy.getValue();
            boolean zR = pzaVar.r();
            mp8 mp8Var = pzaVar.c;
            if (zR) {
                ap8 ap8Var = new ap8(((xp8) mp8Var).k, pzaVar, 4);
                nz4 nz4Var = nz4.a;
                w7cVarX = od2.X(ap8Var, pzaVar.a, wld.a, nz4Var);
            } else {
                w7cVarX = ((xp8) mp8Var).k;
            }
            od2.L(new zn5(w7cVarX, new iza(this, null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ PickerMembersListWidget(String str, long j, boolean z, int i, z84 z84Var) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z, null);
    }
}
