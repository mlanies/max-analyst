package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r11 extends FrameLayout {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public r11(final Context context) {
        super(context, null);
        this.a = tu0.r(3, new k11(2));
        final int i = 0;
        this.b = tu0.r(3, new k56() { // from class: q11
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        p11 p11Var = new p11(context, null);
                        r11 r11Var = this;
                        p11Var.setLayoutParams(r11Var.getLayoutParams());
                        r11Var.removeAllViews();
                        r11Var.addView(p11Var);
                        return p11Var;
                    default:
                        j11 j11Var = new j11(context, null);
                        r11 r11Var2 = this;
                        j11Var.setLayoutParams(r11Var2.getLayoutParams());
                        r11Var2.removeAllViews();
                        r11Var2.addView(j11Var);
                        return j11Var;
                }
            }
        });
        final int i2 = 1;
        this.c = tu0.r(3, new k56() { // from class: q11
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        p11 p11Var = new p11(context, null);
                        r11 r11Var = this;
                        p11Var.setLayoutParams(r11Var.getLayoutParams());
                        r11Var.removeAllViews();
                        r11Var.addView(p11Var);
                        return p11Var;
                    default:
                        j11 j11Var = new j11(context, null);
                        r11 r11Var2 = this;
                        j11Var.setLayoutParams(r11Var2.getLayoutParams());
                        r11Var2.removeAllViews();
                        r11Var2.addView(j11Var);
                        return j11Var;
                }
            }
        });
    }

    private final p11 getNewCallBottomPanel() {
        return (p11) this.b.getValue();
    }

    private final j11 getOldCallBottomPanel() {
        return (j11) this.c.getValue();
    }

    public final void a() {
        if (!d()) {
            getOldCallBottomPanel().y();
            return;
        }
        p11 newCallBottomPanel = getNewCallBottomPanel();
        ywe yweVar = newCallBottomPanel.U0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
        ywe yweVar2 = newCallBottomPanel.V0;
        if (yweVar2 != null) {
            yweVar2.dismiss();
        }
        newCallBottomPanel.U0 = null;
        newCallBottomPanel.V0 = null;
    }

    public final void b() {
        if (d()) {
            ywe yweVar = getNewCallBottomPanel().U0;
            if (yweVar != null) {
                yweVar.a();
                return;
            }
            return;
        }
        ywe yweVar2 = getOldCallBottomPanel().Q0;
        if (yweVar2 != null) {
            yweVar2.a();
        }
    }

    public final void c() {
        ywe yweVar;
        if (!d() || (yweVar = getNewCallBottomPanel().V0) == null) {
            return;
        }
        yweVar.a();
    }

    public final boolean d() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void e(ArrayList arrayList) {
        if (d()) {
            return;
        }
        getOldCallBottomPanel().B(arrayList);
    }

    public final void f() {
        if (!d()) {
            getOldCallBottomPanel().C();
            return;
        }
        p11 newCallBottomPanel = getNewCallBottomPanel();
        ywe yweVar = newCallBottomPanel.U0;
        eqe eqeVar = new eqe(b8a.W1);
        int i = x7a.X;
        newCallBottomPanel.U0 = newCallBottomPanel.y(yweVar, newCallBottomPanel.K0, eqeVar, new l11(newCallBottomPanel, 3), Integer.valueOf(i));
    }

    public final void g(kl7 kl7Var) {
        if (d()) {
            return;
        }
        getOldCallBottomPanel().E(kl7Var);
    }

    public final void h() {
        if (d()) {
            p11 newCallBottomPanel = getNewCallBottomPanel();
            newCallBottomPanel.V0 = newCallBottomPanel.y(newCallBottomPanel.V0, newCallBottomPanel.N0, new eqe(b8a.X1), new l11(newCallBottomPanel, 0), null);
        }
    }

    public final void setAudioInfo(a51 a51Var) {
        if (d()) {
            getNewCallBottomPanel().setAudioInfo(a51Var);
        } else {
            getOldCallBottomPanel().setAudioInfo(a51Var);
        }
    }

    public final void setChatUnreadMessageCount(int i) {
        if (d()) {
            getNewCallBottomPanel().setChatUnreadMessageCount(i);
        }
    }

    public final void setClickListener(o11 o11Var) {
        if (d()) {
            getNewCallBottomPanel().setClickListener(o11Var);
        } else {
            getOldCallBottomPanel().setClickListener(o11Var);
        }
    }

    public final void setMicrophoneEnabled(m38 m38Var) {
        if (d()) {
            getNewCallBottomPanel().setMicrophoneEnabled(m38Var);
        } else {
            getOldCallBottomPanel().setMicrophoneEnabled(m38Var);
        }
    }

    public final void setOpenChat(m38 m38Var) {
        if (d()) {
            getNewCallBottomPanel().setOpenChat(m38Var);
        }
    }

    public final void setRaiseHand(m38 m38Var) {
        if (d()) {
            getNewCallBottomPanel().setRaiseHand(m38Var);
        }
    }

    public final void setVideoEnabled(m38 m38Var) {
        if (d()) {
            getNewCallBottomPanel().setVideoEnabled(m38Var);
        } else {
            getOldCallBottomPanel().setVideoEnabled(m38Var);
        }
    }

    public final void setVolumeMicrophone(float f) {
        if (d()) {
            getNewCallBottomPanel().setVolumeMicrophone(f);
        }
    }
}
