package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class nc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ rc a;
    public final /* synthetic */ oc b;

    public nc(oc ocVar, rc rcVar) {
        this.b = ocVar;
        this.a = rcVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        oc ocVar = this.b;
        DialogInterface.OnClickListener onClickListener = ocVar.r;
        rc rcVar = this.a;
        onClickListener.onClick(rcVar.b, i);
        if (ocVar.t) {
            return;
        }
        rcVar.b.dismiss();
    }
}
