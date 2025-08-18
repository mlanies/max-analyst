package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.bk4;
import defpackage.eg6;
import defpackage.fm9;
import defpackage.gg6;
import defpackage.hg6;
import defpackage.hm9;
import defpackage.khe;
import defpackage.sme;
import defpackage.xxb;
import defpackage.yyb;

/* loaded from: classes2.dex */
public class ContextMenuGridLayout extends hg6 {
    public final bk4 P0;

    public ContextMenuGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.P0 = bk4.b();
    }

    public void setupText(String str) {
        View viewInflate = View.inflate(getContext(), yyb.row_context_menu_action, null);
        ((ImageView) viewInflate.findViewById(xxb.row_options_action__iv_icon)).setVisibility(8);
        TextView textView = (TextView) viewInflate.findViewById(xxb.row_options_action__tv_title);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(8388611);
        eg6 eg6Var = new eg6();
        gg6 gg6Var = eg6Var.a;
        eg6Var.a = new gg6(gg6Var.a, gg6Var.b, hg6.d(7, false), gg6Var.d);
        gg6 gg6Var2 = eg6Var.b;
        eg6Var.b = new gg6(gg6Var2.a, gg6Var2.b, hg6.d(7, true), gg6Var2.d);
        ((ViewGroup.MarginLayoutParams) eg6Var).width = -1;
        ((ViewGroup.MarginLayoutParams) eg6Var).height = -1;
        addView(viewInflate, eg6Var);
        Context context = getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        int i = this.P0.q;
        int i2 = smeVarR.M;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ImageView imageView = (ImageView) childAt.findViewById(xxb.row_options_action__iv_icon);
            imageView.setColorFilter(smeVarR.w);
            imageView.setBackground(hm9.f(smeVarR.I, smeVarR.i, 0, i));
            ((TextView) childAt.findViewById(xxb.row_options_action__tv_title)).setTextColor(i2);
        }
    }
}
