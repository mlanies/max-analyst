package ru.ok.messages.settings;

import android.content.res.Resources;
import defpackage.ed3;
import defpackage.f46;
import defpackage.gcd;
import defpackage.j47;
import defpackage.jp;
import defpackage.jpc;
import defpackage.kke;
import defpackage.lz7;
import defpackage.oag;
import defpackage.qyc;
import defpackage.t33;
import defpackage.vl;
import defpackage.w9a;
import defpackage.xq9;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.z46;
import defpackage.z7d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/settings/FrgMessagesSettings;", "Lru/ok/messages/settings/FrgBaseSettings;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FrgMessagesSettings extends FrgBaseSettings {
    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "SETTINGS_MESSAGES";
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final ArrayList r1() {
        String str;
        jp jpVar = ((y8a) ((ed3) this.p1.b)).n().c;
        ArrayList arrayList = new ArrayList();
        gcd gcdVar = new gcd(xxb.setting_message_send_by_enter, h0(jpc.C1), null, null, Boolean.valueOf(jpVar.g.getBoolean("app.messages.send.by.enter", false)), 2);
        gcdVar.Z = true;
        arrayList.add(gcdVar);
        z7d z7dVar = ((y8a) ((ed3) this.p1.b)).n().b;
        z7dVar.getClass();
        List listT = z7dVar.t(PmsKey.f7audiotranscriptionlocales, qyc.n);
        t33 t33Var = ((y8a) ((ed3) this.p1.b)).n().a;
        int i = lz7.g;
        String strR = t33Var.r();
        if (oag.t(strR)) {
            strR = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        }
        Locale locale = Locale.ROOT;
        if (listT.contains(strR.toLowerCase(locale)) || listT.contains(Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage().toLowerCase(locale))) {
            int i2 = xxb.setting_message_audio_transcription;
            String strH0 = h0(jpc.B1);
            Boolean boolValueOf = Boolean.valueOf(jpVar.g.getBoolean("audio.transcription.enabled", true));
            str = null;
            gcd gcdVar2 = new gcd(i2, strH0, null, null, boolValueOf, 2);
            gcdVar2.Z = true;
            arrayList.add(gcdVar2);
        } else {
            str = null;
        }
        arrayList.add(gcd.a(xxb.setting_message_stickers, h0(jpc.c3), str));
        return arrayList;
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final String s1() {
        return h0(jpc.A1);
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final void t1(int i) {
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final void u1(int i, Object obj) {
        jp jpVar = vl.o.a().c;
        if (i == xxb.setting_message_send_by_enter) {
            jpVar.j("app.messages.send.by.enter", ((Boolean) obj).booleanValue());
            return;
        }
        if (i == xxb.setting_message_in_app_browser) {
            Boolean bool = (Boolean) obj;
            ((y8a) ((ed3) this.p1.b)).b().g("ACTION_IN_APP_BROWSER", bool.booleanValue() ? "1" : "2");
            jpVar.j("app.messages.inAppBrowser", bool.booleanValue());
            return;
        }
        if (i == xxb.setting_message_replace_emoji) {
            Boolean bool2 = (Boolean) obj;
            ((y8a) ((ed3) this.p1.b)).b().g("REPLACE_EMOJI", bool2.booleanValue() ? "1" : "0");
            jpVar.j("app.messages.replace.emoji", bool2.booleanValue());
        } else if (i == xxb.setting_message_reactions_double_tap) {
            Boolean bool3 = (Boolean) obj;
            ((y8a) ((ed3) this.p1.b)).b().g("ENABLE_DOUBLE_TAP_REACTIONS", bool3.booleanValue() ? "1" : "0");
            jpVar.j("app.messages.enable.double.tap.reactions", bool3.booleanValue());
        } else if (i == xxb.setting_message_audio_transcription) {
            Boolean bool4 = (Boolean) obj;
            ((y8a) ((ed3) this.p1.b)).b().g("ENABLE_AUDIO_TRANSCRIPTION", bool4.booleanValue() ? "1" : "0");
            jpVar.j("audio.transcription.enabled", bool4.booleanValue());
            j47.T(f46.J(this), ((w9a) ((kke) ((y8a) ((ed3) this.p1.b)).getAccessor().c(kke.class))).b().plus(xq9.a), null, new z46(this, null), 2);
        }
    }
}
