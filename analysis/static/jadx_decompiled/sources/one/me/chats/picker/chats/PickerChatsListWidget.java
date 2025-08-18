package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.c03;
import defpackage.dle;
import defpackage.dy7;
import defpackage.eya;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.fya;
import defpackage.hob;
import defpackage.hya;
import defpackage.iya;
import defpackage.j81;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jya;
import defpackage.kpa;
import defpackage.kya;
import defpackage.lq0;
import defpackage.lya;
import defpackage.m56;
import defpackage.md3;
import defpackage.mdc;
import defpackage.nd3;
import defpackage.nec;
import defpackage.nxa;
import defpackage.oa2;
import defpackage.od2;
import defpackage.od3;
import defpackage.oi9;
import defpackage.q0e;
import defpackage.qm0;
import defpackage.suc;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.txa;
import defpackage.w54;
import defpackage.w7c;
import defpackage.y51;
import defpackage.yb4;
import defpackage.ys2;
import defpackage.z7;
import defpackage.z7b;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BO\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsListWidget;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lsuc;", "scopeId", "Loa2;", "filter", "", "isFakeChatsEnabled", "isInMultiSelect", "Lkotlin/Function1;", "Le5f;", "onMultiSelectToggled", "(Ljava/lang/String;Ljava/lang/String;Loa2;ZZLm56;Lz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PickerChatsListWidget extends Widget {
    public static final /* synthetic */ bc7[] C0 = {new hob(PickerChatsListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), z7b.g(nec.a, PickerChatsListWidget.class, "isFakeChatsEnabled", "isFakeChatsEnabled()Z", 0), new oi9(PickerChatsListWidget.class, "isInMultiSelect", "isInMultiSelect()Z"), new hob(PickerChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final qm0 A0;
    public final je7 B0;
    public final fs X;
    public final m56 Y;
    public final je7 Z;
    public final je7 a;
    public final String b;
    public final fs c;
    public final fs o;
    public dle s0;
    public final ExecutorService t0;
    public b u0;
    public final y51 v0;
    public final nd3 w0;
    public final nxa x0;
    public final nxa y0;
    public final qm0 z0;

    public PickerChatsListWidget(String str, String str2, oa2 oa2Var, boolean z, boolean z2, m56 m56Var, z84 z84Var) {
        this(dy7.g(new kpa("folder.id.key", str), new kpa("scope.id", new suc(str2)), new kpa("picker.filter", oa2Var), new kpa("folder.fake.enabled", Boolean.valueOf(z)), new kpa("is_in_multiselect", Boolean.valueOf(z2))));
        this.Y = m56Var;
    }

    public static final boolean m0(PickerChatsListWidget pickerChatsListWidget, int i) {
        return i < 0 || i >= pickerChatsListWidget.w0.j() || !tpa.f(pickerChatsListWidget.w0.D(i).first, pickerChatsListWidget.v0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean n0(one.me.chats.picker.chats.PickerChatsListWidget r3) {
        /*
            nd3 r0 = r3.w0
            java.util.List r0 = r0.C()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            hdc r1 = (defpackage.hdc) r1
            nxa r2 = r3.y0
            if (r1 != r2) goto L11
            goto L38
        L22:
            eya r3 = r3.q0()
            w7c r3 = r3.z0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.chats.PickerChatsListWidget.n0(one.me.chats.picker.chats.PickerChatsListWidget):boolean");
    }

    public final txa o0() {
        return (txa) this.a.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        q0e q0eVar = q0().C0;
        q0eVar.m(null, Long.valueOf(((Number) q0eVar.getValue()).longValue() + 1));
    }

    @Override // defpackage.uu3
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        if (tpa.f(this.b, "all.chat.folder")) {
            od2.L(new zn5(o0().u0, new lq0(2, q0(), eya.class, "search", "search$chats_list_release(Ljava/lang/String;)V", 4, 26), 5), getLifecycleScope());
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!tpa.f(this.b, "all.chat.folder")) {
            return p0();
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(p0());
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        EndlessRecyclerView2 endlessRecyclerView2P0 = p0();
        dle dleVar = this.s0;
        if (dleVar != null) {
            dleVar.B(endlessRecyclerView2P0);
        }
        endlessRecyclerView2P0.setDelegate(null);
        endlessRecyclerView2P0.setPager(null);
        endlessRecyclerView2P0.setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        nd3 nd3Var = this.w0;
        od3 od3Var = nd3Var.o;
        nxa nxaVar = this.x0;
        od3Var.a(0, nxaVar);
        EndlessRecyclerView2 endlessRecyclerView2P0 = p0();
        endlessRecyclerView2P0.getContext();
        endlessRecyclerView2P0.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2P0.setAdapter(nd3Var);
        this.s0 = z7.m(endlessRecyclerView2P0);
        endlessRecyclerView2P0.setPager(new j81(this, 6));
        endlessRecyclerView2P0.setDelegate(this.v0);
        endlessRecyclerView2P0.setClipToPadding(false);
        float f = 6;
        endlessRecyclerView2P0.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        endlessRecyclerView2P0.setThreshold(10);
        endlessRecyclerView2P0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.u0;
        if (bVar != null) {
            endlessRecyclerView2P0.setRecycledViewPool(bVar);
        }
        endlessRecyclerView2P0.setItemAnimator(null);
        mdc itemAnimator = endlessRecyclerView2P0.getItemAnimator();
        yb4 yb4Var = itemAnimator instanceof yb4 ? (yb4) itemAnimator : null;
        if (yb4Var != null) {
            yb4Var.g = false;
        }
        bc7 bc7Var = C0[2];
        boolean zBooleanValue = ((Boolean) this.X.a(this)).booleanValue();
        je7 je7Var = this.B0;
        if (zBooleanValue) {
            endlessRecyclerView2P0.j((c03) je7Var.getValue());
        } else {
            endlessRecyclerView2P0.p0((c03) je7Var.getValue());
        }
        endlessRecyclerView2P0.l(new w54(endlessRecyclerView2P0));
        if (nxaVar.j() > 0) {
            endlessRecyclerView2P0.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2P0.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2P0.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            mdc itemAnimator2 = endlessRecyclerView2P0.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.e();
            }
        }
        p0().setRefreshingNext(((Boolean) q0().z0.a.getValue()).booleanValue());
        w7c w7cVar = q0().x0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new iya(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().B0, getViewLifecycleOwner().Q(), fg7Var), new jya(null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().Z, new kya(null, this), 5), getViewLifecycleScope());
        if (tpa.f(this.b, "all.chat.folder")) {
            od2.L(new zn5(o0().u0, new lya(null, this), 5), getViewLifecycleScope());
        }
    }

    public final EndlessRecyclerView2 p0() {
        bc7 bc7Var = C0[3];
        return (EndlessRecyclerView2) this.A0.getValue();
    }

    public final eya q0() {
        return (eya) this.Z.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerChatsListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        int i = 3;
        int i2 = 1;
        int i3 = 0;
        int i4 = 2;
        Object objV = ay7.v(bundle, "scope.id", suc.class);
        if (objV != null) {
            this.a = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, txa.class, null);
            String string = bundle.getString("folder.id.key");
            if (string != null) {
                this.b = string;
                this.c = new fs(oa2.class, "picker.filter");
                this.o = new fs(Boolean.class, "folder.fake.enabled");
                this.X = new fs(Boolean.class, Boolean.TRUE, "is_in_multiselect");
                this.Z = createViewModelLazy(eya.class, new jp8(9, new fya(this, i3)));
                ExecutorService executorServiceA = ys2.a.c().a();
                this.t0 = executorServiceA;
                y51 y51Var = new y51(executorServiceA, i2);
                this.v0 = y51Var;
                this.w0 = new nd3(new md3(false, 1), y51Var);
                hya hyaVar = new hya(this);
                this.x0 = new nxa(hyaVar, executorServiceA, 0);
                this.y0 = new nxa(hyaVar, executorServiceA, 0);
                this.z0 = binding(new fya(this, i2));
                this.A0 = binding(new fya(this, i4));
                this.B0 = tu0.r(3, new fya(this, i));
                q0().c.e();
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key scope.id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ PickerChatsListWidget(String str, String str2, oa2 oa2Var, boolean z, boolean z2, m56 m56Var, int i, z84 z84Var) {
        this(str, str2, (i & 4) != 0 ? oa2.a : oa2Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : m56Var, null);
    }
}
