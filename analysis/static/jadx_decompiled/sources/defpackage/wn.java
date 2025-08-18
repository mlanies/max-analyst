package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class wn implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.a) {
            case 0:
                yn ynVar = (yn) this.b;
                ynVar.P0.setSelection(i);
                if (ynVar.P0.getOnItemClickListener() != null) {
                    ynVar.P0.performItemClick(view, i, ynVar.M0.getItemId(i));
                }
                ynVar.dismiss();
                break;
            case 1:
                u08 u08Var = (u08) this.b;
                if (i < 0) {
                    wl7 wl7Var = u08Var.s0;
                    item = !wl7Var.K0.isShowing() ? null : wl7Var.c.getSelectedItem();
                } else {
                    item = u08Var.getAdapter().getItem(i);
                }
                u08.b(u08Var, item);
                AdapterView.OnItemClickListener onItemClickListener = u08Var.getOnItemClickListener();
                wl7 wl7Var2 = u08Var.s0;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = wl7Var2.K0.isShowing() ? wl7Var2.c.getSelectedView() : null;
                        i = !wl7Var2.K0.isShowing() ? -1 : wl7Var2.c.getSelectedItemPosition();
                        j = !wl7Var2.K0.isShowing() ? Long.MIN_VALUE : wl7Var2.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(wl7Var2.c, view, i, j);
                }
                wl7Var2.dismiss();
                break;
            default:
                ((o0d) this.b).onItemClicked(i, 0, null);
                break;
        }
    }
}
