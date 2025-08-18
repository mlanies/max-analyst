package one.me.folders.edit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.br;
import defpackage.c5;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dv5;
import defpackage.dy7;
import defpackage.es3;
import defpackage.fk4;
import defpackage.fs;
import defpackage.hob;
import defpackage.hu5;
import defpackage.iba;
import defpackage.je7;
import defpackage.jt5;
import defpackage.kka;
import defpackage.kpa;
import defpackage.kt5;
import defpackage.lq0;
import defpackage.mr0;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.nu5;
import defpackage.oba;
import defpackage.od2;
import defpackage.oec;
import defpackage.pnf;
import defpackage.q1d;
import defpackage.q64;
import defpackage.q7c;
import defpackage.qba;
import defpackage.qp4;
import defpackage.rt5;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.uka;
import defpackage.ut5;
import defpackage.v3c;
import defpackage.vc7;
import defpackage.vt5;
import defpackage.w9a;
import defpackage.wt5;
import defpackage.x27;
import defpackage.xv5;
import defpackage.z6a;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/edit/FolderEditScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Ljt5;", "Ldv5;", "", "folderId", "<init>", "(Ljava/lang/String;)V", "", "serverChatId", "(J)V", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class FolderEditScreen extends Widget implements ng3, jt5, dv5 {
    public static final /* synthetic */ bc7[] s0;
    public final kt5 X;
    public final q7c Y;
    public final q7c Z;
    public final x27 a;
    public final fs b;
    public final fs c;
    public final je7 o;

    static {
        hob hobVar = new hob(FolderEditScreen.class, "folderId", "getFolderId()Ljava/lang/String;", 0);
        oec oecVar = nec.a;
        s0 = new bc7[]{hobVar, zr6.e(oecVar, FolderEditScreen.class, "serverChatId", "getServerChatId()J", 0), zr6.f(FolderEditScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(FolderEditScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar)};
    }

    public FolderEditScreen(String str) {
        this(dy7.g(new kpa("key_folder_id", str)));
    }

    public static final cla m0(FolderEditScreen folderEditScreen) {
        folderEditScreen.getClass();
        return (cla) folderEditScreen.Y.T0(folderEditScreen, s0[2]);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getO() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        nu5 nu5VarN0 = n0();
        nu5VarN0.getClass();
        if (i == oba.d) {
            nu5VarN0.u();
        } else {
            if (i != oba.c || nu5VarN0.b == null) {
                return;
            }
            pnf.n(nu5VarN0, ((w9a) nu5VarN0.o).b(), null, new hu5(nu5VarN0, null), 2);
        }
    }

    public final nu5 n0() {
        return (nu5) this.o.getValue();
    }

    public final void o0() {
        int i = vc7.a;
        if (vc7.b(vc7.c)) {
            mr0.G(this);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla claVar = new cla(getContext(), 6);
        claVar.setId(oba.g);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new ut5(this, 0)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(oba.e);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator(null);
        q64 q64Var = new q64(29, this);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), q64Var, null, 12));
        recyclerView.j(new rt5(q64Var));
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(oba.d);
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(qba.h);
        tu0.K(oneMeButton, 300L, new c5(28, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(oba.f);
        ti3 ti3Var = new ti3(0, -2);
        ti3Var.i = 0;
        ti3Var.e = 0;
        ti3Var.h = 0;
        constraintLayout.addView(claVar, ti3Var);
        ti3 ti3Var2 = new ti3(0, 0);
        ti3Var2.j = claVar.getId();
        ti3Var2.e = 0;
        ti3Var2.h = 0;
        ti3Var2.l = 0;
        constraintLayout.addView(recyclerView, ti3Var2);
        ti3 ti3Var3 = new ti3(0, -2);
        ti3Var3.e = 0;
        ti3Var3.h = 0;
        ti3Var3.l = 0;
        float f = 12;
        ti3Var3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, ti3Var3);
        v3c.y(new br(3, (Continuation) null, 7), constraintLayout);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(n0().x0, new vt5(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().u0, new wt5(this, null), 5), getViewLifecycleScope());
    }

    public FolderEditScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        this.b = new fs(String.class, "key_folder_id");
        this.c = new fs(Long.class, 0L, "key_server_chat_id");
        this.o = createViewModelLazy(nu5.class, new nj4(4, new es3(17, this)));
        kt5 kt5Var = new kt5(((iba) xv5.a.getAccessor().c(iba.class)).a(), this);
        this.X = kt5Var;
        this.Y = viewBinding(oba.g);
        this.Z = viewBinding(oba.d);
        od2.L(new zn5(n0().w0, new lq0(2, kt5Var, kt5.class, "submitList", "submitList(Ljava/util/List;)V", 4, 17), 5), getLifecycleScope());
    }

    public FolderEditScreen(long j) {
        this(dy7.g(new kpa("key_server_chat_id", Long.valueOf(j))));
    }

    public FolderEditScreen() {
        this((Bundle) null);
    }
}
