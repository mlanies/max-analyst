package defpackage;

import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class p63 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p63(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(MotionEvent motionEvent) {
        ht8 ht8Var = (ht8) this.c;
        View view = ht8Var.I0;
        if (!(view instanceof jw8) || view.getTouchDelegate() == null) {
            return false;
        }
        return ht8Var.I0.getTouchDelegate().onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    KeyEvent.Callback callback = ((ht8) this.c).I0;
                    ot8 ot8Var = callback instanceof ot8 ? (ot8) callback : null;
                    if (ot8Var != null) {
                        ot8Var.d(motionEvent, ht8.R0);
                    }
                }
                return true;
            case 2:
                return true;
            case 3:
            default:
                return super.onDown(motionEvent);
            case 4:
                xkd xkdVar = (xkd) this.b;
                TouchDelegate touchDelegate = xkdVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) && xkdVar.v0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    xkdVar.getRippleDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    xkdVar.getBorderDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    xkdVar.setPressed(true);
                    xkdVar.invalidate();
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    ((zs8) ((ht8) this.c).a).performLongClick();
                    break;
                }
                break;
            case 2:
                super.onLongPress(motionEvent);
                ((k56) this.c).invoke();
                break;
            case 3:
            default:
                super.onLongPress(motionEvent);
                break;
            case 4:
                xkd xkdVar = (xkd) this.b;
                TouchDelegate touchDelegate = xkdVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    xkdVar.setPressed(false);
                    xkdVar.invalidate();
                    xkdVar.performLongClick();
                    break;
                }
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                wab wabVar = (wab) this.b;
                if (wabVar != null) {
                    bc7[] bc7VarArr = ProfileAvatarWidget.X;
                    ProfileAvatarWidget profileAvatarWidget = (ProfileAvatarWidget) this.c;
                    profileAvatarWidget.getClass();
                    bc7 bc7Var = ProfileAvatarWidget.X[0];
                    ((Number) profileAvatarWidget.b.a(profileAvatarWidget)).longValue();
                    ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) wabVar;
                    profileAvatarsScreen.z0(!(profileAvatarsScreen.A0().getVisibility() == 0));
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        a53 a53VarN;
        switch (this.a) {
            case 0:
                o63 o63Var = (o63) this.b;
                if (o63Var == null) {
                    return true;
                }
                ((ewa) o63Var).c(((n63) this.c).getColor());
                return true;
            case 1:
                if (!a(motionEvent)) {
                    ht8 ht8Var = (ht8) this.c;
                    KeyEvent.Callback callback = ht8Var.I0;
                    String strI = null;
                    ot8 ot8Var = callback instanceof ot8 ? (ot8) callback : null;
                    if (ot8Var != null && (a53VarN = ot8Var.n(motionEvent)) != null) {
                        strI = a53VarN.i();
                    }
                    if (ot8Var != null) {
                        ot8Var.d(motionEvent, ht8.S0);
                    }
                    if (ot8Var == null || (!ot8Var.h(motionEvent) && strI == null)) {
                        ((zs8) ht8Var.a).performClick();
                    } else {
                        ((m56) this.b).invoke(strI);
                    }
                }
                return true;
            case 2:
                ((k56) this.b).invoke();
                return true;
            case 3:
            default:
                return super.onSingleTapUp(motionEvent);
            case 4:
                xkd xkdVar = (xkd) this.b;
                TouchDelegate touchDelegate = xkdVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    xkdVar.setPressed(false);
                    xkdVar.invalidate();
                    if (xkdVar.v0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ((k56) this.c).invoke();
                    } else {
                        ((View) xkdVar.getParent()).performClick();
                    }
                }
                return true;
        }
    }

    public p63(ht8 ht8Var, ft8 ft8Var) {
        this.a = 1;
        this.c = ht8Var;
        this.b = ft8Var;
    }
}
