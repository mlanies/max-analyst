package defpackage;

import android.view.View;
import android.widget.TextView;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class oq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;
    public final /* synthetic */ TextView c;

    public /* synthetic */ oq(tha thaVar, TextView textView, int i) {
        this.a = i;
        this.b = thaVar;
        this.c = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = this.c;
        mi6 mi6Var = mi6.CONTEXT_CLICK;
        tha thaVar = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = AppearanceSettingsMultiThemeScreen.s0;
                if (thaVar.getValue() != 1.0f) {
                    pag.F(textView, mi6Var);
                }
                thaVar.setValue(1.0f);
                break;
            default:
                bc7[] bc7VarArr2 = AppearanceSettingsScreen.Z;
                if (thaVar.getValue() != 1.0f) {
                    pag.F(textView, mi6Var);
                }
                thaVar.setValue(1.0f);
                break;
        }
    }
}
