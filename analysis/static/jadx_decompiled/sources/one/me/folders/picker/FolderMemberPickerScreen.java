package one.me.folders.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import defpackage.bc7;
import defpackage.cla;
import defpackage.ds3;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.es3;
import defpackage.fg7;
import defpackage.fs;
import defpackage.hob;
import defpackage.iy2;
import defpackage.j0e;
import defpackage.jy2;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.kr0;
import defpackage.m5d;
import defpackage.nec;
import defpackage.nz4;
import defpackage.o9;
import defpackage.oba;
import defpackage.od2;
import defpackage.q0e;
import defpackage.q33;
import defpackage.qza;
import defpackage.r0e;
import defpackage.r8a;
import defpackage.su5;
import defpackage.sya;
import defpackage.ta2;
import defpackage.tu0;
import defpackage.tu5;
import defpackage.uka;
import defpackage.uu5;
import defpackage.wz4;
import defpackage.x27;
import defpackage.x3c;
import defpackage.xs2;
import defpackage.xv5;
import defpackage.ys;
import defpackage.zn5;
import defpackage.zr6;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/picker/FolderMemberPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lsu5;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "resultTag", "", "membersIds", "(Ljava/lang/String;Ljava/lang/String;[J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class FolderMemberPickerScreen extends AbstractPickerScreen<su5> {
    public static final /* synthetic */ bc7[] y0 = {new hob(FolderMemberPickerScreen.class, "folderId", "getFolderId()Ljava/lang/String;", 0), zr6.e(nec.a, FolderMemberPickerScreen.class, "tag", "getTag()Ljava/lang/String;", 0)};
    public final x27 t0;
    public final q0e u0;
    public final x3c v0;
    public final fs w0;
    public final fs x0;

    public FolderMemberPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = x27.d;
        this.u0 = r0e.a(new eqe(r8a.X));
        xv5 xv5Var = xv5.a;
        this.v0 = new x3c(xv5Var.getAccessor().d(q33.class), xv5Var.getAccessor().d(kke.class), xv5Var.getAccessor().d(iy2.class), w0(bundle));
        this.w0 = new fs(String.class, "folder_id");
        this.x0 = new fs(String.class, "result_tag");
        kr0 kr0Var = new kr0(this, new es3(18, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 5));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getT0() {
        return this.t0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        return nz4.a;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        xv5 xv5Var = xv5.a;
        return new m5d(this.v0, new xs2(xv5Var.getAccessor().d(iy2.class)), xv5Var.getAccessor().d(ds3.class), xv5Var.getAccessor().d(q33.class));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        return new PickerChatsListWidget("all.chat.folder", str, null, false, false, null, 52, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(v0().Z, getViewLifecycleOwner().Q(), fg7.o), new tu5(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(((su5) v0().c).e, new uu5(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        cla claVar = new cla(context, 6);
        claVar.setId(oba.a);
        claVar.setTransitionName(context.getString(r8a.q));
        claVar.setTitle(r8a.Y);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new jy2(15, this)));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() {
        xv5 xv5Var = xv5.a;
        return new su5(xv5Var.getAccessor().d(ta2.class), xv5Var.getAccessor().d(kke.class), this.v0);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final j0e s0() {
        return this.u0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("preselected_ids");
        return longArray != null ? ys.n0(longArray) : wz4.a;
    }

    public FolderMemberPickerScreen(String str, String str2, long[] jArr) {
        this(dy7.g(new kpa("folder_id", str), new kpa("result_tag", str2), new kpa("preselected_ids", jArr)));
    }
}
