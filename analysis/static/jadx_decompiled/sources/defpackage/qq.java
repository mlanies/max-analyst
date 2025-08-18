package defpackage;

import android.widget.TextView;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class qq {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ qq(TextView textView, Widget widget, int i) {
        this.a = i;
        this.b = textView;
        this.c = widget;
    }

    public final void a(float f) {
        Widget widget = this.c;
        TextView textView = this.b;
        switch (this.a) {
            case 0:
                textView.setVisibility(((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ^ true ? 0 : 8);
                bc7[] bc7VarArr = AppearanceSettingsMultiThemeScreen.s0;
                hp hpVar = (hp) ((AppearanceSettingsMultiThemeScreen) widget).Y.getValue();
                int iE = ote.e(tu0.G(f), 0, 5);
                kxc kxcVar = (kxc) hpVar;
                kxcVar.k(iE, "app.extra.text.size.mode");
                kxcVar.i.e(Integer.valueOf(iE));
                break;
            default:
                textView.setVisibility(((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ^ true ? 0 : 8);
                bc7[] bc7VarArr2 = AppearanceSettingsScreen.Z;
                hp hpVar2 = (hp) ((AppearanceSettingsScreen) widget).Y.getValue();
                int iE2 = ote.e(tu0.G(f), 0, 5);
                kxc kxcVar2 = (kxc) hpVar2;
                kxcVar2.k(iE2, "app.extra.text.size.mode");
                kxcVar2.i.e(Integer.valueOf(iE2));
                break;
        }
    }
}
