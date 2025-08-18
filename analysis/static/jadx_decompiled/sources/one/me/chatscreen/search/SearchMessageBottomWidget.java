package one.me.chatscreen.search;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.au1;
import defpackage.bc7;
import defpackage.dj3;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.fs;
import defpackage.hob;
import defpackage.hzc;
import defpackage.i3a;
import defpackage.i9g;
import defpackage.je7;
import defpackage.k56;
import defpackage.kpa;
import defpackage.l2a;
import defpackage.nec;
import defpackage.od2;
import defpackage.oi9;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.r1b;
import defpackage.suc;
import defpackage.t03;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.xyc;
import defpackage.yyc;
import defpackage.z7b;
import defpackage.z84;
import defpackage.zn5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/search/SearchMessageBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class SearchMessageBottomWidget extends Widget {
    public static final /* synthetic */ bc7[] s0 = {new oi9(SearchMessageBottomWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, SearchMessageBottomWidget.class, "searchResultTextView", "getSearchResultTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new hob(SearchMessageBottomWidget.class, "upButton", "getUpButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hob(SearchMessageBottomWidget.class, "downButton", "getDownButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hob(SearchMessageBottomWidget.class, "separatorView", "getSeparatorView()Landroid/view/View;", 0)};
    public final qm0 X;
    public boolean Y;
    public boolean Z;
    public final je7 a;
    public final qm0 b;
    public final qm0 c;
    public final qm0 o;

    public SearchMessageBottomWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final AppCompatImageView m0() {
        bc7 bc7Var = s0[3];
        return (AppCompatImageView) this.o.getValue();
    }

    public final AppCompatTextView n0() {
        bc7 bc7Var = s0[1];
        return (AppCompatTextView) this.b.getValue();
    }

    public final View o0() {
        bc7 bc7Var = s0[4];
        return (View) this.X.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        float f = 12;
        float f2 = 4;
        constraintLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        constraintLayout.setMinHeight(tu0.G(44 * fk4.d().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.addView(n0());
        constraintLayout.addView(p0());
        constraintLayout.addView(o0());
        constraintLayout.addView(m0());
        v3c.y(new r1b(this, (Continuation) null, 10), constraintLayout);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = n0().getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 7, p0().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id, 4));
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.g(id).d.l0 = true;
        dj3VarQ.g(id).d.w = 0.0f;
        int id2 = p0().getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 7, o0().getId(), 6);
        float f3 = 10;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id2, 4));
        dj3VarQ.d(id2, 4, 0, 4);
        int id3 = o0().getId();
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 7, m0().getId(), 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id3, 4));
        dj3VarQ.d(id3, 4, 0, 4);
        int id4 = m0().getId();
        dj3VarQ.d(id4, 3, 0, 3);
        dj3VarQ.d(id4, 7, 0, 7);
        dj3VarQ.d(id4, 4, 0, 4);
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        q0().q();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.b(q0().X);
        }
        od2.L(new zn5(q0().Y, new xyc(view, this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(tu0.g(q0().s0, this.lifecycleOwner.Q(), fg7.o), 11), new yyc(this, null), 5), getViewLifecycleScope());
    }

    public final AppCompatImageView p0() {
        bc7 bc7Var = s0[2];
        return (AppCompatImageView) this.c.getValue();
    }

    public final hzc q0() {
        return (hzc) this.a.getValue();
    }

    public final void r0(AppCompatImageView appCompatImageView, boolean z) {
        appCompatImageView.setImageTintList(ColorStateList.valueOf(z ? s0().d.d : s0().d.g));
    }

    public final i9g s0() {
        return qp4.u0.b(getContext()).i().a().h();
    }

    public SearchMessageBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7Var = s0[0];
        this.a = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, hzc.class, null);
        final int i = 0;
        this.b = binding(new k56(this) { // from class: vyc
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                final int i2 = 1;
                pq9 pq9Var = qp4.u0;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = SearchMessageBottomWidget.s0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(t8a.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        i4f.n.b(appCompatTextView, du4.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(pq9Var.j(appCompatTextView).a().h().d.g));
                        appCompatTextView.setText(u8a.g);
                        appCompatTextView.setLayoutParams(new ti3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        bc7[] bc7VarArr2 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(t8a.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(s8a.d);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).a().h().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(u8a.i));
                        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i2) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i3 = il2Var.d;
                                            if (i3 - 1 >= 0) {
                                                int i4 = i3 - 1;
                                                il2Var.d = i4;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i4, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i3 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        bc7[] bc7VarArr3 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(t8a.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(s8a.c);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView2).a().h().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(u8a.f));
                        int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        final int i4 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i4) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i32 = il2Var.d;
                                            if (i32 - 1 >= 0) {
                                                int i42 = i32 - 1;
                                                il2Var.d = i42;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i42, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i5 = pq9Var.j(appCompatImageView2).d().a.a.h;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        bc7[] bc7VarArr4 = SearchMessageBottomWidget.s0;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(t8a.f);
                        view.setLayoutParams(new ti3(tu0.G(1 * fk4.d().getDisplayMetrics().density), tu0.G(18 * fk4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(pq9Var.j(view).a().h().d.g);
                        return view;
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new k56(this) { // from class: vyc
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                final int i22 = 1;
                pq9 pq9Var = qp4.u0;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = SearchMessageBottomWidget.s0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(t8a.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        i4f.n.b(appCompatTextView, du4.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(pq9Var.j(appCompatTextView).a().h().d.g));
                        appCompatTextView.setText(u8a.g);
                        appCompatTextView.setLayoutParams(new ti3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        bc7[] bc7VarArr2 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(t8a.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(s8a.d);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).a().h().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(u8a.i));
                        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i22) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i32 = il2Var.d;
                                            if (i32 - 1 >= 0) {
                                                int i42 = i32 - 1;
                                                il2Var.d = i42;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i42, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i3 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        bc7[] bc7VarArr3 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(t8a.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(s8a.c);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView2).a().h().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(u8a.f));
                        int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        final int i4 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i4) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i32 = il2Var.d;
                                            if (i32 - 1 >= 0) {
                                                int i42 = i32 - 1;
                                                il2Var.d = i42;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i42, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i5 = pq9Var.j(appCompatImageView2).d().a.a.h;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        bc7[] bc7VarArr4 = SearchMessageBottomWidget.s0;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(t8a.f);
                        view.setLayoutParams(new ti3(tu0.G(1 * fk4.d().getDisplayMetrics().density), tu0.G(18 * fk4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(pq9Var.j(view).a().h().d.g);
                        return view;
                }
            }
        });
        final int i3 = 2;
        this.o = binding(new k56(this) { // from class: vyc
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                final int i22 = 1;
                pq9 pq9Var = qp4.u0;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = SearchMessageBottomWidget.s0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(t8a.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        i4f.n.b(appCompatTextView, du4.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(pq9Var.j(appCompatTextView).a().h().d.g));
                        appCompatTextView.setText(u8a.g);
                        appCompatTextView.setLayoutParams(new ti3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        bc7[] bc7VarArr2 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(t8a.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(s8a.d);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).a().h().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(u8a.i));
                        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i22) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i32 = il2Var.d;
                                            if (i32 - 1 >= 0) {
                                                int i42 = i32 - 1;
                                                il2Var.d = i42;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i42, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i32 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        bc7[] bc7VarArr3 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(t8a.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(s8a.c);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView2).a().h().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(u8a.f));
                        int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        final int i4 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i4) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i322 = il2Var.d;
                                            if (i322 - 1 >= 0) {
                                                int i42 = i322 - 1;
                                                il2Var.d = i42;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i42, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i5 = pq9Var.j(appCompatImageView2).d().a.a.h;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        bc7[] bc7VarArr4 = SearchMessageBottomWidget.s0;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(t8a.f);
                        view.setLayoutParams(new ti3(tu0.G(1 * fk4.d().getDisplayMetrics().density), tu0.G(18 * fk4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(pq9Var.j(view).a().h().d.g);
                        return view;
                }
            }
        });
        final int i4 = 3;
        this.X = binding(new k56(this) { // from class: vyc
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                final int i22 = 1;
                pq9 pq9Var = qp4.u0;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i4) {
                    case 0:
                        bc7[] bc7VarArr = SearchMessageBottomWidget.s0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(t8a.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        i4f.n.b(appCompatTextView, du4.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(pq9Var.j(appCompatTextView).a().h().d.g));
                        appCompatTextView.setText(u8a.g);
                        appCompatTextView.setLayoutParams(new ti3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        bc7[] bc7VarArr2 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(t8a.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(s8a.d);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).a().h().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(u8a.i));
                        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iG, iG, iG, iG);
                        tu0.K(appCompatImageView, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i22) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i322 = il2Var.d;
                                            if (i322 - 1 >= 0) {
                                                int i42 = i322 - 1;
                                                il2Var.d = i42;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i42, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i32 = pq9Var.j(appCompatImageView).d().a.a.h;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        bc7[] bc7VarArr3 = SearchMessageBottomWidget.s0;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(t8a.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(s8a.c);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView2).a().h().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(u8a.f));
                        int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
                        final int i42 = 0;
                        tu0.K(appCompatImageView2, 300L, new View.OnClickListener() { // from class: wyc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Z) {
                                            il2 il2Var = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i322 = il2Var.d;
                                            if (i322 - 1 >= 0) {
                                                int i422 = i322 - 1;
                                                il2Var.d = i422;
                                                fl2 fl2Var = il2Var.g;
                                                if (fl2Var != null) {
                                                    fl2Var.d(i422, il2Var.k);
                                                }
                                                fl2 fl2Var2 = il2Var.g;
                                                if (fl2Var2 != null) {
                                                    fl2Var2.e((nx8) il2Var.f.get(il2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.Y) {
                                            il2 il2Var2 = (il2) searchMessageBottomWidget2.q0().o.a;
                                            int i5 = il2Var2.d + 1;
                                            ArrayList arrayList = il2Var2.f;
                                            if (i5 <= arrayList.size()) {
                                                int i6 = il2Var2.d + 1;
                                                il2Var2.d = i6;
                                                fl2 fl2Var3 = il2Var2.g;
                                                if (fl2Var3 != null) {
                                                    fl2Var3.d(i6, il2Var2.k);
                                                }
                                                fl2 fl2Var4 = il2Var2.g;
                                                if (fl2Var4 != null) {
                                                    fl2Var4.e((nx8) arrayList.get(il2Var2.d - 1));
                                                }
                                                if (il2Var2.d + 1 <= arrayList.size() && il2Var2.g != null) {
                                                }
                                            }
                                            String str = il2Var2.c;
                                            if (il2Var2.h && arrayList.size() - il2Var2.d < 5 && il2Var2.j != 0 && str != null && str.length() != 0) {
                                                hm9.n("il2", "Search for next messages");
                                                il2Var2.h = false;
                                                j47.T(il2Var2.e, null, null, new gl2(il2Var2, str, il2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i5 = pq9Var.j(appCompatImageView2).d().a.a.h;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        bc7[] bc7VarArr4 = SearchMessageBottomWidget.s0;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(t8a.f);
                        view.setLayoutParams(new ti3(tu0.G(1 * fk4.d().getDisplayMetrics().density), tu0.G(18 * fk4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(pq9Var.j(view).a().h().d.g);
                        return view;
                }
            }
        });
    }
}
