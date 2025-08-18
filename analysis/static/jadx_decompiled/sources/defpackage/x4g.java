package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.welcome.WelcomeScreen;

/* loaded from: classes2.dex */
public final class x4g extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ WelcomeScreen b;

    public /* synthetic */ x4g(WelcomeScreen welcomeScreen, int i) {
        this.a = i;
        this.b = welcomeScreen;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                WelcomeScreen welcomeScreen = this.b;
                ((ad) welcomeScreen.c.getValue()).g("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.m0(welcomeScreen, z7.B(welcomeScreen.getContext(), jpc.L1));
                break;
            default:
                WelcomeScreen welcomeScreen2 = this.b;
                ((ad) welcomeScreen2.c.getValue()).g("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.m0(welcomeScreen2, z7.B(welcomeScreen2.getContext(), jpc.M1));
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
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }
}
