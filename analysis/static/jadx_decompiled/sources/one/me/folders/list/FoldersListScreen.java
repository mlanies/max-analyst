package one.me.folders.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a77;
import defpackage.at5;
import defpackage.aw5;
import defpackage.bc7;
import defpackage.bv5;
import defpackage.bvc;
import defpackage.bw5;
import defpackage.c64;
import defpackage.cla;
import defpackage.cw5;
import defpackage.dw5;
import defpackage.f;
import defpackage.f77;
import defpackage.fg7;
import defpackage.fh5;
import defpackage.fw5;
import defpackage.glc;
import defpackage.hob;
import defpackage.iba;
import defpackage.iw5;
import defpackage.j47;
import defpackage.je7;
import defpackage.jy2;
import defpackage.kka;
import defpackage.kq;
import defpackage.nd7;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.nz7;
import defpackage.o;
import defpackage.oba;
import defpackage.od2;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qba;
import defpackage.qp4;
import defpackage.re6;
import defpackage.s35;
import defpackage.tu0;
import defpackage.uka;
import defpackage.ut0;
import defpackage.v3c;
import defpackage.w9a;
import defpackage.w9f;
import defpackage.x27;
import defpackage.xt3;
import defpackage.xv5;
import defpackage.y67;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/folders/list/FoldersListScreen;", "Lone/me/sdk/arch/Widget;", "Ly67;", "Lng3;", "Lxt3;", "<init>", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class FoldersListScreen extends Widget implements y67, ng3, xt3 {
    public static final /* synthetic */ bc7[] Z;
    public final aw5 X;
    public final q7c Y;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final f77 o;

    static {
        hob hobVar = new hob(FoldersListScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Z = new bc7[]{hobVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FoldersListScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new glc(new fh5(5), null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(iw5.class, new nj4(5, new fh5(6)));
        this.o = new f77(new a77(this));
        this.X = new aw5(((iba) xv5.a.getAccessor().c(iba.class)).a(), new f(1, this, FoldersListScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 22), new ut0(3, this, FoldersListScreen.class, "onActionMenuClick", "onActionMenuClick(Landroid/view/View;Lone/me/folders/list/adapter/UserFolderListItem;I)V", 0, 2), new re6(14, this));
        this.Y = viewBinding(oba.m);
    }

    @Override // defpackage.y67
    public final void W(int i, int i2) {
        this.X.W(i, i2);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == oba.c) {
            iw5 iw5VarM0 = m0();
            j47.T(iw5VarM0.a, ((w9a) iw5VarM0.c).a(), null, new fw5(iw5VarM0, null), 2);
        }
    }

    public final iw5 m0() {
        return (iw5) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla claVar = new cla(getContext(), 6);
        claVar.setId(oba.o);
        claVar.setForm(uka.a);
        claVar.setTitle(qba.c);
        claVar.setLeftActions(new kka(new jy2(16, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(oba.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        this.o.i(recyclerView);
        recyclerView.j(new kq(6));
        recyclerView.j(new nz7(2));
        recyclerView.j(new bw5((Context) xv5.a.getAccessor().c(Context.class)));
        recyclerView.j(new bw5(qp4.u0.j(recyclerView)));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(oba.n);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(claVar);
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, null, 4), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o.i(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        s35 s35Var = m0().Z;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new cw5(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().Y, getViewLifecycleOwner().Q(), fg7Var), new dw5(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        w9f w9fVar;
        at5 at5Var;
        CharSequence charSequence;
        at5 at5Var2;
        String str;
        if (i != oba.j) {
            if (i != oba.k || (w9fVar = m0().t0) == null || (at5Var = w9fVar.a) == null || (charSequence = at5Var.b) == null) {
                return;
            }
            nd7.S(charSequence, this);
            return;
        }
        iw5 iw5VarM0 = m0();
        w9f w9fVar2 = iw5VarM0.t0;
        if (w9fVar2 == null || (at5Var2 = w9fVar2.a) == null || (str = at5Var2.a) == null) {
            return;
        }
        bv5.c.getClass();
        pnf.o(iw5VarM0.Z, new c64(":settings/folder/edit?id=".concat(str)));
    }
}
