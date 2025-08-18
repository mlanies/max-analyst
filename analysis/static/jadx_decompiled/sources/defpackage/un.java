package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class un implements ao, DialogInterface.OnClickListener {
    public tc a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ bo o;

    public un(bo boVar) {
        this.o = boVar;
    }

    @Override // defpackage.ao
    public final boolean a() {
        tc tcVar = this.a;
        if (tcVar != null) {
            return tcVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.ao
    public final Drawable b() {
        return null;
    }

    @Override // defpackage.ao
    public final int c() {
        return 0;
    }

    @Override // defpackage.ao
    public final void d(int i) {
    }

    @Override // defpackage.ao
    public final void dismiss() {
        tc tcVar = this.a;
        if (tcVar != null) {
            tcVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.ao
    public final CharSequence e() {
        return this.c;
    }

    @Override // defpackage.ao
    public final void g(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.ao
    public final void i(Drawable drawable) {
    }

    @Override // defpackage.ao
    public final void l(int i) {
    }

    @Override // defpackage.ao
    public final void m(int i) {
    }

    @Override // defpackage.ao
    public final void n(int i, int i2) {
        if (this.b == null) {
            return;
        }
        bo boVar = this.o;
        sc scVar = new sc(boVar.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            scVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.b;
        int selectedItemPosition = boVar.getSelectedItemPosition();
        oc ocVar = scVar.a;
        ocVar.q = listAdapter;
        ocVar.r = this;
        ocVar.u = selectedItemPosition;
        ocVar.t = true;
        tc tcVarCreate = scVar.create();
        this.a = tcVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = tcVarCreate.Y.g;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.ao
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bo boVar = this.o;
        boVar.setSelection(i);
        if (boVar.getOnItemClickListener() != null) {
            boVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.ao
    public final void p(ListAdapter listAdapter) {
        this.b = listAdapter;
    }
}
