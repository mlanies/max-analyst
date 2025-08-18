package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class h04 extends BaseAdapter implements Filterable, i04 {
    public f04 X;
    public g04 Y;
    public j04 Z;
    public boolean a;
    public boolean b;
    public Cursor c;
    public int o;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                f04 f04Var = this.X;
                if (f04Var != null) {
                    cursor2.unregisterContentObserver(f04Var);
                }
                g04 g04Var = this.Y;
                if (g04Var != null) {
                    cursor2.unregisterDataSetObserver(g04Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                f04 f04Var2 = this.X;
                if (f04Var2 != null) {
                    cursor.registerContentObserver(f04Var2);
                }
                g04 g04Var2 = this.Y;
                if (g04Var2 != null) {
                    cursor.registerDataSetObserver(g04Var2);
                }
                this.o = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.o = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            qce qceVar = (qce) this;
            view = qceVar.u0.inflate(qceVar.t0, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.Z == null) {
            j04 j04Var = new j04();
            j04Var.a = this;
            this.Z = j04Var;
        }
        return this.Z;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.o);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(i)) {
            throw new IllegalStateException(zr6.h(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.c);
        return view;
    }
}
