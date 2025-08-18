package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* loaded from: classes2.dex */
public final class rrb extends FrameLayout {
    public static final float H0 = fk4.d().getDisplayMetrics().density * 24.0f;
    public final wv1 A0;
    public final iea B0;
    public final iea C0;
    public final FrameLayout D0;
    public final je7 E0;
    public final je7 F0;
    public final je7 G0;
    public final FloatEvaluator a;
    public boolean b;
    public ValueAnimator c;
    public urb o;
    public ExecutorService s0;
    public w4d t0;
    public final CameraxCameraApiView u0;
    public final AppCompatImageView v0;
    public final iea w0;
    public final Chronometer x0;
    public final LinearLayout y0;
    public final iea z0;

    public rrb(Context context) {
        super(context, null, 0, 0);
        this.a = new FloatEvaluator();
        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(context, null, 14);
        cameraxCameraApiView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.u0 = cameraxCameraApiView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        pq9 pq9Var = qp4.u0;
        pq9Var.j(appCompatImageView).getIcon();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        appCompatImageView.setImageResource(gpc.m);
        this.v0 = appCompatImageView;
        iea ieaVar = new iea(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388659);
        float f = 12;
        float f2 = 6;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        ieaVar.setLayoutParams(layoutParams);
        fea feaVar = fea.b;
        ieaVar.setMode(feaVar);
        int i = gpc.v;
        float f3 = H0;
        ieaVar.a(f3, i, "M12 10.586L5.734 4.32c-0.39-0.39-1.024-0.39-1.414 0-0.39 0.39-0.39 1.023 0 1.414L10.586 12 4.32 18.266c-0.39 0.39-0.39 1.024 0 1.414 0.39 0.39 1.023 0.39 1.414 0L12 13.414l6.266 6.266c0.39 0.39 1.024 0.39 1.414 0 0.39-0.39 0.39-1.024 0-1.414L13.414 12l6.266-6.266c0.39-0.39 0.39-1.023 0-1.414-0.39-0.39-1.024-0.39-1.414 0L12 10.586z");
        final int i2 = 0;
        tu0.K(ieaVar, 300L, new View.OnClickListener(this) { // from class: mrb
            public final /* synthetic */ rrb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                gv1 gv1Var;
                Object value2;
                Object obj;
                grb grbVar = grb.a;
                rrb rrbVar = this.b;
                switch (i2) {
                    case 0:
                        w4d w4dVar = rrbVar.t0;
                        if (w4dVar != null) {
                            int i3 = ew1.A0;
                            ew1 ew1Var = (ew1) w4dVar.b;
                            ew1Var.a(false, true);
                            dw1 listener = ew1Var.getListener();
                            if (listener != null) {
                                an9.g(((MediaBarWidget) listener).o, wuc.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        urb urbVar = rrbVar.o;
                        q0e q0eVar = (urbVar != null ? urbVar : null).u0;
                        do {
                            value = q0eVar.getValue();
                            int iOrdinal = ((gv1) value).ordinal();
                            if (iOrdinal == 0) {
                                gv1Var = gv1.b;
                            } else if (iOrdinal != 1) {
                                gv1Var = gv1.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                gv1Var = gv1.c;
                            }
                        } while (!q0eVar.c(value, gv1Var));
                        return;
                    case 2:
                        urb urbVar2 = rrbVar.o;
                        if (urbVar2 == null) {
                            urbVar2 = null;
                        }
                        urbVar2.getClass();
                        hm9.n("QuickCameraViewModel", "onClickTake()");
                        q0e q0eVar2 = urbVar2.t0;
                        hrb hrbVar = (hrb) q0eVar2.getValue();
                        boolean z = hrbVar instanceof drb;
                        s35 s35Var = urbVar2.v0;
                        if (z) {
                            q0eVar2.m(null, erb.a);
                            pnf.o(s35Var, arb.a);
                            return;
                        }
                        if (hrbVar instanceof erb) {
                            return;
                        }
                        if (!(hrbVar instanceof grb)) {
                            if (!(hrbVar instanceof frb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q0eVar2.m(null, grbVar);
                            pnf.o(s35Var, zqb.a);
                            return;
                        }
                        if (!urbVar2.x0.j()) {
                            pnf.o(urbVar2.w0, jrb.a);
                            return;
                        } else {
                            q0eVar2.m(null, new frb(SystemClock.elapsedRealtime()));
                            pnf.o(s35Var, new yqb(((kk5) urbVar2.X).n(urbVar2.Y.a())));
                            return;
                        }
                    case 3:
                        rrbVar.getCameraApi().f(!rrbVar.getCameraApi().j());
                        return;
                    default:
                        urb urbVar3 = rrbVar.o;
                        q0e q0eVar3 = (urbVar3 != null ? urbVar3 : null).t0;
                        do {
                            value2 = q0eVar3.getValue();
                            obj = (hrb) value2;
                            if (obj instanceof drb) {
                                obj = grbVar;
                            } else if (obj instanceof grb) {
                                obj = drb.a;
                            } else if (!(obj instanceof frb) && !(obj instanceof erb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!q0eVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.w0 = ieaVar;
        Chronometer chronometer = new Chronometer(context);
        pq9Var.j(chronometer).getText();
        chronometer.setTextColor(-1);
        this.x0 = chronometer;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 1);
        float f4 = 16;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, tu0.G(fk4.d().getDisplayMetrics().density * f4), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
        ngg.G(gradientDrawable, pq9Var.j(linearLayout).b().f);
        linearLayout.setBackground(gradientDrawable);
        float f5 = 8;
        linearLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f4 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f5));
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, tu0.G(f5 * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        appCompatImageView2.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        ngg.G(gradientDrawable2, pq9Var.j(appCompatImageView2).f().a);
        gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 6.0f);
        appCompatImageView2.setImageDrawable(gradientDrawable2);
        linearLayout.addView(appCompatImageView2);
        linearLayout.addView(chronometer);
        this.y0 = linearLayout;
        iea ieaVar2 = new iea(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams4.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        ieaVar2.setLayoutParams(layoutParams4);
        ieaVar2.setMode(feaVar);
        final int i3 = 1;
        tu0.K(ieaVar2, 300L, new View.OnClickListener(this) { // from class: mrb
            public final /* synthetic */ rrb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                gv1 gv1Var;
                Object value2;
                Object obj;
                grb grbVar = grb.a;
                rrb rrbVar = this.b;
                switch (i3) {
                    case 0:
                        w4d w4dVar = rrbVar.t0;
                        if (w4dVar != null) {
                            int i32 = ew1.A0;
                            ew1 ew1Var = (ew1) w4dVar.b;
                            ew1Var.a(false, true);
                            dw1 listener = ew1Var.getListener();
                            if (listener != null) {
                                an9.g(((MediaBarWidget) listener).o, wuc.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        urb urbVar = rrbVar.o;
                        q0e q0eVar = (urbVar != null ? urbVar : null).u0;
                        do {
                            value = q0eVar.getValue();
                            int iOrdinal = ((gv1) value).ordinal();
                            if (iOrdinal == 0) {
                                gv1Var = gv1.b;
                            } else if (iOrdinal != 1) {
                                gv1Var = gv1.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                gv1Var = gv1.c;
                            }
                        } while (!q0eVar.c(value, gv1Var));
                        return;
                    case 2:
                        urb urbVar2 = rrbVar.o;
                        if (urbVar2 == null) {
                            urbVar2 = null;
                        }
                        urbVar2.getClass();
                        hm9.n("QuickCameraViewModel", "onClickTake()");
                        q0e q0eVar2 = urbVar2.t0;
                        hrb hrbVar = (hrb) q0eVar2.getValue();
                        boolean z = hrbVar instanceof drb;
                        s35 s35Var = urbVar2.v0;
                        if (z) {
                            q0eVar2.m(null, erb.a);
                            pnf.o(s35Var, arb.a);
                            return;
                        }
                        if (hrbVar instanceof erb) {
                            return;
                        }
                        if (!(hrbVar instanceof grb)) {
                            if (!(hrbVar instanceof frb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q0eVar2.m(null, grbVar);
                            pnf.o(s35Var, zqb.a);
                            return;
                        }
                        if (!urbVar2.x0.j()) {
                            pnf.o(urbVar2.w0, jrb.a);
                            return;
                        } else {
                            q0eVar2.m(null, new frb(SystemClock.elapsedRealtime()));
                            pnf.o(s35Var, new yqb(((kk5) urbVar2.X).n(urbVar2.Y.a())));
                            return;
                        }
                    case 3:
                        rrbVar.getCameraApi().f(!rrbVar.getCameraApi().j());
                        return;
                    default:
                        urb urbVar3 = rrbVar.o;
                        q0e q0eVar3 = (urbVar3 != null ? urbVar3 : null).t0;
                        do {
                            value2 = q0eVar3.getValue();
                            obj = (hrb) value2;
                            if (obj instanceof drb) {
                                obj = grbVar;
                            } else if (obj instanceof grb) {
                                obj = drb.a;
                            } else if (!(obj instanceof frb) && !(obj instanceof erb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!q0eVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.z0 = ieaVar2;
        wv1 wv1Var = new wv1(context);
        float f6 = 72;
        wv1Var.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f6), tu0.G(f6 * fk4.d().getDisplayMetrics().density), 17));
        final int i4 = 2;
        tu0.K(wv1Var, 300L, new View.OnClickListener(this) { // from class: mrb
            public final /* synthetic */ rrb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                gv1 gv1Var;
                Object value2;
                Object obj;
                grb grbVar = grb.a;
                rrb rrbVar = this.b;
                switch (i4) {
                    case 0:
                        w4d w4dVar = rrbVar.t0;
                        if (w4dVar != null) {
                            int i32 = ew1.A0;
                            ew1 ew1Var = (ew1) w4dVar.b;
                            ew1Var.a(false, true);
                            dw1 listener = ew1Var.getListener();
                            if (listener != null) {
                                an9.g(((MediaBarWidget) listener).o, wuc.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        urb urbVar = rrbVar.o;
                        q0e q0eVar = (urbVar != null ? urbVar : null).u0;
                        do {
                            value = q0eVar.getValue();
                            int iOrdinal = ((gv1) value).ordinal();
                            if (iOrdinal == 0) {
                                gv1Var = gv1.b;
                            } else if (iOrdinal != 1) {
                                gv1Var = gv1.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                gv1Var = gv1.c;
                            }
                        } while (!q0eVar.c(value, gv1Var));
                        return;
                    case 2:
                        urb urbVar2 = rrbVar.o;
                        if (urbVar2 == null) {
                            urbVar2 = null;
                        }
                        urbVar2.getClass();
                        hm9.n("QuickCameraViewModel", "onClickTake()");
                        q0e q0eVar2 = urbVar2.t0;
                        hrb hrbVar = (hrb) q0eVar2.getValue();
                        boolean z = hrbVar instanceof drb;
                        s35 s35Var = urbVar2.v0;
                        if (z) {
                            q0eVar2.m(null, erb.a);
                            pnf.o(s35Var, arb.a);
                            return;
                        }
                        if (hrbVar instanceof erb) {
                            return;
                        }
                        if (!(hrbVar instanceof grb)) {
                            if (!(hrbVar instanceof frb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q0eVar2.m(null, grbVar);
                            pnf.o(s35Var, zqb.a);
                            return;
                        }
                        if (!urbVar2.x0.j()) {
                            pnf.o(urbVar2.w0, jrb.a);
                            return;
                        } else {
                            q0eVar2.m(null, new frb(SystemClock.elapsedRealtime()));
                            pnf.o(s35Var, new yqb(((kk5) urbVar2.X).n(urbVar2.Y.a())));
                            return;
                        }
                    case 3:
                        rrbVar.getCameraApi().f(!rrbVar.getCameraApi().j());
                        return;
                    default:
                        urb urbVar3 = rrbVar.o;
                        q0e q0eVar3 = (urbVar3 != null ? urbVar3 : null).t0;
                        do {
                            value2 = q0eVar3.getValue();
                            obj = (hrb) value2;
                            if (obj instanceof drb) {
                                obj = grbVar;
                            } else if (obj instanceof grb) {
                                obj = drb.a;
                            } else if (!(obj instanceof frb) && !(obj instanceof erb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!q0eVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.A0 = wv1Var;
        iea ieaVar3 = new iea(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2, 17);
        float f7 = 90;
        layoutParams5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f7), ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin);
        ieaVar3.setLayoutParams(layoutParams5);
        ieaVar3.setMode(feaVar);
        ieaVar3.a(f3, gpc.c0, "M16.472 8C15.374 6.772 13.777 6 12 6c-2.974 0-5.443 2.164-5.918 5.004C5.992 11.55 5.552 12 5 12s-1.006-0.45-0.938-0.998C4.552 7.055 7.92 4 12 4c2.39 0 4.534 1.047 6 2.708V5c0-0.552 0.448-1 1-1s1 0.448 1 1v4c0 0.552-0.448 1-1 1h-4c-0.552 0-1-0.448-1-1s0.448-1 1-1h1.472zM10 15c0-0.552-0.448-1-1-1H5c-0.552 0-1 0.448-1 1v4c0 0.552 0.448 1 1 1s1-0.448 1-1v-1.708C7.466 18.952 9.61 20 12 20c4.08 0 7.447-3.055 7.938-7.002C20.007 12.45 19.552 12 19 12c-0.552 0-0.991 0.451-1.082 0.996C17.443 15.836 14.975 18 12 18c-1.777 0-3.374-0.773-4.472-2H9c0.552 0 1-0.448 1-1z");
        final int i5 = 3;
        tu0.K(ieaVar3, 300L, new View.OnClickListener(this) { // from class: mrb
            public final /* synthetic */ rrb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                gv1 gv1Var;
                Object value2;
                Object obj;
                grb grbVar = grb.a;
                rrb rrbVar = this.b;
                switch (i5) {
                    case 0:
                        w4d w4dVar = rrbVar.t0;
                        if (w4dVar != null) {
                            int i32 = ew1.A0;
                            ew1 ew1Var = (ew1) w4dVar.b;
                            ew1Var.a(false, true);
                            dw1 listener = ew1Var.getListener();
                            if (listener != null) {
                                an9.g(((MediaBarWidget) listener).o, wuc.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        urb urbVar = rrbVar.o;
                        q0e q0eVar = (urbVar != null ? urbVar : null).u0;
                        do {
                            value = q0eVar.getValue();
                            int iOrdinal = ((gv1) value).ordinal();
                            if (iOrdinal == 0) {
                                gv1Var = gv1.b;
                            } else if (iOrdinal != 1) {
                                gv1Var = gv1.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                gv1Var = gv1.c;
                            }
                        } while (!q0eVar.c(value, gv1Var));
                        return;
                    case 2:
                        urb urbVar2 = rrbVar.o;
                        if (urbVar2 == null) {
                            urbVar2 = null;
                        }
                        urbVar2.getClass();
                        hm9.n("QuickCameraViewModel", "onClickTake()");
                        q0e q0eVar2 = urbVar2.t0;
                        hrb hrbVar = (hrb) q0eVar2.getValue();
                        boolean z = hrbVar instanceof drb;
                        s35 s35Var = urbVar2.v0;
                        if (z) {
                            q0eVar2.m(null, erb.a);
                            pnf.o(s35Var, arb.a);
                            return;
                        }
                        if (hrbVar instanceof erb) {
                            return;
                        }
                        if (!(hrbVar instanceof grb)) {
                            if (!(hrbVar instanceof frb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q0eVar2.m(null, grbVar);
                            pnf.o(s35Var, zqb.a);
                            return;
                        }
                        if (!urbVar2.x0.j()) {
                            pnf.o(urbVar2.w0, jrb.a);
                            return;
                        } else {
                            q0eVar2.m(null, new frb(SystemClock.elapsedRealtime()));
                            pnf.o(s35Var, new yqb(((kk5) urbVar2.X).n(urbVar2.Y.a())));
                            return;
                        }
                    case 3:
                        rrbVar.getCameraApi().f(!rrbVar.getCameraApi().j());
                        return;
                    default:
                        urb urbVar3 = rrbVar.o;
                        q0e q0eVar3 = (urbVar3 != null ? urbVar3 : null).t0;
                        do {
                            value2 = q0eVar3.getValue();
                            obj = (hrb) value2;
                            if (obj instanceof drb) {
                                obj = grbVar;
                            } else if (obj instanceof grb) {
                                obj = drb.a;
                            } else if (!(obj instanceof frb) && !(obj instanceof erb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!q0eVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.B0 = ieaVar3;
        iea ieaVar4 = new iea(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, tu0.G(f7 * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin);
        ieaVar4.setLayoutParams(layoutParams6);
        ieaVar4.setMode(feaVar);
        final int i6 = 4;
        tu0.K(ieaVar4, 300L, new View.OnClickListener(this) { // from class: mrb
            public final /* synthetic */ rrb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                gv1 gv1Var;
                Object value2;
                Object obj;
                grb grbVar = grb.a;
                rrb rrbVar = this.b;
                switch (i6) {
                    case 0:
                        w4d w4dVar = rrbVar.t0;
                        if (w4dVar != null) {
                            int i32 = ew1.A0;
                            ew1 ew1Var = (ew1) w4dVar.b;
                            ew1Var.a(false, true);
                            dw1 listener = ew1Var.getListener();
                            if (listener != null) {
                                an9.g(((MediaBarWidget) listener).o, wuc.CHAT_ATTACH_PICKER);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        urb urbVar = rrbVar.o;
                        q0e q0eVar = (urbVar != null ? urbVar : null).u0;
                        do {
                            value = q0eVar.getValue();
                            int iOrdinal = ((gv1) value).ordinal();
                            if (iOrdinal == 0) {
                                gv1Var = gv1.b;
                            } else if (iOrdinal != 1) {
                                gv1Var = gv1.a;
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                gv1Var = gv1.c;
                            }
                        } while (!q0eVar.c(value, gv1Var));
                        return;
                    case 2:
                        urb urbVar2 = rrbVar.o;
                        if (urbVar2 == null) {
                            urbVar2 = null;
                        }
                        urbVar2.getClass();
                        hm9.n("QuickCameraViewModel", "onClickTake()");
                        q0e q0eVar2 = urbVar2.t0;
                        hrb hrbVar = (hrb) q0eVar2.getValue();
                        boolean z = hrbVar instanceof drb;
                        s35 s35Var = urbVar2.v0;
                        if (z) {
                            q0eVar2.m(null, erb.a);
                            pnf.o(s35Var, arb.a);
                            return;
                        }
                        if (hrbVar instanceof erb) {
                            return;
                        }
                        if (!(hrbVar instanceof grb)) {
                            if (!(hrbVar instanceof frb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q0eVar2.m(null, grbVar);
                            pnf.o(s35Var, zqb.a);
                            return;
                        }
                        if (!urbVar2.x0.j()) {
                            pnf.o(urbVar2.w0, jrb.a);
                            return;
                        } else {
                            q0eVar2.m(null, new frb(SystemClock.elapsedRealtime()));
                            pnf.o(s35Var, new yqb(((kk5) urbVar2.X).n(urbVar2.Y.a())));
                            return;
                        }
                    case 3:
                        rrbVar.getCameraApi().f(!rrbVar.getCameraApi().j());
                        return;
                    default:
                        urb urbVar3 = rrbVar.o;
                        q0e q0eVar3 = (urbVar3 != null ? urbVar3 : null).t0;
                        do {
                            value2 = q0eVar3.getValue();
                            obj = (hrb) value2;
                            if (obj instanceof drb) {
                                obj = grbVar;
                            } else if (obj instanceof grb) {
                                obj = drb.a;
                            } else if (!(obj instanceof frb) && !(obj instanceof erb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!q0eVar3.c(value2, obj));
                        return;
                }
            }
        });
        this.C0 = ieaVar4;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams7.setMargins(((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin, tu0.G(64 * fk4.d().getDisplayMetrics().density));
        frameLayout.setLayoutParams(layoutParams7);
        frameLayout.addView(ieaVar4);
        frameLayout.addView(wv1Var);
        frameLayout.addView(ieaVar3);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.addView(ieaVar);
        frameLayout2.addView(linearLayout);
        frameLayout2.addView(ieaVar2);
        frameLayout2.addView(frameLayout);
        br7.d(frameLayout2, new x27(3, new yq0(3, 3, false)), null);
        this.D0 = frameLayout2;
        this.E0 = tu0.r(3, new xda(context, 12));
        this.F0 = tu0.r(3, new xda(context, 13));
        this.G0 = tu0.r(3, new xda(context, 14));
        addView(cameraxCameraApiView);
        addView(appCompatImageView);
        addView(frameLayout2);
        setBackgroundColor(-16777216);
    }

    public static final void a(rrb rrbVar, gv1 gv1Var) {
        Drawable flashOffDrawable;
        String str;
        int iOrdinal = gv1Var.ordinal();
        if (iOrdinal == 0) {
            flashOffDrawable = rrbVar.getFlashOffDrawable();
        } else if (iOrdinal == 1) {
            flashOffDrawable = rrbVar.getFlashOnDrawable();
        } else if (iOrdinal == 2) {
            flashOffDrawable = rrbVar.getFlashAutoDrawable();
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            flashOffDrawable = rrbVar.getFlashOnDrawable();
        }
        int iOrdinal2 = gv1Var.ordinal();
        if (iOrdinal2 != 0) {
            str = "M14.16 3.854l-7.786 8.384 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 7.786-8.384-3.643-0.52c-1.23-0.176-1.987-1.439-1.563-2.607l1.74-4.781zm0.285-3.248c1.098-1.181 3.025-0.003 2.474 1.512l-2.6 7.152 4.576 0.653c1.181 0.17 1.686 1.596 0.874 2.47l-10.214 11c-1.097 1.182-3.025 0.004-2.474-1.51l2.601-7.153-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l10.214-11z";
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    str = "M14.919 2.118c0.55-1.515-1.376-2.693-2.474-1.512l-10.214 11c-0.812 0.875-0.307 2.302 0.874 2.47l4.577 0.654-2.6 7.152c-0.552 1.515 1.376 2.693 2.473 1.511l10.214-11c0.812-0.874 0.307-2.3-0.874-2.47L12.318 9.27l2.6-7.152zM4.374 12.238l7.785-8.384-1.739 4.781c-0.424 1.168 0.333 2.431 1.563 2.607l3.643 0.52-7.785 8.384 1.739-4.782c0.424-1.168-0.333-2.43-1.563-2.606l-3.643-0.52zm15.456 3.843c-0.53-1.428-2.546-1.438-3.09-0.015l-2.181 5.713c-0.177 0.464 0.055 0.984 0.52 1.162 0.464 0.177 0.984-0.056 1.162-0.52l0.395-1.036h3.239l0.38 1.028c0.174 0.466 0.691 0.704 1.158 0.53 0.466-0.172 0.703-0.69 0.53-1.156l-2.114-5.706zm-0.622 3.504L18.28 17.08l-0.956 2.504h1.884z";
                } else if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            str = "M10 5.792c0-0.301 0.133-0.571 0.344-0.755l4.101-4.43c1.098-1.182 3.025-0.004 2.474 1.51l-1.643 4.52h0.002l-0.33 0.9-0.561 1.543-0.003-0.003-0.07 0.192 0.306 0.044 4.275 0.61c1.181 0.17 1.686 1.596 0.874 2.47l-1 1.069c-0.182 0.188-0.437 0.305-0.72 0.305-0.552 0-1-0.448-1-1 0-0.302 0.134-0.573 0.346-0.756l0.23-0.249-0.649-0.092-0.008-0.008-1.668-0.23-2.855-2.866 0.972-2.68h0.003l0.74-2.032-2.372 2.553C11.605 6.641 11.32 6.792 11 6.792c-0.552 0-1-0.448-1-1z M7.101 8.516L3.293 4.707c-0.39-0.39-0.39-1.024 0-1.414 0.39-0.39 1.024-0.39 1.414 0l16 16c0.39 0.39 0.39 1.024 0 1.414-0.39 0.39-1.024 0.39-1.414 0l-3.756-3.756-5.982 6.443c-1.097 1.181-3.025 0.003-2.474-1.512l2.601-7.152-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l2.87-3.091zm7.02 7.02L8.518 9.93l-2.143 2.307 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 4.282-4.61z";
        }
        pha phaVar = rrbVar.z0.c;
        phaVar.setImageDrawable(flashOffDrawable);
        phaVar.s0 = m6d.i(str);
        phaVar.o = H0;
        phaVar.invalidate();
        rrbVar.getCameraApi().setFlash(gv1Var.name());
    }

    public static final void b(rrb rrbVar, float f, float f2, float f3, float f4, float f5) {
        AppCompatImageView appCompatImageView = rrbVar.v0;
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        FloatEvaluator floatEvaluator = rrbVar.a;
        appCompatImageView.setAlpha(floatEvaluator.evaluate(f5, (Number) fValueOf, (Number) fValueOf2).floatValue());
        rrbVar.D0.setAlpha(floatEvaluator.evaluate(f5, (Number) Float.valueOf(f3), (Number) Float.valueOf(f4)).floatValue());
    }

    private final Drawable getFlashAutoDrawable() {
        return (Drawable) this.E0.getValue();
    }

    private final Drawable getFlashOffDrawable() {
        return (Drawable) this.G0.getValue();
    }

    private final Drawable getFlashOnDrawable() {
        return (Drawable) this.F0.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.b) {
            return false;
        }
        if (keyEvent.getKeyCode() != 25 && keyEvent.getKeyCode() != 24) {
            return false;
        }
        int action = keyEvent.getAction();
        return action == 0 || action == 1;
    }

    public final hv1 getCameraApi() {
        return this.u0;
    }
}
