package one.me.folders.pickerfolders;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c03;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dy7;
import defpackage.f;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.jv5;
import defpackage.k56;
import defpackage.kka;
import defpackage.kpa;
import defpackage.kq;
import defpackage.m56;
import defpackage.nec;
import defpackage.nj4;
import defpackage.oba;
import defpackage.od2;
import defpackage.oec;
import defpackage.ow5;
import defpackage.pw5;
import defpackage.q7c;
import defpackage.qba;
import defpackage.qm0;
import defpackage.rw5;
import defpackage.sw5;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.tw5;
import defpackage.uka;
import defpackage.v3c;
import defpackage.w54;
import defpackage.w7c;
import defpackage.x27;
import defpackage.xh0;
import defpackage.xv5;
import defpackage.yw5;
import defpackage.z6a;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/folders/pickerfolders/FoldersPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "serverChatId", "(J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class FoldersPickerScreen extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X;
    public final q7c Y;
    public final qm0 Z;
    public final x27 a;
    public final fs b;
    public final je7 c;
    public final jv5 o;

    static {
        hob hobVar = new hob(FoldersPickerScreen.class, "serverChatId", "getServerChatId()J", 0);
        oec oecVar = nec.a;
        s0 = new bc7[]{hobVar, zr6.e(oecVar, FoldersPickerScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(FoldersPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(FoldersPickerScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(FoldersPickerScreen.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oecVar)};
    }

    public FoldersPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        this.b = new fs(Long.class, 0L, "arg_chat_id");
        final int i = 0;
        this.c = createViewModelLazy(yw5.class, new nj4(6, new k56(this) { // from class: mw5
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = FoldersPickerScreen.s0;
                        foldersPickerScreen.getClass();
                        bc7 bc7Var = FoldersPickerScreen.s0[0];
                        return new yw5(((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue());
                    default:
                        bc7[] bc7VarArr2 = FoldersPickerScreen.s0;
                        aba abaVar = new aba(foldersPickerScreen.getContext(), null);
                        abaVar.setIcon(woc.O);
                        abaVar.setTitle(new eqe(qba.p));
                        abaVar.x(abaVar.getContext().getString(qba.m), new ow5(foldersPickerScreen, 1));
                        return abaVar;
                }
            }
        }));
        this.o = new jv5(((iba) xv5.a.getAccessor().c(iba.class)).a(), new f(1, this, FoldersPickerScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 23), 6);
        this.X = viewBinding(oba.m);
        viewBinding(oba.o);
        this.Y = viewBinding(oba.d);
        final int i2 = 1;
        this.Z = binding(new k56(this) { // from class: mw5
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = FoldersPickerScreen.s0;
                        foldersPickerScreen.getClass();
                        bc7 bc7Var = FoldersPickerScreen.s0[0];
                        return new yw5(((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue());
                    default:
                        bc7[] bc7VarArr2 = FoldersPickerScreen.s0;
                        aba abaVar = new aba(foldersPickerScreen.getContext(), null);
                        abaVar.setIcon(woc.O);
                        abaVar.setTitle(new eqe(qba.p));
                        abaVar.x(abaVar.getContext().getString(qba.m), new ow5(foldersPickerScreen, 1));
                        return abaVar;
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getO() {
        return this.a;
    }

    public final yw5 m0() {
        return (yw5) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla claVar = new cla(getContext(), 6);
        claVar.setId(oba.o);
        claVar.setForm(uka.a);
        claVar.setTitle(qba.q);
        final int i = 0;
        claVar.setLeftActions(new kka(new m56(this) { // from class: nw5
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
            @Override // defpackage.m56
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r6) {
                /*
                    r5 = this;
                    r0 = 1
                    v9f r1 = defpackage.v9f.a
                    r2 = 0
                    one.me.folders.pickerfolders.FoldersPickerScreen r3 = r5.b
                    int r5 = r2
                    switch(r5) {
                        case 0: goto L6d;
                        case 1: goto L4a;
                        default: goto Lb;
                    }
                Lb:
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r5 = r6.intValue()
                    jv5 r6 = r3.o
                    int r4 = r6.j()
                    if (r4 <= r5) goto L43
                    if (r5 < 0) goto L43
                    java.lang.Object r5 = r6.C(r5)
                    ol7 r5 = (defpackage.ol7) r5
                    w9f r5 = (defpackage.w9f) r5
                    at5 r6 = r5.a
                    if (r6 == 0) goto L45
                    java.lang.String r6 = r6.a
                    if (r6 != 0) goto L2c
                    goto L45
                L2c:
                    v9f r5 = r5.b
                    if (r5 == r1) goto L44
                    yw5 r5 = r3.m0()
                    q0e r5 = r5.x0
                    java.lang.Object r5 = r5.getValue()
                    java.util.Set r5 = (java.util.Set) r5
                    boolean r5 = r5.contains(r6)
                    if (r5 == 0) goto L43
                    goto L44
                L43:
                    r0 = r2
                L44:
                    r2 = r0
                L45:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                    return r5
                L4a:
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r5 = r6.intValue()
                    jv5 r6 = r3.o
                    int r3 = r6.j()
                    if (r3 < r5) goto L67
                    if (r5 < 0) goto L67
                    java.lang.Object r5 = r6.C(r5)
                    ol7 r5 = (defpackage.ol7) r5
                    w9f r5 = (defpackage.w9f) r5
                    v9f r5 = r5.b
                    if (r5 == r1) goto L67
                    goto L68
                L67:
                    r0 = r2
                L68:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    return r5
                L6d:
                    android.view.View r6 = (android.view.View) r6
                    bc7[] r5 = one.me.folders.pickerfolders.FoldersPickerScreen.s0
                    i3a r5 = r3.getOnBackPressedDispatcher()
                    if (r5 == 0) goto L7a
                    r5.d()
                L7a:
                    e5f r5 = defpackage.e5f.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nw5.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(oba.d);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(qba.h);
        tu0.K(oneMeButton, 300L, new ow5(this, 0));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(oba.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        float f = 6;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        final int i2 = 1;
        m56 m56Var = new m56(this) { // from class: nw5
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object v) {
                /*
                    this = this;
                    r0 = 1
                    v9f r1 = defpackage.v9f.a
                    r2 = 0
                    one.me.folders.pickerfolders.FoldersPickerScreen r3 = r5.b
                    int r5 = r2
                    switch(r5) {
                        case 0: goto L6d;
                        case 1: goto L4a;
                        default: goto Lb;
                    }
                Lb:
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r5 = r6.intValue()
                    jv5 r6 = r3.o
                    int r4 = r6.j()
                    if (r4 <= r5) goto L43
                    if (r5 < 0) goto L43
                    java.lang.Object r5 = r6.C(r5)
                    ol7 r5 = (defpackage.ol7) r5
                    w9f r5 = (defpackage.w9f) r5
                    at5 r6 = r5.a
                    if (r6 == 0) goto L45
                    java.lang.String r6 = r6.a
                    if (r6 != 0) goto L2c
                    goto L45
                L2c:
                    v9f r5 = r5.b
                    if (r5 == r1) goto L44
                    yw5 r5 = r3.m0()
                    q0e r5 = r5.x0
                    java.lang.Object r5 = r5.getValue()
                    java.util.Set r5 = (java.util.Set) r5
                    boolean r5 = r5.contains(r6)
                    if (r5 == 0) goto L43
                    goto L44
                L43:
                    r0 = r2
                L44:
                    r2 = r0
                L45:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                    return r5
                L4a:
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r5 = r6.intValue()
                    jv5 r6 = r3.o
                    int r3 = r6.j()
                    if (r3 < r5) goto L67
                    if (r5 < 0) goto L67
                    java.lang.Object r5 = r6.C(r5)
                    ol7 r5 = (defpackage.ol7) r5
                    w9f r5 = (defpackage.w9f) r5
                    v9f r5 = r5.b
                    if (r5 == r1) goto L67
                    goto L68
                L67:
                    r0 = r2
                L68:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    return r5
                L6d:
                    android.view.View r6 = (android.view.View) r6
                    bc7[] r5 = one.me.folders.pickerfolders.FoldersPickerScreen.s0
                    i3a r5 = r3.getOnBackPressedDispatcher()
                    if (r5 == 0) goto L7a
                    r5.d()
                L7a:
                    e5f r5 = defpackage.e5f.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nw5.invoke(java.lang.Object):java.lang.Object");
            }
        };
        final int i3 = 2;
        recyclerView.j(new c03(new pw5(recyclerView, 0), new m56(this) { // from class: nw5
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object v) {
                /*
                    this = this;
                    r0 = 1
                    v9f r1 = defpackage.v9f.a
                    r2 = 0
                    one.me.folders.pickerfolders.FoldersPickerScreen r3 = r5.b
                    int r5 = r2
                    switch(r5) {
                        case 0: goto L6d;
                        case 1: goto L4a;
                        default: goto Lb;
                    }
                Lb:
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r5 = r6.intValue()
                    jv5 r6 = r3.o
                    int r4 = r6.j()
                    if (r4 <= r5) goto L43
                    if (r5 < 0) goto L43
                    java.lang.Object r5 = r6.C(r5)
                    ol7 r5 = (defpackage.ol7) r5
                    w9f r5 = (defpackage.w9f) r5
                    at5 r6 = r5.a
                    if (r6 == 0) goto L45
                    java.lang.String r6 = r6.a
                    if (r6 != 0) goto L2c
                    goto L45
                L2c:
                    v9f r5 = r5.b
                    if (r5 == r1) goto L44
                    yw5 r5 = r3.m0()
                    q0e r5 = r5.x0
                    java.lang.Object r5 = r5.getValue()
                    java.util.Set r5 = (java.util.Set) r5
                    boolean r5 = r5.contains(r6)
                    if (r5 == 0) goto L43
                    goto L44
                L43:
                    r0 = r2
                L44:
                    r2 = r0
                L45:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                    return r5
                L4a:
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r5 = r6.intValue()
                    jv5 r6 = r3.o
                    int r3 = r6.j()
                    if (r3 < r5) goto L67
                    if (r5 < 0) goto L67
                    java.lang.Object r5 = r6.C(r5)
                    ol7 r5 = (defpackage.ol7) r5
                    w9f r5 = (defpackage.w9f) r5
                    v9f r5 = r5.b
                    if (r5 == r1) goto L67
                    goto L68
                L67:
                    r0 = r2
                L68:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    return r5
                L6d:
                    android.view.View r6 = (android.view.View) r6
                    bc7[] r5 = one.me.folders.pickerfolders.FoldersPickerScreen.s0
                    i3a r5 = r3.getOnBackPressedDispatcher()
                    if (r5 == 0) goto L7a
                    r5.d()
                L7a:
                    e5f r5 = defpackage.e5f.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nw5.invoke(java.lang.Object):java.lang.Object");
            }
        }, m56Var, m56Var));
        recyclerView.l(new w54(recyclerView));
        recyclerView.j(new kq(7));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(oba.n);
        ti3 ti3Var = new ti3(0, -2);
        ti3Var.i = 0;
        ti3Var.e = 0;
        ti3Var.h = 0;
        constraintLayout.addView(claVar, ti3Var);
        ti3 ti3Var2 = new ti3(0, 0);
        ti3Var2.j = claVar.getId();
        ti3Var2.e = 0;
        ti3Var2.h = 0;
        ti3Var2.k = oneMeButton.getId();
        constraintLayout.addView(recyclerView, ti3Var2);
        ti3 ti3Var3 = new ti3(0, -2);
        ti3Var3.e = 0;
        ti3Var3.h = 0;
        ti3Var3.l = 0;
        float f2 = 12;
        ti3Var3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, ti3Var3);
        v3c.y(new xh0(3, (Continuation) null, 13), constraintLayout);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = m0().t0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new rw5(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().y0, getViewLifecycleOwner().Q(), fg7Var), new sw5(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().v0, getViewLifecycleOwner().Q(), fg7Var), new tw5(null, this), 5), getViewLifecycleScope());
    }

    public FoldersPickerScreen(long j) {
        this(dy7.g(new kpa("arg_chat_id", Long.valueOf(j))));
    }
}
