package defpackage;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class e27 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e27(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Layout layout;
        Layout layout2;
        switch (this.a) {
            case 0:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                ((ad) inputPhoneScreen.Z.getValue()).g("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.m0(inputPhoneScreen, z7.B(inputPhoneScreen.getContext(), jpc.L1));
                break;
            case 1:
                InputPhoneScreen inputPhoneScreen2 = (InputPhoneScreen) this.b;
                ((ad) inputPhoneScreen2.Z.getValue()).g("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.m0(inputPhoneScreen2, z7.B(inputPhoneScreen2.getContext(), jpc.M1));
                break;
            default:
                p85 p85Var = (p85) this.b;
                if (!p85Var.y0) {
                    p85Var.z0 = true;
                    p85Var.u0 = p85Var.w0;
                    p85Var.requestLayout();
                    break;
                } else if (!p85Var.z0 && (layout = p85Var.w0) != null && (layout2 = p85Var.v0) != null) {
                    p85Var.z0 = true;
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layout2.getHeight(), layout.getHeight());
                    valueAnimatorOfInt.setInterpolator(new wb5());
                    valueAnimatorOfInt.setDuration(200L);
                    valueAnimatorOfInt.addUpdateListener(new z00(8, p85Var));
                    valueAnimatorOfInt.addListener(new lf(p85Var, 1, layout));
                    valueAnimatorOfInt.addListener(new mf(3, p85Var));
                    valueAnimatorOfInt.start();
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(qp4.u0.j((p85) this.b).getText().j);
                break;
        }
    }
}
