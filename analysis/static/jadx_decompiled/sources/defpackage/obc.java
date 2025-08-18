package defpackage;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class obc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        obc obcVar = (obc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        obcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        obc obcVar = new obc(continuation, this.Y);
        obcVar.X = obj;
        return obcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        AnimatorSet animatorSet;
        kpa kpaVar;
        od2.a0(obj);
        MotionEvent motionEvent = (MotionEvent) this.X;
        bc7[] bc7VarArr = RecordControlsWidget.b1;
        RecordControlsWidget recordControlsWidget = this.Y;
        uac uacVar = (uac) recordControlsWidget.I0().w0.a.getValue();
        if (recordControlsWidget.t0().getX() != 0.0f && !(uacVar instanceof tac) && (((animatorSet = recordControlsWidget.W0) == null || !animatorSet.isRunning()) && (kpaVar = recordControlsWidget.P0) != null)) {
            Float f = (Float) kpaVar.a;
            Float f2 = (Float) kpaVar.b;
            if (motionEvent.getAction() == 2 && f != null && f2 != null) {
                float rawX = motionEvent.getRawX() - (recordControlsWidget.t0().getWidth() / 2);
                float y = motionEvent.getY() - (recordControlsWidget.t0().getWidth() / 2);
                double degrees = Math.toDegrees((float) Math.atan2(-(y - f2.floatValue()), rawX - f.floatValue()));
                if (degrees < 0.0d) {
                    degrees += 360;
                }
                int iF = tu0.F(Math.ceil(degrees));
                j37 j37Var = RecordControlsWidget.c1;
                if (j37Var.a <= iF && iF <= j37Var.b) {
                    recordControlsWidget.R0 = 0.0f;
                    if (ote.d((y - f2.floatValue()) / ((f2.floatValue() - tu0.G(40 * fk4.d().getDisplayMetrics().density)) - f2.floatValue()), 0.0f, 1.0f) * 100.0f >= 100.0f) {
                        q0e q0eVar = recordControlsWidget.I0().v0;
                        uac uacVar2 = (uac) q0eVar.getValue();
                        if (uacVar2 instanceof sac) {
                            q0eVar.m(null, new sac(((sac) uacVar2).a, true));
                        }
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            pag.F(view, mi6.CONFIRM);
                        }
                    } else {
                        if (f2.floatValue() - y > tu0.G(1 * fk4.d().getDisplayMetrics().density)) {
                            AnimatorSet animatorSet2 = recordControlsWidget.Y0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                            }
                        } else {
                            AnimatorSet animatorSet3 = recordControlsWidget.Y0;
                            if (animatorSet3 != null) {
                                animatorSet3.start();
                            }
                        }
                        kwd kwdVar = recordControlsWidget.T0;
                        if (kwdVar != null) {
                            kwdVar.b();
                        }
                        View viewZ0 = recordControlsWidget.z0();
                        kpa kpaVar2 = recordControlsWidget.Q0;
                        viewZ0.setTranslationY(recordControlsWidget.t0().getTranslationY() + (kpaVar2 != null ? ((Number) kpaVar2.b).floatValue() : 0.0f));
                        recordControlsWidget.t0().setY(y);
                    }
                } else {
                    j37 j37Var2 = RecordControlsWidget.d1;
                    if (j37Var2.a <= iF && iF <= j37Var2.b) {
                        float f3 = 40;
                        float fD = ote.d((rawX - (f.floatValue() - tu0.G(fk4.d().getDisplayMetrics().density * f3))) / ((f.floatValue() - tu0.G(90 * fk4.d().getDisplayMetrics().density)) - f.floatValue()), 0.0f, 1.0f) * 100.0f;
                        recordControlsWidget.R0 = fD;
                        if (fD >= 100.0f) {
                            cbc cbcVarI0 = recordControlsWidget.I0();
                            cbcVarI0.C();
                            cbcVarI0.v0.m(null, new tac(1, false, true));
                        } else {
                            if (f.floatValue() - rawX > tu0.G(1 * fk4.d().getDisplayMetrics().density)) {
                                AnimatorSet animatorSet4 = recordControlsWidget.X0;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = recordControlsWidget.Y0;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                }
                            } else {
                                AnimatorSet animatorSet6 = recordControlsWidget.X0;
                                if (animatorSet6 != null) {
                                    animatorSet6.start();
                                }
                                AnimatorSet animatorSet7 = recordControlsWidget.Y0;
                                if (animatorSet7 != null) {
                                    animatorSet7.start();
                                }
                            }
                            float f4 = 124;
                            float fQ = (((recordControlsWidget.R0 / 100.0f) * rh4.q(f4, fk4.d().getDisplayMetrics().density, tu0.G(36 * fk4.d().getDisplayMetrics().density))) + tu0.G(fk4.d().getDisplayMetrics().density * f4)) / tu0.G(f4 * fk4.d().getDisplayMetrics().density);
                            recordControlsWidget.t0().setScaleX(fQ);
                            recordControlsWidget.t0().setScaleY(fQ);
                            kwd kwdVar2 = recordControlsWidget.T0;
                            if (kwdVar2 != null) {
                                kwdVar2.a(motionEvent.getRawX() + (-recordControlsWidget.F0().getWidth()) + (tu0.G(fk4.d().getDisplayMetrics().density * f3) / 2));
                            }
                            View viewZ02 = recordControlsWidget.z0();
                            kpa kpaVar3 = recordControlsWidget.Q0;
                            viewZ02.setTranslationY(kpaVar3 != null ? ((Number) kpaVar3.b).floatValue() : 0.0f);
                            float fFloatValue = f.floatValue() - tu0.G(20 * fk4.d().getDisplayMetrics().density);
                            float fD2 = ote.d((rawX - fFloatValue) / ((f.floatValue() - tu0.G(f3 * fk4.d().getDisplayMetrics().density)) - fFloatValue), 0.0f, 1.0f);
                            recordControlsWidget.v0().setAlpha(1.0f - fD2);
                            recordControlsWidget.v0().setTranslationX(tu0.G((-20) * fk4.d().getDisplayMetrics().density) * fD2);
                            recordControlsWidget.t0().setX(rawX);
                            recordControlsWidget.t0().setY(f2.floatValue());
                        }
                    }
                }
            }
        }
        return e5f.a;
    }
}
