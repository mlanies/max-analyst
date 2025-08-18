package defpackage;

import android.text.Editable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class ei1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ei1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent parent2;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                yxc yxcVar = CallScreen.R0;
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (motionEvent.getAction() != 1 || eventTime >= 100) {
                        return false;
                    }
                    CallScreen callScreen = (CallScreen) obj;
                    if (!callScreen.D0().q(callScreen.z0().g)) {
                        return false;
                    }
                    CallScreen.q0(callScreen);
                }
                return true;
            case 1:
                int action = motionEvent.getAction();
                View view2 = ((sr3) obj).a;
                if ((action == 0 || action == 2) && (parent = view2.getParent()) != null && (parent2 = parent.getParent()) != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return view2.onTouchEvent(motionEvent);
            case 2:
                qs4 qs4Var = (qs4) obj;
                qs4Var.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - qs4Var.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        qs4Var.m = false;
                    }
                    qs4Var.u();
                    qs4Var.m = true;
                    qs4Var.o = System.currentTimeMillis();
                }
                return false;
            case 3:
                bc7[] bc7VarArr = MessageWriteWidget.F0;
                xz8 xz8VarV0 = ((MessageWriteWidget) obj).v0();
                xz8VarV0.getClass();
                pnf.o(xz8VarV0.T0, new ez8(bac.a, motionEvent));
                return true;
            case 4:
                EditText editText = (EditText) obj;
                if (editText.getCompoundDrawables()[2] == null || motionEvent.getRawX() < ((editText.getRight() - editText.getPaddingRight()) - r6.getBounds().width()) - editText.getCompoundDrawablePadding()) {
                    return false;
                }
                int action2 = motionEvent.getAction();
                if (action2 != 0) {
                    if (action2 != 1) {
                        return false;
                    }
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                }
                return true;
            case 5:
                return ((Boolean) ((a66) obj).invoke(view, motionEvent)).booleanValue();
            default:
                ScaleGestureDetector scaleGestureDetector = ((VideoMessageWidget) obj).w0;
                if (scaleGestureDetector != null) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                return true;
        }
    }
}
