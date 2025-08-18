package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class jp extends kxc {
    public static int[] n;
    public final WeakHashMap m;

    public jp(Context context, mi5 mi5Var) {
        super(context, mi5Var);
        this.m = new WeakHashMap(1);
    }

    public final boolean u() {
        return this.g.getBoolean("app.messages.enable.animations", true);
    }

    public final int v() {
        return w()[3];
    }

    public final int[] w() {
        if (n == null) {
            Context context = this.f;
            n = new int[]{context.getResources().getColor(ftb.led_1), context.getResources().getColor(ftb.led_2), context.getResources().getColor(ftb.led_3), context.getResources().getColor(ftb.led_4), context.getResources().getColor(ftb.led_5), context.getResources().getColor(ftb.led_6), context.getResources().getColor(ftb.led_7)};
        }
        return n;
    }

    public final String x(String str) {
        ne7 ne7Var = this.g;
        String string = ne7Var.getString(str, "DEFAULT");
        if (!string.equals("DEFAULT") && !string.equals("_NONE_")) {
            if (ne7Var.getBoolean("app.oldSounds", false)) {
                this.f.getResources();
                throw null;
            }
            if (string.equals(Settings.System.DEFAULT_NOTIFICATION_URI.toString())) {
                return "DEFAULT";
            }
        }
        return string;
    }

    public final void y(String str) {
        m("app.night.mode", str);
    }

    public final void z(gaf gafVar) {
        hm9.m("jp", "updateUserSettings, settings = %s", gafVar);
        Long l = gafVar.b;
        if (l != null) {
            l("app.notification.dontDisturbUntil", l);
        }
        Boolean bool = gafVar.a;
        if (bool != null) {
            j("app.notification.show.new.users", bool.booleanValue());
        }
        int i = 2;
        String str = gafVar.c;
        if (str != null) {
            int i2 = !str.equals("OFF") ? !str.equals("REPLY") ? 0 : 2 : 1;
            k(i2, "app.notification.dialogs.show");
            this.j.e(Integer.valueOf(i2));
        }
        String str2 = gafVar.d;
        if (str2 != null) {
            if (str2.equals("OFF")) {
                i = 1;
            } else if (!str2.equals("REPLY")) {
                i = 0;
            }
            s(i);
        }
        String str3 = gafVar.e;
        if (str3 != null) {
            m("app.notification.ringtone", str3);
        }
        String str4 = gafVar.f;
        if (str4 != null) {
            m("app.notification.dialogs.ringtone", str4);
        }
        String str5 = gafVar.g;
        if (str5 != null) {
            m("app.notification.chats.ringtone", str5);
        }
        Integer num = gafVar.i;
        if (num != null) {
            k(m6d.s(num.intValue()), "app.notification.led.color");
        }
        if (gafVar.h != null) {
            j("app.privacy.online.show", !r0.booleanValue());
        }
        Integer num2 = gafVar.j;
        if (num2 != null) {
            k(m6d.s(num2.intValue()), "app.notification.dialogs.led.color");
        }
        Integer num3 = gafVar.k;
        if (num3 != null) {
            k(m6d.s(num3.intValue()), "app.notification.chats.led.color");
        }
        Boolean bool2 = gafVar.l;
        if (bool2 != null) {
            j("app.notification.vibrate", bool2.booleanValue());
        }
        Boolean bool3 = gafVar.m;
        if (bool3 != null) {
            j("app.notification.dialogs.vibrate", bool3.booleanValue());
        }
        Boolean bool4 = gafVar.n;
        if (bool4 != null) {
            j("app.notification.chats.vibrate", bool4.booleanValue());
        }
        int i3 = gafVar.p;
        if (i3 != 0) {
            m("app.privacy.incoming.call", h4f.k(i3));
        }
        int i4 = gafVar.o;
        if (i4 != 0) {
            m("app.privacy.chats.invite", h4f.k(i4));
        }
        faf fafVar = gafVar.q;
        if (fafVar != null) {
            m("app.privacy.inactive.ttl", fafVar.a);
        }
        int i5 = gafVar.r;
        if (i5 != 0) {
            m("app.group.chat.call.notification.status", h4f.j(i5));
        }
        int i6 = gafVar.s;
        if (i6 != 0) {
            m("app.suggest.stickers.status", h4f.l(i6));
        }
        Boolean bool5 = gafVar.t;
        if (bool5 != null) {
            j("audio.transcription.enabled", bool5.booleanValue());
        }
        Boolean bool6 = gafVar.u;
        if (bool6 != null) {
            j("app.privacy.safe_mode", bool6.booleanValue());
        }
        int i7 = gafVar.v;
        if (i7 != 0) {
            m("app.privacy.search_by_phone", h4f.k(i7));
        }
        Boolean bool7 = gafVar.w;
        if (bool7 != null) {
            j("app.privacy.unsafe.files", bool7.booleanValue());
        }
    }
}
