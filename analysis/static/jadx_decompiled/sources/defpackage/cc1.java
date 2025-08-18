package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes.dex */
public final class cc1 implements k56 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cc1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.k56
    public final Object invoke() throws IOException {
        int i = 4;
        int i2 = 9;
        e5f e5fVar = e5f.a;
        AnimatorSet animatorSet = null;
        int i3 = 2;
        int i4 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        int i5 = 1;
        int i6 = 0;
        switch (this.a) {
            case 0:
                je1 je1Var = je1.c;
                ea1 ea1Var = (ea1) ((wm9) obj2);
                String str = ea1Var.b;
                je1Var.P1().b(":call-join-link?link=" + str + "&video_enabled=" + ea1Var.c + "&microphone_enabled=" + ea1Var.d + "&front_camera_enabled=" + ea1Var.e + "&is_new=false", null);
                bc7[] bc7VarArr = CallJoinLinkPreviewWidget.B0;
                ((CallJoinLinkPreviewWidget) obj).r0();
                return e5fVar;
            case 1:
                v4 v4Var = (v4) obj;
                return new wt2((String) obj2, (ta2) v4Var.c(ta2.class), (kke) v4Var.c(kke.class));
            case 2:
                v4 v4Var2 = (v4) obj2;
                return new vu2(new qt2(i6, (khe) ((je7) obj)), v4Var2.d(q33.class), v4Var2.d(y7d.class), v4Var2.d(qe5.class), v4Var2.d(w7b.class), v4Var2.d(lr2.class), v4Var2.d(kr2.class));
            case 3:
                kp6 kp6Var = (kp6) obj;
                np6 np6Var = (np6) obj2;
                try {
                    np6Var.d(this);
                    do {
                    } while (np6Var.a(false, this));
                    kp6Var.a(1, 9, null);
                } catch (IOException e) {
                    kp6Var.a(2, 2, e);
                } catch (Throwable th) {
                    kp6Var.a(3, 3, null);
                    naf.c(np6Var);
                    throw th;
                }
                naf.c(np6Var);
                return e5fVar;
            default:
                uac uacVar = (uac) obj2;
                boolean z = uacVar instanceof sac;
                mi6 mi6Var = mi6.CONFIRM;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj;
                if (z) {
                    sac sacVar = (sac) uacVar;
                    if (sacVar.b) {
                        bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                        recordControlsWidget.r0().setVisibility(0);
                        recordControlsWidget.M0();
                        if (sacVar.a) {
                            AnimatorSet animatorSet2 = recordControlsWidget.W0;
                            if (animatorSet2 != null && animatorSet2.isRunning()) {
                                AnimatorSet animatorSet3 = recordControlsWidget.W0;
                                if (animatorSet3 != null) {
                                    animatorSet3.end();
                                }
                                AnimatorSet animatorSet4 = recordControlsWidget.W0;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                            }
                            recordControlsWidget.W0 = new AnimatorSet();
                            kl7 kl7VarL = j1e.l();
                            kl7VarL.addAll(ngg.F(recordControlsWidget.D0(), 1.0f, 0.5f, 150L, 0L));
                            ImageView imageViewD0 = recordControlsWidget.D0();
                            Property property = View.ALPHA;
                            kl7VarL.add(ngg.e(imageViewD0, property, 1.0f, 0.0f, 150L, 0L, 112));
                            kl7VarL.addAll(ngg.F(recordControlsWidget.C0(), 0.5f, 1.0f, 150L, 50L));
                            kl7VarL.add(ngg.e(recordControlsWidget.C0(), property, 0.0f, 1.0f, 150L, 50L, 96));
                            lsf lsfVar = recordControlsWidget.E0;
                            if (lsfVar != null) {
                                kl7VarL.addAll(lsfVar.getResumeAnimations());
                            }
                            kl7 kl7VarD = j1e.d(kl7VarL);
                            AnimatorSet animatorSet5 = recordControlsWidget.W0;
                            if (animatorSet5 != null) {
                                animatorSet5.addListener(new kbc(recordControlsWidget, 10));
                            }
                            AnimatorSet animatorSet6 = recordControlsWidget.W0;
                            if (animatorSet6 != null) {
                                animatorSet6.addListener(new kbc(recordControlsWidget, i2));
                            }
                            AnimatorSet animatorSet7 = recordControlsWidget.W0;
                            if (animatorSet7 != null) {
                                animatorSet7.setInterpolator(recordControlsWidget.y0());
                            }
                            AnimatorSet animatorSet8 = recordControlsWidget.W0;
                            if (animatorSet8 != null) {
                                animatorSet8.playTogether(kl7VarD);
                            }
                            AnimatorSet animatorSet9 = recordControlsWidget.W0;
                            if (animatorSet9 != null) {
                                animatorSet9.start();
                            }
                        } else {
                            recordControlsWidget.J0();
                        }
                    } else {
                        if (recordControlsWidget.O0 == null) {
                            recordControlsWidget.O0 = Float.valueOf(recordControlsWidget.t0().getX());
                        }
                        recordControlsWidget.t0().setX(recordControlsWidget.a1 - ((recordControlsWidget.t0().getMeasuredWidth() / 2) - (recordControlsWidget.q0().getMeasuredWidth() / 2)));
                        recordControlsWidget.z0().setTranslationX(recordControlsWidget.t0().getTranslationX() - (fk4.d().getDisplayMetrics().density * 4.0f));
                        recordControlsWidget.P0 = new kpa(Float.valueOf(recordControlsWidget.t0().getX()), Float.valueOf(recordControlsWidget.t0().getY()));
                        recordControlsWidget.Q0 = new kpa(Float.valueOf(recordControlsWidget.z0().getTranslationX()), Float.valueOf(recordControlsWidget.z0().getTranslationY()));
                        recordControlsWidget.L0(true);
                        recordControlsWidget.U0 = j47.T(recordControlsWidget.getViewLifecycleScope(), null, null, new tbc(null, recordControlsWidget), 3);
                        recordControlsWidget.requireActivity().getWindow().addFlags(128);
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            pag.F(view, mi6Var);
                        }
                    }
                } else if (uacVar instanceof tac) {
                    tac tacVar = (tac) uacVar;
                    boolean z2 = tacVar.a;
                    lsf lsfVar2 = recordControlsWidget.E0;
                    if (lsfVar2 != null) {
                        r70 waveView = lsfVar2.getWaveView();
                        waveView.z0.reset();
                        waveView.s0 = null;
                        waveView.B0 = null;
                        waveView.A0 = null;
                        waveView.v0 = false;
                        waveView.C0 = 0L;
                        waveView.t0 = 0L;
                        waveView.invalidate();
                    }
                    recordControlsWidget.R0 = 0.0f;
                    recordControlsWidget.M0();
                    recordControlsWidget.requireActivity().getWindow().clearFlags(128);
                    if (z2) {
                        AnimatorSet animatorSet10 = recordControlsWidget.W0;
                        if (animatorSet10 != null && animatorSet10.isRunning()) {
                            AnimatorSet animatorSet11 = recordControlsWidget.W0;
                            if (animatorSet11 != null) {
                                animatorSet11.end();
                            }
                            AnimatorSet animatorSet12 = recordControlsWidget.W0;
                            if (animatorSet12 != null) {
                                animatorSet12.cancel();
                            }
                        }
                        recordControlsWidget.W0 = new AnimatorSet();
                        kl7 kl7VarL2 = j1e.l();
                        lsf lsfVar3 = recordControlsWidget.E0;
                        if (lsfVar3 != null) {
                            kl7VarL2.add(ngg.e(lsfVar3, View.ALPHA, 1.0f, 0.0f, 150L, 0L, 112));
                        }
                        if (recordControlsWidget.C0().getVisibility() == 0) {
                            kl7VarL2.addAll(ngg.F(recordControlsWidget.C0(), 1.0f, 0.0f, 250L, 0L));
                            kl7VarL2.add(ngg.e(recordControlsWidget.C0(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, 112));
                        } else {
                            kl7VarL2.addAll(ngg.F(recordControlsWidget.D0(), 1.0f, 0.0f, 250L, 0L));
                            kl7VarL2.add(ngg.e(recordControlsWidget.D0(), View.ALPHA, 1.0f, 0.0f, 250L, 0L, 112));
                        }
                        kl7VarL2.addAll(ngg.F(recordControlsWidget.E0(), 1.0f, 0.0f, 250L, 0L));
                        ImageView imageViewE0 = recordControlsWidget.E0();
                        Property property2 = View.ALPHA;
                        kl7VarL2.add(ngg.e(imageViewE0, property2, 1.0f, 0.0f, 150L, 0L, 112));
                        kl7VarL2.add(ngg.e(recordControlsWidget.u0(), property2, 1.0f, 0.0f, 250L, 0L, 112));
                        if (recordControlsWidget.H0() == bac.b) {
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(tu0.G(96 * fk4.d().getDisplayMetrics().density), tu0.G(48 * fk4.d().getDisplayMetrics().density));
                            valueAnimatorOfInt.setDuration(300L);
                            valueAnimatorOfInt.addUpdateListener(new dbc(recordControlsWidget, i4));
                            kl7VarL2.add(valueAnimatorOfInt);
                        }
                        kl7VarL2.addAll(ngg.F(recordControlsWidget.t0(), 1.0f, 0.0f, 250L, 0L));
                        kl7VarL2.add(ngg.e(recordControlsWidget.t0(), property2, 1.0f, 0.0f, 150L, 0L, 112));
                        kl7 kl7VarD2 = j1e.d(kl7VarL2);
                        AnimatorSet animatorSet13 = recordControlsWidget.W0;
                        if (animatorSet13 != null) {
                            animatorSet13.addListener(new kbc(recordControlsWidget, i));
                        }
                        AnimatorSet animatorSet14 = recordControlsWidget.W0;
                        if (animatorSet14 != null) {
                            animatorSet14.playTogether(kl7VarD2);
                        }
                        ev8 ev8VarA0 = recordControlsWidget.A0();
                        if (ev8VarA0 != null) {
                            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) ev8VarA0;
                            if (messageWriteWidget.getView() != null) {
                                sv8 sv8VarQ0 = messageWriteWidget.q0();
                                sv8VarQ0.getClass();
                                animatorSet = new AnimatorSet();
                                kl7 kl7VarL3 = j1e.l();
                                kl7VarL3.add(ngg.e(sv8VarQ0.c, property2, 0.0f, 1.0f, 200L, 0L, 112));
                                ImageView imageView = sv8VarQ0.b;
                                kl7VarL3.addAll(ngg.F(imageView, 0.0f, 1.0f, 250L, 0L));
                                kl7VarL3.add(ngg.e(imageView, property2, 0.0f, 1.0f, 200L, 0L, 112));
                                je7 je7Var = sv8VarQ0.s0;
                                if (je7Var.a()) {
                                    kl7VarL3.addAll(ngg.F((View) je7Var.getValue(), 0.0f, 1.0f, 250L, 0L));
                                    kl7VarL3.add(ngg.e((View) je7Var.getValue(), property2, 0.0f, 1.0f, 200L, 50L, 96));
                                }
                                je7 je7Var2 = sv8VarQ0.w0;
                                if (je7Var2.a()) {
                                    kl7VarL3.addAll(ngg.F((View) je7Var2.getValue(), 0.0f, 1.0f, 250L, 0L));
                                    kl7VarL3.add(ngg.e((View) je7Var2.getValue(), property2, 0.0f, 1.0f, 200L, 50L, 96));
                                }
                                ImageView imageView2 = sv8VarQ0.v0;
                                kl7VarL3.addAll(ngg.F(imageView2, 0.0f, 1.0f, 250L, 0L));
                                kl7VarL3.add(ngg.e(imageView2, property2, 0.0f, 1.0f, 250L, 0L, 112));
                                kl7 kl7VarD3 = j1e.d(kl7VarL3);
                                animatorSet.addListener(new rv8(sv8VarQ0, 5));
                                animatorSet.addListener(new rv8(sv8VarQ0, i));
                                animatorSet.playTogether(kl7VarD3);
                            }
                        }
                        AnimatorSet animatorSet15 = recordControlsWidget.W0;
                        if (animatorSet15 != null) {
                            animatorSet15.playTogether(animatorSet);
                        }
                        AnimatorSet animatorSet16 = recordControlsWidget.W0;
                        if (animatorSet16 != null) {
                            animatorSet16.setInterpolator(recordControlsWidget.y0());
                        }
                        AnimatorSet animatorSet17 = recordControlsWidget.W0;
                        if (animatorSet17 != null) {
                            animatorSet17.start();
                        }
                    } else if (tacVar.b) {
                        View view2 = recordControlsWidget.getView();
                        if (view2 != null) {
                            pag.F(view2, mi6Var);
                        }
                        AnimatorSet animatorSet18 = recordControlsWidget.W0;
                        if (animatorSet18 != null && animatorSet18.isRunning()) {
                            AnimatorSet animatorSet19 = recordControlsWidget.W0;
                            if (animatorSet19 != null) {
                                animatorSet19.end();
                            }
                            AnimatorSet animatorSet20 = recordControlsWidget.W0;
                            if (animatorSet20 != null) {
                                animatorSet20.cancel();
                            }
                        }
                        AnimatorSet animatorSet21 = recordControlsWidget.Z0;
                        if (animatorSet21 != null) {
                            animatorSet21.cancel();
                        }
                        recordControlsWidget.W0 = new AnimatorSet();
                        kl7 kl7VarL4 = j1e.l();
                        View viewW0 = recordControlsWidget.w0();
                        Property property3 = View.ALPHA;
                        ObjectAnimator objectAnimatorE = ngg.e(viewW0, property3, recordControlsWidget.w0().getAlpha(), 0.0f, 150L, 100L, 96);
                        objectAnimatorE.addListener(new kbc(recordControlsWidget, i4));
                        kl7VarL4.add(objectAnimatorE);
                        kl7VarL4.addAll(ngg.F(recordControlsWidget.G0(), 0.0f, 1.4f, 200L, 250L));
                        kl7VarL4.addAll(ngg.F(recordControlsWidget.G0(), 1.4f, 0.7f, 100L, 450L));
                        kl7VarL4.addAll(ngg.F(recordControlsWidget.G0(), 0.7f, 1.0f, 100L, 550L));
                        kl7VarL4.addAll(ngg.F(recordControlsWidget.G0(), 1.0f, 0.0f, 300L, 700L));
                        kl7VarL4.add(ngg.e(recordControlsWidget.G0(), property3, 1.0f, 0.0f, 150L, 700L, 96));
                        kl7VarL4.add(ngg.e(recordControlsWidget.v0(), property3, recordControlsWidget.v0().getAlpha(), 0.0f, 200L, 0L, 112));
                        if (recordControlsWidget.v0().getTranslationX() == 0.0f) {
                            kl7VarL4.add(ngg.e(recordControlsWidget.v0(), View.TRANSLATION_X, 0.0f, fk4.d().getDisplayMetrics().density * (-20.0f), 200L, 0L, 112));
                        }
                        kl7VarL4.add(ngg.e(recordControlsWidget.x0(), property3, 1.0f, 0.0f, 200L, 100L, 96));
                        kl7VarL4.addAll(ngg.F(recordControlsWidget.t0(), recordControlsWidget.t0().getScaleX(), 0.4f, 150L, 0L));
                        kl7VarL4.add(ngg.e(recordControlsWidget.t0(), property3, 1.0f, 0.0f, 150L, 0L, 112));
                        kl7VarL4.addAll(ngg.F(recordControlsWidget.z0(), 1.0f, 0.0f, 200L, 100L));
                        kl7VarL4.add(ngg.e(recordControlsWidget.z0(), property3, 1.0f, 0.0f, 200L, 100L, 96));
                        kl7 kl7VarD4 = j1e.d(kl7VarL4);
                        AnimatorSet animatorSet22 = recordControlsWidget.W0;
                        if (animatorSet22 != null) {
                            animatorSet22.addListener(new kbc(recordControlsWidget, i3));
                        }
                        AnimatorSet animatorSet23 = recordControlsWidget.W0;
                        if (animatorSet23 != null) {
                            animatorSet23.addListener(new kbc(recordControlsWidget, i5));
                        }
                        AnimatorSet animatorSet24 = recordControlsWidget.W0;
                        if (animatorSet24 != null) {
                            animatorSet24.playTogether(kl7VarD4);
                        }
                        ev8 ev8VarA02 = recordControlsWidget.A0();
                        if (ev8VarA02 != null) {
                            MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) ev8VarA02;
                            if (messageWriteWidget2.getView() != null) {
                                sv8 sv8VarQ02 = messageWriteWidget2.q0();
                                sv8VarQ02.getClass();
                                animatorSet = new AnimatorSet();
                                kl7 kl7VarL5 = j1e.l();
                                kl7VarL5.add(ngg.e(sv8VarQ02.c, View.TRANSLATION_X, fk4.d().getDisplayMetrics().density * 44.0f, 0.0f, 300L, 250L, 96));
                                kl7VarL5.add(ngg.e(sv8VarQ02.c, property3, 0.0f, 1.0f, 300L, 250L, 96));
                                ImageView imageView3 = sv8VarQ02.b;
                                kl7VarL5.add(ngg.e(imageView3, property3, 0.0f, 1.0f, 150L, 850L, 96));
                                kl7VarL5.addAll(ngg.F(imageView3, 0.0f, 1.0f, 300L, 700L));
                                ImageView imageView4 = sv8VarQ02.v0;
                                kl7VarL5.add(ngg.e(imageView4, property3, 0.0f, 1.0f, 200L, 350L, 96));
                                kl7VarL5.addAll(ngg.F(imageView4, 0.0f, 1.0f, 300L, 250L));
                                je7 je7Var3 = sv8VarQ02.s0;
                                if (je7Var3.a()) {
                                    kl7VarL5.add(ngg.e((View) je7Var3.getValue(), property3, 0.0f, 1.0f, 200L, 350L, 96));
                                    kl7VarL5.addAll(ngg.F((View) je7Var3.getValue(), 0.0f, 1.0f, 300L, 250L));
                                }
                                je7 je7Var4 = sv8VarQ02.w0;
                                if (je7Var4.a()) {
                                    kl7VarL5.add(ngg.e((View) je7Var4.getValue(), property3, 0.0f, 1.0f, 200L, 350L, 96));
                                    kl7VarL5.addAll(ngg.F((View) je7Var4.getValue(), 0.0f, 1.0f, 300L, 250L));
                                }
                                kl7 kl7VarD5 = j1e.d(kl7VarL5);
                                animatorSet.addListener(new rv8(sv8VarQ02, i4));
                                animatorSet.addListener(new rv8(sv8VarQ02, i3));
                                animatorSet.playTogether(kl7VarD5);
                            }
                        }
                        AnimatorSet animatorSet25 = recordControlsWidget.W0;
                        if (animatorSet25 != null) {
                            animatorSet25.playTogether(animatorSet);
                        }
                        AnimatorSet animatorSet26 = recordControlsWidget.W0;
                        if (animatorSet26 != null) {
                            animatorSet26.setInterpolator(recordControlsWidget.y0());
                        }
                        AnimatorSet animatorSet27 = recordControlsWidget.W0;
                        if (animatorSet27 != null) {
                            animatorSet27.start();
                        }
                    } else {
                        AnimatorSet animatorSet28 = recordControlsWidget.W0;
                        if (animatorSet28 != null && animatorSet28.isRunning()) {
                            AnimatorSet animatorSet29 = recordControlsWidget.W0;
                            if (animatorSet29 != null) {
                                animatorSet29.end();
                            }
                            AnimatorSet animatorSet30 = recordControlsWidget.W0;
                            if (animatorSet30 != null) {
                                animatorSet30.cancel();
                            }
                        }
                        AnimatorSet animatorSet31 = recordControlsWidget.Z0;
                        if (animatorSet31 != null) {
                            animatorSet31.cancel();
                        }
                        recordControlsWidget.W0 = new AnimatorSet();
                        kl7 kl7VarL6 = j1e.l();
                        View viewW02 = recordControlsWidget.w0();
                        Property property4 = View.ALPHA;
                        kl7VarL6.add(ngg.e(viewW02, property4, recordControlsWidget.w0().getAlpha(), 0.0f, 300L, 100L, 96));
                        View viewW03 = recordControlsWidget.w0();
                        Property property5 = View.TRANSLATION_X;
                        kl7VarL6.add(ngg.e(viewW03, property5, 0.0f, fk4.d().getDisplayMetrics().density * 72.0f, 300L, 100L, 96));
                        kl7VarL6.add(ngg.e(recordControlsWidget.x0(), property4, 1.0f, 0.0f, 300L, 100L, 96));
                        kl7VarL6.add(ngg.e(recordControlsWidget.x0(), property5, 0.0f, fk4.d().getDisplayMetrics().density * 72.0f, 300L, 100L, 96));
                        kl7VarL6.add(ngg.e(recordControlsWidget.v0(), property4, recordControlsWidget.v0().getAlpha(), 0.0f, 250L, 0L, 112));
                        if (recordControlsWidget.v0().getTranslationX() == 0.0f) {
                            kl7VarL6.add(ngg.e(recordControlsWidget.v0(), property5, 0.0f, fk4.d().getDisplayMetrics().density * 70.0f, 300L, 50L, 96));
                        }
                        kl7VarL6.addAll(ngg.F(recordControlsWidget.s0(), recordControlsWidget.s0().getScaleX(), 0.0f, 300L, 150L));
                        kl7VarL6.add(ngg.e(recordControlsWidget.t0(), property4, 1.0f, 0.0f, 300L, 150L, 96));
                        pq9 pq9Var = qp4.u0;
                        pq9Var.j(recordControlsWidget.q0()).a().s().a.b.getClass();
                        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, pq9Var.j(recordControlsWidget.q0()).a().s().a.b.b);
                        valueAnimatorOfArgb.setStartDelay(100L);
                        valueAnimatorOfArgb.setDuration(300L);
                        valueAnimatorOfArgb.addUpdateListener(new dbc(recordControlsWidget, i6));
                        kl7VarL6.add(valueAnimatorOfArgb);
                        kl7VarL6.add(ngg.e(recordControlsWidget.z0(), View.TRANSLATION_Y, recordControlsWidget.z0().getTranslationY(), (-48) - (fk4.d().getDisplayMetrics().density * 2.0f), 200L, 50L, 96));
                        kl7VarL6.add(ngg.e(recordControlsWidget.z0(), property4, 1.0f, 0.0f, 200L, 0L, 112));
                        kl7 kl7VarD6 = j1e.d(kl7VarL6);
                        AnimatorSet animatorSet32 = recordControlsWidget.W0;
                        if (animatorSet32 != null) {
                            animatorSet32.addListener(new kbc(recordControlsWidget, i6));
                        }
                        AnimatorSet animatorSet33 = recordControlsWidget.W0;
                        if (animatorSet33 != null) {
                            animatorSet33.playTogether(kl7VarD6);
                        }
                        ev8 ev8VarA03 = recordControlsWidget.A0();
                        if (ev8VarA03 != null) {
                            MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) ev8VarA03;
                            if (messageWriteWidget3.getView() != null) {
                                sv8 sv8VarQ03 = messageWriteWidget3.q0();
                                sv8VarQ03.getClass();
                                animatorSet = new AnimatorSet();
                                kl7 kl7VarL7 = j1e.l();
                                kl7VarL7.add(ngg.e(sv8VarQ03.c, property5, fk4.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, 96));
                                kl7VarL7.add(ngg.e(sv8VarQ03.c, property4, 0.0f, 1.0f, 300L, 250L, 96));
                                ImageView imageView5 = sv8VarQ03.b;
                                kl7VarL7.add(ngg.e(imageView5, property5, fk4.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, 96));
                                kl7VarL7.add(ngg.e(imageView5, property4, 0.0f, 1.0f, 300L, 250L, 96));
                                ImageView imageView6 = sv8VarQ03.v0;
                                kl7VarL7.add(ngg.e(imageView6, property4, 0.0f, 1.0f, 200L, 250L, 96));
                                kl7VarL7.addAll(ngg.F(imageView6, 0.0f, 1.0f, 300L, 250L));
                                je7 je7Var5 = sv8VarQ03.s0;
                                if (je7Var5.a()) {
                                    kl7VarL7.add(ngg.e((View) je7Var5.getValue(), property4, 0.0f, 1.0f, 200L, 250L, 96));
                                    kl7VarL7.addAll(ngg.F((View) je7Var5.getValue(), 0.0f, 1.0f, 300L, 250L));
                                }
                                je7 je7Var6 = sv8VarQ03.w0;
                                if (je7Var6.a()) {
                                    kl7VarL7.add(ngg.e((View) je7Var6.getValue(), property4, 0.0f, 1.0f, 200L, 250L, 96));
                                    kl7VarL7.addAll(ngg.F((View) je7Var6.getValue(), 0.0f, 1.0f, 300L, 250L));
                                }
                                kl7 kl7VarD7 = j1e.d(kl7VarL7);
                                animatorSet.addListener(new rv8(sv8VarQ03, i5));
                                animatorSet.addListener(new rv8(sv8VarQ03, i6));
                                animatorSet.playTogether(kl7VarD7);
                            }
                        }
                        AnimatorSet animatorSet34 = recordControlsWidget.W0;
                        if (animatorSet34 != null) {
                            animatorSet34.playTogether(animatorSet);
                        }
                        AnimatorSet animatorSet35 = recordControlsWidget.W0;
                        if (animatorSet35 != null) {
                            animatorSet35.setInterpolator(recordControlsWidget.y0());
                        }
                        AnimatorSet animatorSet36 = recordControlsWidget.W0;
                        if (animatorSet36 != null) {
                            animatorSet36.start();
                        }
                    }
                } else {
                    if (!(uacVar instanceof rac)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z3 = ((rac) uacVar).a;
                    bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                    if (z3) {
                        recordControlsWidget.L0(false);
                        AnimatorSet animatorSet37 = recordControlsWidget.W0;
                        if (animatorSet37 != null) {
                            animatorSet37.end();
                        }
                        recordControlsWidget.J0();
                        AnimatorSet animatorSet38 = recordControlsWidget.W0;
                        if (animatorSet38 != null) {
                            animatorSet38.end();
                        }
                        recordControlsWidget.K0();
                        AnimatorSet animatorSet39 = recordControlsWidget.W0;
                        if (animatorSet39 != null) {
                            animatorSet39.end();
                        }
                        recordControlsWidget.M0();
                        lsf lsfVar4 = recordControlsWidget.E0;
                        if (lsfVar4 != null) {
                            r70 r70Var = lsfVar4.v0;
                            if (!r70Var.isLaidOut() || r70Var.isLayoutRequested()) {
                                r70Var.addOnLayoutChangeListener(new qq0(14, lsfVar4));
                            } else {
                                lsfVar4.f();
                            }
                        }
                    } else {
                        recordControlsWidget.K0();
                    }
                }
                return e5fVar;
        }
    }

    public cc1(kp6 kp6Var, np6 np6Var) {
        this.a = 3;
        this.c = kp6Var;
        this.b = np6Var;
    }
}
