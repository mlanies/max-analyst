package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class ql7 implements or8, AdapterView.OnItemClickListener {
    public final int X;
    public nr8 Y;
    public pl7 Z;
    public Context a;
    public LayoutInflater b;
    public wq8 c;
    public ExpandedMenuView o;

    public ql7(Context context, int i) {
        this.X = i;
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.or8
    public final boolean b(qae qaeVar) {
        if (!qaeVar.hasVisibleItems()) {
            return false;
        }
        xq8 xq8Var = new xq8();
        xq8Var.a = qaeVar;
        Context context = qaeVar.a;
        sc scVar = new sc(context);
        ql7 ql7Var = new ql7(scVar.getContext(), zyb.abc_list_menu_item_layout);
        xq8Var.c = ql7Var;
        ql7Var.Y = xq8Var;
        qaeVar.b(ql7Var, context);
        ql7 ql7Var2 = xq8Var.c;
        if (ql7Var2.Z == null) {
            ql7Var2.Z = new pl7(ql7Var2);
        }
        pl7 pl7Var = ql7Var2.Z;
        oc ocVar = scVar.a;
        ocVar.q = pl7Var;
        ocVar.r = xq8Var;
        View view = qaeVar.z0;
        if (view != null) {
            ocVar.e = view;
        } else {
            ocVar.c = qaeVar.y0;
            scVar.setTitle(qaeVar.x0);
        }
        ocVar.o = xq8Var;
        tc tcVarCreate = scVar.create();
        xq8Var.b = tcVarCreate;
        tcVarCreate.setOnDismissListener(xq8Var);
        WindowManager.LayoutParams attributes = xq8Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        xq8Var.b.show();
        nr8 nr8Var = this.Y;
        if (nr8Var == null) {
            return true;
        }
        nr8Var.o(qaeVar);
        return true;
    }

    @Override // defpackage.or8
    public final void c(wq8 wq8Var, boolean z) {
        nr8 nr8Var = this.Y;
        if (nr8Var != null) {
            nr8Var.c(wq8Var, z);
        }
    }

    @Override // defpackage.or8
    public final boolean d() {
        return false;
    }

    @Override // defpackage.or8
    public final boolean e(br8 br8Var) {
        return false;
    }

    @Override // defpackage.or8
    public final void g(nr8 nr8Var) {
        this.Y = nr8Var;
    }

    @Override // defpackage.or8
    public final boolean h(br8 br8Var) {
        return false;
    }

    @Override // defpackage.or8
    public final void i() {
        pl7 pl7Var = this.Z;
        if (pl7Var != null) {
            pl7Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.or8
    public final void k(Context context, wq8 wq8Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = wq8Var;
        pl7 pl7Var = this.Z;
        if (pl7Var != null) {
            pl7Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.Z.getItem(i), this, 0);
    }
}
