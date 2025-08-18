package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b44;
import defpackage.byb;
import defpackage.d71;
import defpackage.ee4;
import defpackage.f9;
import defpackage.fm9;
import defpackage.ioa;
import defpackage.khe;
import defpackage.ltb;
import defpackage.pyb;
import defpackage.sme;
import defpackage.ste;
import defpackage.u34;
import defpackage.wme;
import defpackage.wsd;
import defpackage.y34;
import kotlin.Metadata;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/tamtam/messages/scheduled/DateTimePicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lwme;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lu34;", "listener", "Le5f;", "setListener$scheduled_send_picker_dialog_release", "(Lu34;)V", "setListener", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DateTimePicker extends ConstraintLayout implements wme {
    public final RecyclerView G0;
    public final RecyclerView H0;
    public final RecyclerView I0;
    public final View J0;
    public final View K0;
    public final TextView L0;
    public u34 M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public final int Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimePicker(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        sme smeVarR;
        super(context, attributeSet);
        final int i = 1;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ltb.date_picker_today_margin_top);
        this.Q0 = dimensionPixelSize;
        View.inflate(context, pyb.date_time_picker, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(byb.days_recycler_view);
        this.G0 = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(byb.hours_recycler_view);
        this.H0 = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) findViewById(byb.minutes_recycler_view);
        this.I0 = recyclerView3;
        this.J0 = findViewById(byb.top_line);
        this.K0 = findViewById(byb.bottom_line);
        this.L0 = (TextView) findViewById(byb.time_divider);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(ltb.date_picker_item_height);
        b44 b44Var = new b44(y34.e);
        b44Var.A(true);
        recyclerView.setAdapter(b44Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.j(new d71(dimensionPixelSize, 2));
        recyclerView.setLayoutManager(new SliderLayoutManager(context, new f9(this, 23, b44Var)));
        recyclerView.setEdgeEffectFactory(new ioa(dimensionPixelSize2));
        final ste steVar = new ste();
        recyclerView2.setAdapter(steVar);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemAnimator(null);
        recyclerView2.j(new d71(dimensionPixelSize, 2));
        final int i2 = 0;
        recyclerView2.setLayoutManager(new SliderLayoutManager(context, new wsd(this) { // from class: r34
            public final /* synthetic */ DateTimePicker b;

            {
                this.b = this;
            }

            @Override // defpackage.wsd
            public final void a(int i3) {
                switch (i2) {
                    case 0:
                        DateTimePicker dateTimePicker = this.b;
                        if (!dateTimePicker.O0) {
                            qte qteVar = (qte) steVar.C(i3);
                            u34 u34Var = dateTimePicker.M0;
                            if (u34Var != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) u34Var;
                                hm9.n("ScheduledSendPickerViewModel", "hour = " + qteVar);
                                q0e q0eVar = scheduledSendPickerViewModel.e;
                                m34 m34Var = (m34) q0eVar.getValue();
                                if (m34Var != null && !tpa.f(m34Var.b, qteVar)) {
                                    q0eVar.m(null, m34.a(m34Var, null, qteVar, null, 5));
                                    scheduledSendPickerViewModel.f();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        DateTimePicker dateTimePicker2 = this.b;
                        if (!dateTimePicker2.P0) {
                            qte qteVar2 = (qte) steVar.C(i3);
                            u34 u34Var2 = dateTimePicker2.M0;
                            if (u34Var2 != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) u34Var2;
                                hm9.n("ScheduledSendPickerViewModel", "minute = " + qteVar2);
                                q0e q0eVar2 = scheduledSendPickerViewModel2.e;
                                m34 m34Var2 = (m34) q0eVar2.getValue();
                                if (m34Var2 != null && !tpa.f(m34Var2.c, qteVar2)) {
                                    q0eVar2.m(null, m34.a(m34Var2, null, null, qteVar2, 3));
                                    scheduledSendPickerViewModel2.h();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }));
        recyclerView2.setEdgeEffectFactory(new ioa(dimensionPixelSize2));
        final ste steVar2 = new ste();
        recyclerView3.setAdapter(steVar2);
        recyclerView3.setItemAnimator(null);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.j(new d71(dimensionPixelSize, 2));
        recyclerView3.setLayoutManager(new SliderLayoutManager(context, new wsd(this) { // from class: r34
            public final /* synthetic */ DateTimePicker b;

            {
                this.b = this;
            }

            @Override // defpackage.wsd
            public final void a(int i3) {
                switch (i) {
                    case 0:
                        DateTimePicker dateTimePicker = this.b;
                        if (!dateTimePicker.O0) {
                            qte qteVar = (qte) steVar2.C(i3);
                            u34 u34Var = dateTimePicker.M0;
                            if (u34Var != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) u34Var;
                                hm9.n("ScheduledSendPickerViewModel", "hour = " + qteVar);
                                q0e q0eVar = scheduledSendPickerViewModel.e;
                                m34 m34Var = (m34) q0eVar.getValue();
                                if (m34Var != null && !tpa.f(m34Var.b, qteVar)) {
                                    q0eVar.m(null, m34.a(m34Var, null, qteVar, null, 5));
                                    scheduledSendPickerViewModel.f();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        DateTimePicker dateTimePicker2 = this.b;
                        if (!dateTimePicker2.P0) {
                            qte qteVar2 = (qte) steVar2.C(i3);
                            u34 u34Var2 = dateTimePicker2.M0;
                            if (u34Var2 != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) u34Var2;
                                hm9.n("ScheduledSendPickerViewModel", "minute = " + qteVar2);
                                q0e q0eVar2 = scheduledSendPickerViewModel2.e;
                                m34 m34Var2 = (m34) q0eVar2.getValue();
                                if (m34Var2 != null && !tpa.f(m34Var2.c, qteVar2)) {
                                    q0eVar2.m(null, m34.a(m34Var2, null, null, qteVar2, 3));
                                    scheduledSendPickerViewModel2.h();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }));
        recyclerView3.setEdgeEffectFactory(new ioa(dimensionPixelSize2));
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        z(smeVarR);
    }

    public final void setListener$scheduled_send_picker_dialog_release(u34 listener) {
        this.M0 = listener;
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        setBackgroundColor(smeVar.m);
        View view = this.J0;
        int i = smeVar.k;
        view.setBackgroundColor(i);
        this.K0.setBackgroundColor(i);
        this.L0.setTextColor(smeVar.F);
    }
}
