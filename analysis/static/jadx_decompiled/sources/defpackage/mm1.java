package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mm1 extends ConstraintLayout implements pv3, bk1, zj1, g1b {
    public final no1 G0;
    public final je7 H0;
    public final je7 I0;
    public b J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public PointF O0;
    public final ViewStub P0;
    public final ViewStub Q0;
    public ugf R0;
    public qv3 S0;
    public final je7 T0;
    public fm1 U0;
    public zx7 V0;
    public qma W0;
    public boolean X0;
    public km1 Y0;
    public j1b Z0;

    public mm1(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H0 = zi1.a.c();
        this.I0 = tu0.r(3, new hm1(this, 4));
        final int i = 0;
        this.K0 = tu0.r(3, new k56() { // from class: jm1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return mm1.x(context, this);
                    default:
                        xg1 xg1Var = new xg1(context);
                        xg1Var.setPipTheme(qp4.u0.p(xg1Var).c);
                        xg1Var.setPipMode(ug1.b);
                        xg1Var.setId(View.generateViewId());
                        mm1 mm1Var = this;
                        xg1Var.setListener(new rxd(6, mm1Var));
                        xg1Var.setVisibility(8);
                        xg1Var.setVideoLayoutUpdatesControllerProvider(new hm1(mm1Var, 3));
                        return xg1Var;
                }
            }
        });
        final int i2 = 1;
        this.L0 = tu0.r(3, new k56() { // from class: jm1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return mm1.x(context, this);
                    default:
                        xg1 xg1Var = new xg1(context);
                        xg1Var.setPipTheme(qp4.u0.p(xg1Var).c);
                        xg1Var.setPipMode(ug1.b);
                        xg1Var.setId(View.generateViewId());
                        mm1 mm1Var = this;
                        xg1Var.setListener(new rxd(6, mm1Var));
                        xg1Var.setVisibility(8);
                        xg1Var.setVideoLayoutUpdatesControllerProvider(new hm1(mm1Var, 3));
                        return xg1Var;
                }
            }
        });
        this.M0 = tu0.r(3, new a5(context, 11));
        this.N0 = tu0.r(3, new a5(context, 12));
        this.T0 = tu0.r(3, new dk1(9));
        setLayoutParams(new ti3(-1, -1));
        no1 no1Var = new no1(context, null);
        no1Var.setId(rvb.call_user_full_avatar);
        no1Var.setVideoLayoutUpdatesControllerProvider(new hm1(this, 5));
        this.G0 = no1Var;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(rvb.call_speaker_opponents_view);
        this.P0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(y7a.N1);
        this.Q0 = viewStub2;
        addView(no1Var, -1, -1);
        addView(viewStub2);
        addView(viewStub);
        addView(getBottomSpaceView());
        addView(getTopSpaceView());
        dj3 dj3VarQ = fp3.q(this);
        int id = getTopSpaceView().getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = viewStub2.getId();
        dj3VarQ.d(id2, 7, 0, 7);
        au1.p(16, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id2, 4));
        dj3VarQ.d(id2, 4, 0, 4);
        int id3 = no1Var.getId();
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        dj3VarQ.d(id4, 4, getBottomSpaceView().getId(), 3);
        au1.p(4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 4, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        dj3VarQ.d(id4, 7, 0, 7);
        int id5 = getBottomSpaceView().getId();
        dj3VarQ.d(id5, 4, 0, 4);
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.d(id5, 7, 0, 7);
        dj3VarQ.a(this);
    }

    public static void A(mm1 mm1Var, List list) {
        mm1Var.getOpponentsAdapter().E(list);
    }

    public static void B(mm1 mm1Var) {
        mm1Var.D(mm1Var.getMarginTop());
        mm1Var.u(mm1Var.getMarginBottom());
    }

    private final Space getBottomSpaceView() {
        return (Space) this.N0.getValue();
    }

    private final xg1 getFakePipView() {
        return (xg1) this.L0.getValue();
    }

    private final ov3 getMarginBottom() {
        ov3 ov3Var;
        ov3 ov3Var2 = ov3.d;
        qv3 qv3Var = this.S0;
        return (qv3Var == null || (ov3Var = ((uv3) qv3Var).k) == null) ? ov3Var2 : ov3Var;
    }

    private final ov3 getMarginTop() {
        ov3 ov3Var;
        ov3 ov3Var2 = ov3.d;
        qv3 qv3Var = this.S0;
        return (qv3Var == null || (ov3Var = ((uv3) qv3Var).j) == null) ? ov3Var2 : ov3Var;
    }

    private final af1 getOpponentsAdapter() {
        return (af1) this.I0.getValue();
    }

    private final RecyclerView getOpponentsView() {
        return (RecyclerView) this.K0.getValue();
    }

    private final m1b getPipAnimation() {
        return (m1b) this.T0.getValue();
    }

    private final aa1 getPipPositionMediator() {
        return (aa1) this.H0.getValue();
    }

    private final Space getTopSpaceView() {
        return (Space) this.M0.getValue();
    }

    private final void setMainSpeaker(zx7 zx7Var) {
        ko1 ko1Var;
        gg1 gg1Var;
        fm1 fm1Var;
        zx7 zx7Var2 = this.V0;
        boolean z = !tpa.f(zx7Var2 != null ? zx7Var2.h : null, zx7Var != null ? zx7Var.h : null);
        this.V0 = zx7Var;
        if (zx7Var == null) {
            ko1Var = ko1.o;
        } else {
            boolean z2 = zx7Var.e;
            ko1Var = !z2 ? ko1.b : (zx7Var.f && z2 && zx7Var.g) ? ko1.c : ko1.a;
        }
        no1 no1Var = this.G0;
        no1Var.setBackgroundState(ko1Var);
        boolean z3 = zx7Var != null && zx7Var.g && zx7Var.e && !zx7Var.f;
        s5a s5aVar = no1Var.G0;
        if (ft.l(s5aVar)) {
            no1Var.S(z3 ? 128 : 255, false);
        }
        no1Var.setRaiseHand(zx7Var != null ? zx7Var.j : false);
        md0 md0Var = zx7Var != null ? zx7Var.a : null;
        s5a.h(s5aVar, md0Var != null ? md0Var.b : null, md0Var != null ? md0Var.a : null);
        s5aVar.setCustomOverlay(null);
        no1Var.O(zx7Var != null ? zx7Var.d : false);
        no1Var.T(zx7Var != null ? zx7Var.h : null);
        no1Var.P(zx7Var != null ? zx7Var.m : null, zx7Var != null ? zx7Var.l : null);
        if (zx7Var == null || (gg1Var = zx7Var.c) == null) {
            gg1Var = gg1.c;
        }
        no1Var.setParticipantId(gg1Var);
        if (z && (fm1Var = this.U0) != null) {
            haf hafVar = zx7Var != null ? zx7Var.h : null;
            gm1 gm1Var = (gm1) fm1Var;
            if (!tpa.f(gm1Var.b, hafVar)) {
                gm1Var.b = hafVar;
                Iterator it = gm1Var.a.iterator();
                while (it.hasNext()) {
                    ((em1) it.next()).p();
                }
            }
        }
        I(this.X0, null);
    }

    public static void w(mm1 mm1Var, zx7 zx7Var) {
        mm1Var.setMainSpeaker(zx7Var);
    }

    public static RecyclerView x(Context context, mm1 mm1Var) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(rvb.call_speaker_opponents_view);
        recyclerView.setAdapter(mm1Var.getOpponentsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.j(new d71(tu0.G(4 * fk4.d().getDisplayMetrics().density), 1));
        recyclerView.setLayoutParams(new ti3(-1, -2));
        b bVar = mm1Var.J0;
        if (bVar != null) {
            recyclerView.setRecycledViewPool(bVar);
        }
        return recyclerView;
    }

    public static void y(boolean z, mm1 mm1Var, List list) {
        if (z) {
            mm1Var.getOpponentsAdapter().E(list);
        } else {
            mm1Var.getOpponentsView().post(new c(mm1Var, 17, list));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.xg1 r4, android.graphics.PointF r5) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.graphics.PointF r0 = defpackage.dy7.y(r0)
            ov3 r1 = r3.getMarginBottom()
            int r1 = r1.b()
            if (r1 != 0) goto L18
            if (r5 != 0) goto L15
            r5 = r0
        L15:
            r3.O0 = r5
            return
        L18:
            r1 = 0
            r3.O0 = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r0.x
            float r0 = r0.y
            ov3 r3 = r3.getMarginBottom()
            int r3 = r3.a
            float r3 = (float) r3
            float r0 = r0 - r3
            r1.<init>(r2, r0)
            if (r5 == 0) goto L55
            float r3 = r5.x
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L36
            goto L3c
        L36:
            float r3 = r5.y
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L3e
        L3c:
            r3 = 1
            goto L3f
        L3e:
            r3 = 0
        L3f:
            if (r3 == 0) goto L42
            goto L55
        L42:
            float r3 = r5.y
            float r0 = r1.y
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L56
            android.graphics.PointF r3 = new android.graphics.PointF
            float r5 = r5.x
            float r0 = r1.y
            r3.<init>(r5, r0)
            r5 = r3
            goto L56
        L55:
            r5 = r1
        L56:
            r4.setStartPosition(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm1.C(xg1, android.graphics.PointF):void");
    }

    @Override // defpackage.pv3
    public final void D(ov3 ov3Var) {
        dy7.L(getTopSpaceView(), ov3Var.b());
        this.G0.D(ov3Var);
    }

    public final void E(j1b j1bVar) {
        this.Z0 = j1bVar;
        if (br7.G(this.Q0)) {
            getFakePipView().setBoundariesOffset(j1bVar);
        }
    }

    public final void F(zx7 zx7Var, qma qmaVar) {
        qma qmaVar2 = this.W0;
        boolean z = (qmaVar2 == null || qmaVar == null || tpa.f(qmaVar2.c, qmaVar.c)) ? false : true;
        if (!br7.G(this.Q0) || !z) {
            setMainSpeaker(zx7Var);
            G(qmaVar);
            return;
        }
        G(qmaVar);
        m1b pipAnimation = getPipAnimation();
        xg1 fakePipView = getFakePipView();
        x2 x2Var = new x2(this, 15, zx7Var);
        pipAnimation.getClass();
        no1 no1Var = this.G0;
        a81 a81Var = new a81(x2Var, pipAnimation, no1Var, 7);
        RectF rectF = new RectF(no1Var.getX(), no1Var.getY(), no1Var.getX() + no1Var.getMeasuredWidth(), no1Var.getY() + no1Var.getMeasuredHeight());
        RectF rectF2 = new RectF(fakePipView.getX(), fakePipView.getY(), fakePipView.getX() + fakePipView.getMeasuredWidth(), fakePipView.getY() + fakePipView.getMeasuredHeight());
        float fWidth = rectF2.width() / rectF.width();
        float fHeight = rectF2.height() / rectF.height();
        no1Var.setPivotX(rectF.top);
        no1Var.setPivotY(rectF.left);
        if (m1b.b()) {
            no1Var.setLayerType(2, null);
            fakePipView.setLayerType(2, null);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(no1Var, (Property<no1, Float>) View.X, rectF.left, rectF2.left);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(no1Var, (Property<no1, Float>) View.Y, rectF.top, rectF2.top);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(no1Var, (Property<no1, Float>) View.SCALE_X, 1.0f, fWidth);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(no1Var, (Property<no1, Float>) View.SCALE_Y, 1.0f, fHeight);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fk4.d().getDisplayMetrics().density * 16.0f);
        valueAnimatorOfFloat.addUpdateListener(new zf(no1Var, 3));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfFloat, ObjectAnimator.ofFloat(fakePipView, (Property<xg1, Float>) View.ALPHA, 1.0f, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new l1b(pipAnimation, no1Var, fakePipView, rectF, a81Var));
        animatorSet.start();
    }

    public final void G(qma qmaVar) {
        boolean z;
        ViewStub viewStub = this.Q0;
        if ((qmaVar != null || br7.G(viewStub)) && !tpa.f(this.W0, qmaVar)) {
            this.W0 = qmaVar;
            xg1 fakePipView = getFakePipView();
            if (br7.G(viewStub)) {
                z = false;
            } else {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = fakePipView.getLayoutParams().height;
                layoutParams.width = fakePipView.getLayoutParams().width;
                fakePipView.setId(viewStub.getId());
                viewGroup.addView(fakePipView, iIndexOfChild, layoutParams);
                xg1 fakePipView2 = getFakePipView();
                ba1 ba1Var = (ba1) getPipPositionMediator();
                ba1Var.getClass();
                PointF pointF = ba1Var.b;
                C(fakePipView2, new PointF(pointF.x, pointF.y));
                j1b j1bVar = this.Z0;
                if (j1bVar != null) {
                    getFakePipView().setBoundariesOffset(j1bVar);
                }
                z = true;
            }
            if (qmaVar != null) {
                getFakePipView().d(qmaVar);
            }
            ft.g(getFakePipView(), qmaVar != null, z ? 0L : 150L, null, 4);
        }
    }

    @Override // defpackage.pv3
    public final List H(nv3 nv3Var, nv3 nv3Var2) {
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(z7.u(getTopSpaceView(), nv3Var, null, 2));
        kl7VarL.add(z7.u(getBottomSpaceView(), null, nv3Var2, 1));
        if (br7.G(this.P0)) {
            kl7VarL.add(z7.o(getOpponentsView(), nv3Var2.a));
        }
        kl7VarL.addAll(this.G0.H(nv3Var, nv3Var2));
        return j1e.d(kl7VarL);
    }

    public final void I(boolean z, m56 m56Var) {
        ov3 ov3Var;
        if (br7.G(this.P0)) {
            qv3 qv3Var = this.S0;
            if (qv3Var != null && (ov3Var = ((uv3) qv3Var).k) != null && !ov3Var.c) {
                z = false;
            }
            ft.g(getOpponentsView(), z, 0L, m56Var, 2);
        }
    }

    @Override // defpackage.bk1
    public final void a(boolean z) {
        if (z) {
            this.G0.a(z);
        }
    }

    @Override // defpackage.zj1
    public final void d(RectF rectF, boolean z) {
        if (ft.q(this, z)) {
            float f = rectF.left;
            no1 no1Var = this.G0;
            no1Var.setX(f);
            no1Var.setY(rectF.top);
            no1Var.setPivotX(0.0f);
            no1Var.setPivotY(0.0f);
            no1Var.setScaleX(rectF.width() / no1Var.getWidth());
            no1Var.setScaleY(rectF.height() / no1Var.getHeight());
        }
    }

    @Override // defpackage.zj1
    public final void e(boolean z) {
        if (br7.G(this.Q0)) {
            xg1 fakePipView = getFakePipView();
            if (ft.q(fakePipView, z) && getShouldScaleMainOpponent()) {
                fakePipView.setAlpha(0.0f);
            }
        }
    }

    @Override // defpackage.zj1
    public final void f(kl7 kl7Var, boolean z, long j) {
        this.G0.f(kl7Var, z, j);
    }

    public boolean getShouldScaleMainOpponent() {
        haf hafVar;
        haf hafVar2;
        zx7 zx7Var = this.V0;
        qma qmaVar = this.W0;
        boolean z = (zx7Var == null || (hafVar2 = zx7Var.h) == null || !hafVar2.c) ? false : true;
        boolean z2 = (qmaVar == null || (hafVar = qmaVar.g) == null || !hafVar.c) ? false : true;
        if (zx7Var == null || zx7Var.i || !z) {
            if (qmaVar != null && !qmaVar.i && z2) {
                return false;
            }
            if (zx7Var == null || !zx7Var.i || !z) {
                if (qmaVar == null) {
                    return false;
                }
                boolean z3 = qmaVar.i;
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bk1
    public final void h(kl7 kl7Var, boolean z, long j) {
        this.G0.h(kl7Var, z, j);
    }

    @Override // defpackage.zj1
    public final void o(boolean z) {
        if (z) {
            no1 no1Var = this.G0;
            no1Var.o(z);
            no1Var.setX(0.0f);
            no1Var.setY(0.0f);
            no1Var.setPivotX(0.0f);
            no1Var.setPivotY(0.0f);
            no1Var.setScaleX(1.0f);
            no1Var.setScaleY(1.0f);
            if (br7.G(this.Q0)) {
                getFakePipView().setAlpha(1.0f);
            }
        }
    }

    public final void setCallSpeakerMediator(fm1 fm1Var) {
        this.U0 = fm1Var;
    }

    public final void setControlsMediator(qv3 qv3Var) {
        this.S0 = qv3Var;
        this.G0.setControlsMediator(qv3Var);
    }

    public final void setListener(km1 km1Var) {
        this.Y0 = km1Var;
        this.G0.setListener(km1Var);
    }

    public final void setOpponents(List<sma> list) {
        sma smaVar = (sma) x53.i0(list);
        List list2 = smaVar != null ? smaVar.c : null;
        if (list2 == null) {
            list2 = nz4.a;
        }
        boolean zIsEmpty = list2.isEmpty();
        ViewStub viewStub = this.P0;
        if (!zIsEmpty || br7.G(viewStub)) {
            br7.F(viewStub, getOpponentsView(), new hm1(this, 0));
            boolean z = !list2.isEmpty();
            boolean z2 = getOpponentsView().getVisibility() == 0;
            this.X0 = z;
            I(z, new im1(z2, this, list2));
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        if (br7.G(this.P0)) {
            getOpponentsView().setRecycledViewPool(bVar);
        }
        this.J0 = bVar;
    }

    public final void setStatus(CharSequence charSequence) {
        this.G0.setStatus(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setName(charSequence);
    }

    public final void setVideoLayoutUpdatesController(ugf ugfVar) {
        this.R0 = ugfVar;
    }

    @Override // defpackage.pv3
    public final void u(ov3 ov3Var) {
        dy7.K(getBottomSpaceView(), ov3Var.b());
        if (br7.G(this.Q0) && this.O0 != null) {
            C(getFakePipView(), this.O0);
        }
        this.G0.getClass();
    }
}
