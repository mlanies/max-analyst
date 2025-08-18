package one.me.sdk.phoneutils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.daa;
import defpackage.du4;
import defpackage.eaa;
import defpackage.fk4;
import defpackage.i4f;
import defpackage.il7;
import defpackage.j1e;
import defpackage.kl7;
import defpackage.ny3;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.vu5;
import defpackage.yoc;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/phoneutils/SelectCountryBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "phone-utils_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SelectCountryBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int y0 = 0;

    public SelectCountryBottomSheet(Bundle bundle) {
        super(bundle);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(View.generateViewId());
        textView.setText(yoc.b0);
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        boolean z = getArgs().getBoolean("is_narnia_available");
        eaa eaaVar = daa.a;
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(daa.b);
        kl7VarL.add(daa.a);
        if (z) {
            kl7VarL.add((eaa) daa.c.getValue());
        }
        ListIterator listIterator = j1e.d(kl7VarL).listIterator(0);
        while (true) {
            il7 il7Var = (il7) listIterator;
            if (!il7Var.hasNext()) {
                return linearLayout;
            }
            eaa eaaVar2 = (eaa) il7Var.next();
            ny3 ny3Var = new ny3(linearLayout.getContext());
            ny3Var.setCountryInfo(eaaVar2);
            tu0.K(ny3Var, 300L, new vu5(this, 28, eaaVar2));
            linearLayout.addView(ny3Var);
        }
    }
}
