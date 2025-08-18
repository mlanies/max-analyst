package defpackage;

import android.os.Vibrator;

/* loaded from: classes.dex */
public final class q71 {
    public final je7 a;
    public final je7 b;

    public q71(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final void a() {
        hm9.n("HandleSilenceMode", "try mute ringtones");
        xh1 xh1VarA = ((lkc) this.b.getValue()).a();
        if (xh1VarA.g == null && ((Vibrator) xh1VarA.e.getValue()) == null) {
            hm9.n("RingtoneManagerTag", " mute already set");
        } else {
            hm9.n("RingtoneManagerTag", " set mute");
            xh1VarA.c();
        }
    }
}
