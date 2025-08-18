package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import java.util.Arrays;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.protocol.HTTP;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final /* synthetic */ class lq implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                se5 se5Var = (se5) ((qe5) ((gdb) this.b).b.getValue());
                se5Var.getClass();
                return se5Var.n(PmsKey.f6appearancemultithemescreenenabled, false) ? new AppearanceSettingsMultiThemeScreen() : new AppearanceSettingsScreen();
            case 1:
                final lr3 lr3Var = (lr3) this.b;
                return new a8() { // from class: jr3
                    @Override // defpackage.a8
                    public final void a(znc zncVar) {
                        lr3 lr3Var2 = lr3Var;
                        try {
                            Activity activityF = ay7.F(zncVar);
                            die dieVar = new die(activityF, 13);
                            String string = ((qyc) ((y7d) lr3Var2.b.getValue())).g.getString("invite-header", null);
                            if (string == null) {
                                string = activityF.getString(dpc.v);
                            }
                            dieVar.c = string;
                            ((Intent) dieVar.b).setType(HTTP.PLAIN_TEXT_TYPE);
                            qyc qycVar = (qyc) ((y7d) lr3Var2.b.getValue());
                            String string2 = qycVar.g.getString("invite-long", null);
                            if (string2 == null) {
                                string2 = String.format(activityF.getString(dpc.C), Arrays.copyOf(new Object[]{qycVar.p()}, 1));
                            }
                            dieVar.R(string2);
                            dieVar.S();
                        } catch (ActivityNotFoundException unused) {
                            hm9.p("ContactsDeepLinkFactory", "shareInvite: failed, no activity found", null);
                        }
                    }
                };
            case 2:
                se5 se5Var2 = (se5) ((qe5) ((jid) this.b).b.getValue());
                se5Var2.getClass();
                if (se5Var2.n(PmsKey.f94newsettingsstoragescreenenabled, false)) {
                    return new SettingsStorageScreen();
                }
                String strB = nec.a(ActSettings.class).b();
                if (strB != null) {
                    return new ActivityWrapperWidget(strB, new w8c(7));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                return new ChatTitleIconScreen((long[]) this.b, pyd.c);
        }
    }
}
