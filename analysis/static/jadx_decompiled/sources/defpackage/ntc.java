package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;

/* loaded from: classes2.dex */
public final class ntc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ntc ntcVar = (ntc) n((etc) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ntcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ntc ntcVar = new ntc(this.Y, continuation);
        ntcVar.X = obj;
        return ntcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        etc etcVar = (etc) this.X;
        hm9.n("ScheduledSendPickerDialogFragment", "new data " + etcVar);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Y;
        final DateTimePicker dateTimePickerB = scheduledSendPickerDialogFragment.m1().b();
        List list = etcVar.a;
        dateTimePickerB.N0 = true;
        hdc adapter = dateTimePickerB.G0.getAdapter();
        b44 b44Var = adapter instanceof b44 ? (b44) adapter : null;
        if (b44Var != null) {
            final int i = etcVar.d;
            final int i2 = 0;
            b44Var.F(list, new Runnable() { // from class: s34
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            final DateTimePicker dateTimePicker = dateTimePickerB;
                            RecyclerView recyclerView = dateTimePicker.G0;
                            ((SliderLayoutManager) recyclerView.getLayoutManager()).n1(i, dateTimePicker.Q0);
                            final int i3 = 0;
                            recyclerView.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    DateTimePicker dateTimePicker2 = dateTimePicker;
                                    switch (i4) {
                                        case 0:
                                            dateTimePicker2.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker2.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker2.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final DateTimePicker dateTimePicker2 = dateTimePickerB;
                            RecyclerView recyclerView2 = dateTimePicker2.I0;
                            ((SliderLayoutManager) recyclerView2.getLayoutManager()).n1(i, dateTimePicker2.Q0);
                            final int i4 = 2;
                            recyclerView2.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i42 = i4;
                                    DateTimePicker dateTimePicker22 = dateTimePicker2;
                                    switch (i42) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final DateTimePicker dateTimePicker3 = dateTimePickerB;
                            RecyclerView recyclerView3 = dateTimePicker3.H0;
                            ((SliderLayoutManager) recyclerView3.getLayoutManager()).n1(i, dateTimePicker3.Q0);
                            final int i5 = 1;
                            recyclerView3.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i42 = i5;
                                    DateTimePicker dateTimePicker22 = dateTimePicker3;
                                    switch (i42) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        final DateTimePicker dateTimePickerB2 = scheduledSendPickerDialogFragment.m1().b();
        dateTimePickerB2.O0 = true;
        hdc adapter2 = dateTimePickerB2.H0.getAdapter();
        ste steVar = adapter2 instanceof ste ? (ste) adapter2 : null;
        if (steVar != null) {
            final int i3 = etcVar.e;
            final int i4 = 2;
            steVar.F(etcVar.b, new Runnable() { // from class: s34
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            final DateTimePicker dateTimePicker = dateTimePickerB2;
                            RecyclerView recyclerView = dateTimePicker.G0;
                            ((SliderLayoutManager) recyclerView.getLayoutManager()).n1(i3, dateTimePicker.Q0);
                            final int i32 = 0;
                            recyclerView.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i42 = i32;
                                    DateTimePicker dateTimePicker22 = dateTimePicker;
                                    switch (i42) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final DateTimePicker dateTimePicker2 = dateTimePickerB2;
                            RecyclerView recyclerView2 = dateTimePicker2.I0;
                            ((SliderLayoutManager) recyclerView2.getLayoutManager()).n1(i3, dateTimePicker2.Q0);
                            final int i42 = 2;
                            recyclerView2.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i422 = i42;
                                    DateTimePicker dateTimePicker22 = dateTimePicker2;
                                    switch (i422) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final DateTimePicker dateTimePicker3 = dateTimePickerB2;
                            RecyclerView recyclerView3 = dateTimePicker3.H0;
                            ((SliderLayoutManager) recyclerView3.getLayoutManager()).n1(i3, dateTimePicker3.Q0);
                            final int i5 = 1;
                            recyclerView3.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i422 = i5;
                                    DateTimePicker dateTimePicker22 = dateTimePicker3;
                                    switch (i422) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        final DateTimePicker dateTimePickerB3 = scheduledSendPickerDialogFragment.m1().b();
        dateTimePickerB3.P0 = true;
        hdc adapter3 = dateTimePickerB3.I0.getAdapter();
        ste steVar2 = adapter3 instanceof ste ? (ste) adapter3 : null;
        if (steVar2 != null) {
            final int i5 = etcVar.f;
            final int i6 = 1;
            steVar2.F(etcVar.c, new Runnable() { // from class: s34
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            final DateTimePicker dateTimePicker = dateTimePickerB3;
                            RecyclerView recyclerView = dateTimePicker.G0;
                            ((SliderLayoutManager) recyclerView.getLayoutManager()).n1(i5, dateTimePicker.Q0);
                            final int i32 = 0;
                            recyclerView.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i422 = i32;
                                    DateTimePicker dateTimePicker22 = dateTimePicker;
                                    switch (i422) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final DateTimePicker dateTimePicker2 = dateTimePickerB3;
                            RecyclerView recyclerView2 = dateTimePicker2.I0;
                            ((SliderLayoutManager) recyclerView2.getLayoutManager()).n1(i5, dateTimePicker2.Q0);
                            final int i42 = 2;
                            recyclerView2.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i422 = i42;
                                    DateTimePicker dateTimePicker22 = dateTimePicker2;
                                    switch (i422) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final DateTimePicker dateTimePicker3 = dateTimePickerB3;
                            RecyclerView recyclerView3 = dateTimePicker3.H0;
                            ((SliderLayoutManager) recyclerView3.getLayoutManager()).n1(i5, dateTimePicker3.Q0);
                            final int i52 = 1;
                            recyclerView3.post(new Runnable() { // from class: t34
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i422 = i52;
                                    DateTimePicker dateTimePicker22 = dateTimePicker3;
                                    switch (i422) {
                                        case 0:
                                            dateTimePicker22.N0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker22.O0 = false;
                                            break;
                                        default:
                                            dateTimePicker22.P0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        return e5f.a;
    }
}
