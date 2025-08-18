package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tq8 extends BaseAdapter {
    public final LayoutInflater X;
    public final int Y;
    public final wq8 a;
    public int b = -1;
    public boolean c;
    public final boolean o;

    public tq8(wq8 wq8Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.o = z;
        this.X = layoutInflater;
        this.a = wq8Var;
        this.Y = i;
        a();
    }

    public final void a() {
        wq8 wq8Var = this.a;
        br8 br8Var = wq8Var.G0;
        if (br8Var != null) {
            wq8Var.i();
            ArrayList arrayList = wq8Var.u0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((br8) arrayList.get(i)) == br8Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final br8 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.o;
        wq8 wq8Var = this.a;
        if (z) {
            wq8Var.i();
            arrayListL = wq8Var.u0;
        } else {
            arrayListL = wq8Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (br8) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.o;
        wq8 wq8Var = this.a;
        if (z) {
            wq8Var.i();
            arrayListL = wq8Var.u0;
        } else {
            arrayListL = wq8Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.X.inflate(this.Y, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        pr8 pr8Var = (pr8) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        pr8Var.d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
