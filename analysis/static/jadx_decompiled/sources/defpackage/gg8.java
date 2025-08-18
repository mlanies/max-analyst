package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class gg8 extends fn {
    public long A0;
    public final cy B0;
    public final eh8 Y;
    public final mf8 Z;
    public final Context s0;
    public wg8 t0;
    public ArrayList u0;
    public fg8 v0;
    public RecyclerView w0;
    public boolean x0;
    public dh8 y0;
    public final long z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public gg8(Context context) {
        ContextThemeWrapper contextThemeWrapperA = lh8.a(context, false);
        super(contextThemeWrapperA, lh8.b(contextThemeWrapperA));
        this.t0 = wg8.c;
        this.B0 = new cy(9, this);
        Context context2 = getContext();
        this.Y = eh8.d(context2);
        this.Z = new mf8(this, 3);
        this.s0 = context2;
        this.z0 = context2.getResources().getInteger(iyb.mr_update_routes_delay_ms);
    }

    public final void g() {
        if (this.y0 == null && this.x0) {
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
            Collections.sort(arrayList, fs4.o);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.A0;
            long j = this.z0;
            if (jUptimeMillis < j) {
                cy cyVar = this.B0;
                cyVar.removeMessages(1);
                cyVar.sendMessageAtTime(cyVar.obtainMessage(1, arrayList), this.A0 + j);
            } else {
                this.A0 = SystemClock.uptimeMillis();
                this.u0.clear();
                this.u0.addAll(arrayList);
                this.v0.C();
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
        setContentView(syb.mr_picker_dialog);
        Context context = this.s0;
        int i = lh8.a;
        getWindow().getDecorView().setBackgroundColor(lt3.a(context, lh8.i(context) ? dtb.mr_dynamic_dialog_background_light : dtb.mr_dynamic_dialog_background_dark));
        this.u0 = new ArrayList();
        ((ImageButton) findViewById(dvb.mr_picker_close_button)).setOnClickListener(new e0d(6, this));
        this.v0 = new fg8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(dvb.mr_picker_list);
        this.w0 = recyclerView;
        recyclerView.setAdapter(this.v0);
        this.w0.setLayoutManager(new LinearLayoutManager());
        getWindow().setLayout(!context.getResources().getBoolean(wsb.is_tablet) ? -1 : dy7.v(context), context.getResources().getBoolean(wsb.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0 = false;
        this.Y.f(this.Z);
        this.B0.removeMessages(1);
    }
}
