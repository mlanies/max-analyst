package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class qf8 extends fn {
    public final eh8 Y;
    public final mf8 Z;
    public TextView s0;
    public wg8 t0;
    public ArrayList u0;
    public pf8 v0;
    public ListView w0;
    public boolean x0;
    public long y0;
    public final cy z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public qf8(Context context) {
        ContextThemeWrapper contextThemeWrapperA = lh8.a(context, false);
        super(contextThemeWrapperA, lh8.b(contextThemeWrapperA));
        this.t0 = wg8.c;
        this.z0 = new cy(8, this);
        this.Y = eh8.d(getContext());
        this.Z = new mf8(this, 1);
    }

    public final void g() {
        if (this.x0) {
            this.Y.getClass();
            eh8.b();
            ah8 ah8VarC = eh8.c();
            ArrayList arrayList = new ArrayList(ah8VarC == null ? Collections.emptyList() : ah8VarC.g);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                dh8 dh8Var = (dh8) arrayList.get(i);
                if (dh8Var.d() || !dh8Var.g || !dh8Var.h(this.t0)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, fs4.c);
            if (SystemClock.uptimeMillis() - this.y0 < 300) {
                cy cyVar = this.z0;
                cyVar.removeMessages(1);
                cyVar.sendMessageAtTime(cyVar.obtainMessage(1, arrayList), this.y0 + 300);
            } else {
                this.y0 = SystemClock.uptimeMillis();
                this.u0.clear();
                this.u0.addAll(arrayList);
                this.v0.notifyDataSetChanged();
            }
        }
    }

    public final void h(wg8 wg8Var) {
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.t0.equals(wg8Var)) {
            return;
        }
        this.t0 = wg8Var;
        if (this.x0) {
            eh8 eh8Var = this.Y;
            mf8 mf8Var = this.Z;
            eh8Var.f(mf8Var);
            eh8Var.a(wg8Var, mf8Var, 1);
        }
        g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0 = true;
        this.Y.a(this.t0, this.Z, 1);
        g();
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(syb.mr_chooser_dialog);
        this.u0 = new ArrayList();
        this.v0 = new pf8(getContext(), this.u0);
        ListView listView = (ListView) findViewById(dvb.mr_chooser_list);
        this.w0 = listView;
        listView.setAdapter((ListAdapter) this.v0);
        this.w0.setOnItemClickListener(this.v0);
        this.w0.setEmptyView(findViewById(R.id.empty));
        this.s0 = (TextView) findViewById(dvb.mr_chooser_title);
        getWindow().setLayout(dy7.v(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.x0 = false;
        this.Y.f(this.Z);
        this.z0.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.fn, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s0.setText(charSequence);
    }

    @Override // defpackage.fn, android.app.Dialog
    public final void setTitle(int i) {
        this.s0.setText(i);
    }
}
