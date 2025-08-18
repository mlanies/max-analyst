package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pl7 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ ql7 b;

    public pl7(ql7 ql7Var) {
        this.b = ql7Var;
        a();
    }

    public final void a() {
        wq8 wq8Var = this.b.c;
        br8 br8Var = wq8Var.G0;
        if (br8Var != null) {
            wq8Var.i();
            ArrayList arrayList = wq8Var.u0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((br8) arrayList.get(i)) == br8Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final br8 getItem(int i) {
        ql7 ql7Var = this.b;
        wq8 wq8Var = ql7Var.c;
        wq8Var.i();
        ArrayList arrayList = wq8Var.u0;
        ql7Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (br8) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ql7 ql7Var = this.b;
        wq8 wq8Var = ql7Var.c;
        wq8Var.i();
        int size = wq8Var.u0.size();
        ql7Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ql7 ql7Var = this.b;
            view = ql7Var.b.inflate(ql7Var.X, viewGroup, false);
        }
        ((pr8) view).d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
