package defpackage;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class xe1 extends hqd {
    public final xo1 F0;
    public final ap1 G0;

    public xe1(FrameLayout frameLayout, xo1 xo1Var) {
        super(frameLayout);
        this.F0 = xo1Var;
        this.G0 = (ap1) frameLayout.findViewById(rvb.call_opponent);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        hb1 hb1Var = (hb1) ol7Var;
        CharSequence charSequence = hb1Var.c;
        String str = hb1Var.o;
        ap1 ap1Var = this.G0;
        ap1Var.J(str, charSequence);
        ap1Var.F(hb1Var.s0);
        ap1Var.G(hb1Var.Y);
        ap1Var.setAvatar(hb1Var.X);
        ap1Var.setRaiseHand(hb1Var.v0);
        ap1Var.setOpponentVideo(hb1Var.z0);
        ap1Var.setButtonAction(hb1Var.A0);
        ap1Var.h1 = hb1Var.a;
        ap1Var.b1 = this.F0;
    }
}
