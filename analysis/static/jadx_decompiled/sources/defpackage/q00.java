package defpackage;

import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.mediabar.LocalPhotoView;
import ru.ok.messages.views.fragments.FrgProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class q00 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        WeakReference weakReference;
        KeyEvent.Callback callback;
        switch (this.a) {
            case 4:
                ap1 ap1Var = (ap1) this.b;
                xo1 xo1Var = ap1Var.b1;
                if (xo1Var != null) {
                    xo1Var.y(ap1Var.h1);
                }
                return ap1Var.b1 != null;
            case 5:
                qz7 qz7Var = ((j33) this.b).d;
                if (qz7Var == null || (weakReference = (WeakReference) qz7Var.b) == null || (callback = (View) weakReference.get()) == null) {
                    return false;
                }
                GestureDetector.OnDoubleTapListener onDoubleTapListener = callback instanceof GestureDetector.OnDoubleTapListener ? (GestureDetector.OnDoubleTapListener) callback : null;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return false;
            case 6:
                jn jnVar = (jn) this.b;
                int i = jnVar.b;
                if (i == 0) {
                    int i2 = i + 1;
                    jnVar.b = i2;
                    wm4 wm4Var = (wm4) jnVar.c;
                    if (wm4Var != null) {
                        wm4Var.f(i2);
                    }
                }
                return true;
            case 8:
                cn4 cn4Var = (cn4) this.b;
                int i3 = cn4Var.c;
                if (i3 == 0) {
                    int i4 = i3 + 1;
                    cn4Var.c = i4;
                    bn4 bn4Var = cn4Var.a;
                    if (bn4Var != null) {
                        bn4Var.f(i4);
                    }
                }
                return true;
            case 11:
                wa6 wa6Var = (wa6) this.b;
                float currentScale = wa6Var.getCurrentScale() * ((float) Math.pow(wa6Var.getMaxScale() / wa6Var.getMinScale(), 1.0f / wa6Var.W0));
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (currentScale > wa6Var.getMaxScale()) {
                    currentScale = wa6Var.getMaxScale();
                }
                float currentScale2 = wa6Var.getCurrentScale();
                s37 s37Var = new s37(wa6Var, currentScale2, currentScale - currentScale2, x, y);
                wa6Var.K0 = s37Var;
                wa6Var.post(s37Var);
                return super.onDoubleTap(motionEvent);
            case 18:
                float x2 = motionEvent.getX();
                fag fagVar = (fag) this.b;
                fagVar.i = x2;
                fagVar.j = motionEvent.getY();
                fagVar.k = 1;
                return true;
            case 19:
                ((ZoomableDraweeView) this.b).E0.a(motionEvent.getX(), motionEvent.getY());
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
            case 6:
            case 7:
            case 8:
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case 16:
            case 18:
            default:
                return super.onDown(motionEvent);
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                j33 j33Var = (j33) this.b;
                j33Var.g = false;
                Spannable spannable = j33Var.e;
                if (spannable == null) {
                    return false;
                }
                j33Var.f = j33.a(j33Var, j33Var.d, spannable, motionEvent);
                return j33Var.f != null;
            case 9:
                return true;
            case 10:
                return true;
            case 13:
                sv8 sv8Var = (sv8) this.b;
                Editable text = sv8Var.c.getText();
                if (text == null) {
                    return false;
                }
                jv8.a.onTouchEvent(sv8Var.c, text, motionEvent);
                return false;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                float x = motionEvent.getX();
                ohf ohfVar = (ohf) this.b;
                float width = x - (ohfVar.getWidth() / 2.0f);
                float y = motionEvent.getY() - (ohfVar.getHeight() / 2.0f);
                if (ohfVar.i()) {
                    long jE = ohfVar.e(ohfVar.getWidth() / 2.0f, ohfVar.getHeight() / 2.0f);
                    if (((float) Math.hypot((r1 + width) - Float.intBitsToFloat((int) (jE >> 32)), (r4 + y) - Float.intBitsToFloat((int) (jE & 4294967295L)))) <= fk4.d().getDisplayMetrics().density * 12.0f * 2) {
                        ohfVar.getParent().requestDisallowInterceptTouchEvent(true);
                        ohfVar.C0 = true;
                        ohfVar.l(width, y);
                        ohfVar.d(true);
                    }
                }
                return true;
            case 19:
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        Spannable spannable;
        lk7 lk7Var;
        lk7 lk7Var2;
        String str;
        mhf listener;
        Object obj = this.b;
        switch (this.a) {
            case 3:
                no1 no1Var = (no1) obj;
                lo1 lo1Var = no1Var.f1;
                if (lo1Var != null) {
                    gg1 gg1Var = no1Var.i1;
                    Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
                    yxc yxcVar = CallScreen.R0;
                    ((ui1) lo1Var).a.D0().x(gg1Var, point);
                    break;
                }
                break;
            case 4:
                ap1 ap1Var = (ap1) obj;
                xo1 xo1Var = ap1Var.b1;
                if (xo1Var != null) {
                    xo1Var.v(ap1Var.h1, new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
                    break;
                }
                break;
            case 5:
                j33 j33Var = (j33) obj;
                qz7 qz7Var = j33Var.d;
                if (qz7Var != null && (spannable = j33Var.e) != null && spannable.length() != 0) {
                    ClickableSpan clickableSpanA = j33.a(j33Var, qz7Var, spannable, motionEvent);
                    if (clickableSpanA instanceof URLSpan) {
                        lk7Var = lk7.a;
                        j33Var.c = ((URLSpan) clickableSpanA).getURL();
                    } else if (clickableSpanA instanceof ek7) {
                        lk7Var = lk7.Y;
                        j33Var.c = ((ek7) clickableSpanA).b;
                    } else if (clickableSpanA instanceof qu8) {
                        nu8 nu8Var = ((qu8) clickableSpanA).a;
                        if (nu8Var.c == mu8.a) {
                            lk7 lk7Var3 = lk7.X;
                            int i = nu8Var.e;
                            try {
                                j33Var.c = spannable.subSequence(((qu8) clickableSpanA).a.d, ((qu8) clickableSpanA).a.e).toString();
                                lk7Var2 = lk7Var3;
                                j33Var.f = clickableSpanA;
                                str = j33Var.c;
                                if (str != null && str.length() != 0) {
                                    j33Var.a.d(clickableSpanA, spannable.getSpanStart(clickableSpanA), spannable.getSpanEnd(clickableSpanA), str, lk7Var2, motionEvent);
                                    j33Var.g = true;
                                    break;
                                }
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                    } else if (clickableSpanA instanceof cmb) {
                        lk7Var = lk7.X;
                        j33Var.c = ((cmb) clickableSpanA).a;
                    }
                    lk7Var2 = lk7Var;
                    j33Var.f = clickableSpanA;
                    str = j33Var.c;
                    if (str != null) {
                        j33Var.a.d(clickableSpanA, spannable.getSpanStart(clickableSpanA), spannable.getSpanEnd(clickableSpanA), str, lk7Var2, motionEvent);
                        j33Var.g = true;
                    }
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ohf ohfVar = (ohf) obj;
                if (!ohfVar.C0 && (listener = ohfVar.getListener()) != null) {
                    ((dif) listener).performLongClick();
                    break;
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 11:
                ((wa6) this.b).g(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        r00 r00Var;
        g71 g71Var;
        k56 k56Var;
        WeakReference weakReference;
        wm4 wm4Var;
        bn4 bn4Var;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                AttachPhotoView attachPhotoView = (AttachPhotoView) obj;
                if (!attachPhotoView.J0.e(attachPhotoView.getMeasuredWidth() / 2, attachPhotoView.getMeasuredHeight() / 2, motionEvent) && (r00Var = attachPhotoView.I0) != null) {
                    ((FrgAttachPhoto) r00Var).E1(attachPhotoView.Q0);
                }
                return true;
            case 1:
            case 11:
            case 13:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 2:
                m71 m71Var = (m71) obj;
                l71 l71Var = m71Var.J0;
                if (l71Var != null && (g71Var = ((h71) ((qqd) l71Var).b).O0) != null) {
                    yxc yxcVar = CallScreen.R0;
                    CallScreen callScreen = ((ki1) g71Var).a;
                    if (callScreen.D0().q(callScreen.z0().g)) {
                        CallScreen.q0(callScreen);
                    }
                }
                return m71Var.J0 != null;
            case 3:
                no1 no1Var = (no1) obj;
                lo1 lo1Var = no1Var.f1;
                if (lo1Var != null) {
                    yxc yxcVar2 = CallScreen.R0;
                    CallScreen callScreen2 = ((ui1) lo1Var).a;
                    if (callScreen2.D0().q(callScreen2.z0().g)) {
                        CallScreen.q0(callScreen2);
                    }
                }
                return no1Var.f1 != null;
            case 4:
                ap1 ap1Var = (ap1) obj;
                xo1 xo1Var = ap1Var.b1;
                if (xo1Var != null) {
                    xo1Var.H(ap1Var.h1);
                }
                return ap1Var.b1 != null;
            case 5:
                j33 j33Var = (j33) obj;
                qz7 qz7Var = j33Var.d;
                View view = (qz7Var == null || (weakReference = (WeakReference) qz7Var.b) == null) ? null : (View) weakReference.get();
                ClickableSpan clickableSpan = j33Var.f;
                if (clickableSpan == null || view == null) {
                    j33Var.g = false;
                    if (clickableSpan == null && view != null && (k56Var = j33Var.h) != null) {
                        if (k56Var != null) {
                            k56Var.invoke();
                        }
                        j33Var.d = null;
                    }
                } else {
                    if (!j33Var.g) {
                        clickableSpan.onClick(view);
                    }
                    j33Var.d = null;
                    j33Var.f = null;
                    j33Var.e = null;
                    j33Var.c = null;
                    j33Var.g = false;
                }
                return true;
            case 6:
                jn jnVar = (jn) obj;
                if (jnVar.b == 0 && (wm4Var = (wm4) jnVar.c) != null) {
                    wm4Var.b();
                }
                return true;
            case 7:
                u5e u5eVar = (u5e) ((zm4) obj).e;
                u5eVar.getClass();
                bc7[] bc7VarArr = VideoViewerWidget.u0;
                dmf dmfVarO0 = ((VideoViewerWidget) u5eVar.a).o0();
                if (dmfVarO0 != null) {
                    ((ChatMediaViewerScreen) dmfVarO0).G0(true);
                }
                return super.onSingleTapConfirmed(motionEvent);
            case 8:
                cn4 cn4Var = (cn4) obj;
                if (cn4Var.c == 0 && (bn4Var = cn4Var.a) != null) {
                    bn4Var.b();
                }
                return true;
            case 9:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) obj;
                if (frgContactAvatar.I1) {
                    frgContactAvatar.I1 = false;
                } else if (frgContactAvatar.r1() != null) {
                    frgContactAvatar.r1().e();
                }
                return true;
            case 10:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) obj;
                if (frgProfilePhoto.r1() != null) {
                    frgProfilePhoto.r1().e();
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int i = LocalPhotoView.I0;
                hm9.k("ru.ok.messages.media.mediabar.LocalPhotoView", "onSingleTapConfirmed");
                rq7 rq7Var = ((LocalPhotoView) obj).H0;
                if (rq7Var != null) {
                    rq7Var.b();
                }
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                wk9 wk9Var = ((oj9) obj).u0;
                if (wk9Var != null) {
                    wk9Var.n(new fj0(18));
                }
                return super.onSingleTapConfirmed(motionEvent);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                hwa hwaVar = ((iwa) obj).I0;
                if (hwaVar != null) {
                    hwaVar.f();
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        b17 b17Var;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                qv0 qv0Var = (qv0) obj;
                ov0 ov0Var = qv0Var.C0;
                fv0 fv0Var = qv0Var.D0;
                kv0 kv0Var = qv0Var.E0;
                if (ov0Var != null && fv0Var != null && kv0Var != null && !fv0Var.s0) {
                    c17 c17Var = (c17) ov0Var;
                    p44 p44Var = c17Var.u0;
                    p44Var.getClass();
                    if (p44Var.b) {
                        p44Var.b = false;
                        z07 z07Var = c17Var.o;
                        if (z07Var != null && (b17Var = c17Var.t0) != null) {
                            long j = c17Var.c;
                            bc7[] bc7VarArr = MessagesListWidget.X0;
                            n59 n59VarX0 = ((MessagesListWidget) ((yt8) b17Var).b).x0();
                            n59VarX0.m1.o1(n59VarX0, n59.D1[4], j47.S(n59VarX0.a, ((w9a) n59VarX0.Y).b(), vx3.b, new x39(fv0Var, n59VarX0, j, z07Var, kv0Var, null)));
                        }
                        c17Var.postDelayed(new re(12, (es3) p44Var.c), p44Var.a);
                    }
                }
                qv0Var.D0 = null;
                qv0Var.E0 = null;
                qv0Var.invalidate();
                return true;
            case 5:
                j33 j33Var = (j33) obj;
                if (j33Var.i) {
                    Runnable runnable = j33Var.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    onSingleTapConfirmed(motionEvent);
                }
                return false;
            case 6:
                jn jnVar = (jn) obj;
                int i = jnVar.b;
                if (i > 0) {
                    int i2 = i + 1;
                    jnVar.b = i2;
                    wm4 wm4Var = (wm4) jnVar.c;
                    if (wm4Var != null) {
                        wm4Var.f(i2);
                    }
                }
                return true;
            case 8:
                cn4 cn4Var = (cn4) obj;
                int i3 = cn4Var.c;
                if (i3 > 0) {
                    int i4 = i3 + 1;
                    cn4Var.c = i4;
                    bn4 bn4Var = cn4Var.a;
                    if (bn4Var != null) {
                        bn4Var.f(i4);
                    }
                }
                return true;
            case 13:
                sv8 sv8Var = (sv8) obj;
                Editable text = sv8Var.c.getText();
                if (text != null) {
                    jv8.a.onTouchEvent(sv8Var.c, text, motionEvent);
                }
                return false;
            case 16:
                ufd ufdVar = (ufd) obj;
                if (!ufdVar.P0.a() || ((tja) ufdVar.P0.getValue()).isEnabled()) {
                    return false;
                }
                qfd qfdVar = ufdVar.S0;
                if (qfdVar != null) {
                    qfdVar.B(ufdVar.getModelItem().getItemId());
                }
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                ohf ohfVar = (ohf) obj;
                if (!ohfVar.i()) {
                    mhf listener = ohfVar.getListener();
                    if (listener != null) {
                        ((dif) listener).t();
                    }
                    ohfVar.setInPause(true);
                } else if (ohfVar.i()) {
                    mhf listener2 = ohfVar.getListener();
                    if (listener2 != null) {
                        ((dif) listener2).v();
                    }
                    ohfVar.setInPause(false);
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
