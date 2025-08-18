package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.bh0;
import defpackage.bo6;
import defpackage.c3;
import defpackage.dle;
import defpackage.dy7;
import defpackage.dza;
import defpackage.em2;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fza;
import defpackage.h8e;
import defpackage.hob;
import defpackage.j31;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jpc;
import defpackage.k56;
import defpackage.kpa;
import defpackage.l5g;
import defpackage.lq0;
import defpackage.md3;
import defpackage.mxa;
import defpackage.nd3;
import defpackage.nec;
import defpackage.nxa;
import defpackage.od2;
import defpackage.qb;
import defpackage.qm0;
import defpackage.s4a;
import defpackage.suc;
import defpackage.tu0;
import defpackage.txa;
import defpackage.uya;
import defpackage.v3c;
import defpackage.wq3;
import defpackage.wya;
import defpackage.ys2;
import defpackage.yya;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zya;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chats/picker/contacts/PickerContactsListWidget;", "Lone/me/sdk/arch/Widget;", "Lmxa;", "", "Lwq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PickerContactsListWidget extends Widget implements mxa, wq3 {
    public static final /* synthetic */ bc7[] y0;
    public final nxa X;
    public final nxa Y;
    public final a3g Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final ExecutorService o;
    public final nd3 s0;
    public final qm0 t0;
    public final qm0 u0;
    public dle v0;
    public bo6 w0;
    public h8e x0;

    static {
        hob hobVar = new hob(PickerContactsListWidget.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        y0 = new bc7[]{hobVar};
    }

    public PickerContactsListWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final void m0(RecyclerView recyclerView) {
        em2 em2Var = new em2(4, new uya(this, 0));
        h8e h8eVar = new h8e(recyclerView, this.s0, em2Var);
        this.x0 = h8eVar;
        recyclerView.j(h8eVar);
        bo6 bo6Var = new bo6(em2Var);
        this.w0 = bo6Var;
        recyclerView.j(bo6Var);
        v3c.y(new qb(h8eVar, null, 2), recyclerView);
    }

    public final txa n0() {
        return (txa) this.a.getValue();
    }

    public final RecyclerView o0() {
        bc7 bc7Var = y0[0];
        return (RecyclerView) this.u0.getValue();
    }

    @Override // defpackage.uu3
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        od2.L(new zn5(n0().u0, new lq0(2, (dza) this.b.getValue(), dza.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 27), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(o0());
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        dle dleVar = this.v0;
        if (dleVar != null) {
            dleVar.B(o0());
        }
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        super.onDestroyView(view);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eua euaVar = (eua) this.c.getValue();
            l5g l5gVar = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            euaVar.getClass();
            eua.k(l5gVar, strArr, iArr, strArr2, i2, i3);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((dza) this.b.getValue()).o, getViewLifecycleOwner().Q(), fg7.o), new wya(null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().Z, new yya(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().u0, new zya(this, null), 5), getViewLifecycleScope());
    }

    @Override // defpackage.wq3
    public final void t() {
        ((eua) this.c.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    @Override // defpackage.wq3
    public final void w(int i) {
        t();
    }

    @Override // defpackage.mxa
    public final void z(long j, fza fzaVar) {
        n0().q(j, fzaVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerContactsListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        final int i = 1;
        final int i2 = 0;
        int i3 = 2;
        Continuation continuation = null;
        Object objV = ay7.v(bundle, Widget.ARG_SCOPE_ID, suc.class);
        if (objV != null) {
            this.a = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, txa.class, null);
            je7 je7VarCreateViewModelLazy = createViewModelLazy(dza.class, new jp8(11, new s4a(20)));
            this.b = je7VarCreateViewModelLazy;
            je7 je7VarCreateViewModelLazy2 = createViewModelLazy(bh0.class, new jp8(12, new s4a(21)));
            ys2 ys2Var = ys2.a;
            this.c = ys2Var.getAccessor().d(eua.class);
            ExecutorService executorServiceA = ys2Var.c().a();
            this.o = executorServiceA;
            nxa nxaVar = new nxa(this, executorServiceA, 48);
            this.X = nxaVar;
            this.Y = new nxa(this, executorServiceA, 48);
            a3g a3gVar = new a3g(this, executorServiceA, i3);
            this.Z = a3gVar;
            this.s0 = new nd3(new md3(false, 1), a3gVar, nxaVar);
            this.t0 = binding(new k56(this) { // from class: vya
                public final /* synthetic */ PickerContactsListWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    PickerContactsListWidget pickerContactsListWidget = this.b;
                    int i4 = 1;
                    switch (i2) {
                        case 0:
                            bc7[] bc7VarArr = PickerContactsListWidget.y0;
                            aba abaVar = new aba(pickerContactsListWidget.getContext(), null);
                            abaVar.setIcon(woc.O0);
                            abaVar.setTitle(new eqe(yoc.d));
                            abaVar.setSubtitle(new eqe(yoc.c));
                            return abaVar;
                        default:
                            bc7[] bc7VarArr2 = PickerContactsListWidget.y0;
                            RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext(), null);
                            recyclerView.setId(p8a.d0);
                            recyclerView.setClipChildren(false);
                            recyclerView.setClipToPadding(false);
                            recyclerView.setClipToOutline(false);
                            recyclerView.setItemAnimator(null);
                            recyclerView.setHasFixedSize(true);
                            recyclerView.getContext();
                            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                            recyclerView.setAdapter(pickerContactsListWidget.s0);
                            recyclerView.j(new c03(new pw5(recyclerView, i4), new uya(pickerContactsListWidget, 2), new ww9(17), new uya(pickerContactsListWidget, 1)));
                            pickerContactsListWidget.m0(recyclerView);
                            pickerContactsListWidget.v0 = z7.m(recyclerView);
                            return recyclerView;
                    }
                }
            });
            this.u0 = binding(new k56(this) { // from class: vya
                public final /* synthetic */ PickerContactsListWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    PickerContactsListWidget pickerContactsListWidget = this.b;
                    int i4 = 1;
                    switch (i) {
                        case 0:
                            bc7[] bc7VarArr = PickerContactsListWidget.y0;
                            aba abaVar = new aba(pickerContactsListWidget.getContext(), null);
                            abaVar.setIcon(woc.O0);
                            abaVar.setTitle(new eqe(yoc.d));
                            abaVar.setSubtitle(new eqe(yoc.c));
                            return abaVar;
                        default:
                            bc7[] bc7VarArr2 = PickerContactsListWidget.y0;
                            RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext(), null);
                            recyclerView.setId(p8a.d0);
                            recyclerView.setClipChildren(false);
                            recyclerView.setClipToPadding(false);
                            recyclerView.setClipToOutline(false);
                            recyclerView.setItemAnimator(null);
                            recyclerView.setHasFixedSize(true);
                            recyclerView.getContext();
                            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                            recyclerView.setAdapter(pickerContactsListWidget.s0);
                            recyclerView.j(new c03(new pw5(recyclerView, i4), new uya(pickerContactsListWidget, 2), new ww9(17), new uya(pickerContactsListWidget, 1)));
                            pickerContactsListWidget.m0(recyclerView);
                            pickerContactsListWidget.v0 = z7.m(recyclerView);
                            return recyclerView;
                    }
                }
            });
            od2.L(new j31(((dza) je7VarCreateViewModelLazy.getValue()).b, ((bh0) je7VarCreateViewModelLazy2.getValue()).s0, new c3(this, continuation, 23), 4), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
