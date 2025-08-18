package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class jv5 extends ppd {
    public final /* synthetic */ int X;
    public Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv5(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.ppd
    /* renamed from: H */
    public void r(hqd hqdVar, int i) {
        switch (this.X) {
            case 0:
                hqdVar.A((ol7) C(i));
                break;
            case 1:
            case 5:
            default:
                super.r(hqdVar, i);
                break;
            case 2:
                K((iq) hqdVar, i);
                break;
            case 3:
                L((g62) hqdVar, i);
                break;
            case 4:
                M((qr3) hqdVar, i);
                break;
            case 6:
                N((gv5) hqdVar, i);
                break;
            case 7:
                O((io6) hqdVar, i);
                break;
            case 8:
                P((fn8) hqdVar, i);
                break;
            case 9:
                ol7 ol7Var = (ol7) this.o.f.get(i);
                if (ol7Var.getI0() != 2 || !(ol7Var instanceof op9)) {
                    if (ol7Var.getI0() == 1 && (ol7Var instanceof qo9)) {
                        to9 to9Var = (to9) hqdVar;
                        qo9 qo9Var = (qo9) ol7Var;
                        om8 om8Var = new om8(1, (gp9) this.Y, gp9.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 7);
                        to9Var.A(qo9Var);
                        tu0.K((OneMeDraweeView) to9Var.a, 300L, new vu5(om8Var, 20, qo9Var));
                        break;
                    }
                } else {
                    ((cmd) ((pp9) hqdVar).a).b.c();
                    break;
                }
                break;
            case 10:
                Q((kgb) hqdVar, i);
                break;
            case 11:
                R((y8c) hqdVar, i);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (!(hqdVar instanceof hed)) {
                    hqdVar.A((ol7) C(i));
                    break;
                } else {
                    hed hedVar = (hed) hqdVar;
                    ol7 ol7Var2 = (ol7) C(i);
                    if (ol7Var2 instanceof wo0) {
                        hedVar.A(ol7Var2);
                        lk3 lk3Var = (lk3) hedVar.a;
                        Integer numValueOf = Integer.valueOf(hha.a);
                        b7a b7aVar = b7a.o;
                        wo0 wo0Var = (wo0) ol7Var2;
                        gaa gaaVar = (gaa) this.Y;
                        lk3.S(lk3Var, numValueOf, b7aVar, new zja(gaaVar, 19, wo0Var), 4);
                        tu0.K(lk3Var, 300L, new v7d(gaaVar, 1, wo0Var));
                        break;
                    }
                }
                break;
            case 13:
                S((ise) hqdVar, i);
                break;
        }
    }

    public qo9 J(int i) {
        ol7 ol7Var = (ol7) C(i);
        if (ol7Var instanceof qo9) {
            return (qo9) ol7Var;
        }
        return null;
    }

    public void K(iq iqVar, int i) {
        eq eqVar = (eq) this.o.f.get(i);
        f fVar = new f(1, (mr) this.Y, mr.class, "onAppearanceModeSelected", "onAppearanceModeSelected(Lone/me/appearancesettings/singletheme/model/AppearanceMode;)V", 0, 1);
        iqVar.A(eqVar);
        tu0.K((gq) iqVar.a, 300L, new hq(fVar, 0, eqVar));
    }

    public void L(g62 g62Var, int i) {
        c62 c62Var = (c62) this.o.f.get(i);
        f fVar = new f(1, (w52) this.Y, w52.class, "onBackgroundSelected", "onBackgroundSelected(Lone/me/appearancesettings/singletheme/model/ChatBackground;)V", 0, 7);
        View view = g62Var.a;
        f62 f62Var = (f62) view;
        f62Var.setBackgroundPreview(c62Var.o);
        Boolean bool = c62Var.a;
        f62Var.setSelected(bool != null ? bool.booleanValue() : false);
        tu0.K((f62) view, 300L, new tb(fVar, 11, c62Var));
    }

    public void M(qr3 qr3Var, int i) {
        pr3 pr3Var = (pr3) ((ol7) C(i));
        e11 e11Var = new e11(0, (nr3) this.Y, nr3.class, "onButtonClick", "onButtonClick()V", 0, 18);
        qr3Var.A(pr3Var);
        qr3Var.F(pr3Var.b, e11Var);
    }

    public void N(gv5 gv5Var, int i) {
        w9f w9fVar = (w9f) ((ol7) C(i));
        v9f v9fVar = v9f.a;
        v9f v9fVar2 = w9fVar.b;
        View view = gv5Var.a;
        if (v9fVar2 == v9fVar) {
            ((TextView) view).setOnClickListener(null);
        } else {
            tu0.K(view, 300L, new ev5((m56) this.Y, w9fVar, 0));
        }
        if (w9fVar.b == v9fVar) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(w9fVar.c.a(gv5Var));
    }

    public void O(io6 io6Var, int i) {
        go6 go6Var = (go6) this.o.f.get(i);
        f fVar = new f(1, (o7d) this.Y, o7d.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0, 25);
        View view = io6Var.a;
        ho6 ho6Var = (ho6) view;
        ho6Var.G0.setText(go6Var.a);
        Boolean bool = go6Var.b;
        ho6Var.setSelected(bool != null ? bool.booleanValue() : false);
        tu0.K((ho6) view, 300L, new vu5(fVar, 6, go6Var));
    }

    public void P(fn8 fn8Var, int i) {
        en8 en8Var = (en8) ((ol7) C(i));
        om8 om8Var = new om8(1, (gn8) this.Y, gn8.class, "onMemberListActionClick", "onMemberListActionClick(I)V", 0, 1);
        fn8Var.A(en8Var);
        tu0.K(fn8Var.a, 300L, new vu5(om8Var, 14, en8Var));
    }

    public void Q(kgb kgbVar, int i) {
        dec decVar;
        efb efbVar = (efb) ((ol7) C(i));
        kgbVar.A(efbVar);
        if (efbVar instanceof zm3) {
            decVar = kgbVar instanceof fq3 ? (fq3) kgbVar : null;
            if (decVar != null) {
                tu0.K(decVar.a, 300L, new xx5(28, this));
                return;
            }
            return;
        }
        if (!(efbVar instanceof x6)) {
            if (efbVar instanceof gh4) {
                decVar = kgbVar instanceof fh4 ? (fh4) kgbVar : null;
                if (decVar != null) {
                    tu0.K(decVar.a, 300L, new m6(8, new lwa(6, this)));
                    return;
                }
                return;
            }
            return;
        }
        decVar = kgbVar instanceof n6 ? (n6) kgbVar : null;
        if (decVar != null) {
            v59 v59Var = new v59(2, (mdb) this.Y, mdb.class, "onChecked", "onChecked(JZ)V", 0, 10);
            om8 om8Var = new om8(1, (mdb) this.Y, mdb.class, "onDisabledClick", "onDisabledClick(J)V", 0, 12);
            View view = decVar.a;
            ((ufd) view).setOnSwitchListener(new qz7(v59Var, 2, om8Var));
            tu0.K(view, 300L, new m6(0, new zja(this, 4, efbVar)));
        }
    }

    public void R(y8c y8cVar, int i) {
        v8c v8cVar = (v8c) ((ol7) C(i));
        om8 om8Var = new om8(1, (zu2) this.Y, zu2.class, "onRecentContactClick", "onRecentContactClick(Lone/me/chats/search/models/RecentContactModel;)V", 0, 14);
        y8cVar.A(v8cVar);
        tu0.K(y8cVar.a, 300L, new vu5(om8Var, 27, v8cVar));
    }

    public void S(ise iseVar, int i) {
        wre wreVar = (wre) this.o.f.get(i);
        om8 om8Var = new om8(1, (cr) this.Y, cr.class, "onThemeSelected", "onThemeSelected(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V", 0, 19);
        View view = iseVar.a;
        zre zreVar = (zre) view;
        zreVar.setThemeName(wreVar.b);
        Drawable drawable = wreVar.o;
        if (drawable != null) {
            zreVar.setBackgroundPattern(drawable);
        }
        tu0.K((zre) view, 300L, new v7d(om8Var, 14, wreVar));
    }

    @Override // defpackage.hl7, defpackage.hdc
    public int j() {
        switch (this.X) {
            case 3:
                return this.o.f.size();
            case 13:
                return this.o.f.size();
            default:
                return super.j();
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public int l(int i) {
        switch (this.X) {
            case 1:
                return ((ol7) C(i)).getI0();
            case 2:
            case 3:
            case 7:
            case 8:
            default:
                return super.l(i);
            case 4:
                return ((pr3) ((ol7) C(i))).c;
            case 5:
                return ((ol7) C(i)).getI0();
            case 6:
                return lw5.$EnumSwitchMapping$0[((w9f) ((ol7) C(i))).b.ordinal()] == 1 ? oba.h : oba.p;
            case 9:
                return ((ol7) this.o.f.get(i)).getI0();
            case 10:
                return ((efb) ((ol7) C(i))).getI0();
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public /* bridge */ /* synthetic */ void r(dec decVar, int i) {
        switch (this.X) {
            case 0:
                r((hqd) decVar, i);
                break;
            case 1:
            case 5:
            default:
                super.r(decVar, i);
                break;
            case 2:
                K((iq) decVar, i);
                break;
            case 3:
                L((g62) decVar, i);
                break;
            case 4:
                M((qr3) decVar, i);
                break;
            case 6:
                N((gv5) decVar, i);
                break;
            case 7:
                O((io6) decVar, i);
                break;
            case 8:
                P((fn8) decVar, i);
                break;
            case 9:
                r((hqd) decVar, i);
                break;
            case 10:
                Q((kgb) decVar, i);
                break;
            case 11:
                R((y8c) decVar, i);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                r((hqd) decVar, i);
                break;
            case 13:
                S((ise) decVar, i);
                break;
        }
    }

    @Override // defpackage.hdc
    public void s(dec decVar, int i, List list) {
        switch (this.X) {
            case 2:
                iq iqVar = (iq) decVar;
                Object objQ0 = x53.q0(list);
                if (objQ0 != null) {
                    if (objQ0 instanceof cq) {
                        gq gqVar = (gq) iqVar.a;
                        Boolean bool = ((cq) objQ0).a;
                        gqVar.setSelected(bool != null ? bool.booleanValue() : false);
                        break;
                    }
                } else {
                    K(iqVar, i);
                    break;
                }
                break;
            case 3:
                g62 g62Var = (g62) decVar;
                Object objQ02 = x53.q0(list);
                if (objQ02 != null) {
                    if (objQ02 instanceof b62) {
                        f62 f62Var = (f62) g62Var.a;
                        Boolean bool2 = ((b62) objQ02).a;
                        f62Var.setSelected(bool2 != null ? bool2.booleanValue() : false);
                        break;
                    }
                } else {
                    L(g62Var, i);
                    break;
                }
                break;
            case 4:
                qr3 qr3Var = (qr3) decVar;
                Object objI0 = x53.i0(list);
                if (objI0 != null) {
                    if (objI0 instanceof or3) {
                        qr3Var.F(((or3) objI0).a, new e11(0, (nr3) this.Y, nr3.class, "onButtonClick", "onButtonClick()V", 0, 19));
                        break;
                    }
                } else {
                    M(qr3Var, i);
                    break;
                }
                break;
            case 7:
                io6 io6Var = (io6) decVar;
                Object objQ03 = x53.q0(list);
                if (objQ03 != null) {
                    if (objQ03 instanceof fo6) {
                        ho6 ho6Var = (ho6) io6Var.a;
                        Boolean bool3 = ((fo6) objQ03).a;
                        ho6Var.setSelected(bool3 != null ? bool3.booleanValue() : false);
                        break;
                    }
                } else {
                    O(io6Var, i);
                    break;
                }
                break;
            case 11:
                y8c y8cVar = (y8c) decVar;
                if (!list.isEmpty()) {
                    for (Object obj : list) {
                        boolean z = obj instanceof r8c;
                        View view = y8cVar.a;
                        if (z) {
                            ((x8c) view).setAvatar(((r8c) obj).h);
                        } else if (obj instanceof q8c) {
                            ((x8c) view).setAbbreviation(oag.a(((q8c) obj).h, Long.valueOf(y8cVar.X)));
                        } else if (obj instanceof s8c) {
                            ((x8c) view).setName(((s8c) obj).h);
                        } else if (obj instanceof u8c) {
                            ((x8c) view).setVerified(((u8c) obj).h);
                        } else if (obj instanceof t8c) {
                            ((x8c) view).setOnline(((t8c) obj).h);
                        }
                    }
                    break;
                } else {
                    R(y8cVar, i);
                    break;
                }
            case 13:
                ise iseVar = (ise) decVar;
                Object objQ04 = x53.q0(list);
                if (objQ04 != null && (objQ04 instanceof ure)) {
                    ((zre) iseVar.a).setSelected(((ure) objQ04).a);
                }
                S(iseVar, i);
                break;
            default:
                super.s(decVar, i, list);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [iv5] */
    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        cm0 cm0Var;
        pq9 pq9Var = qp4.u0;
        int i2 = 3;
        final int i3 = 0;
        final int i4 = 2;
        final int i5 = 1;
        Continuation continuation = null;
        switch (this.X) {
            case 0:
                int i6 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
                if (i == uvb.oneme_folder_widget_view_type) {
                    cm0Var = new cm0(viewGroup.getContext(), new m56(this) { // from class: iv5
                        public final /* synthetic */ jv5 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.m56
                        public final Object invoke(Object obj) {
                            ov5 ov5Var = (ov5) obj;
                            switch (i3) {
                                case 0:
                                    sv5 sv5Var = (sv5) this.b.Y;
                                    if (sv5Var != null) {
                                        ((v02) sv5Var).e(ov5Var);
                                    }
                                    break;
                                case 1:
                                    sv5 sv5Var2 = (sv5) this.b.Y;
                                    if (sv5Var2 != null) {
                                        ((v02) sv5Var2).e(ov5Var);
                                    }
                                    break;
                                default:
                                    sv5 sv5Var3 = (sv5) this.b.Y;
                                    if (sv5Var3 != null) {
                                        ((v02) sv5Var3).e(ov5Var);
                                    }
                                    break;
                            }
                            return e5f.a;
                        }
                    });
                    View view = cm0Var.a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    float f = 128;
                    layoutParams.width = tu0.G(fk4.d().getDisplayMetrics().density * f);
                    layoutParams.height = tu0.G(f * fk4.d().getDisplayMetrics().density);
                    view.setLayoutParams(layoutParams);
                } else if (i == uvb.oneme_big_folder_widget_view_type) {
                    cm0Var = new cm0(viewGroup.getContext(), (iv5) new m56(this) { // from class: iv5
                        public final /* synthetic */ jv5 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.m56
                        public final Object invoke(Object obj) {
                            ov5 ov5Var = (ov5) obj;
                            switch (i5) {
                                case 0:
                                    sv5 sv5Var = (sv5) this.b.Y;
                                    if (sv5Var != null) {
                                        ((v02) sv5Var).e(ov5Var);
                                    }
                                    break;
                                case 1:
                                    sv5 sv5Var2 = (sv5) this.b.Y;
                                    if (sv5Var2 != null) {
                                        ((v02) sv5Var2).e(ov5Var);
                                    }
                                    break;
                                default:
                                    sv5 sv5Var3 = (sv5) this.b.Y;
                                    if (sv5Var3 != null) {
                                        ((v02) sv5Var3).e(ov5Var);
                                    }
                                    break;
                            }
                            return e5f.a;
                        }
                    });
                    int iM = wg0.m(12, fk4.d().getDisplayMetrics().density, 2, i6);
                    View view2 = cm0Var.a;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = iM;
                    layoutParams2.height = tu0.G(128 * fk4.d().getDisplayMetrics().density);
                    view2.setLayoutParams(layoutParams2);
                } else {
                    if (i != uvb.oneme_half_folder_widget_view_type) {
                        throw new IllegalStateException(("Not supported viewType " + i + " for " + jv5.class.getName()).toString());
                    }
                    cm0Var = new cm0(viewGroup.getContext(), new m56(this) { // from class: iv5
                        public final /* synthetic */ jv5 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.m56
                        public final Object invoke(Object obj) {
                            ov5 ov5Var = (ov5) obj;
                            switch (i4) {
                                case 0:
                                    sv5 sv5Var = (sv5) this.b.Y;
                                    if (sv5Var != null) {
                                        ((v02) sv5Var).e(ov5Var);
                                    }
                                    break;
                                case 1:
                                    sv5 sv5Var2 = (sv5) this.b.Y;
                                    if (sv5Var2 != null) {
                                        ((v02) sv5Var2).e(ov5Var);
                                    }
                                    break;
                                default:
                                    sv5 sv5Var3 = (sv5) this.b.Y;
                                    if (sv5Var3 != null) {
                                        ((v02) sv5Var3).e(ov5Var);
                                    }
                                    break;
                            }
                            return e5f.a;
                        }
                    });
                    int iM2 = (wg0.m(12, fk4.d().getDisplayMetrics().density, 2, i6) - tu0.G(8 * fk4.d().getDisplayMetrics().density)) / 2;
                    View view3 = cm0Var.a;
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams3.width = iM2;
                    layoutParams3.height = tu0.G(128 * fk4.d().getDisplayMetrics().density);
                    view3.setLayoutParams(layoutParams3);
                }
                return cm0Var;
            case 1:
                if (i == f4a.a) {
                    return new ze1(new c8a(viewGroup.getContext()), new f(1, (n) this.Y, n.class, "onVersionClick", "onVersionClick(Ljava/lang/String;)V", 0, 0));
                }
                throw new IllegalArgumentException("Not supported viewType for AboutAppAdapter");
            case 2:
                return new iq(new gq(viewGroup.getContext(), null));
            case 3:
                return new g62(new f62(viewGroup.getContext()));
            case 4:
                aba abaVar = new aba(viewGroup.getContext(), null);
                qr3 qr3Var = new qr3(abaVar);
                abaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return qr3Var;
            case 5:
                return i == jca.q ? new b02(viewGroup.getContext(), new fh5(10)) : new mw4(viewGroup.getContext(), (bkg) this.Y);
            case 6:
                int i7 = oba.h;
                v9f v9fVar = v9f.a;
                v9f v9fVar2 = i == i7 ? v9fVar : v9f.b;
                Context context = viewGroup.getContext();
                TextView textView = new TextView(context);
                textView.setLayoutParams(new pdc(-1, -2));
                i4f.j.b(textView, du4.b);
                v3c.y(new fv5(i2, continuation, i3), textView);
                int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                if (v9fVar2 == v9fVar) {
                    textView.setAlpha(0.35f);
                    textView.setEnabled(false);
                    EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, jub.ic_check_filled_24);
                    c54.Z(enhancedVectorDrawable, "circle_background", k7d.h(pq9Var, context).k);
                    textView.setCompoundDrawablePadding(iG);
                    ArrayList arrayList = qqe.a;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(enhancedVectorDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setGravity(16);
                int iG2 = tu0.G(18 * fk4.d().getDisplayMetrics().density);
                textView.setPadding(iG, iG2, iG, iG2);
                return new gv5(textView);
            case 7:
                return new io6(new ho6(viewGroup.getContext()));
            case 8:
                return new fn8(new ufd(viewGroup.getContext(), null));
            case 9:
                if (i == 1) {
                    oo9 oo9Var = new oo9(viewGroup.getContext());
                    float f2 = 64;
                    oo9Var.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                    return new to9(oo9Var);
                }
                if (i != 2) {
                    throw new IllegalStateException(("Such viewType " + i + " is not supported in NeuroAvatarsAdapter").toString());
                }
                cmd cmdVar = new cmd(viewGroup.getContext());
                int iG3 = tu0.G(64 * fk4.d().getDisplayMetrics().density);
                cmdVar.setLayoutParams(new ViewGroup.LayoutParams(iG3, iG3));
                cmdVar.setOutlineProvider(new ix3(iG3));
                cmdVar.setBackgroundColor(pq9Var.j(viewGroup).b().k);
                v3c.y(new y03(iG3, (Continuation) null), cmdVar);
                return new pp9(cmdVar);
            case 10:
                int i8 = 536870911 & i;
                if (dy7.o(i8, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                    return new n6(viewGroup.getContext());
                }
                if (dy7.o(i8, 2048) || dy7.o(i8, 4096)) {
                    return new g2b(viewGroup.getContext(), 1);
                }
                if (dy7.o(i8, 32768)) {
                    lk3 lk3Var = new lk3(viewGroup.getContext(), null);
                    fq3 fq3Var = new fq3(lk3Var);
                    v3c.y(new a93(i2, continuation, i5), lk3Var);
                    return fq3Var;
                }
                if (dy7.o(i8, 128)) {
                    return new fh4(viewGroup.getContext());
                }
                throw new IllegalStateException(("unknown item viewType: " + i).toString());
            case 11:
                return new y8c(new x8c(viewGroup.getContext()));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new hed(new lk3(viewGroup.getContext(), null));
            case 13:
                return new ise(new zre(viewGroup.getContext()));
            default:
                return new vt3(((ThreadsStateViewerScreen) this.Y).getContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv5(Executor executor) {
        super(executor);
        this.X = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv5(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv5(ThreadsStateViewerScreen threadsStateViewerScreen, ExecutorService executorService) {
        super(executorService);
        this.X = 14;
        this.Y = threadsStateViewerScreen;
    }
}
