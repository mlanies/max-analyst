package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.settings.SettingsAvatarBottomSheet;

/* loaded from: classes2.dex */
public final class ged extends LinearLayout implements kre {
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinkedHashMap c;

    public ged(SettingsAvatarBottomSheet settingsAvatarBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        AppCompatTextView appCompatTextView;
        super(context);
        bc7[] bc7VarArr = SettingsAvatarBottomSheet.C0;
        settingsAvatarBottomSheet.getClass();
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null);
        i4f.c.b(appCompatTextView2, du4.b);
        appCompatTextView2.setText(charSequence);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        bc7 bc7Var = SettingsAvatarBottomSheet.C0[1];
        layoutParams.bottomMargin = tu0.G((((jqe) settingsAvatarBottomSheet.z0.a(settingsAvatarBottomSheet)) == null ? 16 : 12) * fk4.d().getDisplayMetrics().density);
        addView(appCompatTextView2, layoutParams);
        this.a = appCompatTextView2;
        if (charSequence2 != null) {
            appCompatTextView = new AppCompatTextView(getContext(), null);
            i4f.n.b(appCompatTextView, du4.b);
            appCompatTextView.setText(charSequence2);
            appCompatTextView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
            addView(appCompatTextView, layoutParams2);
        } else {
            appCompatTextView = null;
        }
        this.b = appCompatTextView;
        int iZ = mz7.Z(z53.S(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ >= 16 ? iZ : 16);
        for (Object obj : arrayList) {
            fed fedVar = (fed) obj;
            int i = fedVar.a;
            CharSequence charSequenceB = fedVar.b.b(getContext());
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), null);
            i4f.C.b(appCompatTextView3, du4.b);
            appCompatTextView3.setText(charSequenceB);
            appCompatTextView3.setGravity(17);
            tu0.K(appCompatTextView3, 300L, new elb(settingsAvatarBottomSheet, i));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            float f = 15;
            layoutParams3.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            layoutParams3.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
            addView(appCompatTextView3, layoutParams3);
            linkedHashMap.put(appCompatTextView3, obj);
        }
        this.c = linkedHashMap;
        setOrientation(1);
        setGravity(17);
        onThemeChanged(qp4.u0.j(this));
    }

    public final Map<TextView, fed> getButtonViews() {
        return this.c;
    }

    public final TextView getDescriptionView() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int i;
        this.a.setTextColor(fkaVar.getText().e);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(fkaVar.getText().g);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            TextView textView = (TextView) entry.getKey();
            int iS = au1.s(((fed) entry.getValue()).c);
            if (iS == 0) {
                i = fkaVar.getText().j;
            } else {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = fkaVar.getText().h;
            }
            textView.setTextColor(i);
        }
    }
}
