package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes.dex */
public final class ag implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public ag(View view, boolean z) {
        this.b = z;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        uu3 uu3VarM0;
        int i = 1;
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                return;
            case 1:
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.c;
                recordControlsWidget.w0().setAlpha(1.0f);
                recordControlsWidget.w0().setTranslationX(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.x0().setTranslationX(0.0f);
                recordControlsWidget.v0().setAlpha(1.0f);
                recordControlsWidget.v0().setTranslationX(0.0f);
                recordControlsWidget.z0().setAlpha(1.0f);
                Drawable drawableB0 = recordControlsWidget.B0();
                qp4.u0.j(recordControlsWidget.q0()).a().s().a.b.getClass();
                ngg.G(drawableB0, -1);
                recordControlsWidget.s0().setScaleX(1.0f);
                recordControlsWidget.s0().setScaleY(1.0f);
                recordControlsWidget.s0().setAlpha(1.0f);
                if (this.b) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    recordControlsWidget.Z0 = animatorSet;
                    animatorSet.playTogether(ngg.d(recordControlsWidget.w0(), View.ALPHA, 1.0f, 0.0f, 1000L, 1000L, 2, -1));
                    AnimatorSet animatorSet2 = recordControlsWidget.Z0;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new kbc(recordControlsWidget, 12));
                    }
                    AnimatorSet animatorSet3 = recordControlsWidget.Z0;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    recordControlsWidget.X0 = animatorSet4;
                    animatorSet4.play(ngg.d(recordControlsWidget.v0(), View.TRANSLATION_X, 0.0f, fk4.d().getDisplayMetrics().density * (-4.0f), 1000L, 1000L, 2, -1));
                    AnimatorSet animatorSet5 = recordControlsWidget.X0;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                    }
                    recordControlsWidget.Y0 = new AnimatorSet();
                    kpa kpaVar = recordControlsWidget.Q0;
                    float fFloatValue = kpaVar != null ? ((Number) kpaVar.b).floatValue() : 0.0f;
                    AnimatorSet animatorSet6 = recordControlsWidget.Y0;
                    if (animatorSet6 != null) {
                        animatorSet6.play(ngg.d(recordControlsWidget.z0(), View.TRANSLATION_Y, fFloatValue, fFloatValue + tu0.G(8 * fk4.d().getDisplayMetrics().density), 1000L, 1000L, 2, -1));
                    }
                    AnimatorSet animatorSet7 = recordControlsWidget.Y0;
                    if (animatorSet7 != null) {
                        animatorSet7.addListener(new x5c(recordControlsWidget, fFloatValue, i));
                    }
                    AnimatorSet animatorSet8 = recordControlsWidget.Y0;
                    if (animatorSet8 != null) {
                        animatorSet8.start();
                        return;
                    }
                    return;
                }
                return;
            default:
                rge rgeVar = (rge) this.c;
                if (rgeVar.b()) {
                    rgeVar.a();
                } else {
                    kq0.x(rgeVar.c, rgeVar.a(), null, null, 1.0f);
                }
                rge rgeVar2 = (rge) this.c;
                rgeVar2.m = null;
                ViewGroup viewGroup = rgeVar2.c;
                viewGroup.removeView(viewGroup.findViewById(wwb.swipe_fade));
                if (this.b) {
                    rge rgeVar3 = (rge) this.c;
                    rgeVar3.f = false;
                    rgeVar3.g = -1.0f;
                    rgeVar3.h = -1.0f;
                }
                nge ngeVar = ((rge) this.c).q;
                if (ngeVar != null) {
                    SwipeWidget swipeWidget = (SwipeWidget) ngeVar;
                    swipeWidget.b = false;
                    coc cocVar = (coc) x53.q0(swipeWidget.getRouter().e());
                    if (cocVar != null && (uu3VarM0 = swipeWidget.m0()) != null) {
                        SwipeWidget.s0(uu3VarM0);
                        View view2 = uu3VarM0.getView();
                        if (view2 != null) {
                            zu3 zu3VarB = cocVar.b();
                            if (zu3VarB == null || zu3VarB.d()) {
                                if (view2.getParent() != null) {
                                    String str = swipeWidget.a;
                                    ir6 ir6Var = hm9.m;
                                    if (ir6Var != null && ir6Var.c()) {
                                        ir6Var.d(us7.X, str, "clearUnderlyingViewsOnCancel: detaching underlying view", null);
                                    }
                                    ((ViewGroup) view2.getParent()).removeView(view2);
                                }
                                if (uu3VarM0.getRetainViewMode() != tu3.b) {
                                    String str2 = swipeWidget.a;
                                    ir6 ir6Var2 = hm9.m;
                                    if (ir6Var2 != null && ir6Var2.c()) {
                                        ir6Var2.d(us7.X, str2, "clearUnderlyingViewsOnCancel: destroying underlying view", null);
                                    }
                                    Context context = swipeWidget.getContext();
                                    Method method = (Method) cv3.c.T0(null, cv3.a[1]);
                                    if (method == null) {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                    method.invoke(uu3VarM0, context);
                                }
                            } else {
                                String str3 = swipeWidget.a;
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, str3, "clearUnderlyingViewsOnCancel: current controller was pushed with 'removesFromViewOnPush'=false, skip clearing", null);
                                }
                            }
                        }
                    }
                    swipeWidget.o0();
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    break;
                }
                break;
        }
    }

    public ag(rge rgeVar, boolean z, float f) {
        this.c = rgeVar;
        this.b = z;
    }

    public ag(RecordControlsWidget recordControlsWidget, boolean z) {
        this.c = recordControlsWidget;
        this.b = z;
    }
}
