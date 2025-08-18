package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* loaded from: classes.dex */
public final class p11 extends ConstraintLayout {
    public static final /* synthetic */ int Y0 = 0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final knc J0;
    public final knc K0;
    public final knc L0;
    public final knc M0;
    public final knc N0;
    public final knc O0;
    public o11 P0;
    public m38 Q0;
    public m38 R0;
    public m38 S0;
    public m38 T0;
    public ywe U0;
    public ywe V0;
    public a51 W0;
    public int X0;

    public p11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new k11(0));
        int iG = tu0.G(fk4.c() * 48);
        this.H0 = tu0.r(3, new l11(this, 2));
        this.I0 = tu0.r(3, new a5(context, 6));
        knc kncVar = new knc(context, null);
        kncVar.setId(rvb.call_dinamic);
        kncVar.setLayoutParams(new ti3(-2, -2));
        final int i = 0;
        kncVar.setListener(new hnc(this) { // from class: n11
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                o11 o11Var3;
                m38 m38Var = m38.a;
                m38 m38Var2 = m38.c;
                m38 m38Var3 = m38.o;
                m38 m38Var4 = m38.X;
                m38 m38Var5 = m38.b;
                p11 p11Var = this.b;
                switch (i) {
                    case 0:
                        p11.w(p11Var);
                        return;
                    case 1:
                        m38 m38Var6 = p11Var.Q0;
                        if (m38Var6 == null || (o11Var = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 2:
                        m38 m38Var7 = p11Var.T0;
                        if (m38Var7 == null || (o11Var2 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 3:
                        o11 o11Var4 = p11Var.P0;
                        if (o11Var4 != null) {
                            bc7[] bc7VarArr3 = CallBottomPanelWidget.s0;
                            pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, hj1.D);
                            return;
                        }
                        return;
                    case 4:
                        m38 m38Var8 = p11Var.R0;
                        if (m38Var8 == null || (o11Var3 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal3 = m38Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal3 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr4 = CallBottomPanelWidget.s0;
                        h21 h21VarN0 = ((CallBottomPanelWidget) ((sy4) o11Var3).b).n0();
                        h21VarN0.getClass();
                        boolean z = m38Var == m38Var5;
                        bt1 bt1Var = (bt1) h21VarN0.Y.getValue();
                        bt1Var.getClass();
                        bt1.c(bt1Var, "HAND_RAISED", null, null, Long.valueOf(z ? 1L : 0L), null, null, false, 118);
                        yz0 yz0Var = (yz0) h21VarN0.r().l;
                        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                        if (participantStatesManagerF != null) {
                            participantStatesManagerF.setOwnHandRaised(z);
                        }
                        yz0Var.x0.set(z);
                        return;
                    default:
                        o11 o11Var5 = p11Var.P0;
                        if (o11Var5 != null) {
                            ((sy4) o11Var5).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar.setImageSize(new gnc(iG, iG));
        kncVar.setButtonPadding(tu0.F(fk4.c() * 3.5d));
        this.J0 = kncVar;
        knc kncVar2 = new knc(context, null);
        kncVar2.setId(rvb.call_microphone);
        kncVar2.setLayoutParams(new ti3(-2, -2));
        final int i2 = 1;
        kncVar2.setListener(new hnc(this) { // from class: n11
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                o11 o11Var3;
                m38 m38Var = m38.a;
                m38 m38Var2 = m38.c;
                m38 m38Var3 = m38.o;
                m38 m38Var4 = m38.X;
                m38 m38Var5 = m38.b;
                p11 p11Var = this.b;
                switch (i2) {
                    case 0:
                        p11.w(p11Var);
                        return;
                    case 1:
                        m38 m38Var6 = p11Var.Q0;
                        if (m38Var6 == null || (o11Var = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 2:
                        m38 m38Var7 = p11Var.T0;
                        if (m38Var7 == null || (o11Var2 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 3:
                        o11 o11Var4 = p11Var.P0;
                        if (o11Var4 != null) {
                            bc7[] bc7VarArr3 = CallBottomPanelWidget.s0;
                            pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, hj1.D);
                            return;
                        }
                        return;
                    case 4:
                        m38 m38Var8 = p11Var.R0;
                        if (m38Var8 == null || (o11Var3 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal3 = m38Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal3 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr4 = CallBottomPanelWidget.s0;
                        h21 h21VarN0 = ((CallBottomPanelWidget) ((sy4) o11Var3).b).n0();
                        h21VarN0.getClass();
                        boolean z = m38Var == m38Var5;
                        bt1 bt1Var = (bt1) h21VarN0.Y.getValue();
                        bt1Var.getClass();
                        bt1.c(bt1Var, "HAND_RAISED", null, null, Long.valueOf(z ? 1L : 0L), null, null, false, 118);
                        yz0 yz0Var = (yz0) h21VarN0.r().l;
                        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                        if (participantStatesManagerF != null) {
                            participantStatesManagerF.setOwnHandRaised(z);
                        }
                        yz0Var.x0.set(z);
                        return;
                    default:
                        o11 o11Var5 = p11Var.P0;
                        if (o11Var5 != null) {
                            ((sy4) o11Var5).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar2.setImageSize(new gnc(iG, iG));
        kncVar2.setButtonPadding(tu0.F(fk4.c() * 3.5d));
        this.K0 = kncVar2;
        knc kncVar3 = new knc(context, null);
        kncVar3.setId(rvb.call_video);
        kncVar3.setLayoutParams(new ti3(-2, -2));
        knc.B(kncVar3, woc.S0);
        final int i3 = 2;
        kncVar3.setListener(new hnc(this) { // from class: n11
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                o11 o11Var3;
                m38 m38Var = m38.a;
                m38 m38Var2 = m38.c;
                m38 m38Var3 = m38.o;
                m38 m38Var4 = m38.X;
                m38 m38Var5 = m38.b;
                p11 p11Var = this.b;
                switch (i3) {
                    case 0:
                        p11.w(p11Var);
                        return;
                    case 1:
                        m38 m38Var6 = p11Var.Q0;
                        if (m38Var6 == null || (o11Var = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 2:
                        m38 m38Var7 = p11Var.T0;
                        if (m38Var7 == null || (o11Var2 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 3:
                        o11 o11Var4 = p11Var.P0;
                        if (o11Var4 != null) {
                            bc7[] bc7VarArr3 = CallBottomPanelWidget.s0;
                            pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, hj1.D);
                            return;
                        }
                        return;
                    case 4:
                        m38 m38Var8 = p11Var.R0;
                        if (m38Var8 == null || (o11Var3 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal3 = m38Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal3 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr4 = CallBottomPanelWidget.s0;
                        h21 h21VarN0 = ((CallBottomPanelWidget) ((sy4) o11Var3).b).n0();
                        h21VarN0.getClass();
                        boolean z = m38Var == m38Var5;
                        bt1 bt1Var = (bt1) h21VarN0.Y.getValue();
                        bt1Var.getClass();
                        bt1.c(bt1Var, "HAND_RAISED", null, null, Long.valueOf(z ? 1L : 0L), null, null, false, 118);
                        yz0 yz0Var = (yz0) h21VarN0.r().l;
                        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                        if (participantStatesManagerF != null) {
                            participantStatesManagerF.setOwnHandRaised(z);
                        }
                        yz0Var.x0.set(z);
                        return;
                    default:
                        o11 o11Var5 = p11Var.P0;
                        if (o11Var5 != null) {
                            ((sy4) o11Var5).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar3.setImageSize(new gnc(iG, iG));
        kncVar3.setButtonPadding(tu0.F(fk4.c() * 3.5d));
        this.L0 = kncVar3;
        knc kncVar4 = new knc(context, null);
        kncVar4.setId(y7a.p);
        kncVar4.setLayoutParams(new ti3(-2, -2));
        knc.B(kncVar4, x7a.W);
        final int i4 = 3;
        kncVar4.setListener(new hnc(this) { // from class: n11
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                o11 o11Var3;
                m38 m38Var = m38.a;
                m38 m38Var2 = m38.c;
                m38 m38Var3 = m38.o;
                m38 m38Var4 = m38.X;
                m38 m38Var5 = m38.b;
                p11 p11Var = this.b;
                switch (i4) {
                    case 0:
                        p11.w(p11Var);
                        return;
                    case 1:
                        m38 m38Var6 = p11Var.Q0;
                        if (m38Var6 == null || (o11Var = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 2:
                        m38 m38Var7 = p11Var.T0;
                        if (m38Var7 == null || (o11Var2 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 3:
                        o11 o11Var4 = p11Var.P0;
                        if (o11Var4 != null) {
                            bc7[] bc7VarArr3 = CallBottomPanelWidget.s0;
                            pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, hj1.D);
                            return;
                        }
                        return;
                    case 4:
                        m38 m38Var8 = p11Var.R0;
                        if (m38Var8 == null || (o11Var3 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal3 = m38Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal3 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr4 = CallBottomPanelWidget.s0;
                        h21 h21VarN0 = ((CallBottomPanelWidget) ((sy4) o11Var3).b).n0();
                        h21VarN0.getClass();
                        boolean z = m38Var == m38Var5;
                        bt1 bt1Var = (bt1) h21VarN0.Y.getValue();
                        bt1Var.getClass();
                        bt1.c(bt1Var, "HAND_RAISED", null, null, Long.valueOf(z ? 1L : 0L), null, null, false, 118);
                        yz0 yz0Var = (yz0) h21VarN0.r().l;
                        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                        if (participantStatesManagerF != null) {
                            participantStatesManagerF.setOwnHandRaised(z);
                        }
                        yz0Var.x0.set(z);
                        return;
                    default:
                        o11 o11Var5 = p11Var.P0;
                        if (o11Var5 != null) {
                            ((sy4) o11Var5).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar4.setImageSize(new gnc(iG, iG));
        kncVar4.setButtonPadding(tu0.F(fk4.c() * 3.5d));
        this.M0 = kncVar4;
        knc kncVar5 = new knc(context, null);
        kncVar5.setId(y7a.s0);
        kncVar5.setLayoutParams(new ti3(-2, -2));
        knc.B(kncVar5, x7a.K);
        final int i5 = 4;
        kncVar5.setListener(new hnc(this) { // from class: n11
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                o11 o11Var3;
                m38 m38Var = m38.a;
                m38 m38Var2 = m38.c;
                m38 m38Var3 = m38.o;
                m38 m38Var4 = m38.X;
                m38 m38Var5 = m38.b;
                p11 p11Var = this.b;
                switch (i5) {
                    case 0:
                        p11.w(p11Var);
                        return;
                    case 1:
                        m38 m38Var6 = p11Var.Q0;
                        if (m38Var6 == null || (o11Var = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 2:
                        m38 m38Var7 = p11Var.T0;
                        if (m38Var7 == null || (o11Var2 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 3:
                        o11 o11Var4 = p11Var.P0;
                        if (o11Var4 != null) {
                            bc7[] bc7VarArr3 = CallBottomPanelWidget.s0;
                            pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, hj1.D);
                            return;
                        }
                        return;
                    case 4:
                        m38 m38Var8 = p11Var.R0;
                        if (m38Var8 == null || (o11Var3 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal3 = m38Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal3 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr4 = CallBottomPanelWidget.s0;
                        h21 h21VarN0 = ((CallBottomPanelWidget) ((sy4) o11Var3).b).n0();
                        h21VarN0.getClass();
                        boolean z = m38Var == m38Var5;
                        bt1 bt1Var = (bt1) h21VarN0.Y.getValue();
                        bt1Var.getClass();
                        bt1.c(bt1Var, "HAND_RAISED", null, null, Long.valueOf(z ? 1L : 0L), null, null, false, 118);
                        yz0 yz0Var = (yz0) h21VarN0.r().l;
                        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                        if (participantStatesManagerF != null) {
                            participantStatesManagerF.setOwnHandRaised(z);
                        }
                        yz0Var.x0.set(z);
                        return;
                    default:
                        o11 o11Var5 = p11Var.P0;
                        if (o11Var5 != null) {
                            ((sy4) o11Var5).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar5.setImageSize(new gnc(iG, iG));
        kncVar5.setButtonPadding(tu0.F(fk4.c() * 3.5d));
        this.N0 = kncVar5;
        knc kncVar6 = new knc(context, null);
        kncVar6.setId(rvb.call_cancel);
        kncVar6.setLayoutParams(new ti3(-2, -2));
        knc.B(kncVar6, x7a.d0);
        kncVar6.setAccessibility(Integer.valueOf(f0c.call_cancel_accessibility));
        final int i6 = 5;
        kncVar6.setListener(new hnc(this) { // from class: n11
            public final /* synthetic */ p11 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                o11 o11Var;
                o11 o11Var2;
                o11 o11Var3;
                m38 m38Var = m38.a;
                m38 m38Var2 = m38.c;
                m38 m38Var3 = m38.o;
                m38 m38Var4 = m38.X;
                m38 m38Var5 = m38.b;
                p11 p11Var = this.b;
                switch (i6) {
                    case 0:
                        p11.w(p11Var);
                        return;
                    case 1:
                        m38 m38Var6 = p11Var.Q0;
                        if (m38Var6 == null || (o11Var = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal = m38Var6.ordinal();
                        if (iOrdinal == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().s(m38Var);
                        return;
                    case 2:
                        m38 m38Var7 = p11Var.T0;
                        if (m38Var7 == null || (o11Var2 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal2 = m38Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal2 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
                        ((CallBottomPanelWidget) ((sy4) o11Var2).b).n0().u(m38Var);
                        return;
                    case 3:
                        o11 o11Var4 = p11Var.P0;
                        if (o11Var4 != null) {
                            bc7[] bc7VarArr3 = CallBottomPanelWidget.s0;
                            pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, hj1.D);
                            return;
                        }
                        return;
                    case 4:
                        m38 m38Var8 = p11Var.R0;
                        if (m38Var8 == null || (o11Var3 = p11Var.P0) == null) {
                            return;
                        }
                        int iOrdinal3 = m38Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            m38Var = m38Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                m38Var = m38Var2;
                            } else if (iOrdinal3 == 3) {
                                m38Var = m38Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m38Var = m38Var4;
                            }
                        }
                        bc7[] bc7VarArr4 = CallBottomPanelWidget.s0;
                        h21 h21VarN0 = ((CallBottomPanelWidget) ((sy4) o11Var3).b).n0();
                        h21VarN0.getClass();
                        boolean z = m38Var == m38Var5;
                        bt1 bt1Var = (bt1) h21VarN0.Y.getValue();
                        bt1Var.getClass();
                        bt1.c(bt1Var, "HAND_RAISED", null, null, Long.valueOf(z ? 1L : 0L), null, null, false, 118);
                        yz0 yz0Var = (yz0) h21VarN0.r().l;
                        ParticipantStatesManager participantStatesManagerF = yz0Var.f();
                        if (participantStatesManagerF != null) {
                            participantStatesManagerF.setOwnHandRaised(z);
                        }
                        yz0Var.x0.set(z);
                        return;
                    default:
                        o11 o11Var5 = p11Var.P0;
                        if (o11Var5 != null) {
                            ((sy4) o11Var5).F();
                            return;
                        }
                        return;
                }
            }
        });
        kncVar6.setMode(fnc.c);
        kncVar6.setImageSize(new gnc(iG, iG));
        kncVar6.setButtonPadding(tu0.F(fk4.c() * 3.5d));
        this.O0 = kncVar6;
        ti3 ti3Var = new ti3(0, -2);
        float f = 8;
        ti3Var.setMarginStart(tu0.G(fk4.c() * f));
        ti3Var.setMarginEnd(tu0.G(fk4.c() * f));
        setLayoutParams(ti3Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        setBackground(shapeDrawable);
        setPadding(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f), tu0.G(fk4.c() * f), tu0.G(fk4.c() * 12));
        addView(kncVar);
        addView(kncVar2);
        addView(kncVar3);
        addView(kncVar4);
        addView(kncVar5);
        addView(kncVar6);
        dj3 dj3VarQ = fp3.q(this);
        int id = kncVar.getId();
        dj3VarQ.d(id, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id, 7, kncVar2.getId(), 6);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, kncVar3.getId(), 3);
        dj3VarQ.g(id).d.V = 1;
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
        dj3VarQ.d(id4, 4, 0, 4);
        dj3VarQ.d(id4, 6, kncVar3.getId(), 7);
        dj3VarQ.d(id4, 7, kncVar5.getId(), 6);
        dj3VarQ.d(id4, 3, 0, 3);
        int id5 = kncVar5.getId();
        dj3VarQ.d(id5, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id5, 6, kncVar4.getId(), 7);
        dj3VarQ.d(id5, 7, kncVar6.getId(), 6);
        dj3VarQ.d(id5, 3, kncVar3.getId(), 3);
        int id6 = kncVar6.getId();
        dj3VarQ.d(id6, 4, kncVar3.getId(), 4);
        dj3VarQ.d(id6, 7, 0, 7);
        dj3VarQ.d(id6, 6, kncVar5.getId(), 7);
        dj3VarQ.d(id6, 3, kncVar3.getId(), 3);
        dj3VarQ.a(this);
    }

    public static void A(knc kncVar, int i) {
        ViewGroup.LayoutParams layoutParams = kncVar.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) == i) {
            ViewGroup.LayoutParams layoutParams2 = kncVar.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) == i) {
                return;
            }
        }
        if (kncVar.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams3 = kncVar.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            kncVar.setLayoutParams(marginLayoutParams);
        }
    }

    public static void B(knc kncVar, Drawable drawable, Drawable drawable2, m38 m38Var, jqe jqeVar, jqe jqeVar2) {
        kncVar.setVisibility(m38Var != m38.o ? 0 : 8);
        int iOrdinal = m38Var.ordinal();
        pq9 pq9Var = qp4.u0;
        if (iOrdinal == 0) {
            kncVar.A(drawable2, pq9Var.p(kncVar).c.getIcon().g);
            kncVar.setMode(fnc.o);
            kncVar.setAccessibility(jqeVar2);
            return;
        }
        fnc fncVar = fnc.s0;
        if (iOrdinal == 1) {
            pq9Var.p(kncVar).c.getIcon();
            kncVar.A(drawable, -1);
            kncVar.setMode(fncVar);
            kncVar.setAccessibility(jqeVar);
            return;
        }
        if (iOrdinal == 2) {
            kncVar.A(drawable2, pq9Var.p(kncVar).c.getIcon().g);
            kncVar.setMode(fnc.Y);
            kncVar.setAccessibility(jqeVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            kncVar.A(drawable2, pq9Var.p(kncVar).c.getIcon().c);
            kncVar.setMode(fncVar);
            kncVar.setAccessibility(jqeVar2);
        }
    }

    private final int getActualButtonsMargin() {
        knc kncVar = this.O0;
        int visibility = kncVar.getVisibility();
        knc kncVar2 = this.J0;
        knc kncVar3 = this.K0;
        knc kncVar4 = this.L0;
        knc kncVar5 = this.N0;
        if (visibility == 0 && kncVar5.getVisibility() == 0 && this.M0.getVisibility() == 0 && kncVar4.getVisibility() == 0 && kncVar3.getVisibility() == 0 && kncVar2.getVisibility() == 0) {
            return 0;
        }
        if (kncVar.getVisibility() == 0 && kncVar5.getVisibility() == 0 && kncVar4.getVisibility() == 0 && kncVar3.getVisibility() == 0 && kncVar2.getVisibility() == 0) {
            return tu0.G(fk4.c() * 2);
        }
        return tu0.G(fk4.c() * 4);
    }

    private final float[] getBgRadius() {
        return (float[]) this.G0.getValue();
    }

    private final View getContainer() {
        return (View) this.H0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return tu0.G(fk4.c() * 6) + measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    private final ca9 getMicrophoneOnDrawable() {
        return (ca9) this.I0.getValue();
    }

    public static void w(p11 p11Var) {
        o11 o11Var;
        if (p11Var.W0 == null || (o11Var = p11Var.P0) == null) {
            return;
        }
        ((sy4) o11Var).G(p11Var.getContainer());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I0.a() && this.Q0 == m38.b) {
            getMicrophoneOnDrawable().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.I0.a()) {
            getMicrophoneOnDrawable().stop();
        }
        super.onDetachedFromWindow();
    }

    public final void setAudioInfo(a51 a51Var) {
        if (tpa.f(this.W0, a51Var)) {
            return;
        }
        this.W0 = a51Var;
        int iA = a51Var.a();
        jqe contentDescription = a51Var.getContentDescription();
        Drawable drawableB = kt3.b(getContext(), iA);
        B(this.J0, drawableB, drawableB, a51Var instanceof x41 ? m38.a : m38.b, contentDescription, contentDescription);
    }

    public final void setChatUnreadMessageCount(int i) {
        if (this.X0 == i) {
            return;
        }
        this.X0 = i;
        knc kncVar = this.M0;
        if (kncVar.getVisibility() == 0) {
            kncVar.setCounter(i);
        }
    }

    public final void setClickListener(o11 o11Var) {
        this.P0 = o11Var;
    }

    public final void setMicrophoneEnabled(m38 m38Var) {
        if (this.Q0 == m38Var) {
            return;
        }
        this.Q0 = m38Var;
        B(this.K0, getMicrophoneOnDrawable(), kt3.b(getContext(), x7a.Z), m38Var, new eqe(f0c.call_microphone_enabled_accessibility), new eqe(f0c.call_microphone_disabled_accessibility));
        if (m38Var == m38.b) {
            getMicrophoneOnDrawable().start();
        } else {
            getMicrophoneOnDrawable().stop();
        }
    }

    public final void setOpenChat(m38 m38Var) {
        if (this.S0 == m38Var) {
            return;
        }
        this.S0 = m38Var;
        int i = x7a.W;
        Drawable drawableB = kt3.b(getContext(), i);
        Drawable drawableB2 = kt3.b(getContext(), i);
        int i2 = f0c.call_incoming_open_chat_accessibility;
        B(this.M0, drawableB, drawableB2, m38Var, new eqe(i2), new eqe(i2));
        this.M0.setCounter(this.X0);
        x();
    }

    public final void setRaiseHand(m38 m38Var) {
        m38 m38Var2;
        ywe yweVar;
        m38 m38Var3 = this.R0;
        if (m38Var3 == m38Var) {
            return;
        }
        if (m38Var3 != null && m38Var3 == (m38Var2 = m38.b) && m38Var != m38Var2 && (yweVar = this.V0) != null) {
            yweVar.a();
        }
        this.R0 = m38Var;
        int i = x7a.K;
        Drawable drawableB = kt3.b(getContext(), i);
        Drawable drawableB2 = kt3.b(getContext(), i);
        eqe eqeVar = new eqe(f0c.call_raise_hand_enabled_accessibility);
        eqe eqeVar2 = new eqe(f0c.call_raise_hand_disabled_accessibility);
        int i2 = m38Var != m38.o ? 0 : 8;
        knc kncVar = this.N0;
        kncVar.setVisibility(i2);
        int iOrdinal = m38Var.ordinal();
        fnc fncVar = fnc.s0;
        pq9 pq9Var = qp4.u0;
        if (iOrdinal == 0) {
            pq9Var.p(kncVar).c.getIcon();
            kncVar.A(drawableB2, -1);
            kncVar.setMode(fncVar);
            kncVar.setAccessibility(eqeVar2);
        } else if (iOrdinal == 1) {
            pq9Var.p(kncVar).c.getIcon();
            kncVar.A(drawableB, -1);
            kncVar.setMode(fnc.Z);
            kncVar.setAccessibility(eqeVar);
        } else if (iOrdinal == 2) {
            kncVar.A(drawableB2, pq9Var.p(kncVar).c.getIcon().g);
            kncVar.setMode(fnc.Y);
            kncVar.setAccessibility(eqeVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            kncVar.A(drawableB2, pq9Var.p(kncVar).c.getIcon().c);
            kncVar.setMode(fncVar);
            kncVar.setAccessibility(eqeVar2);
        }
        x();
    }

    public final void setVideoEnabled(m38 m38Var) {
        if (this.T0 == m38Var) {
            return;
        }
        this.T0 = m38Var;
        B(this.L0, kt3.b(getContext(), x7a.E0), kt3.b(getContext(), x7a.C0), m38Var, new eqe(f0c.call_video_enabled_accessibility), new eqe(f0c.call_video_disabled_accessibility));
    }

    public final void setVolumeMicrophone(float f) {
        ca9 microphoneOnDrawable = getMicrophoneOnDrawable();
        microphoneOnDrawable.getClass();
        float fD = ote.d(f, 0.0f, 1.0f);
        if (microphoneOnDrawable.t0 == fD) {
            return;
        }
        microphoneOnDrawable.t0 = fD;
        bg bgVar = microphoneOnDrawable.Y;
        PropertyValuesHolder[] propertyValuesHolderArr = {PropertyValuesHolder.ofFloat(bgVar, bgVar.a, fD)};
        ObjectAnimator objectAnimator = microphoneOnDrawable.Z;
        objectAnimator.setValues(propertyValuesHolderArr);
        objectAnimator.start();
        microphoneOnDrawable.invalidateSelf();
    }

    public final void x() {
        int actualButtonsMargin = getActualButtonsMargin();
        A(this.O0, actualButtonsMargin);
        A(this.N0, actualButtonsMargin);
        A(this.M0, actualButtonsMargin);
        A(this.L0, actualButtonsMargin);
        A(this.K0, actualButtonsMargin);
        A(this.J0, actualButtonsMargin);
    }

    public final ywe y(ywe yweVar, View view, eqe eqeVar, k56 k56Var, Integer num) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Point point = new Point((Integer.valueOf(iArr[0]).intValue() - (view.getWidth() / 2)) - tu0.G(fk4.c() * 12), getContextHeight());
        if (yweVar != null && yweVar.isShowing()) {
            yweVar.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            return yweVar;
        }
        if (yweVar != null) {
            yweVar.dismiss();
        }
        ywe yweVar2 = new ywe(getContext(), view, new l11(this, 1), new k11(1), 0, 0, 96);
        yweVar2.d(eqeVar);
        yweVar2.c(num);
        yweVar2.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        yweVar2.setOnDismissListener(new m11(0, k56Var));
        return yweVar2;
    }
}
