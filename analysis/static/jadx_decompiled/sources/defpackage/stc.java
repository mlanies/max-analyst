package defpackage;

import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final class stc extends ffe implements a66 {
    public final /* synthetic */ csc X;
    public final /* synthetic */ ScheduledSendPickerViewModel Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stc(csc cscVar, ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = cscVar;
        this.Y = scheduledSendPickerViewModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        stc stcVar = (stc) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        stcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new stc(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object obj2;
        etc etcVarE;
        int i;
        od2.a0(obj);
        csc cscVar = this.X;
        LinkedHashMap linkedHashMap = cscVar.a;
        try {
            obj2 = linkedHashMap.get("ScheduledSendPickerViewModel:delayed_attrs");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("ScheduledSendPickerViewModel:delayed_attrs");
            au1.r(cscVar.c.remove("ScheduledSendPickerViewModel:delayed_attrs"));
            cscVar.d.remove("ScheduledSendPickerViewModel:delayed_attrs");
            obj2 = null;
        }
        ng4 ng4Var = obj2 instanceof ng4 ? (ng4) obj2 : null;
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.Y;
        if (ng4Var != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(ng4Var.a);
            int i2 = calendar.get(5);
            int i3 = calendar.get(2);
            int i4 = calendar.get(1);
            int i5 = calendar.get(11);
            int i6 = calendar.get(12);
            etc etcVarE2 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            etc etcVarE3 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            etc etcVarE4 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
            List list = etcVarE2.a;
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                x34 x34Var = (x34) it.next();
                if (x34Var.o == i4 && x34Var.c == i3 && x34Var.b == i2) {
                    break;
                }
                i7++;
            }
            int i8 = i7 < 0 ? 0 : i7;
            List list2 = etcVarE3.b;
            Iterator it2 = list2.iterator();
            int i9 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i9 = -1;
                    break;
                }
                if (((qte) it2.next()).a == i5) {
                    break;
                }
                i9++;
            }
            int i10 = i9 < 0 ? 0 : i9;
            List list3 = etcVarE4.c;
            Iterator it3 = list3.iterator();
            int i11 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((qte) it3.next()).a == i6) {
                    i = i11;
                    break;
                }
                i11++;
            }
            etcVarE = new etc(list, list2, list3, i8, i10, i < 0 ? 0 : i);
        } else {
            etcVarE = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
        }
        scheduledSendPickerViewModel.e.m(null, new m34((x34) etcVarE.a.get(etcVarE.d), (qte) etcVarE.b.get(etcVarE.e), (qte) etcVarE.c.get(etcVarE.f)));
        scheduledSendPickerViewModel.c.m(null, etcVarE);
        return e5f.a;
    }
}
