package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class j11 extends ConstraintLayout {
    public static final /* synthetic */ int S0 = 0;
    public final je7 G0;
    public final je7 H0;
    public final knc I0;
    public final knc J0;
    public final knc K0;
    public final knc L0;
    public o11 M0;
    public m38 N0;
    public m38 O0;
    public a51 P0;
    public ywe Q0;
    public final je7 R0;

    public j11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new m(27));
        this.H0 = tu0.r(3, new m(28));
        this.R0 = tu0.r(3, new h11(this, 0));
        setLayoutParams(new ti3(0, -2));
        View view = new View(context);
        view.setId(rvb.call_bottom_panel_background);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        view.setBackground(shapeDrawable);
        addView(view, -1, tu0.G(76 * fk4.d().getDisplayMetrics().density));
        knc kncVar = new knc(context, null);
        kncVar.setId(rvb.call_dinamic);
        kncVar.setListener(new f9(this, 6, kncVar));
        float f = 50;
        kncVar.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        kncVar.setButtonPadding(tu0.G(3 * fk4.d().getDisplayMetrics().density));
        this.I0 = kncVar;
        addView(kncVar);
        knc kncVar2 = new knc(context, null);
        kncVar2.setId(rvb.call_microphone);
        knc.B(kncVar2, woc.E0);
        final int i = 0;
        kncVar2.setListener(new hnc(this) { // from class: i11
            public final /* synthetic */ j11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                m38 m38Var = m38.b;
                m38 m38Var2 = m38.a;
                m38 m38Var3 = m38.c;
                m38 m38Var4 = m38.o;
                m38 m38Var5 = m38.X;
                j11 j11Var = this.b;
                switch (i) {
                    case 0:
                        m38 m38Var6 = j11Var.N0;
                        if (m38Var6 == null || (o11Var = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 1:
                        m38 m38Var7 = j11Var.O0;
                        if (m38Var7 == null || (o11Var2 = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 2:
                        j11.w(j11Var);
                        return;
                    default:
                        o11 o11Var3 = j11Var.M0;
                        if (o11Var3 != null) {
                            ((sy4) o11Var3).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        float f2 = 4;
        kncVar2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.J0 = kncVar2;
        addView(kncVar2);
        knc kncVar3 = new knc(context, null);
        kncVar3.setId(rvb.call_video);
        knc.B(kncVar3, woc.S0);
        final int i2 = 1;
        kncVar3.setListener(new hnc(this) { // from class: i11
            public final /* synthetic */ j11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                m38 m38Var = m38.b;
                m38 m38Var2 = m38.a;
                m38 m38Var3 = m38.c;
                m38 m38Var4 = m38.o;
                m38 m38Var5 = m38.X;
                j11 j11Var = this.b;
                switch (i2) {
                    case 0:
                        m38 m38Var6 = j11Var.N0;
                        if (m38Var6 == null || (o11Var = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 1:
                        m38 m38Var7 = j11Var.O0;
                        if (m38Var7 == null || (o11Var2 = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 2:
                        j11.w(j11Var);
                        return;
                    default:
                        o11 o11Var3 = j11Var.M0;
                        if (o11Var3 != null) {
                            ((sy4) o11Var3).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar3.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        kncVar3.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.K0 = kncVar3;
        addView(kncVar3);
        knc kncVar4 = new knc(context, null);
        kncVar4.setId(rvb.call_more);
        knc.B(kncVar4, woc.s0);
        kncVar4.setAccessibility(Integer.valueOf(f0c.call_more_accessibility));
        final int i3 = 2;
        kncVar4.setListener(new hnc(this) { // from class: i11
            public final /* synthetic */ j11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                m38 m38Var = m38.b;
                m38 m38Var2 = m38.a;
                m38 m38Var3 = m38.c;
                m38 m38Var4 = m38.o;
                m38 m38Var5 = m38.X;
                j11 j11Var = this.b;
                switch (i3) {
                    case 0:
                        m38 m38Var6 = j11Var.N0;
                        if (m38Var6 == null || (o11Var = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 1:
                        m38 m38Var7 = j11Var.O0;
                        if (m38Var7 == null || (o11Var2 = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 2:
                        j11.w(j11Var);
                        return;
                    default:
                        o11 o11Var3 = j11Var.M0;
                        if (o11Var3 != null) {
                            ((sy4) o11Var3).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar4.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        kncVar4.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.L0 = kncVar4;
        addView(kncVar4);
        knc kncVar5 = new knc(context, null);
        kncVar5.setId(rvb.call_cancel);
        knc.B(kncVar5, woc.K0);
        kncVar5.setAccessibility(Integer.valueOf(f0c.call_cancel_accessibility));
        final int i4 = 3;
        kncVar5.setListener(new hnc(this) { // from class: i11
            public final /* synthetic */ j11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                m38 m38Var = m38.b;
                m38 m38Var2 = m38.a;
                m38 m38Var3 = m38.c;
                m38 m38Var4 = m38.o;
                m38 m38Var5 = m38.X;
                j11 j11Var = this.b;
                switch (i4) {
                    case 0:
                        m38 m38Var6 = j11Var.N0;
                        if (m38Var6 == null || (o11Var = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 1:
                        m38 m38Var7 = j11Var.O0;
                        if (m38Var7 == null || (o11Var2 = j11Var.M0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 2) {
                                m38Var = m38Var3;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var4;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var5;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 2:
                        j11.w(j11Var);
                        return;
                    default:
                        o11 o11Var3 = j11Var.M0;
                        if (o11Var3 != null) {
                            ((sy4) o11Var3).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar5.setMode(fnc.c);
        kncVar5.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        kncVar5.setButtonPadding(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        addView(kncVar5);
        dj3 dj3VarQ = fp3.q(this);
        int id = kncVar.getId();
        dj3VarQ.d(id, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id, 7, kncVar2.getId(), 6);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, kncVar3.getId(), 3);
        int id2 = kncVar2.getId();
        dj3VarQ.d(id2, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id2, 7, kncVar3.getId(), 6);
        dj3VarQ.d(id2, 6, kncVar.getId(), 7);
        dj3VarQ.d(id2, 3, kncVar3.getId(), 3);
        int id3 = kncVar3.getId();
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 7, kncVar4.getId(), 6);
        dj3VarQ.d(id3, 6, kncVar2.getId(), 7);
        int id4 = kncVar4.getId();
        dj3VarQ.d(id4, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id4, 7, kncVar5.getId(), 6);
        dj3VarQ.d(id4, 6, kncVar3.getId(), 7);
        dj3VarQ.d(id4, 3, kncVar3.getId(), 3);
        int id5 = kncVar5.getId();
        dj3VarQ.d(id5, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id5, 7, 0, 7);
        dj3VarQ.d(id5, 6, kncVar4.getId(), 7);
        dj3VarQ.d(id5, 3, kncVar3.getId(), 3);
        int id6 = view.getId();
        dj3VarQ.d(id6, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id6, 7, 0, 7);
        dj3VarQ.d(id6, 6, 0, 6);
        dj3VarQ.d(id6, 3, kncVar3.getId(), 3);
        dj3VarQ.a(this);
    }

    public static void A(knc kncVar, int i, jqe jqeVar) {
        kncVar.y(i, qp4.u0.p(kncVar).c.getIcon().g);
        kncVar.setMode(fnc.o);
        kncVar.setAccessibility(jqeVar);
    }

    public static void F(knc kncVar, int i, int i2, m38 m38Var, jqe jqeVar, jqe jqeVar2) {
        kncVar.setVisibility(m38Var != m38.o ? 0 : 8);
        int iOrdinal = m38Var.ordinal();
        if (iOrdinal == 0) {
            A(kncVar, i2, jqeVar2);
            return;
        }
        if (iOrdinal == 1) {
            x(kncVar, i, jqeVar);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        kncVar.y(i2, qp4.u0.p(kncVar).c.getIcon().c);
        kncVar.setMode(fnc.s0);
        kncVar.setAccessibility(jqeVar2);
    }

    private final float[] getBgRadius() {
        return (float[]) this.G0.getValue();
    }

    private final u31 getCallContextMenuDelegate() {
        return (u31) this.H0.getValue();
    }

    private final View getContainer() {
        return (View) this.R0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return rh4.c(6, fk4.d().getDisplayMetrics().density, measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
    }

    public static void w(j11 j11Var) {
        o11 o11Var = j11Var.M0;
        if (o11Var != null) {
            j11Var.getContainer();
            bc7[] bc7VarArr = CallBottomPanelWidget.s0;
            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((sy4) o11Var).b;
            if (((el1) callBottomPanelWidget.c.getValue()).u()) {
                return;
            }
            r11 r11VarM0 = callBottomPanelWidget.m0();
            el1 el1Var = callBottomPanelWidget.n0().c;
            la1 la1Var = (la1) el1Var.C0.a.getValue();
            boolean z = !la1Var.g;
            m31 m31Var = la1Var.f;
            boolean z2 = (m31Var != null ? m31Var.a : null) != null;
            boolean zA = la1Var.i.a();
            boolean zU = el1Var.u();
            kl7 kl7VarL = j1e.l();
            if (z) {
                kl7VarL.add(new o6());
            }
            if (z2) {
                kl7VarL.add(new r6());
            }
            if (zU) {
                if (zA) {
                    kl7VarL.add(new q6());
                } else {
                    kl7VarL.add(new p6());
                }
            }
            r11VarM0.g(j1e.d(kl7VarL));
        }
    }

    public static void x(knc kncVar, int i, jqe jqeVar) {
        qp4.u0.p(kncVar).c.getIcon();
        kncVar.y(i, -1);
        kncVar.setMode(fnc.s0);
        kncVar.setAccessibility(jqeVar);
    }

    public final void B(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        u31 callContextMenuDelegate = getCallContextMenuDelegate();
        Context context = getContext();
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            a51 a51Var = (a51) next;
            arrayList2.add(new l04(a51Var.getIcon(), i, a51Var.getTitle()));
            i = i2;
        }
        cu3 cu3VarA = callContextMenuDelegate.a(context, arrayList2, new u00(callContextMenuDelegate, this, arrayList, 1));
        int iG = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        int contextHeight = getContextHeight();
        knc kncVar = this.I0;
        cu3VarA.showAtLocation(kncVar, 8388691, iG, contextHeight);
        cu3VarA.setOnDismissListener(new g11(this, 1));
        a51 a51Var2 = this.P0;
        if (a51Var2 != null) {
            if (!(a51Var2 instanceof w41)) {
                A(kncVar, a51Var2.a(), a51Var2.getContentDescription());
            } else {
                w41 w41Var = (w41) a51Var2;
                x(kncVar, w41Var.c, w41Var.f);
            }
        }
    }

    public final void C() {
        eqe eqeVar = new eqe(b8a.W1);
        int i = x7a.X;
        int[] iArr = new int[2];
        knc kncVar = this.J0;
        kncVar.getLocationOnScreen(iArr);
        Point point = new Point(rh4.q(8, fk4.d().getDisplayMetrics().density, Integer.valueOf(iArr[0]).intValue() - (kncVar.getWidth() / 2)), getContextHeight());
        ywe yweVar = this.Q0;
        if (yweVar != null && yweVar.isShowing()) {
            ywe yweVar2 = this.Q0;
            if (yweVar2 != null) {
                yweVar2.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                return;
            }
            return;
        }
        ywe yweVar3 = this.Q0;
        if (yweVar3 != null) {
            yweVar3.dismiss();
        }
        ywe yweVar4 = new ywe(getContext(), kncVar, new h11(this, 1), new m(29), 0, 0, 96);
        yweVar4.d(eqeVar);
        yweVar4.c(Integer.valueOf(i));
        yweVar4.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        yweVar4.setOnDismissListener(new g11(this, 0));
        this.Q0 = yweVar4;
    }

    public final void E(kl7 kl7Var) {
        if (kl7Var.isEmpty()) {
            return;
        }
        u31 callContextMenuDelegate = getCallContextMenuDelegate();
        cu3 cu3VarA = callContextMenuDelegate.a(getContext(), kl7Var, new f9(callContextMenuDelegate, 5, this));
        int contextHeight = getContextHeight();
        knc kncVar = this.L0;
        cu3VarA.showAtLocation(kncVar, 81, 0, contextHeight);
        cu3VarA.setOnDismissListener(new g11(this, 2));
        A(kncVar, woc.s0, new eqe(f0c.call_more_accessibility));
    }

    public final void setAudioInfo(a51 a51Var) {
        if (tpa.f(this.P0, a51Var)) {
            return;
        }
        this.P0 = a51Var;
        int iA = a51Var.a();
        jqe contentDescription = a51Var.getContentDescription();
        F(this.I0, iA, iA, a51Var instanceof w41 ? m38.b : m38.a, contentDescription, contentDescription);
    }

    public final void setClickListener(o11 o11Var) {
        this.M0 = o11Var;
    }

    public final void setMicrophoneEnabled(m38 m38Var) {
        if (this.N0 == m38Var) {
            return;
        }
        this.N0 = m38Var;
        F(this.J0, woc.F0, woc.E0, m38Var, new eqe(f0c.call_microphone_enabled_accessibility), new eqe(f0c.call_microphone_disabled_accessibility));
    }

    public final void setVideoEnabled(m38 m38Var) {
        if (this.O0 == m38Var) {
            return;
        }
        this.O0 = m38Var;
        F(this.K0, woc.T0, woc.S0, m38Var, new eqe(f0c.call_video_enabled_accessibility), new eqe(f0c.call_video_disabled_accessibility));
    }

    public final void y() {
        u31 callContextMenuDelegate = getCallContextMenuDelegate();
        cu3 cu3Var = callContextMenuDelegate.a;
        if (cu3Var != null) {
            cu3Var.dismiss();
        }
        callContextMenuDelegate.a = null;
        ywe yweVar = this.Q0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
    }
}
