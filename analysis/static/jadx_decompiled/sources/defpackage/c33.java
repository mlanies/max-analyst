package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class c33 extends LinearLayout implements kre {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final OneMeButton c;

    public c33(FrameLayout frameLayout, final ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(appCompatTextView.getContext().getString(r8a.w));
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(View.generateViewId());
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        b7a b7aVar = b7a.o;
        oneMeButton.setMode(b7aVar);
        oneMeButton.setAppearance(z6a.b);
        oneMeButton.setText(r8a.v);
        final int i = 0;
        tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: b33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        ClearRecentSearchBottomSheet clearRecentSearchBottomSheet2 = clearRecentSearchBottomSheet;
                        clearRecentSearchBottomSheet2.s0(true);
                        Object targetController = clearRecentSearchBottomSheet2.getTargetController();
                        a33 a33Var = targetController instanceof a33 ? (a33) targetController : null;
                        if (a33Var != null) {
                            gw2 gw2VarN0 = ((ChatsListSearchScreen) a33Var).n0();
                            vxd vxdVar = gw2VarN0.O0;
                            if (vxdVar == null || !vxdVar.isActive()) {
                                gw2VarN0.O0 = j47.T(gw2VarN0.a, gw2VarN0.L0, null, new pv2(gw2VarN0, null), 2);
                                break;
                            }
                        }
                        break;
                    default:
                        clearRecentSearchBottomSheet.s0(true);
                        break;
                }
            }
        });
        this.b = oneMeButton;
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
        oneMeButton2.setId(View.generateViewId());
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(c7aVar);
        oneMeButton2.setMode(b7aVar);
        oneMeButton2.setAppearance(z6a.o);
        oneMeButton2.setText(r8a.u);
        final int i2 = 1;
        tu0.K(oneMeButton2, 300L, new View.OnClickListener() { // from class: b33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ClearRecentSearchBottomSheet clearRecentSearchBottomSheet2 = clearRecentSearchBottomSheet;
                        clearRecentSearchBottomSheet2.s0(true);
                        Object targetController = clearRecentSearchBottomSheet2.getTargetController();
                        a33 a33Var = targetController instanceof a33 ? (a33) targetController : null;
                        if (a33Var != null) {
                            gw2 gw2VarN0 = ((ChatsListSearchScreen) a33Var).n0();
                            vxd vxdVar = gw2VarN0.O0;
                            if (vxdVar == null || !vxdVar.isActive()) {
                                gw2VarN0.O0 = j47.T(gw2VarN0.a, gw2VarN0.L0, null, new pv2(gw2VarN0, null), 2);
                                break;
                            }
                        }
                        break;
                    default:
                        clearRecentSearchBottomSheet.s0(true);
                        break;
                }
            }
        });
        this.c = oneMeButton2;
        setOrientation(1);
        addView(appCompatTextView);
        addView(oneMeButton);
        addView(oneMeButton2);
        float f = 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(26 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
    }

    public final OneMeButton getCancel() {
        return this.c;
    }

    public final OneMeButton getConfirm() {
        return this.b;
    }

    public final AppCompatTextView getTitle() {
        return this.a;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setTextColor(fkaVar.getText().e);
        this.b.onThemeChanged(fkaVar);
        this.c.onThemeChanged(fkaVar);
    }
}
