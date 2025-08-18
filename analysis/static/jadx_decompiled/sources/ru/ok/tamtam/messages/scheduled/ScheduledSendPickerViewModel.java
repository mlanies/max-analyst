package ru.ok.tamtam.messages.scheduled;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import defpackage.bc7;
import defpackage.csc;
import defpackage.dpc;
import defpackage.eae;
import defpackage.etc;
import defpackage.f46;
import defpackage.hbc;
import defpackage.hm9;
import defpackage.j47;
import defpackage.khe;
import defpackage.lwa;
import defpackage.m34;
import defpackage.nec;
import defpackage.ngg;
import defpackage.oi9;
import defpackage.q0e;
import defpackage.ql4;
import defpackage.qte;
import defpackage.r0e;
import defpackage.rh4;
import defpackage.stc;
import defpackage.ttc;
import defpackage.u34;
import defpackage.utc;
import defpackage.w7c;
import defpackage.x34;
import defpackage.zsb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lu34;", "Landroid/app/Application;", "app", "Lcsc;", "savedStateHandle", "<init>", "(Landroid/app/Application;Lcsc;)V", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ScheduledSendPickerViewModel extends AndroidViewModel implements u34 {
    public static final /* synthetic */ bc7[] p = {new oi9(ScheduledSendPickerViewModel.class, "sendWithNotification", "getSendWithNotification()Z"), rh4.g(nec.a, ScheduledSendPickerViewModel.class, "allowWorkHours", "getAllowWorkHours()Z")};
    public final q0e c;
    public final w7c d;
    public final q0e e;
    public final w7c f;
    public final khe g;
    public final khe h;
    public final khe i;
    public final khe j;
    public final q0e k;
    public final w7c l;
    public final q0e m;
    public final w7c n;
    public final utc o;

    public ScheduledSendPickerViewModel(Application application, csc cscVar) {
        super(application);
        q0e q0eVarA = r0e.a(null);
        this.c = q0eVarA;
        this.d = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.e = q0eVarA2;
        this.f = new w7c(q0eVarA2);
        this.g = new khe(new lwa(22, application));
        this.h = new khe(new hbc(9));
        this.i = new khe(new hbc(10));
        this.j = new khe(new lwa(23, this));
        j47.T(f46.R(this), ql4.a, null, new stc(cscVar, this, null), 2);
        Boolean bool = Boolean.TRUE;
        q0e q0eVarA3 = r0e.a(bool);
        this.k = q0eVarA3;
        this.l = new w7c(q0eVarA3);
        q0e q0eVarA4 = r0e.a(null);
        this.m = q0eVarA4;
        this.n = new w7c(q0eVarA4);
        this.o = new utc(9, bool);
    }

    public static final etc e(ScheduledSendPickerViewModel scheduledSendPickerViewModel) {
        int i;
        int i2;
        qte qteVar;
        qte qteVar2;
        scheduledSendPickerViewModel.getClass();
        Calendar calendar = Calendar.getInstance();
        if (!scheduledSendPickerViewModel.b.getResources().getBoolean(zsb.small_time_offset)) {
            calendar.add(12, 5);
        } else if (calendar.get(13) > 35) {
            calendar.add(12, 2);
        } else {
            calendar.add(12, 1);
        }
        int i3 = calendar.get(11);
        q0e q0eVar = scheduledSendPickerViewModel.e;
        m34 m34Var = (m34) q0eVar.getValue();
        int i4 = 0;
        int i5 = (m34Var == null || (qteVar2 = m34Var.b) == null) ? 0 : qteVar2.a;
        if (i5 < i3) {
            i5 = i3;
        }
        ArrayList arrayListW = ngg.w(i3);
        Iterator it = arrayListW.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((qte) it.next()).a == i5) {
                i = i6;
                break;
            }
            i6++;
        }
        int i7 = calendar.get(12);
        m34 m34Var2 = (m34) q0eVar.getValue();
        int i8 = (m34Var2 == null || (qteVar = m34Var2.c) == null) ? 0 : qteVar.a;
        if (i5 == i3) {
            i8 = i7;
        }
        if (i5 != i3) {
            i7 = 0;
        }
        ArrayList arrayListA = ngg.A(i7);
        Iterator it2 = arrayListA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (((qte) it2.next()).a == i8) {
                i2 = i4;
                break;
            }
            i4++;
        }
        return new etc((List) scheduledSendPickerViewModel.j.getValue(), arrayListW, arrayListA, 0, i, i2);
    }

    public final void f() {
        x34 x34Var;
        qte qteVar;
        qte qteVar2;
        q0e q0eVar = this.e;
        m34 m34Var = (m34) q0eVar.getValue();
        if (m34Var == null || (x34Var = m34Var.a) == null) {
            return;
        }
        Integer num = null;
        if (eae.k0(x34Var.X, this.b.getString(dpc.u), true)) {
            j47.T(f46.R(this), ql4.a, null, new ttc(this, null), 2);
            return;
        }
        m34 m34Var2 = (m34) q0eVar.getValue();
        x34 x34Var2 = m34Var2 != null ? m34Var2.a : null;
        khe kheVar = this.j;
        if (x34Var2 != null) {
            int iIndexOf = ((List) kheVar.getValue()).indexOf(x34Var2);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf >= 0) {
                num = numValueOf;
            }
        } else {
            num = 0;
        }
        m34 m34Var3 = (m34) q0eVar.getValue();
        int i = (m34Var3 == null || (qteVar2 = m34Var3.b) == null) ? 0 : qteVar2.a;
        m34 m34Var4 = (m34) q0eVar.getValue();
        g(new etc((List) kheVar.getValue(), (List) this.h.getValue(), (List) this.i.getValue(), num != null ? num.intValue() : 0, i, (m34Var4 == null || (qteVar = m34Var4.c) == null) ? 0 : qteVar.a));
    }

    public final void g(etc etcVar) {
        hm9.m("ScheduledSendPickerViewModel", "setData %s", etcVar);
        this.c.m(null, etcVar);
        this.e.m(null, new m34((x34) etcVar.a.get(etcVar.d), (qte) etcVar.b.get(etcVar.e), (qte) etcVar.c.get(etcVar.f)));
        h();
    }

    public final boolean h() {
        hm9.n("ScheduledSendPickerViewModel", "validateSelectedTime");
        m34 m34Var = (m34) this.e.getValue();
        if (m34Var == null) {
            return false;
        }
        boolean z = System.currentTimeMillis() < m34Var.b();
        hm9.n("ScheduledSendPickerViewModel", "validateSelectedTime: " + z);
        this.k.m(null, Boolean.valueOf(z));
        return z;
    }
}
