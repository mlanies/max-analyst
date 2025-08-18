package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* loaded from: classes.dex */
public final class ty0 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ty0(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var2;
        this.b = je7Var3;
        this.c = je7Var;
    }

    public final boolean a(Context context, Intent intent, String str) {
        hm9.n("CallActionsProcessor", "handleCallNotificationActionIntent action=" + intent.getAction() + " from=" + str);
        String action = intent.getAction();
        if (action == null) {
            return false;
        }
        z01 z01Var = (z01) n31.a.getAccessor().c(z01.class);
        wa1 wa1VarD = oz7.d(action);
        if (wa1VarD.equals(sa1.a)) {
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.setAction("action-open-call");
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        } else {
            boolean zEquals = wa1VarD.equals(na1.a);
            je7 je7Var = this.c;
            if (zEquals) {
                if (((eua) this.a.getValue()).b(eua.h)) {
                    ((wr1) ((kr1) je7Var.getValue())).e();
                    Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
                    intent3.setAction("action-open-call");
                    intent3.setFlags(268435456);
                    context.startActivity(intent3);
                } else {
                    Bundle extras = intent.getExtras();
                    Intent intent4 = new Intent(context, (Class<?>) MainActivity.class);
                    intent4.setAction("action-open-incoming");
                    if (extras != null) {
                        intent4.putExtras(extras);
                    }
                    intent4.setFlags(268435456);
                    context.startActivity(intent4);
                }
            } else if (wa1VarD.equals(qa1.a)) {
                ((wr1) ((kr1) je7Var.getValue())).v();
            } else if (wa1VarD.equals(oa1.a)) {
                bt1 bt1Var = (bt1) this.b.getValue();
                String str2 = ((wr1) ((kr1) je7Var.getValue())).k().c;
                a11 a11Var = (a11) z01Var;
                long j = a11Var.d() ? 0L : 1L;
                boolean z = ((wr1) ((kr1) je7Var.getValue())).k().h;
                bt1Var.getClass();
                bt1.c(bt1Var, "AUDIO_ENABLED", str2, null, Long.valueOf(j), null, null, z, 52);
                boolean z2 = !a11Var.d();
                MicrophoneManager microphoneManagerC = a11Var.c();
                if (microphoneManagerC != null) {
                    microphoneManagerC.setMicEnabled(z2);
                }
            } else if (wa1VarD.equals(pa1.a)) {
                ((wr1) ((kr1) je7Var.getValue())).w(ji6.c);
            } else if (wa1VarD.equals(ta1.a)) {
                Bundle extras2 = intent.getExtras();
                Intent intent5 = new Intent(context, (Class<?>) MainActivity.class);
                intent5.setAction("action-open-incoming");
                if (extras2 != null) {
                    intent5.putExtras(extras2);
                }
                intent5.setFlags(268435456);
                context.startActivity(intent5);
            } else if (wa1VarD.equals(ra1.a)) {
                Bundle extras3 = intent.getExtras();
                Intent intent6 = new Intent(context, (Class<?>) MainActivity.class);
                intent6.setAction("action-join-link");
                if (extras3 != null) {
                    intent6.putExtras(extras3);
                }
                intent6.setFlags(268435456);
                context.startActivity(intent6);
            } else {
                if (!wa1VarD.equals(ua1.a)) {
                    if (wa1VarD.equals(va1.a)) {
                        return false;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Bundle extras4 = intent.getExtras();
                Intent intent7 = new Intent(context, (Class<?>) MainActivity.class);
                intent7.setAction("action-rate-call");
                if (extras4 != null) {
                    intent7.putExtras(extras4);
                }
                intent7.setFlags(268435456);
                context.startActivity(intent7);
            }
        }
        return true;
    }
}
