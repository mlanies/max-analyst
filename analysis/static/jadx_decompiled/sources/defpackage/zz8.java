package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class zz8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ zz8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        CharSequence charSequenceSubSequence;
        int i = 5;
        int i2 = 2;
        e5f e5fVar = e5f.a;
        MessageWriteWidget messageWriteWidget = this.b;
        int i3 = 1;
        switch (this.a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                bc7[] bc7VarArr = MessageWriteWidget.F0;
                sv8 sv8Var = new sv8(viewGroup.getContext());
                Context context = sv8Var.getContext();
                MessageWriteWidget messageWriteWidget2 = this.b;
                GestureDetector gestureDetector = new GestureDetector(context, new ua6(1, new d09(0, 0, xz8.class, messageWriteWidget2.v0(), "onEmojiClick", "onEmojiClick(ZZ)V")));
                gestureDetector.setIsLongpressEnabled(false);
                sv8Var.setLeftInnerIconTouchListener(new q46(gestureDetector, i));
                sv8Var.setRightInnerIconVisible(true);
                GestureDetector gestureDetector2 = new GestureDetector(sv8Var.getContext(), new ua6(1, new e11(0, messageWriteWidget2, MessageWriteWidget.class, "onClickAttachPicker", "onClickAttachPicker()V", 0, 29)));
                gestureDetector2.setIsLongpressEnabled(false);
                sv8Var.setRightInnerIconTouchListener(new q46(gestureDetector2, i));
                sv8Var.setRightOuterIconTouchListener(new rf1(new om8(1, messageWriteWidget2, MessageWriteWidget.class, "onTouch", "onTouch(Landroid/view/MotionEvent;)V", 0, 4), i2, new GestureDetector(sv8Var.getContext(), new p63(new e09(0, messageWriteWidget2, MessageWriteWidget.class, "onRightOuterIconClick", "onRightOuterIconClick()V", 0, 0), 2, new e09(0, messageWriteWidget2, MessageWriteWidget.class, "onSendLongClick", "onSendLongClick()V", 0, 1)))));
                sv8Var.setVideoMessageEnabled(((se5) ((qe5) messageWriteWidget2.Z.getValue())).v());
                sv8Var.setVideoMessageTouchListener(new ei1(3, messageWriteWidget2));
                if (((Boolean) messageWriteWidget2.t0.getValue()).booleanValue()) {
                    sv8Var.c.addTextChangedListener(new vf1(new zz8(messageWriteWidget2, i3), 7, sv8Var));
                }
                sv8Var.setInputKeyListener(new b09(i, messageWriteWidget2));
                sv8Var.setCustomSelectionActionModeCallback(new zz8(messageWriteWidget2, i2));
                viewGroup.addView(sv8Var);
                View w12Var = new w12(viewGroup.getContext());
                w12Var.setId(lga.x);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                w12Var.setLayoutParams(layoutParams);
                w12Var.setBackgroundColor(0);
                viewGroup.addView(w12Var);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                bc7[] bc7VarArr2 = MessageWriteWidget.F0;
                if (charSequence != null) {
                    int length = charSequence.length() - 1;
                    int i4 = 0;
                    boolean z = false;
                    while (i4 <= length) {
                        boolean z2 = tpa.m(charSequence.charAt(!z ? i4 : length), 32) <= 0;
                        if (z) {
                            if (z2) {
                                length--;
                            } else {
                                charSequenceSubSequence = charSequence.subSequence(i4, length + 1);
                            }
                        } else if (z2) {
                            i4++;
                        } else {
                            z = true;
                        }
                    }
                    charSequenceSubSequence = charSequence.subSequence(i4, length + 1);
                } else {
                    charSequenceSubSequence = null;
                }
                if ((((charSequenceSubSequence == null || charSequenceSubSequence.length() == 0) ? 1 : 0) ^ 1) != 0 && charSequence != null && w9e.D0(charSequence) == '\n') {
                    messageWriteWidget.A0();
                    break;
                }
                break;
            case 2:
                bc7[] bc7VarArr3 = MessageWriteWidget.F0;
                xz7 xz7Var = new xz7((EditText) obj, new y8(messageWriteWidget));
                messageWriteWidget.A0 = xz7Var;
                break;
            case 3:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr4 = MessageWriteWidget.F0;
                zz8 zz8Var = new zz8(messageWriteWidget, i);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(lga.w);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                zz8Var.invoke(frameLayout);
                linearLayout.addView(frameLayout);
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7VarArr5 = MessageWriteWidget.F0;
                if (zBooleanValue) {
                    xz8.z(messageWriteWidget.v0(), 2, 2);
                    break;
                }
                break;
            default:
                bc7[] bc7VarArr6 = MessageWriteWidget.F0;
                xz8 xz8VarV0 = messageWriteWidget.v0();
                xz8VarV0.getClass();
                pnf.o(xz8VarV0.z0, new hz8((Uri) obj));
                break;
        }
        return e5fVar;
    }
}
