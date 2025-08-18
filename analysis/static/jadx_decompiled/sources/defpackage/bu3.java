package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* loaded from: classes2.dex */
public final class bu3 extends FrameLayout implements kre {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu3(ContextMenuPopupWindow contextMenuPopupWindow, LayoutInflater layoutInflater, Context context) {
        boolean z;
        super(context);
        this.a = contextMenuPopupWindow;
        boolean z2 = true;
        setClickable(true);
        tu0.K(this, 300L, new c5(24, contextMenuPopupWindow));
        bc7[] bc7VarArr = ContextMenuPopupWindow.u0;
        contextMenuPopupWindow.getClass();
        h6b h6bVar = new h6b(layoutInflater.getContext(), contextMenuPopupWindow.n0());
        h6bVar.setId(ContextMenuPopupWindow.v0);
        Bundle bundle = contextMenuPopupWindow.getArgs().getBundle("actions");
        List listF = bundle != null ? ay7.f(bundle) : null;
        List list = nz4.a;
        listF = listF == null ? list : listF;
        if (listF.isEmpty()) {
            z = false;
        } else {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                if (((tt3) it.next()).d != null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        jqe jqeVar = (jqe) ((Parcelable) ay7.v(contextMenuPopupWindow.getArgs(), "header", jqe.class));
        int i = -1;
        int i2 = -2;
        if (jqeVar != null) {
            au3 au3Var = new au3(jqeVar, contextMenuPopupWindow, h6bVar.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f = 12;
            layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
            layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
            h6bVar.addView(au3Var, layoutParams);
        }
        Bundle bundle2 = contextMenuPopupWindow.getArgs().getBundle("actions");
        List listF2 = bundle2 != null ? ay7.f(bundle2) : null;
        for (tt3 tt3Var : listF2 != null ? listF2 : list) {
            g6b g6bVar = new g6b(h6bVar.getContext(), contextMenuPopupWindow.n0());
            jqe jqeVar2 = tt3Var.b;
            Integer num = tt3Var.d;
            boolean z3 = num != null ? z2 : false;
            int i3 = i2;
            int i4 = i;
            g6bVar.c(g6bVar, jqeVar2, tt3Var.c, z3, z);
            g6bVar.b(num, tt3Var.e);
            tu0.K(g6bVar, 300L, new tb(contextMenuPopupWindow, 23, tt3Var));
            h6bVar.addView(g6bVar, i4, i3);
            i2 = i3;
            i = i4;
            z2 = true;
        }
        addView(h6bVar, new FrameLayout.LayoutParams(tu0.G(250 * fk4.d().getDisplayMetrics().density), i2, 51));
        onThemeChanged(ContextMenuPopupWindow.m0(contextMenuPopupWindow));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        ContextMenuPopupWindow contextMenuPopupWindow = this.a;
        if (contextMenuPopupWindow.getArgs().getBoolean("dim")) {
            setBackgroundColor(ContextMenuPopupWindow.m0(contextMenuPopupWindow).b().e);
        }
    }
}
