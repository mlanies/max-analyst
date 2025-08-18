package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class s5a extends View implements kre {
    public static final /* synthetic */ int K0 = 0;
    public final je7 A0;
    public final je7 B0;
    public k56 C0;
    public k56 D0;
    public boolean E0;
    public tc0 F0;
    public rd0 G0;
    public final wjc H0;
    public final n5 I0;
    public List J0;
    public final String a;
    public final sq4 b;
    public m5a c;
    public int o;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public boolean y0;
    public final je7 z0;

    public s5a(Context context) {
        super(context, null);
        this.a = s5a.class.getName();
        sq4 sq4Var = new sq4(new ma6(getResources()).a());
        umc umcVarE = sq4Var.e();
        if (umcVarE != null) {
            umcVarE.setCallback(this);
        }
        rq4 rq4Var = sq4Var.o;
        rq4Var.getClass();
        ya5 ya5Var = ((la6) rq4Var).e;
        ya5Var.w0 = 50;
        if (ya5Var.v0 == 1) {
            ya5Var.v0 = 0;
        }
        this.b = sq4Var;
        this.c = j5a.a;
        this.o = 1;
        this.v0 = tu0.r(3, new hy4(context, 17));
        this.w0 = tu0.r(3, new hy4(context, 18));
        this.x0 = tu0.r(3, new hy4(context, 19));
        final int i = 0;
        this.z0 = tu0.r(3, new k56(this) { // from class: i5a
            public final /* synthetic */ s5a b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        pq9 pq9Var = qp4.u0;
                        s5a s5aVar = this.b;
                        gradientDrawable.setStroke(iG, pq9Var.j(s5aVar).b().k);
                        gradientDrawable.setColor(pq9Var.j(s5aVar).getIcon().k);
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable;
                    case 1:
                        int i2 = jub.call_fill_16;
                        pq9 pq9Var2 = qp4.u0;
                        s5a s5aVar2 = this.b;
                        pq9Var2.j(s5aVar2).getIcon();
                        Drawable drawableB = kt3.b(s5aVar2.getContext(), i2);
                        ngg.G(drawableB, -1);
                        return drawableB;
                    default:
                        return s5a.a(this.b);
                }
            }
        });
        final int i2 = 1;
        this.A0 = tu0.r(3, new k56(this) { // from class: i5a
            public final /* synthetic */ s5a b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        pq9 pq9Var = qp4.u0;
                        s5a s5aVar = this.b;
                        gradientDrawable.setStroke(iG, pq9Var.j(s5aVar).b().k);
                        gradientDrawable.setColor(pq9Var.j(s5aVar).getIcon().k);
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable;
                    case 1:
                        int i22 = jub.call_fill_16;
                        pq9 pq9Var2 = qp4.u0;
                        s5a s5aVar2 = this.b;
                        pq9Var2.j(s5aVar2).getIcon();
                        Drawable drawableB = kt3.b(s5aVar2.getContext(), i22);
                        ngg.G(drawableB, -1);
                        return drawableB;
                    default:
                        return s5a.a(this.b);
                }
            }
        });
        final int i3 = 2;
        this.B0 = tu0.r(3, new k56(this) { // from class: i5a
            public final /* synthetic */ s5a b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                        pq9 pq9Var = qp4.u0;
                        s5a s5aVar = this.b;
                        gradientDrawable.setStroke(iG, pq9Var.j(s5aVar).b().k);
                        gradientDrawable.setColor(pq9Var.j(s5aVar).getIcon().k);
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable;
                    case 1:
                        int i22 = jub.call_fill_16;
                        pq9 pq9Var2 = qp4.u0;
                        s5a s5aVar2 = this.b;
                        pq9Var2.j(s5aVar2).getIcon();
                        Drawable drawableB = kt3.b(s5aVar2.getContext(), i22);
                        ngg.G(drawableB, -1);
                        return drawableB;
                    default:
                        return s5a.a(this.b);
                }
            }
        });
        this.H0 = new wjc();
        this.I0 = new n5(i3, this);
        sq4Var.i(f());
    }

    public static LayerDrawable a(s5a s5aVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{s5aVar.getCallBadgeBackgroundDrawable(), s5aVar.getCallIconDrawable()});
        int iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        layerDrawable.setLayerSize(0, iG, iG);
        layerDrawable.setLayerSize(1, iG2, iG2);
        layerDrawable.setLayerInset(1, iG3, iG3, iG3, iG3);
        return layerDrawable;
    }

    private final EnhancedVectorDrawable getAddBadgeDrawable() {
        return (EnhancedVectorDrawable) this.v0.getValue();
    }

    private final GradientDrawable getCallBadgeBackgroundDrawable() {
        return (GradientDrawable) this.z0.getValue();
    }

    private final LayerDrawable getCallBadgeDrawable() {
        return (LayerDrawable) this.B0.getValue();
    }

    private final Drawable getCallIconDrawable() {
        return (Drawable) this.A0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.x0.getValue();
    }

    private final EnhancedVectorDrawable getOnlineBadgeDrawable() {
        return (EnhancedVectorDrawable) this.w0.getValue();
    }

    public static void h(s5a s5aVar, String str, uc0 uc0Var) {
        s5aVar.setAvatarUrl(str);
        s5aVar.g(uc0Var, true);
    }

    public static void i(s5a s5aVar, String str, Long l, CharSequence charSequence) {
        uc0 uc0VarA = oag.a(charSequence, l);
        s5aVar.setAvatarUrl(str);
        s5aVar.g(uc0VarA, true);
    }

    public static void j(s5a s5aVar, Drawable drawable, m5a m5aVar, int i) {
        if ((i & 2) != 0) {
            m5aVar = s5aVar.c;
        }
        m5a m5aVar2 = m5aVar;
        fka fkaVarJ = qp4.u0.j(s5aVar);
        l8 l8Var = new l8(2, fkaVarJ);
        l8 l8Var2 = new l8(3, fkaVarJ);
        s5aVar.setAvatarShape(m5aVar2);
        s5aVar.setCustomPlaceholder(drawable != null ? new rd0(drawable, m5aVar2, fkaVarJ, l8Var, l8Var2) : null);
        s5aVar.invalidate();
    }

    public final d2b f() {
        e2b e2bVarA = s36.a.get();
        e2bVarA.g = this.H0;
        e2bVarA.h = this.I0;
        e2bVarA.l = this.b.X;
        e2bVarA.k = true;
        return e2bVarA.a();
    }

    public final void g(uc0 uc0Var, boolean z) {
        sq4 sq4Var = this.b;
        if (uc0Var == null || uc0Var == uc0.c || (uc0Var.a == 0 && uc0Var.b.length() == 0)) {
            if (this.o == 3) {
                rq4 rq4Var = sq4Var.o;
                rq4Var.getClass();
                ((la6) rq4Var).i(null, 1);
                this.F0 = null;
                this.o = 1;
                return;
            }
            return;
        }
        tc0 tc0Var = new tc0(this.c, uc0Var, qp4.u0.b(getContext()).i());
        tc0Var.t0.o1(tc0Var, tc0.u0[0], Boolean.valueOf(z));
        this.F0 = tc0Var;
        rq4 rq4Var2 = sq4Var.o;
        rq4Var2.getClass();
        ((la6) rq4Var2).i(tc0Var, 1);
        rq4 rq4Var3 = sq4Var.o;
        rq4Var3.getClass();
        ((la6) rq4Var3).i(tc0Var, 5);
        this.o = 3;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new o5a(this, drawable, 0));
        } else {
            post(new p5a(this, drawable, 0));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        umc umcVarE = this.b.e();
        if (umcVarE != null) {
            umcVarE.setBounds(0, 0, iMin, iMin);
        }
        if (umcVarE != null) {
            umcVarE.draw(canvas);
        }
        if (this.s0) {
            int iG = iMin >= tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density) ? tu0.G(24 * fk4.d().getDisplayMetrics().density) : iMin >= tu0.G(((float) 54) * fk4.d().getDisplayMetrics().density) ? tu0.G(20 * fk4.d().getDisplayMetrics().density) : iMin >= tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density) ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : tu0.G(12 * fk4.d().getDisplayMetrics().density);
            getCloseBadgeDrawable().setBounds(iMin - iG, 0, iMin, iG);
            getCloseBadgeDrawable().draw(canvas);
        }
        if (this.t0) {
            int iG2 = iMin - (iMin >= tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density) ? tu0.G(24 * fk4.d().getDisplayMetrics().density) : iMin >= tu0.G(((float) 54) * fk4.d().getDisplayMetrics().density) ? tu0.G(20 * fk4.d().getDisplayMetrics().density) : iMin >= tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density) ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : tu0.G(12 * fk4.d().getDisplayMetrics().density));
            float f = 3;
            getOnlineBadgeDrawable().setBounds(rh4.c(f, fk4.d().getDisplayMetrics().density, iG2), rh4.c(f, fk4.d().getDisplayMetrics().density, iG2), rh4.c(f, fk4.d().getDisplayMetrics().density, iMin), rh4.c(f, fk4.d().getDisplayMetrics().density, iMin));
            getOnlineBadgeDrawable().draw(canvas);
        }
        if (this.u0) {
            float f2 = 28;
            getAddBadgeDrawable().setBounds(rh4.q(f2, fk4.d().getDisplayMetrics().density, iMin), rh4.q(f2, fk4.d().getDisplayMetrics().density, iMin), iMin, iMin);
            getAddBadgeDrawable().draw(canvas);
        }
        if (this.y0) {
            float f3 = 24;
            getCallBadgeDrawable().setBounds(rh4.q(f3, fk4.d().getDisplayMetrics().density, iMin), rh4.q(f3, fk4.d().getDisplayMetrics().density, iMin), iMin, iMin);
            getCallBadgeDrawable().draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.g();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.b.h();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        tc0 tc0Var;
        EnhancedVectorDrawable addBadgeDrawable = getAddBadgeDrawable();
        c54.Z(addBadgeDrawable, "background", fkaVar.b().a.f);
        c54.Z(addBadgeDrawable, "plus", fkaVar.getIcon().b);
        EnhancedVectorDrawable onlineBadgeDrawable = getOnlineBadgeDrawable();
        c54.Z(onlineBadgeDrawable, "online", fkaVar.getIcon().e);
        ne0 ne0VarB = fkaVar.b();
        VectorPath vectorPathFindPath = onlineBadgeDrawable.findPath("online");
        if (vectorPathFindPath != null) {
            vectorPathFindPath.setStrokeColor(ne0VarB.k);
            onlineBadgeDrawable.invalidatePath();
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        c54.Z(closeBadgeDrawable, "cross", -1);
        c54.Z(closeBadgeDrawable, "circle_background", fkaVar.getIcon().j);
        getCallIconDrawable().setTint(-1);
        GradientDrawable callBadgeBackgroundDrawable = getCallBadgeBackgroundDrawable();
        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        pq9 pq9Var = qp4.u0;
        callBadgeBackgroundDrawable.setStroke(iG, pq9Var.j(this).b().k);
        callBadgeBackgroundDrawable.setColor(pq9Var.j(this).getIcon().k);
        int iS = au1.s(this.o);
        if (iS == 1) {
            rd0 rd0Var = this.G0;
            if (rd0Var != null) {
                rd0Var.onThemeChanged(fkaVar);
            }
        } else if (iS == 2 && (tc0Var = this.F0) != null) {
            tc0Var.onThemeChanged(fkaVar);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k56 k56Var;
        if (!this.s0 || this.D0 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean zContains = getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.E0 = zContains;
            if (zContains) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (action == 1 && this.E0 && getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (k56Var = this.D0) != null) {
            k56Var.invoke();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new q5a(this, drawable, runnable, j, 0));
        } else {
            post(new q5a(this, drawable, runnable, j, 1));
        }
    }

    public final void setAddBadgeVisibility(boolean z) {
        this.u0 = z;
        if (z) {
            this.t0 = false;
        }
        invalidate();
    }

    public final void setAvatarShape(m5a m5aVar) {
        if (tpa.f(this.c, m5aVar)) {
            return;
        }
        this.c = m5aVar;
        invalidate();
    }

    public final void setAvatarUrl(String str) {
        wv6 wv6VarB;
        List list = this.J0;
        if (list != null && list.size() == 1) {
            List list2 = this.J0;
            if (tpa.f(list2 != null ? (String) x53.g0(list2) : null, str)) {
                return;
            }
        }
        if (str == null || str.length() == 0) {
            this.J0 = null;
            wv6VarB = null;
        } else {
            this.J0 = Collections.singletonList(str);
            vc0 vc0Var = h5a.a;
            wv6VarB = h5a.b(str, this.c, 4);
        }
        sq4 sq4Var = this.b;
        if (wv6VarB == null) {
            sq4Var.i(null);
            return;
        }
        iv6 iv6VarO = s36.o();
        iv6VarO.getClass();
        this.H0.a(new hv6(iv6VarO, wv6VarB, str));
        if (sq4Var.X == null) {
            sq4Var.i(f());
        }
    }

    public final void setAvatarUrls(List<String> list) {
        if (list == null || list.isEmpty() || !tpa.f(this.J0, list)) {
            sq4 sq4Var = this.b;
            if (list == null || list.isEmpty()) {
                sq4Var.i(null);
                this.J0 = null;
                return;
            }
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (String str : list) {
                vc0 vc0Var = h5a.a;
                wv6 wv6VarB = h5a.b(str, this.c, 4);
                iv6 iv6VarO = s36.o();
                iv6VarO.getClass();
                arrayList.add(new hv6(iv6VarO, wv6VarB, str));
            }
            rz6 rz6Var = new rz6(arrayList, true);
            this.J0 = list;
            this.H0.a(rz6Var);
            if (sq4Var.X == null) {
                sq4Var.i(f());
            }
        }
    }

    public final void setCallBadgeVisibility(boolean z) {
        this.y0 = z;
        if (z) {
            this.t0 = false;
            this.u0 = false;
        }
        invalidate();
    }

    public final void setCloseBadgeClickListener(k56 k56Var) {
        this.D0 = k56Var;
    }

    public final void setCloseBadgeVisibility(boolean z) {
        this.s0 = z;
        invalidate();
    }

    public final void setCustomOverlay(od0 od0Var) {
        sq4 sq4Var = this.b;
        if (od0Var == null) {
            rq4 rq4Var = sq4Var.o;
            rq4Var.getClass();
            ((la6) rq4Var).k(null);
        } else {
            rq4 rq4Var2 = sq4Var.o;
            rq4Var2.getClass();
            ((la6) rq4Var2).k(od0Var);
        }
    }

    public final void setCustomPlaceholder(rd0 rd0Var) {
        sq4 sq4Var = this.b;
        if (rd0Var != null) {
            this.G0 = rd0Var;
            rq4 rq4Var = sq4Var.o;
            rq4Var.getClass();
            ((la6) rq4Var).i(rd0Var, 1);
            this.o = 2;
            return;
        }
        if (this.o == 2) {
            rq4 rq4Var2 = sq4Var.o;
            rq4Var2.getClass();
            ((la6) rq4Var2).i(null, 1);
            this.G0 = null;
            this.o = 1;
        }
    }

    public final void setOnImageLoadedListener(k56 k56Var) {
        this.C0 = k56Var;
    }

    public final void setOnlineBadgeVisibility(boolean z) {
        this.t0 = z;
        if (z) {
            this.u0 = false;
        }
        invalidate();
    }

    public final void setOverlay(Drawable drawable) {
        od0 od0Var;
        if (drawable != null) {
            m5a m5aVar = this.c;
            Context context = getContext();
            od0Var = new od0(drawable, m5aVar, context, new nd0(context, 0), new nd0(context, 1));
        } else {
            od0Var = null;
        }
        setCustomOverlay(od0Var);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new r5a(this, drawable, runnable, 0));
        } else {
            post(new r5a(this, drawable, runnable, 1));
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b.e() == drawable || super.verifyDrawable(drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new o5a(this, drawable, 1));
        } else {
            post(new p5a(this, drawable, 1));
        }
    }
}
